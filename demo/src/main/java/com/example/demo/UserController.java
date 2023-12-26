package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_XML_VALUE)
    public User getUser() {
        User user = new User();
        user.setId(123);
        user.setName("Test");
        user.setEmail("Teste@example.com");
        user.setAge(30);
        return user;
    }

    @PostMapping("/create")
    public String createUser(@Validated @RequestBody User user) {

        return "User created successfully";
    }
}

