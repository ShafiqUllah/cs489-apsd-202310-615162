package edu.miu.cs489.ads.lab7.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
