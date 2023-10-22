package edu.miu.apsd.ads.lab9.service.impl;

import edu.miu.apsd.ads.lab9.model.Surgery;
import edu.miu.apsd.ads.lab9.repository.SurgeryRepository;
import edu.miu.apsd.ads.lab9.service.SurgeryService;
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
