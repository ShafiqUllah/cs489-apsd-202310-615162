package edu.miu.cs489.ads.lab7.repository;



import edu.miu.cs489.ads.lab7.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
