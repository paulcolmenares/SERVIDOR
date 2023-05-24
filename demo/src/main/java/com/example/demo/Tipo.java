package com.example.demo;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Tipo  {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODTIPO;

    @Column(length = 40, nullable = false)
    private String nombre;

    @Column( nullable = false)
    private Long estado;

    @Column( nullable = false)
    private Long sw;

    //relacion con tipotex
    @ManyToMany
    @JoinTable(name = "TipoTex")
    private Set<Texto> codtext ;
    
    public Tipo() {
    }


    public Long getCODTIPO() {
        return CODTIPO;
    }


    public void setCODTIPO(Long cODTIPO) {
        CODTIPO = cODTIPO;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public Long getSw() {
        return sw;
    }

    public void setSw(Long sw) {
        this.sw = sw;
    }



    public Set<Texto> getCodtext() {
        return codtext;
    }


    public void setCodtext(Set<Texto> codtext) {
        this.codtext = codtext;
    }


    @Override
    public String toString() {
        return "Tipo [CODTIPO=" + CODTIPO + ", codtext=" + codtext + ", estado=" + estado + ", nombre=" + nombre
                + ", sw=" + sw + "]";
    }

  
}