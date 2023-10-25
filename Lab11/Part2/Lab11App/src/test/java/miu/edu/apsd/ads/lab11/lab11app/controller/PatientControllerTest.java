package miu.edu.apsd.ads.lab11.lab11app.controller;

import miu.edu.apsd.ads.lab11.lab11app.dto.address.AddressResponse;
import miu.edu.apsd.ads.lab11.lab11app.dto.patient.PatientResponse;
import miu.edu.apsd.ads.lab11.lab11app.dto.patient.PatientResponseWithAddress;
import miu.edu.apsd.ads.lab11.lab11app.service.PatientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import static org.mockito.Mockito.when;

public class PatientControllerTest {

    @InjectMocks
    private PatientController patientController;

    @Mock
    private PatientService patientService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListAllPatients() {
        when(patientService.getAllPatients()).thenReturn(List.of(new PatientResponseWithAddress(
                1,
                "P001",
                "Shafiq",
                "Ullah",
                new AddressResponse(
                        1,
                        "123 Main St",
                        "fairfield",
                        "IA",
                        "12345"
                )
        ), new PatientResponseWithAddress(
                2,
                "P002",
                "Shafiq",
                "Ullah",

                new AddressResponse(
                        2,
                        "456 Elm St",
                        "saint louis",
                        "MO",
                        "67890"
                )
        )));


        ResponseEntity<List<PatientResponseWithAddress>> response = patientController.listPatients();


        assertThat(response.getStatusCodeValue()).isEqualTo(200);
        assertThat(response.getBody()).hasSize(2);

    }
}
