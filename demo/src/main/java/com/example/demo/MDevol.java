package com.example.demo;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class MDevol {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODD;

    @Column(length = 8, nullable = false)
    private Date fecha;

    @Column(length = 15, nullable = false)
    private Long estado;

    // relacion con la tabla ejemplar
    @ManyToMany(mappedBy = "codd")
    private Set<Ejemplar> codinv;

    // relacion con la tabla usuarios
    @ManyToOne(optional = false)
    private Usuario login;

    // relacion con la tabla mprestamo
    @ManyToOne(optional = false)
    private MPrestamo codp;

    public MDevol() {
    }

    public Long getCODD() {
        return CODD;
    }

    public void setCODD(Long cODD) {
        CODD = cODD;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

   

    public Set<Ejemplar> getCodinv() {
        return codinv;
    }

    public void setCodinv(Set<Ejemplar> codinv) {
        this.codinv = codinv;
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

    public MPrestamo getCodp() {
        return codp;
    }

    public void setCodp(MPrestamo codp) {
        this.codp = codp;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((CODD == null) ? 0 : CODD.hashCode());
        result = prime * result + ((codinv == null) ? 0 : codinv.hashCode());
        result = prime * result + ((codp == null) ? 0 : codp.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MDevol other = (MDevol) obj;
        if (CODD == null) {
            if (other.CODD != null)
                return false;
        } else if (!CODD.equals(other.CODD))
            return false;
        if (codinv == null) {
            if (other.codinv != null)
                return false;
        } else if (!codinv.equals(other.codinv))
            return false;
        if (codp == null) {
            if (other.codp != null)
                return false;
        } else if (!codp.equals(other.codp))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (login == null) {
            if (other.login != null)
                return false;
        } else if (!login.equals(other.login))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MDevol [CODD=" + CODD + ", codinv=" + codinv + ", codp=" + codp + ", estado=" + estado + ", fecha="
                + fecha + ", login=" + login + "]";
    }

}
