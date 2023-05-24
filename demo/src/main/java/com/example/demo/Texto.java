package com.example.demo;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Texto{
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODT;

    @Column(length = 150, nullable = false)
    private String titulo;

    @Column(length = 20)
    private String isbn;

    @Column(nullable = true)
    private Long estado;

     private Long edicion;

    @Column(length = 1000)
    private String  resumen;

   @Column( length = 8)
    private Date fechapub;

    //relacion con la tabla area
  @ManyToOne(optional = true)
  private Area coda;

    //relacion con la tabla editorial
    @ManyToOne(optional = true)
    private Editorial code ;

    //relacion con la tabla autor
  @ManyToMany(mappedBy = "codt")
    private Set<Autor> codaut;
 
 //relacion con la tabla tipoTex
    @ManyToMany(mappedBy= "codtext")
    private Set<Tipo> codtipo;

  //relacion con la tabla ejemplares
    @OneToMany(mappedBy = "codt")
    private Set<Ejemplar> codjemplar;

    public Texto() {
    }

    
    public Long getCODT() {
        return CODT;
    }


    public void setCODT(Long cODT) {
        CODT = cODT;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public Long getEdicion() {
        return edicion;
    }

    public void setEdicion(Long edicion) {
        this.edicion = edicion;
    }

    public Date getFechapub() {
        return fechapub;
    }

    public void setFechapub(Date fechapub) {
        this.fechapub = fechapub;
    }

    public Area sgetCoda() {
        return coda;
    }

    public void setCoda(Area coda) {
        this.coda = coda;
    }
    

    public Editorial getCode() {
        return code;
    }

    public void setCode(Editorial code) {
        this.code = code;
    }

    public Area getCoda() {
        return coda;
    }

    public Set<Autor> getCodaut() {
        return codaut;
    }

    public void setCodaut(Set<Autor> codaut) {
        this.codaut = codaut;
    }

    public Set<Tipo> getCodtipo() {
        return codtipo;
    }


    public void setCodtipo(Set<Tipo> codtipo) {
        this.codtipo = codtipo;
    }


    public Set<Ejemplar> getCodjemplar() {
        return codjemplar;
    }


    public void setCodjemplar(Set<Ejemplar> codjemplar) {
        this.codjemplar = codjemplar;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((CODT == null) ? 0 : CODT.hashCode());
        result = prime * result + ((coda == null) ? 0 : coda.hashCode());
        result = prime * result + ((codaut == null) ? 0 : codaut.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((codjemplar == null) ? 0 : codjemplar.hashCode());
        result = prime * result + ((codtipo == null) ? 0 : codtipo.hashCode());
        result = prime * result + ((edicion == null) ? 0 : edicion.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((fechapub == null) ? 0 : fechapub.hashCode());
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + ((resumen == null) ? 0 : resumen.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
        Texto other = (Texto) obj;
        if (CODT == null) {
            if (other.CODT != null)
                return false;
        } else if (!CODT.equals(other.CODT))
            return false;
        if (coda == null) {
            if (other.coda != null)
                return false;
        } else if (!coda.equals(other.coda))
            return false;
        if (codaut == null) {
            if (other.codaut != null)
                return false;
        } else if (!codaut.equals(other.codaut))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (codjemplar == null) {
            if (other.codjemplar != null)
                return false;
        } else if (!codjemplar.equals(other.codjemplar))
            return false;
        if (codtipo == null) {
            if (other.codtipo != null)
                return false;
        } else if (!codtipo.equals(other.codtipo))
            return false;
        if (edicion == null) {
            if (other.edicion != null)
                return false;
        } else if (!edicion.equals(other.edicion))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (fechapub == null) {
            if (other.fechapub != null)
                return false;
        } else if (!fechapub.equals(other.fechapub))
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (resumen == null) {
            if (other.resumen != null)
                return false;
        } else if (!resumen.equals(other.resumen))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Texto [CODT=" + CODT + ", coda=" + coda + ", codaut=" + codaut + ", code=" + code + ", codjemplar="
                + codjemplar + ", codtipo=" + codtipo + ", edicion=" + edicion + ", estado=" + estado + ", fechapub="
                + fechapub + ", isbn=" + isbn + ", resumen=" + resumen + ", titulo=" + titulo + "]";
    }

}