/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "eventos")
@NamedQueries({
    @NamedQuery(name = "Eventos.findAll", query = "SELECT e FROM Eventos e"),
    @NamedQuery(name = "Eventos.findByIdEvento", query = "SELECT e FROM Eventos e WHERE e.idEvento = :idEvento"),
    @NamedQuery(name = "Eventos.findByTipoEvento", query = "SELECT e FROM Eventos e WHERE e.tipoEvento = :tipoEvento"),
    @NamedQuery(name = "Eventos.findByFechaInicio", query = "SELECT e FROM Eventos e WHERE e.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Eventos.findByFechaFin", query = "SELECT e FROM Eventos e WHERE e.fechaFin = :fechaFin"),
    @NamedQuery(name = "Eventos.findByDuracion", query = "SELECT e FROM Eventos e WHERE e.duracion = :duracion"),
    @NamedQuery(name = "Eventos.findByDescripcion", query = "SELECT e FROM Eventos e WHERE e.descripcion = :descripcion")})
public class Eventos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEvento")
    private Integer idEvento;
    @Basic(optional = false)
    @Column(name = "tipo_evento")
    private String tipoEvento;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "duracion")
    private Integer duracion;
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado")
    @ManyToOne(optional = false)
    private Empleado codigoEmpleado;

    public Eventos() {
    }

    public Eventos(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Eventos(Integer idEvento, String tipoEvento, Date fechaInicio) {
        this.idEvento = idEvento;
        this.tipoEvento = tipoEvento;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        Integer oldIdEvento = this.idEvento;
        this.idEvento = idEvento;
        changeSupport.firePropertyChange("idEvento", oldIdEvento, idEvento);
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        String oldTipoEvento = this.tipoEvento;
        this.tipoEvento = tipoEvento;
        changeSupport.firePropertyChange("tipoEvento", oldTipoEvento, tipoEvento);
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        Date oldFechaInicio = this.fechaInicio;
        this.fechaInicio = fechaInicio;
        changeSupport.firePropertyChange("fechaInicio", oldFechaInicio, fechaInicio);
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        Date oldFechaFin = this.fechaFin;
        this.fechaFin = fechaFin;
        changeSupport.firePropertyChange("fechaFin", oldFechaFin, fechaFin);
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        Integer oldDuracion = this.duracion;
        this.duracion = duracion;
        changeSupport.firePropertyChange("duracion", oldDuracion, duracion);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
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
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventos)) {
            return false;
        }
        Eventos other = (Eventos) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }
    

 /*   @Override
    public String toString() {
        return "bean.Eventos[ idEvento=" + idEvento + " ]";
    }
    */

    @Override
    public String toString() {
        return "idEvento=" + idEvento + ", tipoEvento=" + tipoEvento + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", duracion=" + duracion + ", descripcion=" + descripcion + ", codigoEmpleado=" + codigoEmpleado;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
