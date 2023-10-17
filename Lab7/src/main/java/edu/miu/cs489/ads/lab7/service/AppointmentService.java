package edu.miu.cs489.ads.lab7.service;


import edu.miu.cs489.ads.lab7.model.Appointment;

import java.util.List;


public interface AppointmentService {

    List<Appointment> getAllAppointments();

    Appointment addNewAppointment(Appointment appointment);


}
