package com.roberta.apispring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.roberta.apispring.model.Product;
import com.roberta.apispring.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public List<Product> listProd() {
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Product create(@RequestBody Product prod) {
        return productRepository.save(prod);
    }

    @GetMapping({"/{id}"})
    Product edit(@PathVariable Long id){
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }
}
