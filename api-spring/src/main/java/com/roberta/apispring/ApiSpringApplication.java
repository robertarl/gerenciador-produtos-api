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

	@Bean
	CommandLineRunner initDataBase(ProductRepository productRepository){
		return args -> {
			productRepository.deleteAll();

			Product prod = new Product();
			prod.setName("SSD");
			prod.setPrice(180.00);

			productRepository.save(prod);
			
		}; 
	}

}
