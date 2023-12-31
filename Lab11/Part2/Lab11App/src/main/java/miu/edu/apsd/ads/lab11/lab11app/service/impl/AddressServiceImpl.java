package miu.edu.apsd.ads.lab11.lab11app.service.impl;


import miu.edu.apsd.ads.lab11.lab11app.dto.address.AddressResponseWithPatient;
import miu.edu.apsd.ads.lab11.lab11app.dto.patient.PatientResponse;
import miu.edu.apsd.ads.lab11.lab11app.model.Address;
import miu.edu.apsd.ads.lab11.lab11app.repository.AddressRepository;
import miu.edu.apsd.ads.lab11.lab11app.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<AddressResponseWithPatient> getAllAddresses() {
        return addressRepository.findAll()
                .stream()
                .map(a -> new AddressResponseWithPatient(
                        a.getAddressId(),
                        a.getStreet(),
                        a.getCity(),
                        a.getState(),
                        a.getZipCode(),
                        new PatientResponse(
                                a.getPatient().getPatientId(),
                                a.getPatient().getPatNo(),
                                a.getPatient().getFirstName(),
                                a.getPatient().getLastName()
                        )
                )).toList();
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        return addressRepository.save(newAddress);
    }

    @Override
    public Address getAddressId(Integer addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }

    @Override
    public void deleteAddressById(Integer addressId) {
        addressRepository.deleteById(addressId);
    }
}
