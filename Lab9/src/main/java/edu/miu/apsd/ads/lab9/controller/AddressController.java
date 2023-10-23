package edu.miu.apsd.ads.lab9.controller;

import edu.miu.apsd.ads.lab9.dto.address.AddressResponseWithPatient;
import edu.miu.apsd.ads.lab9.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/adsApp/api/v1/address" )
public class AddressController {
    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<AddressResponseWithPatient>> listAddress() {
        return ResponseEntity.ok(addressService.getAllAddresses());
    }

}
