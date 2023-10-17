package edu.miu.cs489.ads.lab7.service.impl;


import edu.miu.cs489.ads.lab7.model.Surgery;
import edu.miu.cs489.ads.lab7.repository.SurgeryRepository;
import edu.miu.cs489.ads.lab7.service.SurgeryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgeryServiceImpl implements SurgeryService {

    private SurgeryRepository surgeryRepository;

    public SurgeryServiceImpl(SurgeryRepository surgeryRepository) {
        this.surgeryRepository = surgeryRepository;
    }

    @Override
    public List<Surgery> getAllSurgeries() {
        return this.surgeryRepository.findAll();
    }

    @Override
    public Surgery addNewSurgery(Surgery newSurgery) {
        return this.surgeryRepository.save(newSurgery);
    }
}
