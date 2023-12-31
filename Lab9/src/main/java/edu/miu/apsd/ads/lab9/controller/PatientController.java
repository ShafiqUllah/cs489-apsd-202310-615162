package edu.miu.apsd.ads.lab9.controller;

import edu.miu.apsd.ads.lab9.dto.patient.PatientResponse;
import edu.miu.apsd.ads.lab9.dto.patient.PatientResponseWithAddress;
import edu.miu.apsd.ads.lab9.exception.PatientNotFoundException;
import edu.miu.apsd.ads.lab9.model.Patient;
import edu.miu.apsd.ads.lab9.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/adsApp/api/v1/patient" )
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<PatientResponseWithAddress>> listPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    @GetMapping(value = "/get/{patientId}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Integer patientId) throws PatientNotFoundException {
        return ResponseEntity.ok(patientService.getPatientId(patientId));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Patient> registerNewPatient(@Valid @RequestBody Patient newPatient) {
        return new ResponseEntity<>(patientService.addNewPatient(newPatient), HttpStatus.CREATED);
    }

    @PutMapping(value =  "/update/{patientId}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Integer patientId, @RequestBody Patient editedPatient) {
        return new ResponseEntity<>(patientService.updatePatient(patientId, editedPatient), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{patientId}")
    public ResponseEntity<Void> deletePatient(@PathVariable Integer patientId) {
        patientService.deletePatientById(patientId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping(value = "/search/{searchString}")
    public ResponseEntity<List<Patient>> searchPatient(@PathVariable String searchString) {
        return ResponseEntity.ok(patientService.searchPatient(searchString));
    }

}