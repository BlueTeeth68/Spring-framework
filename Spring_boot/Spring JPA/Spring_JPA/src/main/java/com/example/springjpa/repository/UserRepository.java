package com.example.springjpa.repository;

import com.example.springjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);


    @Query(value = "SELECT * FROM user " +
            " ORDER BY id ASC " +
            " LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<User> findALimitUserSortById(int limit, int offset);
}
