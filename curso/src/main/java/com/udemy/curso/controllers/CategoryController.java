package com.udemy.curso.controllers;

import com.udemy.curso.entities.Category;
import com.udemy.curso.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> findAll(){
        return categoryService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable(name = "id") Integer id){
        return categoryService.findById(id);
    }
}
