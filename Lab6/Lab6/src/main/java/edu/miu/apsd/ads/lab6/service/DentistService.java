package edu.miu.apsd.ads.lab6.service;

import edu.miu.apsd.ads.lab6.model.Dentist;

import java.util.List;

public interface DentistService {

    List<Dentist> getAllDentists();

    Dentist addNewDentist(Dentist newDentist);
}
