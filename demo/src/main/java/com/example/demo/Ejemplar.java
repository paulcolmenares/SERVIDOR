package com.example.demo;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ejemplar {
    @Id
    @Column(nullable = false)
    private Long CODINV;

    @Column(nullable = false)
    private Long disponible;

    @Column(nullable = false)
    private Long estado;

    // relacion con la tabla texto
    @ManyToOne(optional = true)
    private Texto codt;

    // relacion con la tabla usuarios
    @ManyToOne(optional = true)
    private Usuario perResp;

    @ManyToOne(optional = true)
    private Usuario perAnula;

    // relacion con la tabla mdevol
    @ManyToMany()
    @JoinTable(name = "DDevol", joinColumns = @JoinColumn(nullable = false), inverseJoinColumns = @JoinColumn(nullable = false))
    private Set<MDevol> codd;

    // relacion con la tabla DPrestamo
    @ManyToMany(mappedBy = "codinv")
    private Set<MPrestamo> codp;

    public Ejemplar() {
    }

    public Long getCODINV() {
        return CODINV;
    }

    public void setCODINV(Long cODINV) {
        CODINV = cODINV;
    }

    public Long getDisponible() {
        return disponible;
    }

    public void setDisponible(Long disponible) {
        this.disponible = disponible;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public Texto getCodt() {
        return codt;
    }

    public void setCodt(Texto codt) {
        this.codt = codt;
    }

    public Usuario getPerResp() {
        return perResp;
    }

    public void setPerResp(Usuario perResp) {
        this.perResp = perResp;
    }

    public Usuario getPerAnula() {
        return perAnula;
    }

    public void setPerAnula(Usuario perAnula) {
        this.perAnula = perAnula;
    }

    public Set<MDevol> getCodd() {
        return codd;
    }

    public void setCodd(Set<MDevol> codd) {
        this.codd = codd;
    }

    public Set<MPrestamo> getCodp() {
        return codp;
    }

    public void setCodp(Set<MPrestamo> codp) {
        this.codp = codp;
    }

   

    @Override
    public String toString() {
        return "Ejemplar [CODINV=" + CODINV + ", codd=" + codd + ", codp=" + codp + ", codt=" + codt + ", disponible="
                + disponible + ", estado=" + estado + ", perAnula=" + perAnula + ", perResp=" + perResp + "]";
    }

}
