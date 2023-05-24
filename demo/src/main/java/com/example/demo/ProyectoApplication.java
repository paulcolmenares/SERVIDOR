package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(Repo_Usuarios repository) {
		return (args) -> {
			Usuario t = new Usuario("user", "123");
			System.out.println(t.toString());
			repository.save(t);
			System.out.println(t.toString());
		};
	}
}