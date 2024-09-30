package com.udemy.curso.services;

import com.udemy.curso.entities.Product;
import com.udemy.curso.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServices {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findById(Integer id){
        return productRepository.findById(id).get();
    }
}
