package edu.miu.apsd.ads.lab6.service;

import edu.miu.apsd.ads.lab6.model.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getAllPatients();

    Patient addNewPatient(Patient newPatient);

    List<Patient> getPatientListFirstNameContains(String strContains);
}
