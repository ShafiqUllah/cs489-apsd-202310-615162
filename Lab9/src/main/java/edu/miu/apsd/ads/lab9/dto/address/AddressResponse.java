package edu.miu.apsd.ads.lab9.dto.address;

public record AddressResponse(Integer addressId,
                              String street,
                              String city,
                              String state,
                              String zipCode) {
}
