package edu.miu.apsd.ads.lab9.dto.patient;

import edu.miu.apsd.ads.lab9.dto.address.AddressResponse;

public record PatientResponseWithAddress(Integer patientId,
                                         String patNo,
                                         String firstname,
                                         String lastname,
                                         AddressResponse primaryAddress) {
}
