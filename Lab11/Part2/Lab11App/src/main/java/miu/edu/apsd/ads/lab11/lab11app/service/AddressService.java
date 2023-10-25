package miu.edu.apsd.ads.lab11.lab11app.service;



import miu.edu.apsd.ads.lab11.lab11app.dto.address.AddressResponseWithPatient;
import miu.edu.apsd.ads.lab11.lab11app.model.Address;

import java.util.List;

public interface AddressService {

    List<AddressResponseWithPatient> getAllAddresses();
    Address addNewAddress(Address newAddress);
    Address getAddressId(Integer addressId);
    void deleteAddressById(Integer addressId);
}
