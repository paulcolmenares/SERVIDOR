package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "mprestamos")
@CrossOrigin("*")
public interface Repo_MPrestamos extends JpaRepository<MPrestamo, Long> {
   
    
}
