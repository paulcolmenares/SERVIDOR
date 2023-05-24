package com.example.demo;

import java.io.Serializable;

public class pres implements Serializable {
    MPrestamo codp;
    Ejemplar codinv;
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codinv == null) ? 0 : codinv.hashCode());
        result = prime * result + ((codp == null) ? 0 : codp.hashCode());
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
        pres other = (pres) obj;
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
        return true;
    }

    
    
}
