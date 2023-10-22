package edu.miu.apsd.ads.lab9.service;

import edu.miu.apsd.ads.lab9.model.Dentist;

import java.util.List;

public interface DentistService {
    List<Dentist> getAllDentists();

    Dentist addNewDentist(Dentist newDentist);

    Dentist getDentistId(Integer dentistId);

    Dentist updateDentist(Dentist editedDentist);

    List<Dentist> getDentistByFirstName(String firstNameStart);
}
