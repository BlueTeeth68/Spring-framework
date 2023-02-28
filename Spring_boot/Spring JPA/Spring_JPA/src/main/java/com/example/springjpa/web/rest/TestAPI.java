package com.example.springjpa.web.rest;

import com.example.springjpa.domain.Role;
import com.example.springjpa.domain.RoleName;
import com.example.springjpa.domain.User;
import com.example.springjpa.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestAPI {

    private final UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> result = userService.getAllUser();
        log.debug("Number if user: {}", result.size());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/role/{roleName}")
    public ResponseEntity<List<User>> getAllUserByRole(
            @PathVariable String roleName
    ) {
        RoleName role = RoleName.valueOf(roleName.toUpperCase());
        List<User> result = userService.getALlUserByRole(role);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/role")
    public ResponseEntity<List<Role>> getAllUserByRole() {
        List<Role> result = userService.getAllRole();
        return ResponseEntity.ok(result);
    }

}
