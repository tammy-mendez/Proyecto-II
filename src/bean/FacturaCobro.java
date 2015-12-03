/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

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

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "factura_cobro")
@NamedQueries({
    @NamedQuery(name = "FacturaCobro.findAll", query = "SELECT f FROM FacturaCobro f"),
    @NamedQuery(name = "FacturaCobro.findByNumFactura", query = "SELECT f FROM FacturaCobro f WHERE f.numFactura = :numFactura"),
    @NamedQuery(name = "FacturaCobro.findByFechaEmision", query = "SELECT f FROM FacturaCobro f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "FacturaCobro.findByRucCliente", query = "SELECT f FROM FacturaCobro f WHERE f.rucCliente = :rucCliente"),
    @NamedQuery(name = "FacturaCobro.findByConcepto", query = "SELECT f FROM FacturaCobro f WHERE f.concepto = :concepto"),
    @NamedQuery(name = "FacturaCobro.findByTotal", query = "SELECT f FROM FacturaCobro f WHERE f.total = :total"),
    @NamedQuery(name = "FacturaCobro.findByTipoFactura", query = "SELECT f FROM FacturaCobro f WHERE f.tipoFactura = :tipoFactura")})
public class FacturaCobro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numFactura")
    private Integer numFactura;
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
    @JoinColumn(name = "codigoReserva", referencedColumnName = "codigoReserva")
    @ManyToOne
    private Reserva codigoReserva;
    @JoinColumn(name = "forma_pago", referencedColumnName = "idDetalle")
    @ManyToOne(optional = false)
    private DetalleCobro formaPago;
    @OneToMany(mappedBy = "numFactura")
    private Collection<ConsumoProSer> consumoProSerCollection;

    public FacturaCobro() {
    }

    public FacturaCobro(Integer numFactura) {
        this.numFactura = numFactura;
    }

    public FacturaCobro(Integer numFactura, String fechaEmision, String rucCliente, String concepto, int total, String tipoFactura) {
        this.numFactura = numFactura;
        this.fechaEmision = fechaEmision;
        this.rucCliente = rucCliente;
        this.concepto = concepto;
        this.total = total;
        this.tipoFactura = tipoFactura;
    }

    public Integer getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(Integer numFactura) {
        this.numFactura = numFactura;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public Reserva getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(Reserva codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public DetalleCobro getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(DetalleCobro formaPago) {
        this.formaPago = formaPago;
    }

    public Collection<ConsumoProSer> getConsumoProSerCollection() {
        return consumoProSerCollection;
    }

    public void setConsumoProSerCollection(Collection<ConsumoProSer> consumoProSerCollection) {
        this.consumoProSerCollection = consumoProSerCollection;
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
        if (!(object instanceof FacturaCobro)) {
            return false;
        }
        FacturaCobro other = (FacturaCobro) object;
        if ((this.numFactura == null && other.numFactura != null) || (this.numFactura != null && !this.numFactura.equals(other.numFactura))) {
            return false;
        }
        return true;
    }

    /* @Override
    public String toString() {
    return "bean.FacturaCobro[ numFactura=" + numFactura + " ]";
    }*/
    @Override
    public String toString() {
        return "numFactura=" + numFactura + ", fechaEmision=" + fechaEmision + ", rucCliente=" + rucCliente + ", concepto=" + concepto + ", total=" + total + ", tipoFactura=" + tipoFactura + ", codigoReserva=" + codigoReserva + ", formaPago=" + formaPago;
    }
    
    
}
