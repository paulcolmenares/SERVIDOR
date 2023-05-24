package com.example.demo;

import java.util.Arrays;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Persona {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long CODPER;
    
    @Column(length = 60, nullable = false)
    private String nombre;

    @Column()
    private String ap;

    @Column(length = 40)
    private String am;

    @Column(length = 1, nullable = false)
    private String genero;

    @Column(nullable = false)
    private Long estado;

    @Column(length = 1, nullable = false)
    private String tipoper;

    private byte[] foto;

 //relacion con la tabla usuario
    @OneToOne(mappedBy = "codper")
    private Usuario usu;

 //relacion con la tabla dato
    @OneToOne(mappedBy = "codper")
    private Dato coddato;

//relacion con la tabla telefono
    @OneToMany(mappedBy ="codper")
    private Set<Telefono> telefono;

    public Persona() {
    }

    public Long getCODPER() {
        return CODPER;
    }

    public void setCODPER(Long cODPER) {
        CODPER = cODPER;
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

    public String getTipoper() {
        return tipoper;
    }

    public void setTipoper(String tipoper) {
        this.tipoper = tipoper;
    }
   

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
   
    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Dato getCoddato() {
        return coddato;
    }

    public void setCoddato(Dato coddato) {
        this.coddato = coddato;
    }


    public Set<Telefono> getTelefono() {
        return telefono;
    }

    public void setTelefono(Set<Telefono> telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [CODPER=" + CODPER + ", am=" + am + ", ap=" + ap + ", coddato=" + coddato + ", estado=" + estado
                + ", foto=" + Arrays.toString(foto) + ", genero=" + genero + ", nombre=" + nombre + ", telefono="
                + telefono + ", tipoper=" + tipoper + ", usu=" + usu + "]";
    }

}
   
