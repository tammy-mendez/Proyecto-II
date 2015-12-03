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
import java.util.List;
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
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author tammy
 */
@Entity
@Table(name = "orden_compra")
@NamedQueries({
    @NamedQuery(name = "OrdenCompra.findAll", query = "SELECT o FROM OrdenCompra o"),
    @NamedQuery(name = "OrdenCompra.findByCodOrden", query = "SELECT o FROM OrdenCompra o WHERE o.codOrden = :codOrden"),
    @NamedQuery(name = "OrdenCompra.findByFecha", query = "SELECT o FROM OrdenCompra o WHERE o.fecha = :fecha"),
    @NamedQuery(name = "OrdenCompra.findByCodProveedor", query = "SELECT o FROM OrdenCompra o WHERE o.codProveedor = :codProveedor")})
 public class OrdenCompra implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_orden")
    private Integer codOrden;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @JoinColumn(name = "cod_proveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne
    private Proveedor codProveedor;
    public OrdenCompra() {
    }

    public OrdenCompra(Integer codOrden) {
        this.codOrden = codOrden;
    }

    public OrdenCompra(Integer codOrden, String fecha) {
        this.codOrden = codOrden;
        this.fecha = fecha;
    }

    public Integer getCodOrden() {
        return codOrden;
    }

    public void setCodOrden(Integer codOrden) {
        Integer oldCodOrden = this.codOrden;
        this.codOrden = codOrden;
        changeSupport.firePropertyChange("codOrden", oldCodOrden, codOrden);
    }

    public String getFecha() {
        return fecha;
    }

    public Proveedor getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Proveedor codProveedor) {
        Proveedor oldCodProveedor = this.codProveedor;
        this.codProveedor = codProveedor;
        changeSupport.firePropertyChange("codProveedor", oldCodProveedor, codProveedor);
    }

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codOrden != null ? codOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenCompra)) {
            return false;
        }
        OrdenCompra other = (OrdenCompra) object;
        if ((this.codOrden == null && other.codOrden != null) || (this.codOrden != null && !this.codOrden.equals(other.codOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.OrdenCompra[ codOrden=" + codOrden + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
