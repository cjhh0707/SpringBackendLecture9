package com.example.springhello.controller;


import com.example.springhello.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        return new UserDto(id, "Kim", 27);
    }
}
