package com.example.demo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MPrestamo implements Serializable {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODP;

    @Column(length = 8, nullable = false)
    private Date fecha;

    @Column(length = 8, nullable = false)
    private Date fini;

    @Column(length = 8, nullable = false)
    private Date ffin;

    @Column(nullable = false)
    private Long tipopres;

    @Column(nullable = false)
    private Long estado;

    // relacion con la tabla dato
    @ManyToOne(optional = true)
    private Dato ci;

    // relacion con la tabla usuario
    @ManyToOne(optional = true)
    private Usuario login;

    // relacion con la tabla Ejemplar
    @ManyToMany
    @JoinTable(name = "dprestamo")
    private Set<Ejemplar> codinv;

    // relacion con la tabla mdevol
    @OneToMany(mappedBy = "codp")
    private List<MDevol> codmdev;

    public MPrestamo() {
    }

    public Long getCODP() {
        return CODP;
    }

    public void setCODP(Long cODP) {
        CODP = cODP;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFini() {
        return fini;
    }

    public void setFini(Date fini) {
        this.fini = fini;
    }

    public Date getFfin() {
        return ffin;
    }

    public void setFfin(Date ffin) {
        this.ffin = ffin;
    }

    public Long getTipopres() {
        return tipopres;
    }

    public void setTipopres(Long tipopres) {
        this.tipopres = tipopres;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public List<MDevol> getCodmdev() {
        return codmdev;
    }

    public void setCodmdev(List<MDevol> codmdev) {
        this.codmdev = codmdev;
    }

    public Dato getCi() {
        return ci;
    }

    public void setCi(Dato ci) {
        this.ci = ci;
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "MPrestamo [CODP=" + CODP + ", ci=" + ci + ", codinv=" + codinv + ", codmdev=" + codmdev + ", estado="
                + estado + ", fecha=" + fecha + ", ffin=" + ffin + ", fini=" + fini + ", login=" + login + ", tipopres="
                + tipopres + "]";
    }

}