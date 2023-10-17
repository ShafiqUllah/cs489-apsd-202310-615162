package edu.miu.apsd.ads.lab6.service.impl;

import edu.miu.apsd.ads.lab6.model.Dentist;
import edu.miu.apsd.ads.lab6.repository.DentistRepository;
import edu.miu.apsd.ads.lab6.service.DentistService;
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
