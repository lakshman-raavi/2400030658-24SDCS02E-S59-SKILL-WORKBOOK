package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.entity.User;
import com.klu.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User register(User u) 
    { 
    	return repo.save(u); 
    }
    public User login(User u) 
    {
        return repo.findByUsernameAndPassword(u.getUsername(), u.getPassword());
    }
    public User getUser(Long id) 
    {
        return repo.findById(id).orElse(null);
    }
}