package com.roberta.apispring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.roberta.apispring.model.Product;
import com.roberta.apispring.repository.CategoryRepository;
import com.roberta.apispring.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    private  CategoryRepository categoryRepository;


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

    @PutMapping("/{id}")
    Product update(@RequestBody Product newProduct, @PathVariable Long id){

        return productRepository.findById(id)
        .map(prod -> {
            prod.setName(newProduct.getName());
            prod.setPrice(newProduct.getPrice());
            return productRepository.save(prod);}).orElseGet(() -> {
                newProduct.setId(id);
                return productRepository.save(newProduct);
              });
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id){
        productRepository.deleteById(id);
    }
}
