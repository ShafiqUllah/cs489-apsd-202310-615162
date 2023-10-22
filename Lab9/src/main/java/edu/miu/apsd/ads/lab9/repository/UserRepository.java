package edu.miu.apsd.ads.lab9.repository;

import edu.miu.apsd.ads.lab9.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findByUsername(String username);
}
