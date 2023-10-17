package edu.miu.apsd.ads.lab6.repository;

import edu.miu.apsd.ads.lab6.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    //USing query method
    List<Patient> findPatientByFirstNameIsContaining(String strContains);

    @Query(value = "select p from Patient p")
    List<Patient> getMyCustomListOfPatient();
}
