package miu.edu.apsd.ads.lab11.lab11app.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String patNo;
    @Column(nullable = false)

    @NotBlank(message = "Patient Name is required and cannot be null or empty string or blank spaces")
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", unique = true, nullable = false)
    @JsonManagedReference
    private Address primaryAddress;


    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<Appointment> appointments;

    public Patient(Integer patientId, String patNo,String firstName, String lastName, Address primaryAddress) {
        this.patientId = patientId;
        this.patNo = patNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.primaryAddress = primaryAddress;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patNo='" + patNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", primaryAddress=" + primaryAddress +
                '}';
    }
}