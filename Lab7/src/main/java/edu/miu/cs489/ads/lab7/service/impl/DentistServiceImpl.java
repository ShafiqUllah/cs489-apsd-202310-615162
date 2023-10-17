package edu.miu.cs489.ads.lab7.service.impl;


import edu.miu.cs489.ads.lab7.model.Dentist;
import edu.miu.cs489.ads.lab7.repository.DentistRepository;
import edu.miu.cs489.ads.lab7.service.DentistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistServiceImpl implements DentistService {

    private DentistRepository dentistRepository;

    public DentistServiceImpl(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public List<Dentist> getAllDentists() {
        return this.dentistRepository.findAll();
    }

    @Override
    public Dentist addNewDentist(Dentist newDentist) {
        return this.dentistRepository.save(newDentist);
    }
}
