package com.spring.springsecurity.rest;

import com.spring.springsecurity.rest.vm.Token;
import com.spring.springsecurity.rest.vm.UsernamePasswordVM;
import com.spring.springsecurity.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticateResource {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Token> register(@Valid @RequestBody UsernamePasswordVM register) {
        return ResponseEntity.ok(authenticationService.register(register));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<Token> authenticate(@Valid @RequestBody UsernamePasswordVM authenticate) {
        return ResponseEntity.ok(authenticationService.authenticate(authenticate));
    }
}
