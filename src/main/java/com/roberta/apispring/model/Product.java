package com.roberta.apispring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
public class Product {

   
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;

    @Column(name= "name", length = 200, nullable = false)
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


    @Column(name= "price", nullable = false)
    private double price;

    @Column(name= "quantity", nullable = false)
    private Integer quantity;

    @Column(name= "description", length = 500, nullable = false)
    private String description;
    
}
