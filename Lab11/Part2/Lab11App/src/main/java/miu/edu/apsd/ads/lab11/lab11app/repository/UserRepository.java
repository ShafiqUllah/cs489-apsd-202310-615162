package miu.edu.apsd.ads.lab11.lab11app.repository;


import miu.edu.apsd.ads.lab11.lab11app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findByUsername(String username);
}
