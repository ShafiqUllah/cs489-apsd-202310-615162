package miu.edu.apsd.ads.lab11.lab11app.controller;


import miu.edu.apsd.ads.lab11.lab11app.dto.address.AddressResponseWithPatient;
import miu.edu.apsd.ads.lab11.lab11app.service.AddressService;
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
