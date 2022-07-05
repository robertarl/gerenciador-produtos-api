package com.roberta.apispring.controller;

public class ProductNotFoundException extends RuntimeException {

    ProductNotFoundException(Long id) {
        super("Produto " + id + " não encontrado");
      }

}