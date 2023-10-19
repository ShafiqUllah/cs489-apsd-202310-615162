package edu.miu.cs489.ads.lab7.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AddressDto {
    private Long addressId;
    private String streetAddress;
    private String city;
    private String state;
    private Integer zipcode;
}
