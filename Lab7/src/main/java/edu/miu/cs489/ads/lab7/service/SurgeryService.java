package edu.miu.cs489.ads.lab7.service;


import edu.miu.cs489.ads.lab7.model.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeries();

    Surgery addNewSurgery(Surgery newSurgery);
}
