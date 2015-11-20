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
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "detalle_facturacompra")
@NamedQueries({
    @NamedQuery(name = "DetalleFacturacompra.findAll", query = "SELECT d FROM DetalleFacturacompra d"),
    @NamedQuery(name = "DetalleFacturacompra.findByNumFactura", query = "SELECT d FROM DetalleFacturacompra d WHERE d.numFactura = :numFactura"),
    @NamedQuery(name = "DetalleFacturacompra.findByCodArticulo", query = "SELECT d FROM DetalleFacturacompra d WHERE d.codArticulo = :codArticulo"),
    @NamedQuery(name = "DetalleFacturacompra.findByCantidad", query = "SELECT d FROM DetalleFacturacompra d WHERE d.cantidad = :cantidad")})
public class DetalleFacturacompra implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numFactura")
    private Integer numFactura;
    @Column(name = "codArticulo")
    private Integer codArticulo;
   // @JoinColumn(name = "codArticulo", referencedColumnName = "codigoArticulo", updatable = false, insertable = false)
   // @ManyToOne
   // private Articulo codArticulo;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "numFactura", referencedColumnName = "num_factura", updatable = false, insertable = false)
    @ManyToOne
    private FacturaPago numfactura;

    public DetalleFacturacompra() {
    }

    public DetalleFacturacompra(Integer numFactura) {
        this.numFactura = numFactura;
    }

    public Integer getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(Integer numFactura) {
        Integer oldNumFactura = this.numFactura;
        this.numFactura = numFactura;
        changeSupport.firePropertyChange("numFactura", oldNumFactura, numFactura);
    }

   public Integer getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(Integer codArticulo) {
        Integer oldCodArticulo = this.codArticulo;
        this.codArticulo = codArticulo;
        changeSupport.firePropertyChange("codArticulo", oldCodArticulo, codArticulo);
    }

/*    public Articulo getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(Articulo codArticulo) {
      //  this.codArticulo = codArticulo;
        Articulo oldCodArticulo = this.codArticulo;
        this.codArticulo = codArticulo;
        changeSupport.firePropertyChange("codArticulo", oldCodArticulo, codArticulo);
    }*/


    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Integer oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numFactura != null ? numFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturacompra)) {
            return false;
        }
        DetalleFacturacompra other = (DetalleFacturacompra) object;
        if ((this.numFactura == null && other.numFactura != null) || (this.numFactura != null && !this.numFactura.equals(other.numFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.DetalleFacturacompra[ numFactura=" + numFactura + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public FacturaPago getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(FacturaPago numfactura) {
        FacturaPago oldNumfactura = this.numfactura;
        this.numfactura = numfactura;
        changeSupport.firePropertyChange("numfactura", oldNumfactura, numfactura);
    }
    
}
