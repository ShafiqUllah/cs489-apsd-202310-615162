package edu.miu.apsd.ads.lab9.service;

import edu.miu.apsd.ads.lab9.model.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeries();

    Surgery addNewSurgery (Surgery newSurgery);

    Surgery getSurgeryId (Integer surgeryId);
}
