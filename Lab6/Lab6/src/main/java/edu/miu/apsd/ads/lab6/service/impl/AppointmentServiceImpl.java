package edu.miu.apsd.ads.lab6.service.impl;

import edu.miu.apsd.ads.lab6.model.Appointment;
import edu.miu.apsd.ads.lab6.repository.AppointmentRepository;
import edu.miu.apsd.ads.lab6.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return this.appointmentRepository.findAll();
    }

    @Override
    public Appointment addNewAppointment(Appointment appointment) {
        return this.appointmentRepository.save(appointment);
    }
}
