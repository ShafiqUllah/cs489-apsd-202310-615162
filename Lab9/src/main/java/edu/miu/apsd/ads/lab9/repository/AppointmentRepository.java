package edu.miu.apsd.ads.lab9.repository;

import edu.miu.apsd.ads.lab9.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
