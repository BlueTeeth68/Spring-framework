package com.example.springjpa.repository;

import com.example.springjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    @Query(value = "SELECT * FROM user " +
            " ORDER BY id ASC " +
            " LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<User> findALimitUserSortById(int limit, int offset);

    List<User> findByUsernameLike (String username);

    List<User> findByUsernameStartingWith(String username);
}
