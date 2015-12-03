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
@Table(name = "actividad")
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a"),
    @NamedQuery(name = "Actividad.findByCodActividad", query = "SELECT a FROM Actividad a WHERE a.codActividad = :codActividad"),
    @NamedQuery(name = "Actividad.findByNombre", query = "SELECT a FROM Actividad a WHERE a.nombre = :nombre")})
public class Actividad implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codActividad")
    private Integer codActividad;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad")
    private Collection<SeguimientoActividad> seguimientoActividadCollection;

    public Actividad() {
    }

    public Actividad(Integer codActividad) {
        this.codActividad = codActividad;
    }

    public Actividad(Integer codActividad, String nombre) {
        this.codActividad = codActividad;
        this.nombre = nombre;
    }

    public Integer getCodActividad() {
        return codActividad;
    }

    public void setCodActividad(Integer codActividad) {
        Integer oldCodActividad = this.codActividad;
        this.codActividad = codActividad;
        changeSupport.firePropertyChange("codActividad", oldCodActividad, codActividad);
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
        hash += (codActividad != null ? codActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.codActividad == null && other.codActividad != null) || (this.codActividad != null && !this.codActividad.equals(other.codActividad))) {
            return false;
        }
        return true;
    }

    /*  @Override
    public String toString() {
    return "bean.Actividad[ codActividad=" + codActividad + " ]";
    }*/
    @Override
    public String toString() {
        return "codActividad=" + codActividad + ", nombre=" + nombre;
    }
    

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
