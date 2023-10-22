package edu.miu.apsd.ads.lab9.repository;

import edu.miu.apsd.ads.lab9.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DentistRepository extends JpaRepository<Dentist, Integer> {

    //jpql
    @Query(value = "select d from Dentist d")
    public List<Dentist> getCustomListOfDentist();

    //method query
    List<Dentist> findDentistByFirstNameIsStartingWith(String firstNameStart);
}
