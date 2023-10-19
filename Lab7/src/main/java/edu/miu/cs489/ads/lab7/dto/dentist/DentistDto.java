package edu.miu.cs489.ads.lab7.dto.dentist;

import edu.miu.cs489.ads.lab7.model.Appointment;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class DentistDto {

    private Long dentistId;
    private String firstName;
    private String lastName;
    private String contactPhone;
    private String email;
    private List<Appointment> appointments;
}
