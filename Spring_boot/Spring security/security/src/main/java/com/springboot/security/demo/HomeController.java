package com.springboot.security.demo;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@SecurityRequirement(name = "authorize")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> showHomePage() {
        return new ResponseEntity<>("This is home page", HttpStatus.OK);
    }
}
