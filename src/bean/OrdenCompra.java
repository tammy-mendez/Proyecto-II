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
 * @author pc
 */
@Entity
@Table(name = "orden_compra")
@NamedQueries({
    @NamedQuery(name = "OrdenCompra.findAll", query = "SELECT o FROM OrdenCompra o"),
    @NamedQuery(name = "OrdenCompra.findByCodOrden", query = "SELECT o FROM OrdenCompra o WHERE o.codOrden = :codOrden"),
    @NamedQuery(name = "OrdenCompra.findByFecha", query = "SELECT o FROM OrdenCompra o WHERE o.fecha = :fecha"),
    @NamedQuery(name = "OrdenCompra.findByCodProveedor", query = "SELECT o FROM OrdenCompra o WHERE o.codProveedor = :codProveedor")})
  //  @NamedQuery(name = "OrdenCompra.findByDetalle", query = "SELECT o FROM OrdenCompra o WHERE o.detalle = :detalle")})
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
  //  @Basic(optional = false)
  //  @Column(name = "detalle")
   // private Collection<DetalleOrdenCompra> detalle;
//    private List<DetalleOrdenCompra> detalle;
 // private List<Integer> detalle;
  //private String detalle; 
    @JoinColumn(name = "cod_proveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne
    private Proveedor codProveedor;
  //  private Integer codDetalle;
    //private Integer cant;
    //private Integer codArticulo;
    public OrdenCompra() {
    }

    public OrdenCompra(Integer codOrden) {
        this.codOrden = codOrden;
    }

    public OrdenCompra(Integer codOrden, String fecha
          //  , String detalle
    ) {
        this.codOrden = codOrden;
        this.fecha = fecha;
      // this.detalle = detalle;
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

/*
    public String getDetalle() {
    return detalle;
    }
    public void setDetalle(String detalle) {
    this.detalle = detalle;
    }
     */
/*        public Collection<DetalleOrdenCompra> getDetalle() {
    return detalle;
    }
    public void setDetalle(Collection<DetalleOrdenCompra> detalle) {
    this.detalle = detalle;
    }*/
    /*  public List<DetalleOrdenCompra> getDetalle() {
    return detalle;
    }
    public void setDetalle(List<DetalleOrdenCompra> detalle) {
    int cant;
    this.detalle = detalle;
    }*/
/*
    public List<Integer> getDetalle() {
    return detalle;
    }
    public void setDetalle(List<Integer> detalle) {
    this.detalle = detalle;
    }
     */
    /*public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
*/

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
