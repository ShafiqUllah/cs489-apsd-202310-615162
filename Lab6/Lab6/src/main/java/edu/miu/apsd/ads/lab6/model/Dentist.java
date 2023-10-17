package edu.miu.apsd.ads.lab6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "dentist")
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dentistId;
    private String firstName;
    private String lastName;
    private String contactPhone;
    private String email;


    public Dentist(Long dentistId, String firstName, String lastName, String contactPhone, String email) {
        this.dentistId = dentistId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhone = contactPhone;
        this.email = email;
    }

    @OneToMany(mappedBy = "dentist")
    private List<Appointment> appointments;

    @Override
    public String toString() {
        return "Dentist{" +
                "dentistId=" + dentistId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
