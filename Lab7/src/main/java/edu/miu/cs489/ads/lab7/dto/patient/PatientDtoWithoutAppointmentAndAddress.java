package edu.miu.cs489.ads.lab7.dto.patient;

import edu.miu.cs489.ads.lab7.dto.AddressDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class PatientDtoWithoutAppointmentAndAddress {
    private Long patientId;
    private String firstName;
    private String lastName;
    private String contactPhone;
    private String email;
    private LocalDate DOB;

}
