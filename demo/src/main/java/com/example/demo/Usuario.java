package com.example.demo;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@Entity
public class Usuario {
    @Id
    @Column(length=15, nullable = false)
    private String LOGIN;

    @Column(length=200, nullable = false)
    private String passwd;

    @Column( nullable = true)
    private Long estado;

    //relacion con la tabla ejemplares
    @OneToMany (mappedBy = "perResp")
    private List<Ejemplar> codejem;

    @OneToMany (mappedBy = "perAnula")
    private List<Ejemplar> codejemp;

    //relacion con la tabla mdevol
    @OneToMany(mappedBy = "login")
    private List<MDevol> codmdev;

    //relacion con la tabla mprestamo
    @OneToMany(mappedBy = "login")
    private List<MPrestamo> codmpres;

    //relacion con la tabla persona
    @OneToOne(optional = true)
    private Persona codper;

    //relacion con la tabla rol
    @ManyToMany(mappedBy = "login")
    private Set<Rol> codr;

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String lOGIN) {
        LOGIN = lOGIN;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public List<Ejemplar> getCodejem() {
        return codejem;
    }

    public void setCodejem(List<Ejemplar> codejem) {
        this.codejem = codejem;
    }

    public List<Ejemplar> getCodejemp() {
        return codejemp;
    }

    public void setCodejemp(List<Ejemplar> codejemp) {
        this.codejemp = codejemp;
    }

    public List<MDevol> getCodmdev() {
        return codmdev;
    }

    public void setCodmdev(List<MDevol> codmdev) {
        this.codmdev = codmdev;
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
     

        public Set<Rol> getCodr() {
        return codr;
    }

    public void setCodr(Set<Rol> codr) {
        this.codr = codr;
    }


        @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((LOGIN == null) ? 0 : LOGIN.hashCode());
        result = prime * result + ((codejem == null) ? 0 : codejem.hashCode());
        result = prime * result + ((codejemp == null) ? 0 : codejemp.hashCode());
        result = prime * result + ((codmdev == null) ? 0 : codmdev.hashCode());
        result = prime * result + ((codmpres == null) ? 0 : codmpres.hashCode());
        result = prime * result + ((codper == null) ? 0 : codper.hashCode());
        result = prime * result + ((codr == null) ? 0 : codr.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((passwd == null) ? 0 : passwd.hashCode());
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
        Usuario other = (Usuario) obj;
        if (LOGIN == null) {
            if (other.LOGIN != null)
                return false;
        } else if (!LOGIN.equals(other.LOGIN))
            return false;
        if (codejem == null) {
            if (other.codejem != null)
                return false;
        } else if (!codejem.equals(other.codejem))
            return false;
        if (codejemp == null) {
            if (other.codejemp != null)
                return false;
        } else if (!codejemp.equals(other.codejemp))
            return false;
        if (codmdev == null) {
            if (other.codmdev != null)
                return false;
        } else if (!codmdev.equals(other.codmdev))
            return false;
        if (codmpres == null) {
            if (other.codmpres != null)
                return false;
        } else if (!codmpres.equals(other.codmpres))
            return false;
        if (codper == null) {
            if (other.codper != null)
                return false;
        } else if (!codper.equals(other.codper))
            return false;
        if (codr == null) {
            if (other.codr != null)
                return false;
        } else if (!codr.equals(other.codr))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (passwd == null) {
            if (other.passwd != null)
                return false;
        } else if (!passwd.equals(other.passwd))
            return false;
        return true;
    }

        @Override
    public String toString() {
        return "Usuario [LOGIN=" + LOGIN + ", codejem=" + codejem + ", codejemp=" + codejemp + ", codmdev=" + codmdev
                + ", codmpres=" + codmpres + ", codper=" + codper + ", codr=" + codr + ", estado=" + estado
                + ", passwd=" + passwd + "]";
    }

        public Usuario() {
        }
    public Usuario(String login, String passwd) {
        this.LOGIN = login;
           this.passwd = passwd;
       }
       @PrePersist
       public void nuevo(){
           passwd =new BCryptPasswordEncoder().encode(passwd);
           System.out.println("nuevo "+LOGIN+" "+passwd);
       }
   @PreUpdate
   public void actualizado(){
       passwd=new BCryptPasswordEncoder().encode(passwd);
       System.out.println("actualizado "+passwd+" "+LOGIN);
   }
   
}
   
