package com.example.springjpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private RoleName roleName;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
//    @JsonBackReference
    @JsonIgnoreProperties(value = "roles", allowSetters = true)
    private Set<User> users = new HashSet<>();
}
