package com.udemy.curso.controllers;

import com.udemy.curso.entities.Order;
import com.udemy.curso.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> findAll(){
        return orderService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Order findById(@PathVariable(name = "id") Integer id){
        return orderService.findById(id);
    }
}
