package com.example.demo;

import java.io.Serializable;

public class tips  implements Serializable{
    
    Texto codt;
    Tipo codtipo;
    

    public tips() {
    }

    
    public Texto getCodt() {
        return codt;
    }


    public void setCodt(Texto codt) {
        this.codt = codt;
    }


    public Tipo getCodtipo() {
        return codtipo;
    }


    public void setCodtipo(Tipo codtipo) {
        this.codtipo = codtipo;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codt == null) ? 0 : codt.hashCode());
        result = prime * result + ((codtipo == null) ? 0 : codtipo.hashCode());
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
        tips other = (tips) obj;
        if (codt == null) {
            if (other.codt != null)
                return false;
        } else if (!codt.equals(other.codt))
            return false;
        if (codtipo == null) {
            if (other.codtipo != null)
                return false;
        } else if (!codtipo.equals(other.codtipo))
            return false;
        return true;
    }

    
}

