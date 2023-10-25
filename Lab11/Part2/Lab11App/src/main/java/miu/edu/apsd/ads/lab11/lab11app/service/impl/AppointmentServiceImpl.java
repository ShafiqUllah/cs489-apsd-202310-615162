package miu.edu.apsd.ads.lab11.lab11app.service.impl;


import miu.edu.apsd.ads.lab11.lab11app.model.Appointment;
import miu.edu.apsd.ads.lab11.lab11app.repository.AppointmentRepository;
import miu.edu.apsd.ads.lab11.lab11app.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment addNewAppointment(Appointment newAppointment) {
        return appointmentRepository.save(newAppointment);
    }

    @Override
    public Appointment getAppointmentId(Integer appointmentId) {
        return appointmentRepository.findById(appointmentId)
                .orElse(null);
    }

}
