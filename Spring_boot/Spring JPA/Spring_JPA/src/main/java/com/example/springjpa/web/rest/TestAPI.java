package com.example.springjpa.web.rest;

import com.example.springjpa.domain.Post;
import com.example.springjpa.domain.Role;
import com.example.springjpa.domain.RoleName;
import com.example.springjpa.domain.User;
import com.example.springjpa.service.PostService;
import com.example.springjpa.service.UserService;
import com.example.springjpa.util.APIUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestAPI {

    private final UserService userService;

    private final PostService postService;

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

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUserPaginate(
            @RequestParam String limit,
            @RequestParam String page
    ) {
        int limitNum = APIUtil.convertStringToInt(limit);
        int pageNum = APIUtil.convertStringToInt(page);

        List<User> result = userService.getUserByPaginate(limitNum, pageNum);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/user/like")
    public ResponseEntity<List<User>> getUserByUserNameLike(
            @RequestParam String username
    ) {
        List<User> result = userService.getUserByUsernameLike(username);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @GetMapping("/user/start-with")
    public ResponseEntity<List<User>> getUserByUserNameStartingWith(
            @RequestParam String username
    ) {
        List<User> result = userService.getUserByUsernameStartingWith(username);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @GetMapping("/user/username")
    public ResponseEntity<User> getUserByUsername(
            @RequestParam String username
    ) {
        User result = userService.getUserByUsername(username);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @PostMapping("/post")
    public ResponseEntity<Post> createPost(
            @Valid @RequestBody Post post
    ) {
        User user = userService.getUserByUsername("admin");
        post.setUser(user);
        Post result = postService.createdAPost(post);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

}