package com.example.demo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dato{
    @Id
    @Column (nullable = false)
    private Long CI;

    //relacion con la tabla Mprestamo
    @OneToMany(mappedBy = "ci")
    private List<MPrestamo> codmpres;

    //relacion con la tabla persona
    @OneToOne(optional = false)
    private Persona codper;

    public Dato() {
    }

    public Long getCI() {
        return CI;
    }

    public void setCI(Long cI) {
        CI = cI;
    }

    public List<MPrestamo> getCodmpres() {
        return codmpres;
    }

    public void setCodmpres(List<MPrestamo> codmpres) {
        this.codmpres = codmpres;
    }

    public Persona getCodper() {
        return codper;
    }

    public void setCodper(Persona codper) {
        this.codper = codper;
    }

   
    @Override
    public String toString() {
        return "Dato [CI=" + CI + ", codmpres=" + codmpres + ", codper=" + codper + "]";
    }

}
   
