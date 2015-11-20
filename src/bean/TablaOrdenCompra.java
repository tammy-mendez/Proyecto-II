/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

//import javaapplication1.Proveedor;
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
 * @author tammy
 */
@Entity
@Table(name = "tabla_orden_compra")
@NamedQueries({
    @NamedQuery(name = "TablaOrdenCompra.findAll", query = "SELECT t FROM TablaOrdenCompra t"),
    @NamedQuery(name = "TablaOrdenCompra.findByCodigoOrden", query = "SELECT t FROM TablaOrdenCompra t WHERE t.codigoOrden = :codigoOrden"),
    @NamedQuery(name = "TablaOrdenCompra.findByCodigoProveedor", query = "SELECT t FROM TablaOrdenCompra t WHERE t.codigoProveedor = :codigoProveedor"),
    @NamedQuery(name = "TablaOrdenCompra.findByCodigoArticulo", query = "SELECT t FROM TablaOrdenCompra t WHERE t.codigoArticulo = :codigoArticulo"),
    @NamedQuery(name = "TablaOrdenCompra.findByCantidadPedida", query = "SELECT t FROM TablaOrdenCompra t WHERE t.cantidadPedida = :cantidadPedida"),
    @NamedQuery(name = "TablaOrdenCompra.findByFecha", query = "SELECT t FROM TablaOrdenCompra t WHERE t.fecha = :fecha")})
public class TablaOrdenCompra implements Serializable {
//    @OneToMany(mappedBy = "codOC")
 //   private Collection<Informerecepcion> informerecepcionCollection;
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_orden")
    private Integer codigoOrden;
     @JoinColumn(name = "codigo_proveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne(optional = false)
    private Proveedor codigoProveedor;
   
  //  @Column(name = "codigo_proveedor")
   // private Integer codigoProveedor;
    @JoinColumn(name = "codigo_articulo", referencedColumnName = "codigoArticulo")
    @ManyToOne(optional = false)
    private Articulo codigoArticulo;
 //   @Column(name = "codigo_articulo")
  //  private Integer codigoArticulo;
    @Column(name = "cantidadPedida")
    private Integer cantidadPedida;
    @Column(name = "fecha")
    private String fecha;

    public TablaOrdenCompra() {
    }

    public TablaOrdenCompra(Integer codigoOrden) {
        this.codigoOrden = codigoOrden;
    }

    public Integer getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(Integer codigoOrden) {
        Integer oldCodigoOrden = this.codigoOrden;
        this.codigoOrden = codigoOrden;
        changeSupport.firePropertyChange("codigoOrden", oldCodigoOrden, codigoOrden);
    }

/*
    public Integer getCodigoProveedor() {
    return codigoProveedor;
    }
    public void setCodigoProveedor(Integer codigoProveedor) {
    Integer oldCodigoProveedor = this.codigoProveedor;
    this.codigoProveedor = codigoProveedor;
    changeSupport.firePropertyChange("codigoProveedor", oldCodigoProveedor, codigoProveedor);
    }*/
    public Proveedor getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Proveedor codigoProveedor) {
        Proveedor oldCodigoProveedor = this.codigoProveedor;
        this.codigoProveedor = codigoProveedor;
        changeSupport.firePropertyChange("codigoProveedor", oldCodigoProveedor, codigoProveedor);
    }
    

    /*  public Articulo getCodigoArticulo() {
    return codigoArticulo;
    }
    public void setCodigoArticulo(Articulo codigoArticulo) {
    Articulo oldCodigoArticulo = this.codigoArticulo;
    this.codigoArticulo = codigoArticulo;
    changeSupport.firePropertyChange("codigoArticulo", oldCodigoArticulo, codigoArticulo);
    }*/
  /*  public Integer getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(Integer codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }*/
    

    public Articulo getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(Articulo codigoArticulo) {
        Articulo oldCodigoArticulo = this.codigoArticulo;
        this.codigoArticulo = codigoArticulo;
        changeSupport.firePropertyChange("codigoArticulo", oldCodigoArticulo, codigoArticulo);
    }

    

    public Integer getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(Integer cantidadPedida) {
        Integer oldCantidadPedida = this.cantidadPedida;
        this.cantidadPedida = cantidadPedida;
        changeSupport.firePropertyChange("cantidadPedida", oldCantidadPedida, cantidadPedida);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoOrden != null ? codigoOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablaOrdenCompra)) {
            return false;
        }
        TablaOrdenCompra other = (TablaOrdenCompra) object;
        if ((this.codigoOrden == null && other.codigoOrden != null) || (this.codigoOrden != null && !this.codigoOrden.equals(other.codigoOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.TablaOrdenCompra[ codigoOrden=" + codigoOrden + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

  /*  public Collection<Informerecepcion> getInformerecepcionCollection() {
        return informerecepcionCollection;
    }

    public void setInformerecepcionCollection(Collection<Informerecepcion> informerecepcionCollection) {
        this.informerecepcionCollection = informerecepcionCollection;
    }-*/
    
}
