package com.spring.springsecurity;

import com.spring.springsecurity.domain.RoleName;
import com.spring.springsecurity.domain.User;
import com.spring.springsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }


    @Bean
    CommandLineRunner run(UserService userService) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String password = passwordEncoder.encode("0000");

        return args -> {

            User user = new User();
            user.setUsername("SystemAdmin");
            user.setPassword(password);

            user.setRole(RoleName.ADMIN.toString());
            userService.saveUser(user);
        };
    }
}
