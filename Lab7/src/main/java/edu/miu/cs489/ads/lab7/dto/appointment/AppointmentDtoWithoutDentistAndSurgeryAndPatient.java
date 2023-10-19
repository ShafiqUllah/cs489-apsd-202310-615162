package edu.miu.cs489.ads.lab7.dto.appointment;

import edu.miu.cs489.ads.lab7.dto.SurgeryDto;
import edu.miu.cs489.ads.lab7.dto.patient.PatientDtoWithoutAppointmentAndAddress;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class AppointmentDtoWithoutDentistAndSurgeryAndPatient {
    private Long appointmentId;
    private LocalDate appointmentDateTime;

}
