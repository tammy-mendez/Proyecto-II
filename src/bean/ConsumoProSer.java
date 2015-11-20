/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

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

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "consumo_pro_ser")
@NamedQueries({
    @NamedQuery(name = "ConsumoProSer.findAll", query = "SELECT c FROM ConsumoProSer c"),
    @NamedQuery(name = "ConsumoProSer.findByCodigoConsumo", query = "SELECT c FROM ConsumoProSer c WHERE c.codigoConsumo = :codigoConsumo"),
    @NamedQuery(name = "ConsumoProSer.findByCantidad", query = "SELECT c FROM ConsumoProSer c WHERE c.cantidad = :cantidad"),
    @NamedQuery(name = "ConsumoProSer.findByTotal", query = "SELECT c FROM ConsumoProSer c WHERE c.total = :total"),
    @NamedQuery(name = "ConsumoProSer.findByFecha", query = "SELECT c FROM ConsumoProSer c WHERE c.fecha = :fecha")})
public class ConsumoProSer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoConsumo")
    private Integer codigoConsumo;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @JoinColumn(name = "numFactura", referencedColumnName = "numFactura")
    @ManyToOne
    private FacturaCobro numFactura;
    @JoinColumn(name = "codigoPS", referencedColumnName = "codigoPS")
    @ManyToOne
    private ProductoServicio codigoPS;
    @JoinColumn(name = "codigoReserva", referencedColumnName = "codigoReserva")
    @ManyToOne
    private Reserva codigoReserva;

    public ConsumoProSer() {
    }

    public ConsumoProSer(Integer codigoConsumo) {
        this.codigoConsumo = codigoConsumo;
    }

    public ConsumoProSer(Integer codigoConsumo, int cantidad, int total, String fecha) {
        this.codigoConsumo = codigoConsumo;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
    }

    public Integer getCodigoConsumo() {
        return codigoConsumo;
    }

    public void setCodigoConsumo(Integer codigoConsumo) {
        this.codigoConsumo = codigoConsumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public FacturaCobro getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(FacturaCobro numFactura) {
        this.numFactura = numFactura;
    }

    public ProductoServicio getCodigoPS() {
        return codigoPS;
    }

    public void setCodigoPS(ProductoServicio codigoPS) {
        this.codigoPS = codigoPS;
    }

    public Reserva getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(Reserva codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoConsumo != null ? codigoConsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsumoProSer)) {
            return false;
        }
        ConsumoProSer other = (ConsumoProSer) object;
        if ((this.codigoConsumo == null && other.codigoConsumo != null) || (this.codigoConsumo != null && !this.codigoConsumo.equals(other.codigoConsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "codigoConsumo=" + codigoConsumo + ", cantidad=" + cantidad + ", total=" + total + ", fecha=" + fecha + ", numFactura=" + numFactura + ", codigoPS=" + codigoPS + ", codigoReserva=" + codigoReserva;
    }

  
    
}
