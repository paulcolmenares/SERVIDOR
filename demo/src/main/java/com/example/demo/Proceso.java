package com.example.demo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Proceso {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long codp;

    @Column(length = 40, nullable = false)
    private String nombre;

    @Column(length = 60, nullable = false)
    private String enlace;

    @Column(nullable = false)
    private Long estado;
    
      //relacion con la tabla menu
      @ManyToMany(mappedBy = "codp")
      private Set<Menu> codm;

    public Proceso() {
    }
    public Long getCodp() {
        return codp;
    }
    public void setCodp(Long codp) {
        this.codp = codp;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEnlace() {
        return enlace;
    }
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    public Long getEstado() {
        return estado;
    }
    public void setEstado(Long estado) {
        this.estado = estado;
    }
  
    public Set<Menu> getCodm() {
        return codm;
    }
    public void setCodm(Set<Menu> codm) {
        this.codm = codm;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codm == null) ? 0 : codm.hashCode());
        result = prime * result + ((codp == null) ? 0 : codp.hashCode());
        result = prime * result + ((enlace == null) ? 0 : enlace.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Proceso other = (Proceso) obj;
        if (codm == null) {
            if (other.codm != null)
                return false;
        } else if (!codm.equals(other.codm))
            return false;
        if (codp == null) {
            if (other.codp != null)
                return false;
        } else if (!codp.equals(other.codp))
            return false;
        if (enlace == null) {
            if (other.enlace != null)
                return false;
        } else if (!enlace.equals(other.enlace))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Proceso [codm=" + codm + ", codp=" + codp + ", enlace=" + enlace + ", estado=" + estado + ", nombre="
                + nombre + "]";
    }
    
}
   
