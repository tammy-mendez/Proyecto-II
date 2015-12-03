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
@Table(name = "detalle_orden_compra")
@NamedQueries({
    @NamedQuery(name = "DetalleOrdenCompra.findAll", query = "SELECT d FROM DetalleOrdenCompra d"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCodDetalle", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.codDetalle = :codDetalle"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCantidadPedida", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.cantidadPedida = :cantidadPedida"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCantidadRecibida", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.cantidadRecibida = :cantidadRecibida"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCodArticulo", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.codArticulo = :codArticulo"),
   // @NamedQuery(name = "DetalleOrdenCompra.findByCodProveedor", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.codProveedor = :codProveedor"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCodOrden", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.codOrden = :codOrden"),
    @NamedQuery(name = "DetalleOrdenCompra.findByEstado", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.estado = :estado")})
public class DetalleOrdenCompra implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_detalle")
    private Integer codDetalle;
   // @Basic(optional = false)
    //@Column(name = "cod_orden")
   // private Integer codOrden;
    
    @Basic(optional = false)
    @Column(name = "cantidadPedida")
    private int cantidadPedida;
     @Basic(optional = false)
    @Column(name = "cantidadRecibida")
    private int cantidadRecibida;
    @Column(name = "estado")
    private String estado;
    /*@JoinColumn(name = "cod_proveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne
    private Proveedor codProveedor;*/
    @JoinColumn(name = "cod_orden", referencedColumnName = "cod_orden")
    @ManyToOne
    private OrdenCompra codOrden;
    @JoinColumn(name = "cod_articulo", referencedColumnName = "codigoArticulo")
   @ManyToOne
   private Articulo codArticulo;




    public DetalleOrdenCompra() {
    }

    public DetalleOrdenCompra(Integer codDetalle) {
        this.codDetalle = codDetalle;
    }

    public DetalleOrdenCompra(Integer codDetalle, int cantidadPedida) {
        this.codDetalle = codDetalle;
        this.cantidadPedida = cantidadPedida;
    }

    public Integer getCodDetalle() {
        return codDetalle;
    }

    public void setCodDetalle(Integer codDetalle) {
        Integer oldCodDetalle = this.codDetalle;
        this.codDetalle = codDetalle;
        changeSupport.firePropertyChange("codDetalle", oldCodDetalle, codDetalle);
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(int cantidadPedida) {
        int oldCantidadPedida = this.cantidadPedida;
        this.cantidadPedida = cantidadPedida;
        changeSupport.firePropertyChange("cantidadPedida", oldCantidadPedida, cantidadPedida);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

   /* public Proveedor getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Proveedor codProveedor) {
        Proveedor oldCodProveedor = this.codProveedor;
        this.codProveedor = codProveedor;
        changeSupport.firePropertyChange("codProveedor", oldCodProveedor, codProveedor);
    }*/

    public Articulo getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(Articulo codArticulo) {
        Articulo oldCodArticulo = this.codArticulo;
        this.codArticulo = codArticulo;
        changeSupport.firePropertyChange("codArticulo", oldCodArticulo, codArticulo);
    }

    public int getCantidadRecibida() {
        return cantidadRecibida;
    }

    public void setCantidadRecibida(int cantidadRecibida) {
        int oldCantidadRecibida = this.cantidadRecibida;
        this.cantidadRecibida = cantidadRecibida;
        changeSupport.firePropertyChange("cantidadRecibida", oldCantidadRecibida, cantidadRecibida);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDetalle != null ? codDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOrdenCompra)) {
            return false;
        }
        DetalleOrdenCompra other = (DetalleOrdenCompra) object;
        if ((this.codDetalle == null && other.codDetalle != null) || (this.codDetalle != null && !this.codDetalle.equals(other.codDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.DetalleOrdenCompra[ codDetalle=" + codDetalle + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    /*  public Integer getCodOrden() {
    return codOrden;
    }
    public void setCodOrden(Integer codOrden) {
    Integer oldCodOrden = this.codOrden;
    this.codOrden = codOrden;
    changeSupport.firePropertyChange("codOrden", oldCodOrden, codOrden);
    }*/
    public OrdenCompra getCodOrden() {
        return codOrden;
    }

    public void setCodOrden(OrdenCompra codOrden) {
        OrdenCompra oldCodOrden = this.codOrden;
        this.codOrden = codOrden;
        changeSupport.firePropertyChange("codOrden", oldCodOrden, codOrden);
    }
    
}
