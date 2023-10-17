package edu.miu.cs489.ads.lab7.service;

import edu.miu.cs489.ads.lab7.model.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getAllPatients();

    Patient addNewPatient(Patient newPatient);

    List<Patient> getPatientListFirstNameContains(String strContains);
}
