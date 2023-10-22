package edu.miu.apsd.ads.lab9.dto.patient;

public record PatientResponse(Integer patientId,
                              String patNo,
                              String firstname,
                              String lastname) {
}
