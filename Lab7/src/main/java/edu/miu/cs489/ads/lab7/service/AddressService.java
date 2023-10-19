package edu.miu.cs489.ads.lab7.service;


import edu.miu.cs489.ads.lab7.dto.AddressDto;
import edu.miu.cs489.ads.lab7.model.Address;

import java.util.List;

public interface AddressService {

    List<Address> getAllAddresses();

    Address addNewAddress(Address newAddress);

    List<AddressDto> getAllAddressesDto();
}
