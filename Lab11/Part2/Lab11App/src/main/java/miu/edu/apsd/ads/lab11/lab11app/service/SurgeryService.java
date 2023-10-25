package miu.edu.apsd.ads.lab11.lab11app.service;



import miu.edu.apsd.ads.lab11.lab11app.model.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeries();

    Surgery addNewSurgery (Surgery newSurgery);

    Surgery getSurgeryId (Integer surgeryId);
}
