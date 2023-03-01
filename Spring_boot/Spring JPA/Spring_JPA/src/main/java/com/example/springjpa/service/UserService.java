package com.example.springjpa.service;

import com.example.springjpa.domain.Role;
import com.example.springjpa.domain.RoleName;
import com.example.springjpa.domain.User;
import com.example.springjpa.repository.RoleRepository;
import com.example.springjpa.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Role saveRole(Role role) {

        return roleRepository.save(role);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Role getRoleByName(RoleName roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    public User addRoleToUser(String userName, RoleName roleName) {
        User user = getUserByUsername(userName);
        Role role = getRoleByName(roleName);

        user.getRoles().add(role);
        log.debug("Saving user after adding role.");
        user = userRepository.save(user);
//        User result = userRepository.save(user);
        return user;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public List<User> getALlUserByRole(RoleName roleName) {
        Role role = roleRepository.findByRoleName(roleName);
//        List<User> result = roleRepository.getUserByRole(roleName);
        return role.getUsers().stream().toList();
//        return result;
    }

    public List<Role> getAllRole() {
        return roleRepository.findAll().stream().toList();
    }

    public List<User> getUserByPaginate(int limit, int page) {
        int offset = limit * (page - 1);
        List<User> result = userRepository.findALimitUserSortById(limit, offset);
        return result;
    }


}
