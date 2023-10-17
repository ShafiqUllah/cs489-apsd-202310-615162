package edu.miu.apsd.ads.lab6.repository;

import edu.miu.apsd.ads.lab6.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
