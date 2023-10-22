package edu.miu.apsd.ads.lab9.service;

import edu.miu.apsd.ads.lab9.dto.patient.PatientResponseWithAddress;
import edu.miu.apsd.ads.lab9.exception.PatientNotFoundException;
import edu.miu.apsd.ads.lab9.model.Patient;

import java.util.List;

public interface PatientService {
    List<PatientResponseWithAddress> getAllPatients();
    Patient addNewPatient(Patient newPatient);

    Patient getPatientId(Integer patientId) throws PatientNotFoundException;


    Patient updatePatient(Integer patientId,Patient editedPatient);

    void deletePatientById(Integer patientId);

    void deletePatientAddressById(Integer patientId);

//    List<Patient> getPatientByFirstNameStart(String firstNameStart);

    List<Patient> searchPatient(String searchString);
}
