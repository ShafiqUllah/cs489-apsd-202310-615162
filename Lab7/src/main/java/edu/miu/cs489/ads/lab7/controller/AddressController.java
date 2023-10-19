package edu.miu.cs489.ads.lab7.controller;

import edu.miu.cs489.ads.lab7.dto.AddressDto;
import edu.miu.cs489.ads.lab7.dto.patient.PatientDto;
import edu.miu.cs489.ads.lab7.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/adsweb/api/v1/address")
public class AddressController {
    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<AddressDto>> listAddress() {
        return ResponseEntity.ok(addressService.getAllAddressesDto());
    }
}
