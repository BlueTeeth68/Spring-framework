package com.example.springjpa;

import com.example.springjpa.domain.Role;
import com.example.springjpa.domain.RoleName;
import com.example.springjpa.domain.User;
import com.example.springjpa.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }


    @Bean
    CommandLineRunner run(UserService userService) {

        return args -> {
            Role roleUser = new Role(null, RoleName.USER, new HashSet<>());
            Role roleAdmin = new Role(null, RoleName.ADMIN, new HashSet<>());
            Role roleManager = new Role(null, RoleName.MANAGER, new HashSet<>());

            userService.saveRole(roleUser);
            userService.saveRole(roleAdmin);
            userService.saveRole(roleManager);

            User admin = new User(null, "admin", "0000",
                    "System Admin", "012456145", new HashSet<>());
            userService.saveUser(admin);
            userService.addRoleToUser(admin.getUsername(), RoleName.USER);
            userService.addRoleToUser(admin.getUsername(), RoleName.ADMIN);
            userService.addRoleToUser(admin.getUsername(), RoleName.MANAGER);

            User user = new User(null, "user", "0000",
                    "Common user", "012456145", new HashSet<>());
            userService.saveUser(user);
            userService.addRoleToUser(user.getUsername(), RoleName.USER);

            for (int i = 1; i <= 20; i++) {
                admin = new User(null, "admin" + i, "0000",
                        "System Admin", "012456145", new HashSet<>());
                userService.saveUser(admin);
                userService.addRoleToUser(admin.getUsername(), RoleName.USER);
                userService.addRoleToUser(admin.getUsername(), RoleName.ADMIN);
                userService.addRoleToUser(admin.getUsername(), RoleName.MANAGER);
            }

        };
    }
}
