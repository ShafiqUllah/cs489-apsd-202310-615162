package edu.miu.apsd.ads.lab6.service.impl;

import edu.miu.apsd.ads.lab6.model.Patient;
import edu.miu.apsd.ads.lab6.repository.PatientRepository;
import edu.miu.apsd.ads.lab6.service.PatientService;
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
