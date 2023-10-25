package miu.edu.apsd.ads.lab11.lab11app;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import miu.edu.apsd.ads.lab11.lab11app.model.Role;
import miu.edu.apsd.ads.lab11.lab11app.model.User;
import miu.edu.apsd.ads.lab11.lab11app.repository.RoleRepository;
import miu.edu.apsd.ads.lab11.lab11app.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class Lab11AppApplication {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        System.out.println("Lab11 part 2");
        SpringApplication.run(Lab11AppApplication.class, args);
    }

    @PostConstruct
    public void initAdminUser() {
        var adminUser = userRepository.findByUsername("admin");
        if (adminUser.isEmpty()) {
            List<Role> listAdminRoles = new ArrayList<>();
            var adminRole = roleRepository.findByRoleName("ROLE_ADMIN");
            if (adminRole.isEmpty()) {
                var newAdminRole = new Role(null, "ROLE_ADMIN");
                listAdminRoles.add(newAdminRole);
            } else {
                listAdminRoles.add(adminRole.get());
            }
            User newAdminUser = new User(null, "Shafiq", "n/a", "Ullah", "admin",
                    passwordEncoder.encode("test1234"), "admin@gmail.com",
                    true,true, true, true);
            newAdminUser.setRoles(listAdminRoles);
            userRepository.save(newAdminUser);
        }
    }

}
