package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "textos")
@CrossOrigin("*")
public interface Repo_Textos extends JpaRepository<Texto, Long> {
   
   /* @Query("select a from Texto a where docen=null");
   Iterable<Area> Areas_Libres();*/
}