package edu.miu.apsd.ads.lab9.service;

import edu.miu.apsd.ads.lab9.dto.address.AddressResponseWithPatient;
import edu.miu.apsd.ads.lab9.model.Address;

import java.util.List;

public interface AddressService {

    List<AddressResponseWithPatient> getAllAddresses();
    Address addNewAddress(Address newAddress);
    Address getAddressId(Integer addressId);
    void deleteAddressById(Integer addressId);
}
