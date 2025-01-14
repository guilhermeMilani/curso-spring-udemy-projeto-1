package com.udemy.curso.services;

import com.udemy.curso.entities.User;
import com.udemy.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findUser(Integer id){
        return userRepository.findById(id).get();
    }
}
