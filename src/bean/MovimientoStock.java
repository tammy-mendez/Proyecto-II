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
@Table(name = "movimiento_stock")
@NamedQueries({
    @NamedQuery(name = "MovimientoStock.findAll", query = "SELECT m FROM MovimientoStock m"),
    @NamedQuery(name = "MovimientoStock.findByCodigoMovimiento", query = "SELECT m FROM MovimientoStock m WHERE m.codigoMovimiento = :codigoMovimiento"),
    @NamedQuery(name = "MovimientoStock.findByCantidad", query = "SELECT m FROM MovimientoStock m WHERE m.cantidad = :cantidad"),
    @NamedQuery(name = "MovimientoStock.findByCodigoArticulo", query = "SELECT m FROM MovimientoStock m WHERE m.codigoArticulo = :codigoArticulo"),
    @NamedQuery(name = "MovimientoStock.findByFechaHora", query = "SELECT m FROM MovimientoStock m WHERE m.fechaHora = :fechaHora")
})
public class MovimientoStock implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoMovimiento")
    private Integer codigoMovimiento;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "fechaHora")
    private String fechaHora;
    @JoinColumn(name = "codigoArticulo", referencedColumnName = "codigoArticulo")
     @ManyToOne
     private Articulo codigoArticulo;
    public MovimientoStock() {
    }

    public MovimientoStock(Integer codigoMovimiento) {
        this.codigoMovimiento = codigoMovimiento;
    }

    public MovimientoStock(Integer codigoMovimiento, int cantidad, 
          //int codigoArticulo, int codigoEmpleado) {
            Articulo codigoArticulo,String fechaHora) {
        
        this.codigoMovimiento = codigoMovimiento;
        this.cantidad = cantidad;
        this.codigoArticulo = codigoArticulo;
        this.fechaHora = fechaHora;
    }

    public Integer getCodigoMovimiento() {
        return codigoMovimiento;
    }

    public void setCodigoMovimiento(Integer codigoMovimiento) {
        Integer oldCodigoMovimiento = this.codigoMovimiento;
        this.codigoMovimiento = codigoMovimiento;
        changeSupport.firePropertyChange("codigoMovimiento", oldCodigoMovimiento, codigoMovimiento);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        int oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }
    public Articulo getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(Articulo codigoArticulo) {
        Articulo oldCodigoArticulo = this.codigoArticulo;
        this.codigoArticulo = codigoArticulo;
        changeSupport.firePropertyChange("codigoArticulo", oldCodigoArticulo, codigoArticulo);
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMovimiento != null ? codigoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientoStock)) {
            return false;
        }
        MovimientoStock other = (MovimientoStock) object;
        if ((this.codigoMovimiento == null && other.codigoMovimiento != null) || (this.codigoMovimiento != null && !this.codigoMovimiento.equals(other.codigoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.MovimientoStock[ codigoMovimiento=" + codigoMovimiento + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
