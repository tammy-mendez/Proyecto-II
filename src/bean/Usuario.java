/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCodigoEmpleado", query = "SELECT u FROM Usuario u WHERE u.codigoEmpleado = :codigoEmpleado"),
    @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password")})
public class Usuario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigoEmpleado")
    private Integer codigoEmpleado;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    //@OneToMany
    //@Basic(optional = false)
    //@Column(name = "idRol")
    //private Integer idRol;
    
    @JoinColumn(name = "idRol", referencedColumnName="idRol")
    @ManyToOne
    //Column(name = "idRol")
    private Rol idRol;

    public Usuario() {
    }

    public Usuario(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Usuario(Integer codigoEmpleado, String password) {
        this.codigoEmpleado = codigoEmpleado;
        this.password = password;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        Integer oldCodigoEmpleado = this.codigoEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        changeSupport.firePropertyChange("codigoEmpleado", oldCodigoEmpleado, codigoEmpleado);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        Rol oldIdRol = this.idRol;
        this.idRol = idRol;
        changeSupport.firePropertyChange("idRol", oldIdRol, idRol);
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEmpleado != null ? codigoEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codigoEmpleado == null && other.codigoEmpleado != null) || (this.codigoEmpleado != null && !this.codigoEmpleado.equals(other.codigoEmpleado))) {
            return false;
        }
        return true;
    }

    /*   @Override
    public String toString() {
    return "bean.Usuario[ codigoEmpleado=" + codigoEmpleado + " ]";
    }*/
    @Override
    public String toString() {
        return  "codigoEmpleado=" + codigoEmpleado  +  ", idRol=" + idRol;
    }
    

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
