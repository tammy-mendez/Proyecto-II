/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "reserva")
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByCodigoReserva", query = "SELECT r FROM Reserva r WHERE r.codigoReserva = :codigoReserva"),
    @NamedQuery(name = "Reserva.findByCheckIn", query = "SELECT r FROM Reserva r WHERE r.checkIn = :checkIn"),
    @NamedQuery(name = "Reserva.findByCheckOut", query = "SELECT r FROM Reserva r WHERE r.checkOut = :checkOut"),
    @NamedQuery(name = "Reserva.findByCantPersonas", query = "SELECT r FROM Reserva r WHERE r.cantPersonas = :cantPersonas"),
    @NamedQuery(name = "Reserva.findByMontoTotal", query = "SELECT r FROM Reserva r WHERE r.montoTotal = :montoTotal"),
    @NamedQuery(name = "Reserva.findByMontoAbonado", query = "SELECT r FROM Reserva r WHERE r.montoAbonado = :montoAbonado")})
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoReserva")
    private Integer codigoReserva;
    @Basic(optional = false)
    @Column(name = "checkIn")
    @Temporal(TemporalType.DATE)
    private Date checkIn;
    @Basic(optional = false)
    @Column(name = "checkOut")
    @Temporal(TemporalType.DATE)
    private Date checkOut;
    @Basic(optional = false)
    @Column(name = "cantPersonas")
    private int cantPersonas;
    @Basic(optional = false)
    @Column(name = "montoTotal")
    private int montoTotal;
    @Column(name = "montoAbonado")
    private Integer montoAbonado;
    @OneToMany(mappedBy = "codigoReserva")
    private Collection<FacturaCobro> facturaCobroCollection;
    @JoinColumn(name = "numPresupuesto", referencedColumnName = "numPresupuesto")
    @ManyToOne
    private Presupuesto numPresupuesto;
    @JoinColumn(name = "numHabitacion", referencedColumnName = "numero")
    @ManyToOne(optional = false)
    private Habitacion numHabitacion;
    @JoinColumn(name = "codigoCliente", referencedColumnName = "codigoCliente")
    @ManyToOne(optional = false)
    private Cliente codigoCliente;
    @OneToMany(mappedBy = "codigoReserva")
    private Collection<ConsumoProSer> consumoProSerCollection;

    public Reserva() {
    }

    public Reserva(Integer codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Reserva(Integer codigoReserva, Date checkIn, Date checkOut, int cantPersonas, int montoTotal) {
        this.codigoReserva = codigoReserva;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cantPersonas = cantPersonas;
        this.montoTotal = montoTotal;
    }

    public Integer getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(Integer codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Integer getMontoAbonado() {
        return montoAbonado;
    }

    public void setMontoAbonado(Integer montoAbonado) {
        this.montoAbonado = montoAbonado;
    }

    public Collection<FacturaCobro> getFacturaCobroCollection() {
        return facturaCobroCollection;
    }

    public void setFacturaCobroCollection(Collection<FacturaCobro> facturaCobroCollection) {
        this.facturaCobroCollection = facturaCobroCollection;
    }

    public Presupuesto getNumPresupuesto() {
        return numPresupuesto;
    }

    public void setNumPresupuesto(Presupuesto numPresupuesto) {
        this.numPresupuesto = numPresupuesto;
    }

    public Habitacion getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(Habitacion numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public Cliente getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Cliente codigoCliente) {
        this.codigoCliente = codigoCliente;
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
        hash += (codigoReserva != null ? codigoReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.codigoReserva == null && other.codigoReserva != null) || (this.codigoReserva != null && !this.codigoReserva.equals(other.codigoReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reserva=" + codigoReserva + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", cantPersonas=" + cantPersonas + ", montoTotal=" + montoTotal + ", montoAbonado=" + montoAbonado + ", numPresupuesto=" + numPresupuesto + ", numHabitacion=" + numHabitacion + ", codigoCliente=" + codigoCliente;
    }

  
    
}
