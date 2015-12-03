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
@Table(name = "asistencia")
@NamedQueries({
    @NamedQuery(name = "Asistencia.findAll", query = "SELECT a FROM Asistencia a"),
    @NamedQuery(name = "Asistencia.findByCodigoAsistencia", query = "SELECT a FROM Asistencia a WHERE a.codigoAsistencia = :codigoAsistencia"),
    @NamedQuery(name = "Asistencia.findByHoraEntrada", query = "SELECT a FROM Asistencia a WHERE a.horaEntrada = :horaEntrada"),
    @NamedQuery(name = "Asistencia.findByHoraSalida", query = "SELECT a FROM Asistencia a WHERE a.horaSalida = :horaSalida"),
    @NamedQuery(name = "Asistencia.findByFechaAsistencia", query = "SELECT a FROM Asistencia a WHERE a.fechaAsistencia = :fechaAsistencia"),
    @NamedQuery(name = "Asistencia.findByHorasTrabajadas", query = "SELECT a FROM Asistencia a WHERE a.horasTrabajadas = :horasTrabajadas")})
public class Asistencia implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoAsistencia")
    private Integer codigoAsistencia;
    @Column(name = "horaEntrada")
    private String horaEntrada;
    @Column(name = "horaSalida")
    private String horaSalida;
    @Basic(optional = false)
    @Column(name = "fechaAsistencia")
    @Temporal(TemporalType.DATE)
    private Date fechaAsistencia;
    @Basic(optional = false)
    @Column(name = "horasTrabajadas")
    private float horasTrabajadas;
    @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado")
    @ManyToOne(optional = false)
    private Empleado codigoEmpleado;

    public Asistencia() {
    }

    public Asistencia(Integer codigoAsistencia) {
        this.codigoAsistencia = codigoAsistencia;
    }

    public Asistencia(Integer codigoAsistencia, Date fechaAsistencia, float horasTrabajadas) {
        this.codigoAsistencia = codigoAsistencia;
        this.fechaAsistencia = fechaAsistencia;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Integer getCodigoAsistencia() {
        return codigoAsistencia;
    }

    public void setCodigoAsistencia(Integer codigoAsistencia) {
        Integer oldCodigoAsistencia = this.codigoAsistencia;
        this.codigoAsistencia = codigoAsistencia;
        changeSupport.firePropertyChange("codigoAsistencia", oldCodigoAsistencia, codigoAsistencia);
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        String oldHoraEntrada = this.horaEntrada;
        this.horaEntrada = horaEntrada;
        changeSupport.firePropertyChange("horaEntrada", oldHoraEntrada, horaEntrada);
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        String oldHoraSalida = this.horaSalida;
        this.horaSalida = horaSalida;
        changeSupport.firePropertyChange("horaSalida", oldHoraSalida, horaSalida);
    }

    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(Date fechaAsistencia) {
        Date oldFechaAsistencia = this.fechaAsistencia;
        this.fechaAsistencia = fechaAsistencia;
        changeSupport.firePropertyChange("fechaAsistencia", oldFechaAsistencia, fechaAsistencia);
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        float oldHorasTrabajadas = this.horasTrabajadas;
        this.horasTrabajadas = horasTrabajadas;
        changeSupport.firePropertyChange("horasTrabajadas", oldHorasTrabajadas, horasTrabajadas);
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
        hash += (codigoAsistencia != null ? codigoAsistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistencia)) {
            return false;
        }
        Asistencia other = (Asistencia) object;
        if ((this.codigoAsistencia == null && other.codigoAsistencia != null) || (this.codigoAsistencia != null && !this.codigoAsistencia.equals(other.codigoAsistencia))) {
            return false;
        }
        return true;
    }

   /* @Override
    public String toString() {
        return "bean.Asistencia[ codigoAsistencia=" + codigoAsistencia + " ]";
    }
    */

    @Override
    public String toString() {
        return "codigoAsistencia=" + codigoAsistencia + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", fechaAsistencia=" + fechaAsistencia + ", horasTrabajadas=" + horasTrabajadas + ", codigoEmpleado=" + codigoEmpleado;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
