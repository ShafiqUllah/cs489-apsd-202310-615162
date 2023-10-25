package miu.edu.apsd.ads.lab11.lab11app.repository;


import miu.edu.apsd.ads.lab11.lab11app.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
