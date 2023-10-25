package miu.edu.apsd.ads.lab11.lab11app.dto.patient;


import miu.edu.apsd.ads.lab11.lab11app.dto.address.AddressResponse;

public record PatientResponseWithAddress(Integer patientId,
                                         String patNo,
                                         String firstname,
                                         String lastname,
                                         AddressResponse primaryAddress) {
}
