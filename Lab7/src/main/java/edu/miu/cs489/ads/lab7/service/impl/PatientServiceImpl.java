package edu.miu.cs489.ads.lab7.service.impl;


import edu.miu.cs489.ads.lab7.model.Patient;
import edu.miu.cs489.ads.lab7.repository.PatientRepository;
import edu.miu.cs489.ads.lab7.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatients() {
        return this.patientRepository.findAll();
    }

    @Override
    public Patient addNewPatient(Patient newPatient) {
        return this.patientRepository.save(newPatient);
    }

    @Override
    public List<Patient> getPatientListFirstNameContains(String strContains) {
        return this.patientRepository.findPatientByFirstNameIsContaining(strContains);
    }
}
