package edu.miu.apsd.ads.lab6.service;

import edu.miu.apsd.ads.lab6.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AppointmentService {

    List<Appointment> getAllAppointments();

    Appointment addNewAppointment(Appointment appointment);


}
