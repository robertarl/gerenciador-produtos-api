package com.roberta.apispring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    private @Id @GeneratedValue Long id;

    @Column(name= "name", length = 200, nullable = false)
    private String name;

    @Column(name= "price", length = 200, nullable = false)
    private double price;

    @ManyToOne 
    @JoinColumn(name = "category_id")
    private Category category;
    
}
