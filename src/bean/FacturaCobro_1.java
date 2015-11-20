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
@Table(name = "factura_cobro")
@NamedQueries({
    @NamedQuery(name = "FacturaCobro.findAll", query = "SELECT f FROM FacturaCobro f"),
    @NamedQuery(name = "FacturaCobro.findByNumfactura", query = "SELECT f FROM FacturaCobro f WHERE f.numfactura = :numfactura"),
    @NamedQuery(name = "FacturaCobro.findByFechaEmision", query = "SELECT f FROM FacturaCobro f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "FacturaCobro.findByRucCliente", query = "SELECT f FROM FacturaCobro f WHERE f.rucCliente = :rucCliente"),
    @NamedQuery(name = "FacturaCobro.findByConcepto", query = "SELECT f FROM FacturaCobro f WHERE f.concepto = :concepto"),
    @NamedQuery(name = "FacturaCobro.findByTotal", query = "SELECT f FROM FacturaCobro f WHERE f.total = :total"),
    @NamedQuery(name = "FacturaCobro.findByTipoFactura", query = "SELECT f FROM FacturaCobro f WHERE f.tipoFactura = :tipoFactura"),
  @NamedQuery(name = "FacturaCobro.findByFormaPago", query = "SELECT f FROM FacturaCobro f WHERE f.formaPago = :formaPago")
})
public class FacturaCobro_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numfactura")
    private Integer numfactura;
    @Basic(optional = false)
    @Column(name = "fechaEmision")
    private String fechaEmision;
    @Basic(optional = false)
    @Column(name = "rucCliente")
    private String rucCliente;
    @Basic(optional = false)
    @Column(name = "concepto")
    private String concepto;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;
    @Basic(optional = false)
    @Column(name = "tipoFactura")
    private String tipoFactura;
  /*  @Basic(optional = false)
    @Column(name = "detalleFactura")
    private String detalleFactura;
 */
    @JoinColumn(name = "codigoReserva", referencedColumnName = "codigoReserva")
    @ManyToOne
    private Reserva codigoReserva;
    
     @JoinColumn(name = "forma_pago", referencedColumnName = "idDetalle")
    @ManyToOne
    private DetalleCobro formaPago;

    
    public FacturaCobro_1() {
    }

    public FacturaCobro_1(Integer numfactura) {
        this.numfactura = numfactura;
    }

    public FacturaCobro_1(Integer numfactura, String fechaEmision, String rucCliente, String concepto, int total, String tipoFactura) {
        this.numfactura = numfactura;
        this.fechaEmision = fechaEmision;
        this.rucCliente = rucCliente;
        this.concepto = concepto;
        this.total = total;
        this.tipoFactura = tipoFactura;
    }

    public Integer getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(Integer numfactura) {
        Integer oldNumfactura = this.numfactura;
        this.numfactura = numfactura;
        changeSupport.firePropertyChange("numfactura", oldNumfactura, numfactura);
    }

  /*  public String getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(String detalleFactura) {
        String oldDetalleFactura = this.detalleFactura;
        this.detalleFactura = detalleFactura;
        changeSupport.firePropertyChange("detalleFactura", oldDetalleFactura, detalleFactura);
    }*/

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        String oldFechaEmision = this.fechaEmision;
        this.fechaEmision = fechaEmision;
        changeSupport.firePropertyChange("fechaEmision", oldFechaEmision, fechaEmision);
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        String oldRucCliente = this.rucCliente;
        this.rucCliente = rucCliente;
        changeSupport.firePropertyChange("rucCliente", oldRucCliente, rucCliente);
    }

    public String getConcepto() {
        return concepto;
    }

    public DetalleCobro getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(DetalleCobro formaPago) {
        DetalleCobro oldFormaPago = this.formaPago;
        this.formaPago = formaPago;
        changeSupport.firePropertyChange("formaPago", oldFormaPago, formaPago);
    }


  /*  public DetalleCobro_1 getFormaPago() {
    return forma_pago;
    }
    public void setForma_pago(DetalleCobro_1 forma_pago) {
    DetalleCobro_1 oldForma_pago = this.forma_pago;
    this.forma_pago = forma_pago;
    changeSupport.firePropertyChange("forma_pago", oldForma_pago, forma_pago);
    }*/
 /*   public int getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(int forma_pago) {
        this.forma_pago = forma_pago;
    }*/
    

    public void setConcepto(String concepto) {
        String oldConcepto = this.concepto;
        this.concepto = concepto;
        changeSupport.firePropertyChange("concepto", oldConcepto, concepto);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        int oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        String oldTipoFactura = this.tipoFactura;
        this.tipoFactura = tipoFactura;
        changeSupport.firePropertyChange("tipoFactura", oldTipoFactura, tipoFactura);
    }

    public Reserva getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(Reserva codigoReserva) {
        Reserva oldCodigoReserva = this.codigoReserva;
        this.codigoReserva = codigoReserva;
        changeSupport.firePropertyChange("codigoReserva", oldCodigoReserva, codigoReserva);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numfactura != null ? numfactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaCobro_1)) {
            return false;
        }
        FacturaCobro_1 other = (FacturaCobro_1) object;
        if ((this.numfactura == null && other.numfactura != null) || (this.numfactura != null && !this.numfactura.equals(other.numfactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.FacturaCobro[ numfactura=" + numfactura + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
