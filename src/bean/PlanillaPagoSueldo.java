/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "planilla_pago_sueldo")
@NamedQueries({
    @NamedQuery(name = "PlanillaPagoSueldo.findAll", query = "SELECT p FROM PlanillaPagoSueldo p"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByIdPago", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.idPago = :idPago"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByPeriodo", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.periodo = :periodo"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByFechaPago", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.fechaPago = :fechaPago"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByTotalHoras", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.totalHoras = :totalHoras"),
    @NamedQuery(name = "PlanillaPagoSueldo.findBySalarioBase", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.salarioBase = :salarioBase"),
    @NamedQuery(name = "PlanillaPagoSueldo.findBySueldoHorasT", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.sueldoHorasT = :sueldoHorasT"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByExtras", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.extras = :extras"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByNocturno", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.nocturno = :nocturno"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByDescuentoIPS", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.descuentoIPS = :descuentoIPS"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByLiquidoCobrado", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.liquidoCobrado = :liquidoCobrado")})
public class PlanillaPagoSueldo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPago")
    private Integer idPago;
    @Basic(optional = false)
    @Column(name = "periodo")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "fechaPago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_horas")
    private Float totalHoras;
    @Basic(optional = false)
    @Column(name = "salarioBase")
    private int salarioBase;
    @Column(name = "sueldoHorasT")
    private Integer sueldoHorasT;
    @Column(name = "extras")
    private Integer extras;
    @Basic(optional = false)
    @Column(name = "nocturno")
    private int nocturno;
    @Basic(optional = false)
    @Column(name = "descuentoIPS")
    private int descuentoIPS;
    @Basic(optional = false)
    @Column(name = "liquidoCobrado")
    private int liquidoCobrado;
    @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado")
    @ManyToOne(optional = false)
    private Empleado codigoEmpleado;

    public PlanillaPagoSueldo() {
    }

    public PlanillaPagoSueldo(Integer idPago) {
        this.idPago = idPago;
    }

    public PlanillaPagoSueldo(Integer idPago, String periodo, Date fechaPago, int salarioBase, int nocturno, int descuentoIPS, int liquidoCobrado) {
        this.idPago = idPago;
        this.periodo = periodo;
        this.fechaPago = fechaPago;
        this.salarioBase = salarioBase;
        this.nocturno = nocturno;
        this.descuentoIPS = descuentoIPS;
        this.liquidoCobrado = liquidoCobrado;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Float getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(Float totalHoras) {
        this.totalHoras = totalHoras;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Integer getSueldoHorasT() {
        return sueldoHorasT;
    }

    public void setSueldoHorasT(Integer sueldoHorasT) {
        this.sueldoHorasT = sueldoHorasT;
    }

    public Integer getExtras() {
        return extras;
    }

    public void setExtras(Integer extras) {
        this.extras = extras;
    }

    public int getNocturno() {
        return nocturno;
    }

    public void setNocturno(int nocturno) {
        this.nocturno = nocturno;
    }

    public int getDescuentoIPS() {
        return descuentoIPS;
    }

    public void setDescuentoIPS(int descuentoIPS) {
        this.descuentoIPS = descuentoIPS;
    }

    public int getLiquidoCobrado() {
        return liquidoCobrado;
    }

    public void setLiquidoCobrado(int liquidoCobrado) {
        this.liquidoCobrado = liquidoCobrado;
    }

    public Empleado getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Empleado codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPago != null ? idPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanillaPagoSueldo)) {
            return false;
        }
        PlanillaPagoSueldo other = (PlanillaPagoSueldo) object;
        if ((this.idPago == null && other.idPago != null) || (this.idPago != null && !this.idPago.equals(other.idPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.PlanillaPagoSueldo[ idPago=" + idPago + " ]";
    }
    
}
