package edu.miu.apsd.ads.lab6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "surgeries")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long surgeryId;
    private String name;
    private String telephoneNumber;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Surgery(Long surgeryId, String name, String telephoneNumber, Address address) {
        this.surgeryId = surgeryId;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
    }

    @OneToMany(mappedBy = "surgery")
    List<Appointment> appointments;

    @Override
    public String toString() {
        return "Surgery{" +
                "surgeryId=" + surgeryId +
                ", name='" + name + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
