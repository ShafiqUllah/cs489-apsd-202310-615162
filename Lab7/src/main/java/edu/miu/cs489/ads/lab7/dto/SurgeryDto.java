package edu.miu.cs489.ads.lab7.dto;

import edu.miu.cs489.ads.lab7.model.Address;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SurgeryDto {
    private Long surgeryId;
    private String name;
    private String telephoneNumber;
    private AddressDto address;
}
