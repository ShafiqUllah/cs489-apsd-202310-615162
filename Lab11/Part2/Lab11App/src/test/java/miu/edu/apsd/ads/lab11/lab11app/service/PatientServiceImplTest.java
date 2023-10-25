package miu.edu.apsd.ads.lab11.lab11app.service;

import miu.edu.apsd.ads.lab11.lab11app.exception.PatientNotFoundException;
import miu.edu.apsd.ads.lab11.lab11app.model.Address;
import miu.edu.apsd.ads.lab11.lab11app.model.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
class PatientServiceImplTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PatientService patientService;

    @Test
    public void testFindPatientByIdNotExists() throws PatientNotFoundException {
        Patient foundPatient = patientService.getPatientId(-1);
        assertThat(foundPatient).isNull();
    }

    @Test
    public void testFindPatientByIdExists() throws PatientNotFoundException {
        Patient savedPatient = entityManager.persistAndFlush(new Patient(1,"P001","Shafiq","Ullah",
                new Address(1,"6145 murdoch ave","saint louis","MO","63119")));
        Patient foundPatient = patientService.getPatientId(savedPatient.getPatientId());

        assertThat(foundPatient).isNotNull();
        assertThat(foundPatient.getPatientId()).isEqualTo(savedPatient.getPatientId());
    }


}