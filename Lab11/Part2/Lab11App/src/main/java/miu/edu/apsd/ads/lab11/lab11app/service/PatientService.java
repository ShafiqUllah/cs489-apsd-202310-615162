package miu.edu.apsd.ads.lab11.lab11app.service;



import miu.edu.apsd.ads.lab11.lab11app.dto.patient.PatientResponseWithAddress;
import miu.edu.apsd.ads.lab11.lab11app.exception.PatientNotFoundException;
import miu.edu.apsd.ads.lab11.lab11app.model.Patient;

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
