package com.example.demo;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editorial {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODE;
    
    @Column(length = 40, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Long estado;

    @OneToMany(mappedBy = "code")
    private Set<Texto> codtexto;

    
    public Editorial() {
    }

    public Long getCODE() {
        return CODE;
    }

    public void setCODE(Long cODE) {
        CODE = cODE;
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
        return "Editorial [CODE=" + CODE + ", codtexto=" + codtexto + ", estado=" + estado + ", nombre=" + nombre + "]";
    }

}
