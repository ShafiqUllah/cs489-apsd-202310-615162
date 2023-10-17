package edu.miu.apsd.ads.lab6.repository;


import edu.miu.apsd.ads.lab6.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
