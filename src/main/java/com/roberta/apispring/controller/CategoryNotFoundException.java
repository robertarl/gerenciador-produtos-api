package com.roberta.apispring.controller;

public class CategoryNotFoundException extends RuntimeException{

    CategoryNotFoundException(Long id) {
        super("Categoria " + id + " não encontrado");
      }
    
}
