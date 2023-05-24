package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefono{ 

    @Id
    @Column(length = 20, nullable = false)
    private Long NUMERO ;
    
    //relacion con la tabla persona
    @ManyToOne(optional = true)
    private Persona codper;
    
   
    public Telefono() {
    }
    
    public Long getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(Long nUMERO) {
        NUMERO = nUMERO;
    }

    public Persona getCodper() {
        return codper;
    }


    public void setCodper(Persona codper) {
        this.codper = codper;
    }


    @Override
    public String toString() {
        return "Telefono [NUMERO=" + NUMERO + ", codper=" + codper + "]";
    }
} 