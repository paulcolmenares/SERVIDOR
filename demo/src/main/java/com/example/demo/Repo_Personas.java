package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "personas")
@CrossOrigin("*")
public interface Repo_Personas extends JpaRepository<Persona, Long> {
}