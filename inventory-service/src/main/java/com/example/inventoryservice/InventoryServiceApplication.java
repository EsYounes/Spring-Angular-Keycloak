package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Computer")
					.price(3255)
					.quantity(55)
					.build());

			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Phone")
					.price(5555)
					.quantity(20)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Car")
					.price(6598)
					.quantity(55)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("House")
					.price(582222)
					.quantity(55)
					.build());
		};
}
}
