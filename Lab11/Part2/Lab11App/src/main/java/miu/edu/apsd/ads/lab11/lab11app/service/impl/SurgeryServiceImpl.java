package miu.edu.apsd.ads.lab11.lab11app.service.impl;


import miu.edu.apsd.ads.lab11.lab11app.model.Surgery;
import miu.edu.apsd.ads.lab11.lab11app.repository.SurgeryRepository;
import miu.edu.apsd.ads.lab11.lab11app.service.SurgeryService;
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
        return surgeryRepository.findAll();
    }

    @Override
    public Surgery addNewSurgery(Surgery newSurgery) {
        return surgeryRepository.save(newSurgery);
    }

    @Override
    public Surgery getSurgeryId(Integer surgeryId) {
        return surgeryRepository.findById(surgeryId).orElse(null);
    }
}
