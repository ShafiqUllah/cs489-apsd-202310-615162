package miu.edu.apsd.ads.lab11.lab11app.repository;


import miu.edu.apsd.ads.lab11.lab11app.model.Dentist;
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
