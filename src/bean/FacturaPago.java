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
import javax.persistence.CascadeType;
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
 * @author tammy
 */
@Entity
@Table(name = "factura_pago")
@NamedQueries({
    @NamedQuery(name = "FacturaPago.findAll", query = "SELECT f FROM FacturaPago f"),
    @NamedQuery(name = "FacturaPago.findByNumFactura", query = "SELECT f FROM FacturaPago f WHERE f.numFactura = :numFactura"),
    @NamedQuery(name = "FacturaPago.findByFecha", query = "SELECT f FROM FacturaPago f WHERE f.fecha = :fecha"),
 //   @NamedQuery(name = "FacturaPago.findByOrdenCompra", query = "SELECT f FROM FacturaPago f WHERE f.ordenCompra = :ordenCompra"),
    @NamedQuery(name = "FacturaPago.findByEstado", query = "SELECT f FROM FacturaPago f WHERE f.estado = :estado"),
    @NamedQuery(name = "FacturaPago.findByMontoTotal", query = "SELECT f FROM FacturaPago f WHERE f.montoTotal = :montoTotal"),
    @NamedQuery(name = "FacturaPago.findByMontoTotalIva", query = "SELECT f FROM FacturaPago f WHERE f.montoTotalIva = :montoTotalIva"),
    @NamedQuery(name = "FacturaPago.findByFechaVence", query = "SELECT f FROM FacturaPago f WHERE f.fechaVence = :fechaVence")//,
 //   @NamedQuery(name = "FacturaPago.findByCodProveedor", query = "SELECT f FROM FacturaPago f WHERE f.codProveedor = :codProveedor")
})
   public class FacturaPago implements Serializable {
   @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_factura")
    private Integer numFactura;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
   // @Column(name = "orden_compra")
  //  private Integer ordenCompra;
    @Column(name = "estado")
    private String estado;
    @Column(name = "monto_total")
    private Integer montoTotal;
    @Column(name = "monto_total_iva")
    private Integer montoTotalIva;
    @Basic(optional = false)
     @Column(name = "fecha_vence")
    private String fechaVence;
   
  /*  @JoinColumn(name = "cod_proveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne
    private Proveedor codProveedor;*/
/*    private Collection<DetalleFacturacompra> detalleFacturaCompra;

    public Collection<DetalleFacturacompra> getDetalleFacturaCompra() {
        return detalleFacturaCompra;
    }*/

 /*   public void setDetalleFacturaCompra(Collection<DetalleFacturacompra> detalleFacturaCompra) {
        Collection<DetalleFacturacompra> oldDetalleFacturaCompra = this.detalleFacturaCompra;
        this.detalleFacturaCompra = detalleFacturaCompra;
        changeSupport.firePropertyChange("detalleFacturaCompra", oldDetalleFacturaCompra, detalleFacturaCompra);
    }
*/
    public FacturaPago() {
    }

    public FacturaPago(Integer numFactura) {
        this.numFactura = numFactura;
    }

    public FacturaPago(Integer numFactura, String fecha) {
        this.numFactura = numFactura;
        this.fecha = fecha;
    }

    public Integer getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(Integer numFactura) {
        Integer oldNumFactura = this.numFactura;
        this.numFactura = numFactura;
        changeSupport.firePropertyChange("numFactura", oldNumFactura, numFactura);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getFechaVence() {
        return fechaVence;
    }

    public void setFechaVence(String fechaVence) {
        String oldFechaVence = this.fechaVence;
        this.fechaVence = fechaVence;
       changeSupport.firePropertyChange("fechaVence", oldFechaVence, fechaVence);
    }

 /*   public String getFecha_vence() {
        return fecha_vence;
    }

    public void setFecha_vence(String fecha_vence) {
        String oldFecha_vence = this.fecha_vence;
        this.fecha_vence = fecha_vence;
        changeSupport.firePropertyChange("fecha_vence", oldFecha_vence, fecha_vence);
    }
*/
  /*  public Integer getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(Integer ordenCompra) {
        Integer oldOrdenCompra = this.ordenCompra;
        this.ordenCompra = ordenCompra;
        changeSupport.firePropertyChange("ordenCompra", oldOrdenCompra, ordenCompra);
    }
*/
    /*  public String getFormaPago() {
    return formaPago;
    }
    public void setFormaPago(String formaPago) {
    String oldFormaPago = this.formaPago;
    this.formaPago = formaPago;
    changeSupport.firePropertyChange("formaPago", oldFormaPago, formaPago);
    }*/
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
       changeSupport.firePropertyChange("estado", oldEstado, estado);
    }
    

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        Integer oldMontoTotal = this.montoTotal;
        this.montoTotal = montoTotal;
        changeSupport.firePropertyChange("montoTotal", oldMontoTotal, montoTotal);
    }

    public Integer getMontoTotalIva() {
        return montoTotalIva;
    }

    public void setMontoTotalIva(Integer montoTotalIva) {
        Integer oldMontoTotalIva = this.montoTotalIva;
        this.montoTotalIva = montoTotalIva;
        changeSupport.firePropertyChange("montoTotalIva", oldMontoTotalIva, montoTotalIva);
    }

 /*   public Proveedor getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Proveedor codProveedor) {
        Proveedor oldCodProveedor = this.codProveedor;
        this.codProveedor = codProveedor;
        changeSupport.firePropertyChange("codProveedor", oldCodProveedor, codProveedor);
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numFactura != null ? numFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaPago)) {
            return false;
        }
        FacturaPago other = (FacturaPago) object;
        if ((this.numFactura == null && other.numFactura != null) || (this.numFactura != null && !this.numFactura.equals(other.numFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.FacturaPago[ numFactura=" + numFactura + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

/*    public Collection<Pago> getPagoCollection() {
        return pagoCollection;
    }

    public void setPagoCollection(Collection<Pago> pagoCollection) {
        this.pagoCollection = pagoCollection;
    }
    */
}
