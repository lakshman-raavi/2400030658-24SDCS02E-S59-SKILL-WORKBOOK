package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.User;
import com.klu.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserController 
{

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User u) 
    {
        return service.register(u);
    }

    @PostMapping("/login")
    public User login(@RequestBody User u) 
    {
        return service.login(u);
    }

    @GetMapping("/user/{id}")
    public User get(@PathVariable Long id) 
    {
        return service.getUser(id);
    }
}