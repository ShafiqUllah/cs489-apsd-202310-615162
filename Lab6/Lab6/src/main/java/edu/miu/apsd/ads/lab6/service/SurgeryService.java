package edu.miu.apsd.ads.lab6.service;

import edu.miu.apsd.ads.lab6.model.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeries();

    Surgery addNewSurgery(Surgery newSurgery);
}
