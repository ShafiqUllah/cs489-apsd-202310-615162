package edu.miu.cs489.ads.lab7.service.impl;


import edu.miu.cs489.ads.lab7.dto.AddressDto;
import edu.miu.cs489.ads.lab7.model.Address;
import edu.miu.cs489.ads.lab7.repository.AddressRepository;
import edu.miu.cs489.ads.lab7.service.AddressService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Comparator;
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

    @Override
    public List<AddressDto> getAllAddressesDto() {
        return this.addressRepository.findAll().stream().sorted(Comparator.comparing(Address::getState))
                .map(a -> new AddressDto(a.getAddressId(),a.getStreetAddress(),a.getCity(),a.getState(),a.getZipcode()))
                .toList();
    }
}
