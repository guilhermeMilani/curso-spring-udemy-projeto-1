package com.udemy.curso.services;

import com.udemy.curso.entities.Category;
import com.udemy.curso.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    public Category findById(Integer id){
        return categoryRepository.findById(id).get();
    }
}
