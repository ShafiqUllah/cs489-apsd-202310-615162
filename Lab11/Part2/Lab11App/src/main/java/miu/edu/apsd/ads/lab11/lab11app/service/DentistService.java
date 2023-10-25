package miu.edu.apsd.ads.lab11.lab11app.service;



import miu.edu.apsd.ads.lab11.lab11app.model.Dentist;

import java.util.List;

public interface DentistService {
    List<Dentist> getAllDentists();

    Dentist addNewDentist(Dentist newDentist);

    Dentist getDentistId(Integer dentistId);

    Dentist updateDentist(Dentist editedDentist);

    List<Dentist> getDentistByFirstName(String firstNameStart);
}
