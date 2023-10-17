package edu.miu.cs489.ads.lab7.repository;


import edu.miu.cs489.ads.lab7.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
}
