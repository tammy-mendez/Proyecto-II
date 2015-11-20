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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "producto_servicio")
@NamedQueries({
    @NamedQuery(name = "ProductoServicio.findAll", query = "SELECT p FROM ProductoServicio p"),
    @NamedQuery(name = "ProductoServicio.findByCodigoPS", query = "SELECT p FROM ProductoServicio p WHERE p.codigoPS = :codigoPS"),
    @NamedQuery(name = "ProductoServicio.findByNombre", query = "SELECT p FROM ProductoServicio p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "ProductoServicio.findByCosto", query = "SELECT p FROM ProductoServicio p WHERE p.costo = :costo")})
public class ProductoServicio implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoPS")
    private Integer codigoPS;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "costo")
    private int costo;
  
    private Collection<ConsumoProSer> consumoProSerCollection;

    public ProductoServicio() {
    }

    public ProductoServicio(Integer codigoPS) {
        this.codigoPS = codigoPS;
    }

    public ProductoServicio(Integer codigoPS, String nombre, int costo) {
        this.codigoPS = codigoPS;
        this.nombre = nombre;
        this.costo = costo;
    }

    public Integer getCodigoPS() {
        return codigoPS;
    }

    public void setCodigoPS(Integer codigoPS) {
        Integer oldCodigoPS = this.codigoPS;
        this.codigoPS = codigoPS;
        changeSupport.firePropertyChange("codigoPS", oldCodigoPS, codigoPS);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        int oldCosto = this.costo;
        this.costo = costo;
        changeSupport.firePropertyChange("costo", oldCosto, costo);
    }

  

    public Collection<ConsumoProSer> getConsumoProSerCollection() {
        return consumoProSerCollection;
    }

    public void setConsumoProSerCollection(Collection<ConsumoProSer> consumoProSerCollection) {
        Collection<ConsumoProSer> oldConsumoProSerCollection = this.consumoProSerCollection;
        this.consumoProSerCollection = consumoProSerCollection;
        changeSupport.firePropertyChange("consumoProSerCollection", oldConsumoProSerCollection, consumoProSerCollection);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPS != null ? codigoPS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoServicio)) {
            return false;
        }
        ProductoServicio other = (ProductoServicio) object;
        if ((this.codigoPS == null && other.codigoPS != null) || (this.codigoPS != null && !this.codigoPS.equals(other.codigoPS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.ProductoServicio[ codigoPS=" + codigoPS + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
