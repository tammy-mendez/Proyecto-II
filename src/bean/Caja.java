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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "caja")
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c"),
    @NamedQuery(name = "Caja.findByCodigoCaja", query = "SELECT c FROM Caja c WHERE c.codigoCaja = :codigoCaja"),
    @NamedQuery(name = "Caja.findByFechaHora", query = "SELECT c FROM Caja c WHERE c.fechaHora = :fechaHora"),
    @NamedQuery(name = "Caja.findByMontoInicial", query = "SELECT c FROM Caja c WHERE c.montoInicial = :montoInicial"),
    @NamedQuery(name = "Caja.findByMontoFinal", query = "SELECT c FROM Caja c WHERE c.montoFinal = :montoFinal"),
    @NamedQuery(name = "Caja.findByEstado", query = "SELECT c FROM Caja c WHERE c.estado = :estado")})
public class Caja implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_caja")
    private Integer codigoCaja;
    @Basic(optional = false)
    @Column(name = "fecha_hora")
    private String fechaHora;
    @Basic(optional = false)
    @Column(name = "monto_inicial")
    private int montoInicial;
    @Column(name = "monto_final")
    private Integer montoFinal;
    @Column(name = "estado")
    private Character estado;

    public Caja() {
    }

    public Caja(Integer codigoCaja) {
        this.codigoCaja = codigoCaja;
    }

    public Caja(Integer codigoCaja, String fechaHora, int montoInicial) {
        this.codigoCaja = codigoCaja;
        this.fechaHora = fechaHora;
        this.montoInicial = montoInicial;
    }

    public Integer getCodigoCaja() {
        return codigoCaja;
    }

    public void setCodigoCaja(Integer codigoCaja) {
        Integer oldCodigoCaja = this.codigoCaja;
        this.codigoCaja = codigoCaja;
        changeSupport.firePropertyChange("codigoCaja", oldCodigoCaja, codigoCaja);
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        String oldFechaHora = this.fechaHora;
        this.fechaHora = fechaHora;
        changeSupport.firePropertyChange("fechaHora", oldFechaHora, fechaHora);
    }

    public int getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(int montoInicial) {
        int oldMontoInicial = this.montoInicial;
        this.montoInicial = montoInicial;
        changeSupport.firePropertyChange("montoInicial", oldMontoInicial, montoInicial);
    }

    public Integer getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(Integer montoFinal) {
        Integer oldMontoFinal = this.montoFinal;
        this.montoFinal = montoFinal;
        changeSupport.firePropertyChange("montoFinal", oldMontoFinal, montoFinal);
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        Character oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCaja != null ? codigoCaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.codigoCaja == null && other.codigoCaja != null) || (this.codigoCaja != null && !this.codigoCaja.equals(other.codigoCaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Caja[ codigoCaja=" + codigoCaja + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
