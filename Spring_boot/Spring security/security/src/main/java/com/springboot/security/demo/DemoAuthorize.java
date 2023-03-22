package com.springboot.security.demo;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@EnableMethodSecurity(prePostEnabled = true)
@SecurityRequirement(name = "authorize")
//@Api( tags = "Demo")
public class DemoAuthorize {

    //    @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> testAuthorize() {
        return ResponseEntity.ok("Test authorize");
    }

}
