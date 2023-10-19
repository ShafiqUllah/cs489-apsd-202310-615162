package edu.miu.cs489.ads.lab7.dto.appointment;

import edu.miu.cs489.ads.lab7.dto.SurgeryDto;
import edu.miu.cs489.ads.lab7.dto.patient.PatientDtoWithoutAppointmentAndAddress;
import edu.miu.cs489.ads.lab7.model.Dentist;

import java.time.LocalDate;

public class AppointmentDto {
    private Long appointmentId;
    private LocalDate appointmentDateTime;
    private SurgeryDto surgery;
    private PatientDtoWithoutAppointmentAndAddress patient;
    private Dentist dentist;
}
