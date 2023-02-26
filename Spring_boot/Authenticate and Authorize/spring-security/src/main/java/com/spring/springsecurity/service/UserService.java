package com.spring.springsecurity.service;

import com.spring.springsecurity.domain.RoleName;
import com.spring.springsecurity.domain.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long id);

    public User getUserById(Long id);

    public User getUserByUsername(String username);

    public List<User> getUsers();

    public Boolean existsByUsername(String username);

    public User changeUserRole(Long id, RoleName roleName);

}
