/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "lugar")
@NamedQueries({
    @NamedQuery(name = "Lugar.findAll", query = "SELECT l FROM Lugar l"),
    @NamedQuery(name = "Lugar.findByCodLugar", query = "SELECT l FROM Lugar l WHERE l.codLugar = :codLugar"),
    @NamedQuery(name = "Lugar.findByNombre", query = "SELECT l FROM Lugar l WHERE l.nombre = :nombre")})
public class Lugar implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codLugar")
    private Integer codLugar;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lugar")
    private Collection<SeguimientoActividad> seguimientoActividadCollection;

    public Lugar() {
    }

    public Lugar(Integer codLugar) {
        this.codLugar = codLugar;
    }

    public Lugar(Integer codLugar, String nombre) {
        this.codLugar = codLugar;
        this.nombre = nombre;
    }

    public Integer getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(Integer codLugar) {
        Integer oldCodLugar = this.codLugar;
        this.codLugar = codLugar;
        changeSupport.firePropertyChange("codLugar", oldCodLugar, codLugar);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Collection<SeguimientoActividad> getSeguimientoActividadCollection() {
        return seguimientoActividadCollection;
    }

    public void setSeguimientoActividadCollection(Collection<SeguimientoActividad> seguimientoActividadCollection) {
        this.seguimientoActividadCollection = seguimientoActividadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLugar != null ? codLugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugar)) {
            return false;
        }
        Lugar other = (Lugar) object;
        if ((this.codLugar == null && other.codLugar != null) || (this.codLugar != null && !this.codLugar.equals(other.codLugar))) {
            return false;
        }
        return true;
    }

    /*  @Override
    public String toString() {
    return "bean.Lugar[ codLugar=" + codLugar + " ]";
    }*/
    @Override
    public String toString() {
        return "codLugar=" + codLugar + ", nombre=" + nombre;
    }
    

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
