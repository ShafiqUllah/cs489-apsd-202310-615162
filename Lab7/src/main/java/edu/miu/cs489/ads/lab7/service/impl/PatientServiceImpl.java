package edu.miu.cs489.ads.lab7.service.impl;


import edu.miu.cs489.ads.lab7.dto.AddressDto;
import edu.miu.cs489.ads.lab7.dto.SurgeryDto;
import edu.miu.cs489.ads.lab7.dto.appointment.AppointmentDto;
import edu.miu.cs489.ads.lab7.dto.appointment.AppointmentDtoWithoutDentistAndSurgeryAndPatient;
import edu.miu.cs489.ads.lab7.dto.patient.PatientDto;
import edu.miu.cs489.ads.lab7.model.Patient;
import edu.miu.cs489.ads.lab7.repository.PatientRepository;
import edu.miu.cs489.ads.lab7.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<PatientDto> getAllPatientsDto() {
        return this.patientRepository.findAll()
                .stream().map(p->new PatientDto(p.getPatientId(),p.getFirstName(),
                        p.getLastName(),p.getContactPhone(), p.getEmail(), p.getDOB(),
                        new AddressDto(p.getAddress().getAddressId(),
                                p.getAddress().getStreetAddress(),
                                p.getAddress().getCity(),
                                p.getAddress().getState(),p.getAddress().getZipcode()),
                        p.getAppointments().stream().map(a->new AppointmentDtoWithoutDentistAndSurgeryAndPatient(a.getAppointmentId(),
                                a.getAppointmentDateTime())).toList())).toList();
    }

    @Override
    public List<Patient> getAllPatients() {
        return this.patientRepository.findAll();
    }

    @Override
    public Patient addNewPatient(Patient newPatient) {
        return this.patientRepository.save(newPatient);
    }

    @Override
    public List<Patient> getPatientListFirstNameContains(String strContains) {
        return this.patientRepository.findPatientByFirstNameIsContaining(strContains);
    }

    @Override
    public PatientDto getPatientById(String id) {
        Patient p = this.patientRepository.findById(Long.parseLong(id)).orElseThrow(null);

        return new PatientDto(p.getPatientId(),p.getFirstName(),
                p.getLastName(),p.getContactPhone(), p.getEmail(), p.getDOB(),
                new AddressDto(p.getAddress().getAddressId(),
                        p.getAddress().getStreetAddress(),
                        p.getAddress().getCity(),
                        p.getAddress().getState(),p.getAddress().getZipcode()),
                p.getAppointments().stream().map(a->new AppointmentDtoWithoutDentistAndSurgeryAndPatient(a.getAppointmentId(),
                        a.getAppointmentDateTime())).toList());
    }

    @Override
    public Patient updatePatient(Long patientId, Patient editedPatient) {
        var patient = this.patientRepository.findById(patientId).orElseThrow(null);
        if(patient != null ) {
            patient.setFirstName(editedPatient.getFirstName());
            patient.setLastName(editedPatient.getLastName());
            patient.setContactPhone(editedPatient.getContactPhone());
            patient.setEmail(editedPatient.getEmail());
            patient.setDOB(editedPatient.getDOB());

            var address = editedPatient.getAddress();
            address.setStreetAddress(editedPatient.getAddress().getStreetAddress());
            address.setCity(editedPatient.getAddress().getCity());
            address.setState(editedPatient.getAddress().getState());
            address.setZipcode(editedPatient.getAddress().getZipcode());
            return this.patientRepository.save(patient);
        } else {
            return patient;
        }
    }

    @Override
    public void deletePatientById(String id) {
        this.patientRepository.deleteById(Long.parseLong(id));
    }

    @Override
    public List<PatientDto> getPatientsDtoByCustomSearch(String sr) {

        return this.patientRepository.findPatientByFirstNameContainingOrLastNameContainingOrContactPhoneContainingOrEmailContainingOrAddress_StreetAddressContainingOrAddress_cityContainingOrAddress_stateContaining(sr,sr,sr,sr,sr,sr,sr)
                .stream().map(p->new PatientDto(p.getPatientId(),p.getFirstName(),
                        p.getLastName(),p.getContactPhone(), p.getEmail(), p.getDOB(),
                        new AddressDto(p.getAddress().getAddressId(),
                                p.getAddress().getStreetAddress(),
                                p.getAddress().getCity(),
                                p.getAddress().getState(),p.getAddress().getZipcode()),
                        p.getAppointments().stream().map(a->new AppointmentDtoWithoutDentistAndSurgeryAndPatient(a.getAppointmentId(),
                                a.getAppointmentDateTime())).toList())).toList();
    }

}
