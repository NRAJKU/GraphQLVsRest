package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.query", "com.example.service",
	"com.example.resolver", "com.example.mutation"})
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")
public class GraphQLWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQLWithSpringBootApplication.class, args);
	}

}
