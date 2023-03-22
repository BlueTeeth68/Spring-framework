package com.springboot.security.service;

import com.springboot.security.auth.AuthenticationRequest;
import com.springboot.security.auth.RegisterRequest;
import com.springboot.security.config.Role;
import com.springboot.security.domain.User;
import com.springboot.security.repository.UserRepository;
import com.springboot.security.vm.LoginTokenVM;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JWTService jwtService;
    private final AuthenticationManager authenticationManager;

    public LoginTokenVM register(RegisterRequest request) {
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        user = userRepository.save(user);
        String accessToken = jwtService.generateAccessToken(user.getUsername());
        String refreshToken = jwtService.generateRefreshToken(user.getUsername());
        LoginTokenVM result = new LoginTokenVM();
        result.setUser(user);
        result.setAccessToken(accessToken);
        result.setRefreshToken(refreshToken);
        return result;
    }

    public LoginTokenVM authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow();
        String accessToken = jwtService.generateAccessToken(user.getUsername());
        String refreshToken = jwtService.generateRefreshToken(user.getUsername());
        LoginTokenVM result = new LoginTokenVM();
        result.setUser(user);
        result.setAccessToken(accessToken);
        result.setRefreshToken(refreshToken);
        return result;
    }
}
