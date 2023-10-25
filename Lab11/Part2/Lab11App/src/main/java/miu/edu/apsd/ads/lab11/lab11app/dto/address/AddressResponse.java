package miu.edu.apsd.ads.lab11.lab11app.dto.address;

public record AddressResponse(Integer addressId,
                              String street,
                              String city,
                              String state,
                              String zipCode) {
}
