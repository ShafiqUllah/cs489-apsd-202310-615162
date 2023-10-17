package edu.miu.cs489.ads.lab7.service;


import edu.miu.cs489.ads.lab7.model.Dentist;

import java.util.List;

public interface DentistService {

    List<Dentist> getAllDentists();

    Dentist addNewDentist(Dentist newDentist);
}
