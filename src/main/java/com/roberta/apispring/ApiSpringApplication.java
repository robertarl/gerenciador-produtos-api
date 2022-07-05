package com.roberta.apispring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.roberta.apispring.model.Product;
import com.roberta.apispring.repository.ProductRepository;

@SpringBootApplication
public class ApiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringApplication.class, args);
	}

}
