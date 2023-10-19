package edu.miu.cs489.ads.lab7.dto.patient;

import edu.miu.cs489.ads.lab7.dto.AddressDto;
import edu.miu.cs489.ads.lab7.dto.appointment.AppointmentDto;
import edu.miu.cs489.ads.lab7.dto.appointment.AppointmentDtoWithoutDentistAndSurgeryAndPatient;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Data
public class PatientDto {

    private Long patientId;
    private String firstName;
    private String lastName;
    private String contactPhone;
    private String email;
    private LocalDate DOB;
    private AddressDto address;
    private List<AppointmentDtoWithoutDentistAndSurgeryAndPatient> appointments;
}
