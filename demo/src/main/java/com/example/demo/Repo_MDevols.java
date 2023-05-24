package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource()
@CrossOrigin("*")
public interface Repo_MDevols extends JpaRepository<MDevol, Long> {
}