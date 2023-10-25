package miu.edu.apsd.ads.lab11.lab11app.repository;

import edu.miu.apsd.ads.lab9.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(String name);
}