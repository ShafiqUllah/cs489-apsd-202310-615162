package edu.miu.cs489.ads.lab7.dto.dentist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DentistDtoWithoutAppointment {
    private Long dentistId;
    private String firstName;
    private String lastName;
    private String contactPhone;
    private String email;
}
