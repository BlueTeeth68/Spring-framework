package com.spring.springsecurity.service;

import com.spring.springsecurity.domain.RoleName;
import com.spring.springsecurity.domain.User;
import com.spring.springsecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        log.info("Find user by id: {}", id);
        return userRepository.findById(id)
                .orElse(null);
    }

    @Override
    public User getUserByUsername(String username){
        log.info("Find user by username: {}", username);
        return userRepository.findByUsername(username)
                .orElse(null);
    }

    @Override
    public List<User> getUsers() {
        log.info("Get all user from database....");
        List<User> result = userRepository.findAll();
        return result;
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }


    @Override
    public User changeUserRole(Long id, RoleName roleName) {
        User user = getUserById(id);
        log.info("Change role {} to user {}", roleName, user.getUsername());
        user.setRole(roleName.toString());
        return saveUser(user);
    }
}
