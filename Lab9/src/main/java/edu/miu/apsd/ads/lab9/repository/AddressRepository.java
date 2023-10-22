package edu.miu.apsd.ads.lab9.repository;

import edu.miu.apsd.ads.lab9.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
