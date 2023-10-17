package edu.miu.apsd.ads.lab6.service;

import edu.miu.apsd.ads.lab6.model.Address;

import java.util.List;

public interface AddressService {

    List<Address> getAllAddresses();

    Address addNewAddress(Address newAddress);
}
