package edu.miu.cs489.ads.lab7.repository;


import edu.miu.cs489.ads.lab7.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
