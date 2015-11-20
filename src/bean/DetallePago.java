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
 * @author pc
 */
@Entity
@Table(name = "detalle_pago")
@NamedQueries({
    @NamedQuery(name = "DetallePago.findAll", query = "SELECT d FROM DetallePago d"),
    @NamedQuery(name = "DetallePago.findByIddetallePago", query = "SELECT d FROM DetallePago d WHERE d.iddetallePago = :iddetallePago"),
    @NamedQuery(name = "DetallePago.findByIdPago", query = "SELECT d FROM DetallePago d WHERE d.idPago = :idPago"),
    @NamedQuery(name = "DetallePago.findByNumFactura", query = "SELECT d FROM DetallePago d WHERE d.numFactura = :numFactura"),
    @NamedQuery(name = "DetallePago.findByIdExtraccion", query = "SELECT d FROM DetallePago d WHERE d.idExtraccion = :idExtraccion")
})
public class DetallePago implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalle_pago")
    private Integer iddetallePago;
    @JoinColumn(name = "id_pago", referencedColumnName = "codigo_pago")
    @ManyToOne
    private Pago idPago;
    @JoinColumn(name = "num_factura", referencedColumnName = "num_factura")
   @ManyToOne
   private FacturaPago numFactura;
    @JoinColumn(name = "id_extraccion", referencedColumnName = "codigoExtraccionDeposito")
    @ManyToOne
    private ExtraccionDeposito idExtraccion;

    public DetallePago() {
    }

    public DetallePago(Integer iddetallePago) {
        this.iddetallePago = iddetallePago;
    }

    public Integer getIddetallePago() {
        return iddetallePago;
    }

    public void setIddetallePago(Integer iddetallePago) {
        Integer oldIddetallePago = this.iddetallePago;
        this.iddetallePago = iddetallePago;
        changeSupport.firePropertyChange("iddetallePago", oldIddetallePago, iddetallePago);
    }

   /* public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }*/

    public ExtraccionDeposito getIdExtraccion() {
        return idExtraccion;
    }

    public void setIdExtraccion(ExtraccionDeposito idExtraccion) {
        ExtraccionDeposito oldIdExtraccion = this.idExtraccion;
        this.idExtraccion = idExtraccion;
        changeSupport.firePropertyChange("idExtraccion", oldIdExtraccion, idExtraccion);
    }


    public Pago getIdPago() {
        return idPago;
    }

    public void setIdPago(Pago idPago) {
        Pago oldIdPago = this.idPago;
        this.idPago = idPago;
        changeSupport.firePropertyChange("idPago", oldIdPago, idPago);
    }

    public FacturaPago getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(FacturaPago numFactura) {
        FacturaPago oldNumFactura = this.numFactura;
        this.numFactura = numFactura;
        changeSupport.firePropertyChange("numFactura", oldNumFactura, numFactura);
    }

 /*   public CuentaBancaria getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(CuentaBancaria idCuenta) {
        this.idCuenta = idCuenta;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallePago != null ? iddetallePago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePago)) {
            return false;
        }
        DetallePago other = (DetallePago) object;
        if ((this.iddetallePago == null && other.iddetallePago != null) || (this.iddetallePago != null && !this.iddetallePago.equals(other.iddetallePago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.DetallePago[ iddetallePago=" + iddetallePago + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
