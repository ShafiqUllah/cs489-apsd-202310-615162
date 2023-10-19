package edu.miu.cs489.ads.lab7.repository;


import edu.miu.cs489.ads.lab7.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    //USing query method
    List<Patient> findPatientByFirstNameIsContaining(String strContains);

    @Query(value = "select p from Patient p")
    List<Patient> getMyCustomListOfPatient();

    List<Patient> findPatientByFirstNameContainingOrLastNameContainingOrContactPhoneContainingOrEmailContainingOrAddress_StreetAddressContainingOrAddress_cityContainingOrAddress_stateContaining(String a, String b,String c, String d,String e,String f, String g);

            /*
             private Long addressId;
    private String streetAddress;
    private String city;
    private String state;
    private Integer zipcode;
             */

}
