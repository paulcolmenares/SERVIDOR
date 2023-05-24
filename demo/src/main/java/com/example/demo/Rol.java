package com.example.demo;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Rol implements Serializable {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODR;

    @Column(length = 40, nullable = false)
    private String nombre;

    @Column(nullable = true)
    private Long estado;

    // relacion con la tabla usuario
    @ManyToMany
    @JoinTable(name = "rolusu")
    private Set<Usuario> login;

    // relacion con la tabla menu
    @ManyToMany(mappedBy = "codrol")
    private Set<Menu> codme;

    public Rol() {
    }

    public Long getCODR() {
        return CODR;
    }

    public void setCODR(Long cODR) {
        CODR = cODR;
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

    public Set<Usuario> getLogin() {
        return login;
    }

    public void setLogin(Set<Usuario> login) {
        this.login = login;
    }

    public Set<Menu> getCodme() {
        return codme;
    }

    public void setCodme(Set<Menu> codme) {
        this.codme = codme;
    }

    @Override
    public String toString() {
        return "Rol [codme=" + codme + ", codr=" + CODR + ", estado=" + estado + ", login=" + login + ", nombre="
                + nombre + "]";
    }
}
