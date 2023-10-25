package miu.edu.apsd.ads.lab11.lab11app.service;

import edu.miu.apsd.ads.lab9.model.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getAllAppointment();

    Appointment addNewAppointment(Appointment newAppointment);

    Appointment getAppointmentId(Integer appointmentId);
}
