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
 * @author Jorge
 */
@Entity
@Table(name = "seguimiento_actividad")
@NamedQueries({
    @NamedQuery(name = "SeguimientoActividad.findAll", query = "SELECT s FROM SeguimientoActividad s"),
    @NamedQuery(name = "SeguimientoActividad.findByCodigoSeguimiento", query = "SELECT s FROM SeguimientoActividad s WHERE s.codigoSeguimiento = :codigoSeguimiento"),
    @NamedQuery(name = "SeguimientoActividad.findByFechaHora", query = "SELECT s FROM SeguimientoActividad s WHERE s.fechaHora = :fechaHora")})
public class SeguimientoActividad implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoSeguimiento")
    private Integer codigoSeguimiento;
    @Basic(optional = false)
    @Column(name = "fechaHora")
    private String fechaHora;
    @JoinColumn(name = "lugar", referencedColumnName = "codLugar")
    @ManyToOne(optional = false)
    private Lugar lugar;
    @JoinColumn(name = "actividad", referencedColumnName = "codActividad")
    @ManyToOne(optional = false)
    private Actividad actividad;
    @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado")
    @ManyToOne(optional = false)
    private Empleado codigoEmpleado;

    public SeguimientoActividad() {
    }

    public SeguimientoActividad(Integer codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    public SeguimientoActividad(Integer codigoSeguimiento, String fechaHora) {
        this.codigoSeguimiento = codigoSeguimiento;
        this.fechaHora = fechaHora;
    }

    public Integer getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(Integer codigoSeguimiento) {
        Integer oldCodigoSeguimiento = this.codigoSeguimiento;
        this.codigoSeguimiento = codigoSeguimiento;
        changeSupport.firePropertyChange("codigoSeguimiento", oldCodigoSeguimiento, codigoSeguimiento);
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        String oldFechaHora = this.fechaHora;
        this.fechaHora = fechaHora;
        changeSupport.firePropertyChange("fechaHora", oldFechaHora, fechaHora);
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        Lugar oldLugar = this.lugar;
        this.lugar = lugar;
        changeSupport.firePropertyChange("lugar", oldLugar, lugar);
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        Actividad oldActividad = this.actividad;
        this.actividad = actividad;
        changeSupport.firePropertyChange("actividad", oldActividad, actividad);
    }

    public Empleado getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Empleado codigoEmpleado) {
        Empleado oldCodigoEmpleado = this.codigoEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        changeSupport.firePropertyChange("codigoEmpleado", oldCodigoEmpleado, codigoEmpleado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoSeguimiento != null ? codigoSeguimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeguimientoActividad)) {
            return false;
        }
        SeguimientoActividad other = (SeguimientoActividad) object;
        if ((this.codigoSeguimiento == null && other.codigoSeguimiento != null) || (this.codigoSeguimiento != null && !this.codigoSeguimiento.equals(other.codigoSeguimiento))) {
            return false;
        }
        return true;
    }

    /*  @Override
    public String toString() {
    return "bean.SeguimientoActividad[ codigoSeguimiento=" + codigoSeguimiento + " ]";
    }*/
    @Override
    public String toString() {
        return  "codigoSeguimiento=" + codigoSeguimiento + ", fechaHora=" + fechaHora + ", lugar=" + lugar + ", actividad=" + actividad + ", codigoEmpleado=" + codigoEmpleado;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
    
}
