package edu.miu.apsd.ads.lab6.repository;

import edu.miu.apsd.ads.lab6.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
