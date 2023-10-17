package edu.miu.cs489.ads.lab7.repository;


import edu.miu.cs489.ads.lab7.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
