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

import com.roberta.apispring.model.Category;
import com.roberta.apispring.repository.CategoryRepository;
import com.roberta.apispring.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> categories() {
        return categoryRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Category create(@RequestBody Category categories) {
        return categoryRepository.save(categories);
    }

    @GetMapping({ "/{id}" })
    Category edit(@PathVariable Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(id));
    }

    @PutMapping("/{id}")
    Category update(@RequestBody Category newCategory, @PathVariable Long id) {
        return categoryRepository.findById(id).map(categories -> {
            categories.setName(newCategory.getName());
            categories.setDescription(newCategory.getDescription());
            return categoryRepository.save(categories);
        }).orElseGet(() -> {
            newCategory.setId(id);
            return categoryRepository.save(newCategory);
        });
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id){
        categoryRepository.deleteById(id);
    }
}
