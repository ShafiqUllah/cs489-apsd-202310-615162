package edu.miu.cs489.ads.lab7.controller;

import edu.miu.cs489.ads.lab7.dto.patient.PatientDto;
import edu.miu.cs489.ads.lab7.model.Patient;
import edu.miu.cs489.ads.lab7.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/adsweb/api/v1/patient")
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<PatientDto>> listOfPatients() {
        return ResponseEntity.ok(patientService.getAllPatientsDto());
    }

    @GetMapping(value = "/get/{patientId}")
    public ResponseEntity<PatientDto> getAddressById(@PathVariable String patientId) {
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Patient> registerNewPatient(@Valid @RequestBody Patient newPatient) {
        return new ResponseEntity<>(patientService.addNewPatient(newPatient), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{patientId}")
    public ResponseEntity<Patient> updatePublisher(@PathVariable String patientId,
                                                     @RequestBody Patient editedPatient) {
        return new ResponseEntity<>(patientService.updatePatient(Long.parseLong(patientId), editedPatient),
                HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{patientId}")
    public ResponseEntity<Void> deletePatient(@PathVariable String patientId) {
        patientService.deletePatientById(patientId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/search/{searchString}")
    public ResponseEntity<List<PatientDto>> searchPublisher(@PathVariable String searchString) {
        return ResponseEntity.ok(patientService.getPatientsDtoByCustomSearch(searchString));
    }
}
