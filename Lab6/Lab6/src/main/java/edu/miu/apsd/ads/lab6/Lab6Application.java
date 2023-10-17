package edu.miu.apsd.ads.lab6;

import edu.miu.apsd.ads.lab6.model.*;
import edu.miu.apsd.ads.lab6.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Lab6Application implements CommandLineRunner {

    private AddressService addressService;

    private PatientService patientService;

    private DentistService dentistService;

    private SurgeryService surgeryService;

    private AppointmentService appointmentService;

    public Lab6Application(AddressService addressService, PatientService patientService, DentistService dentistService, SurgeryService surgeryService, AppointmentService appointmentService) {
        this.addressService = addressService;
        this.patientService = patientService;
        this.dentistService = dentistService;
        this.surgeryService = surgeryService;
        this.appointmentService = appointmentService;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        SpringApplication.run(Lab6Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Address newAddress = new Address(null,"1000N", "FairField","IA",52557);
        addressService.addNewAddress(newAddress);

        System.out.println(addressService.getAllAddresses());

        Patient newPatient =
                new Patient(null,"Gillian","White","12345678","gillinawhite@gmail.com",
                        LocalDate.of(1972,10,5),addressService.getAllAddresses().get(0));
        patientService.addNewPatient(newPatient);

        System.out.println(patientService.getAllPatients());

        Dentist newDentist = new Dentist(null,"Tony","Smith","132456798","tony_smith@gmail.com");
        dentistService.addNewDentist(newDentist);

        System.out.println(dentistService.getAllDentists());

        Surgery newSurgery = new Surgery(null,"S15",
                "6412339049",
                addressService.getAllAddresses().get(0));
        surgeryService.addNewSurgery(newSurgery);

        System.out.println(surgeryService.getAllSurgeries());

        Appointment newAppointment = new Appointment(null,
                LocalDate.of(2013,9,12),
                surgeryService.getAllSurgeries().get(0),
                patientService.getAllPatients().get(0),
                dentistService.getAllDentists().get(0)
        );

        appointmentService.addNewAppointment(newAppointment);

        System.out.println(appointmentService.getAllAppointments());

        System.out.println(patientService.getPatientListFirstNameContains("gill"));



    }
}
