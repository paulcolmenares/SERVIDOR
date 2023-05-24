package com.example.demo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Menu {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODM;

    @Column(length = 40, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Long estado;

    // relacion con la tabla rol
    @ManyToMany()
    @JoinTable(name = "rolme")
    private Set<Rol> codrol;

    // relacion con la tabla proceso
    @ManyToMany()
    @JoinTable(name = "mepro")
    private Set<Proceso> codp;

    public Menu() {
    }

    public Long getCODM() {
        return CODM;
    }

    public void setCODM(Long cODM) {
        CODM = cODM;
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

    public Set<Rol> getCodrol() {
        return codrol;
    }

    public void setCodrol(Set<Rol> codrol) {
        this.codrol = codrol;
    }

    public Set<Proceso> getCodp() {
        return codp;
    }

    public void setCodp(Set<Proceso> codp) {
        this.codp = codp;
    }

    @Override
    public String toString() {
        return "Menu [codm=" + CODM + ", codp=" + codp + ", codrol=" + codrol + ", estado=" + estado + ", nombre="
                + nombre + "]";
    }
}