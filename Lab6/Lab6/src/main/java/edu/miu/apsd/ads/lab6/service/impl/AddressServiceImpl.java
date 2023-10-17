package edu.miu.apsd.ads.lab6.service.impl;

import edu.miu.apsd.ads.lab6.model.Address;
import edu.miu.apsd.ads.lab6.repository.AddressRepository;
import edu.miu.apsd.ads.lab6.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAllAddresses() {
        return this.addressRepository.findAll();
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        return this.addressRepository.save(newAddress);
    }
}
