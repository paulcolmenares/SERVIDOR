package com.example.demo;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Area {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODA;

    @Column(length = 40, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Long estado;

    @OneToMany(mappedBy = "coda")
     private Set<Texto> codtexto;

    public Area() {

    }

    public Long getCODA() {
        return CODA;
    }

    public void setCODA(Long cODA) {
        CODA = cODA;
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

    public Set<Texto> getCodtexto() {
        return codtexto;
    }
    public void setCodtexto(Set<Texto> codtexto) {
        this.codtexto = codtexto;
    }


    @Override
    public String toString() {
        return "Area [CODA=" + CODA + ", codtexto=" + codtexto + ", estado=" + estado + ", nombre=" + nombre + "]";
    }
}
   
