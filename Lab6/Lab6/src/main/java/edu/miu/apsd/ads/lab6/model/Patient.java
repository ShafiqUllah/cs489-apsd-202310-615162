package edu.miu.apsd.ads.lab6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    private String firstName;
    private String lastName;
    private String contactPhone;
    private String email;
    private LocalDate DOB;

    public Patient(Long patientId, String firstName, String lastName, String contactPhone, String email, LocalDate DOB, Address address) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhone = contactPhone;
        this.email = email;
        this.DOB = DOB;
        this.address = address;
    }

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;


    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                ", address=" + address +
                '}';
    }
}
