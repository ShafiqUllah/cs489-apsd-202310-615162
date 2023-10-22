package edu.miu.apsd.ads.lab9.repository;

import edu.miu.apsd.ads.lab9.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(String name);
}
