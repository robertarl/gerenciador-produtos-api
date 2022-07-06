package com.roberta.apispring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberta.apispring.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
