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
import java.util.Date;
import java.util.Vector;
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
import javax.persistence.Transient;

/**
 *
 * @author Vladimir
 */
@Entity
@Table(name = "extraccion_deposito")
@NamedQueries({
    @NamedQuery(name = "ExtraccionDeposito.findAll", query = "SELECT e FROM ExtraccionDeposito e"),
    @NamedQuery(name = "ExtraccionDeposito.findByCodigoExtraccionDeposito", query = "SELECT e FROM ExtraccionDeposito e WHERE e.codigoExtraccionDeposito = :codigoExtraccionDeposito"),
    @NamedQuery(name = "ExtraccionDeposito.findByFecha", query = "SELECT e FROM ExtraccionDeposito e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "ExtraccionDeposito.findByMonto", query = "SELECT e FROM ExtraccionDeposito e WHERE e.monto = :monto"),
   // @NamedQuery(name = "ExtraccionDeposito.findByIdPago/Cobro", query = "SELECT e FROM ExtraccionDeposito e WHERE e.idPago/Cobro = :idPago/Cobro"),
    @NamedQuery(name = "ExtraccionDeposito.findByTipo", query = "SELECT e FROM ExtraccionDeposito e WHERE e.tipo = :tipo")})
public class ExtraccionDeposito implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoExtraccionDeposito")
    private Integer codigoExtraccionDeposito;
    @Basic(optional = false)
    @Column(name = "fecha")
   // @Temporal(TemporalType.DATE)
 //   private Date fecha;
    private String fecha;
    @Basic(optional = false)
    @Column(name = "monto")
    private int monto;
  /*  @Basic(optional = false)
    @Column(name = "idPago/Cobro")
    private int idPagoCobro;*/
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @JoinColumn(name = "idCuentaBancaria", referencedColumnName = "idCuentaBancaria")
    @ManyToOne(optional = false)
    private CuentaBancaria idCuentaBancaria;

    public ExtraccionDeposito() {
    }

    public ExtraccionDeposito(Integer codigoExtraccionDeposito) {
        this.codigoExtraccionDeposito = codigoExtraccionDeposito;
    }

    public ExtraccionDeposito(Integer codigoExtraccionDeposito,
            //Date fecha,
            String fecha,
            int monto, String tipo) {
        this.codigoExtraccionDeposito = codigoExtraccionDeposito;
      //  this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
    }

    public Integer getCodigoExtraccionDeposito() {
        return codigoExtraccionDeposito;
    }

    public void setCodigoExtraccionDeposito(Integer codigoExtraccionDeposito) {
        Integer oldCodigoExtraccionDeposito = this.codigoExtraccionDeposito;
        this.codigoExtraccionDeposito = codigoExtraccionDeposito;
        changeSupport.firePropertyChange("codigoExtraccionDeposito", oldCodigoExtraccionDeposito, codigoExtraccionDeposito);
    }

/*
    public Date getFecha() {
    return fecha;
    }
    public void setFecha(Date fecha) {
    this.fecha = fecha;
    }
     */
    public String getFecha() {
        return fecha;
    }

    /*public int getIdPagoCobro() {
        return idPagoCobro;
    }

    public void setIdPagoCobro(int idPagoCobro) {
        this.idPagoCobro = idPagoCobro;
    }*/

   /* public Collection<Integer> getIdPagoCobro() {
        return idPagoCobro;
    }

    public void setIdPagoCobro(Collection<Integer> idPagoCobro) {
        this.idPagoCobro = idPagoCobro;
    }
*/
   /* public Vector<Integer> getIdPagoCobro() {
        return idPagoCobro;
    }

    public void setIdPagoCobro(Vector<Integer> idPagoCobro) {
        this.idPagoCobro = idPagoCobro;
    }
*/
/*    public Vector getIdPagoCobro() {
        return idPagoCobro;
    }

    public void setIdPagoCobro(Vector idPagoCobro) {
        this.idPagoCobro = idPagoCobro;
    }*/

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }
    
    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        int oldMonto = this.monto;
        this.monto = monto;
        changeSupport.firePropertyChange("monto", oldMonto, monto);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public CuentaBancaria getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public void setIdCuentaBancaria(CuentaBancaria idCuentaBancaria) {
        CuentaBancaria oldIdCuentaBancaria = this.idCuentaBancaria;
        this.idCuentaBancaria = idCuentaBancaria;
        changeSupport.firePropertyChange("idCuentaBancaria", oldIdCuentaBancaria, idCuentaBancaria);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoExtraccionDeposito != null ? codigoExtraccionDeposito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExtraccionDeposito)) {
            return false;
        }
        ExtraccionDeposito other = (ExtraccionDeposito) object;
        if ((this.codigoExtraccionDeposito == null && other.codigoExtraccionDeposito != null) || (this.codigoExtraccionDeposito != null && !this.codigoExtraccionDeposito.equals(other.codigoExtraccionDeposito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Código: "+codigoExtraccionDeposito 
                + ", Cuenta: "+idCuentaBancaria.getNumeroCuenta()
                +", Fecha: "+ fecha
                +", Monto: " + monto; 
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
