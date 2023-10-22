package edu.miu.apsd.ads.lab9.repository;

import edu.miu.apsd.ads.lab9.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    @Query(value = "select p from Patient p")
    public List<Patient> getMyCustomListOfPatient();


    //Native query
    @Query(value = "SELECT * FROM `dental-surgeries-appointments-db`.patient p where p.first_name like 'Ji%'",nativeQuery = true)
    public Optional<Patient> getMyNativeCustomPatientByNameContaining(String firstName, String lastName);


    //method query
    public List<Patient> findPatientsByFirstNameContainingOrPrimaryAddress_CityContaining (
            String firstName, String city
    );
}