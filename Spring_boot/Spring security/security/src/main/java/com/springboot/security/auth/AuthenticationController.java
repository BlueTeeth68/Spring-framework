package com.springboot.security.auth;

import com.springboot.security.service.AuthenticationService;
import com.springboot.security.service.JWTService;
import com.springboot.security.vm.LoginTokenVM;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    private final JWTService jwtService;

    @PostMapping("/register")
    public ResponseEntity<LoginTokenVM> register(
            @RequestBody RegisterRequest request
    ) {
        return new ResponseEntity<>(authenticationService.register(request), HttpStatus.OK);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<LoginTokenVM> register(
            @RequestBody AuthenticationRequest request
    ) {
        return new ResponseEntity<>(authenticationService.authenticate(request), HttpStatus.OK);
    }

    @PostMapping("/refresh")
    public ResponseEntity<String> getAccessTokenByRefreshToken(
            @RequestHeader("refresh_token") String refreshToken
    ) {
        if (jwtService.isRefreshTokenValid(refreshToken)) {
            return new ResponseEntity<>(jwtService.generateAccessTokenFromRefreshToken(refreshToken), HttpStatus.OK);
        } else {
            throw new BadCredentialsException("refresh token is invalid or expired.");
        }
    }
}
