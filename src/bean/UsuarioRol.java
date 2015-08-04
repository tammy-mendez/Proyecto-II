/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "usuario_rol")
@NamedQueries({
    @NamedQuery(name = "UsuarioRol.findAll", query = "SELECT u FROM UsuarioRol u"),
    @NamedQuery(name = "UsuarioRol.findByCodigoRU", query = "SELECT u FROM UsuarioRol u WHERE u.codigoRU = :codigoRU")})
public class UsuarioRol implements Serializable {
     @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoRU")
    private Integer codigoRU;
    
    @OneToMany
    @Basic(optional = false)
    @Column(name = "idRol")
    private Integer idRol;
    @OneToMany
    @Basic(optional = false)
    @Column(name = "codigoEmpleado")
    private Integer codigoEmpleado;

    public UsuarioRol() {
    }

    public UsuarioRol(Integer codigoRU) {
        this.codigoRU = codigoRU;
    }

    public Integer getCodigoRU() {
        return codigoRU;
    }

    public void setCodigoRU(Integer codigoRU) {
        this.codigoRU = codigoRU;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setIdRol(Integer idRol) {
        Integer oldIdRol=this.idRol;
        this.idRol=idRol;
        changeSupport.firePropertyChange("idRol", oldIdRol, idRol);
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        Integer oldCodigoEmpleado=this.codigoEmpleado;
        this.codigoEmpleado=codigoEmpleado;
        changeSupport.firePropertyChange("codigoEmpleado", oldCodigoEmpleado, codigoEmpleado);
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoRU != null ? codigoRU.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioRol)) {
            return false;
        }
        UsuarioRol other = (UsuarioRol) object;
        if ((this.codigoRU == null && other.codigoRU != null) || (this.codigoRU != null && !this.codigoRU.equals(other.codigoRU))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.UsuarioRol[ codigoRU=" + codigoRU + " ]";
    }
    
}
