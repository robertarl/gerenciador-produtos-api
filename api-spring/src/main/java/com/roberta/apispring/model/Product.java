package com.roberta.apispring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    private @Id @GeneratedValue Long id;

    @Column(name= "Nome", length = 200, nullable = false)
    private String name;

    @Column(name= "Preço", length = 200, nullable = false)
    private double price;
    
}
