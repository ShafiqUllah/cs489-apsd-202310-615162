package edu.miu.apsd.ads.lab9.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer surgeryId;
    private String surgeryNo;

    @OneToOne
    @JoinColumn(name = "address_id")
    @JsonBackReference
    private Address primaryAddress;

    @OneToMany(mappedBy = "surgery")
    private List<Appointment> appointments;

    public Surgery(Integer surgeryId, String surgeryNo, Address primaryAddress) {
        this.surgeryId = surgeryId;
        this.surgeryNo = surgeryNo;
        this.primaryAddress = primaryAddress;
    }

    @Override
    public String toString() {
        return "Surgery{" +
                "surgeryId=" + surgeryId +
                ", surgeryNo='" + surgeryNo + '\'' +
                ", primaryAddress=" + primaryAddress +
                '}';
    }
}
