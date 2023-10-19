package edu.miu.cs489.ads.lab7.service;

import edu.miu.cs489.ads.lab7.dto.patient.PatientDto;
import edu.miu.cs489.ads.lab7.model.Patient;

import java.util.List;

public interface PatientService {

    List<PatientDto> getAllPatientsDto();

    List<Patient> getAllPatients();

    Patient addNewPatient(Patient newPatient);

    List<Patient> getPatientListFirstNameContains(String strContains);

    PatientDto getPatientById(String id);
    public Patient updatePatient(Long patientId, Patient editedPatient);

    public void deletePatientById(String id);

    List<PatientDto> getPatientsDtoByCustomSearch(String sr);

}
