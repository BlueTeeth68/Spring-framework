package com.spring.springsecurity.repository;

import com.spring.springsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUsername(String username);

    public Boolean existsByUsername(String username);
}
