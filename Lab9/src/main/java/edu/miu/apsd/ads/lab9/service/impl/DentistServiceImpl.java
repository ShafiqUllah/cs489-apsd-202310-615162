package edu.miu.apsd.ads.lab9.service.impl;

import edu.miu.apsd.ads.lab9.model.Dentist;
import edu.miu.apsd.ads.lab9.repository.DentistRepository;
import edu.miu.apsd.ads.lab9.service.DentistService;
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
        return dentistRepository.findAll();
    }

    @Override
    public Dentist addNewDentist(Dentist newDentist) {
        return dentistRepository.save(newDentist);
    }

    @Override
    public Dentist getDentistId(Integer dentistId) {
        return dentistRepository.findById(dentistId).orElse(null);
    }

    @Override
    public Dentist updateDentist(Dentist editedDentist) {
        return dentistRepository.save(editedDentist);
    }

    @Override
    public List<Dentist> getDentistByFirstName(String firstNameStart) {
        return dentistRepository.findDentistByFirstNameIsStartingWith(firstNameStart);
    }
}
