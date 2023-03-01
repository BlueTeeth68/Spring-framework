package com.springboot.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@EnableMethodSecurity(prePostEnabled = true)
public class DemoAuthorize {

    @GetMapping
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> testAuthorize() {
        return ResponseEntity.ok("Test authorize");
    }

}
