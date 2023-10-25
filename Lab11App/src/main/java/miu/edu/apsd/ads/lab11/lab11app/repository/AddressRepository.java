package miu.edu.apsd.ads.lab11.lab11app.repository;


import miu.edu.apsd.ads.lab11.lab11app.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
