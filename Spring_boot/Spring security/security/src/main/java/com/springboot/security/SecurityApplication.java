package com.springboot.security;

import com.springboot.security.config.Role;
import com.springboot.security.domain.User;
import com.springboot.security.repository.UserRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication

//@SecurityScheme(name = "authorize", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
@SecurityScheme(
        name = "authorize",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT"
)

@OpenAPIDefinition(
        info = @Info(title = "Demo swagger API", version = "1.0", description = "Demo swagger API")
)
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserRepository userRepository) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return arg -> {
            var user = User.builder()
                    .firstName("admin")
                    .lastName("system")
                    .email("admin@gmail.com")
                    .password(passwordEncoder.encode("0000"))
                    .role(Role.ADMIN)
                    .build();
            userRepository.save(user);
        };
    }


}
