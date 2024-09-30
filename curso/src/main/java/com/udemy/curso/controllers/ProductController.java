package com.udemy.curso.controllers;

import com.udemy.curso.entities.Product;
import com.udemy.curso.services.CategoryService;
import com.udemy.curso.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @GetMapping
    public List<Product> findAll(){
        return productServices.findAll();
    }
    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable(name = "id") Integer id){
        return findById(id);
    }
}
