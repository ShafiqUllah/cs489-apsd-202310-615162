package edu.miu.apsd.ads.lab9.dto.address;

import edu.miu.apsd.ads.lab9.dto.patient.PatientResponse;

public record AddressResponseWithPatient(Integer addressId,
                                         String street,
                                         String city,
                                         String state,
                                         String zipCode,
                                         PatientResponse patient) {
}
