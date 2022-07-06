package com.roberta.apispring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Category {

    private @Id @GeneratedValue Long id;
    
    @Column(name= "name", length = 200, nullable = false)
    private String name;

    @Column(name= "description", length = 200, nullable = false)
    private String description;

    
}
