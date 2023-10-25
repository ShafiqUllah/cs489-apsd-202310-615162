package miu.edu.apsd.ads.lab11.lab11app.dto.address;


import miu.edu.apsd.ads.lab11.lab11app.dto.patient.PatientResponse;

public record AddressResponseWithPatient(Integer addressId,
                                         String street,
                                         String city,
                                         String state,
                                         String zipCode,
                                         PatientResponse patient) {
}
