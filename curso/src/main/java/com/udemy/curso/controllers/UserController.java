package com.udemy.curso.controllers;

import com.udemy.curso.entities.User;
import com.udemy.curso.repositories.UserRepository;
import com.udemy.curso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping
    public List<User> getAllUsers(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public User getById(@PathVariable(name = "id") Integer id){
        return service.findUser(id);
    }

}
