package com.example.demo;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Autor {
    @Id 
    @Column(nullable = false)
    @GeneratedValue
    private Long CODA;

    @Column(length = 60, nullable = false)
    private String nombre;

    @Column(length = 40)
    private String ap;

    @Column(length = 40)
    private String am;

    @Column(length = 1)
    private String genero;

    @Column(nullable = false)
    private Long estado;

    //relacion con la tabla texto
    @ManyToMany
    @JoinTable(name = "Escriben")
    private Set<Texto> codt;

    public Autor() {
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

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public Set<Texto> getCodt() {
        return codt;
    }

    public void setCodt(Set<Texto> codt) {
        this.codt = codt;
    }

    @Override
    public String toString() {
        return "Autor [CODA=" + CODA + ", am=" + am + ", ap=" + ap + ", codt=" + codt + ", estado=" + estado
                + ", genero=" + genero + ", nombre=" + nombre + "]";
    }

}