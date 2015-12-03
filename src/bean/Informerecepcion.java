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
@Table(name = "informerecepcion")
@NamedQueries({
    @NamedQuery(name = "Informerecepcion.findAll", query = "SELECT i FROM Informerecepcion i"),
    @NamedQuery(name = "Informerecepcion.findByCodInformeRecepcion", query = "SELECT i FROM Informerecepcion i WHERE i.codInformeRecepcion = :codInformeRecepcion"),
    @NamedQuery(name = "Informerecepcion.findByCodOC", query = "SELECT i FROM Informerecepcion i WHERE i.codOC = :codOC"),
    @NamedQuery(name = "Informerecepcion.findByNroFactura", query = "SELECT i FROM Informerecepcion i WHERE i.nroFactura = :nroFactura"),
    @NamedQuery(name = "Informerecepcion.findByFecha", query = "SELECT i FROM Informerecepcion i WHERE i.fecha = :fecha"),
    @NamedQuery(name = "Informerecepcion.findByFechaVto", query = "SELECT i FROM Informerecepcion i WHERE i.fechaVto = :fechaVto"),
})
public class Informerecepcion implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codInformeRecepcion")
    private Integer codInformeRecepcion;
    //@Column(name = "codOC")
  //  private Integer codOC;
   // @Column(name = "nroFactura")
  //  private Integer nroFactura;
    @JoinColumn(name = "codOC", referencedColumnName = "cod_orden")
    @ManyToOne
    private OrdenCompra codOC;
    @JoinColumn(name = "nroFactura", referencedColumnName = "num_factura")
    @ManyToOne
    private FacturaPago nroFactura;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "fechaVto")
    private String fechaVto;
    public Informerecepcion() {
    }

    public Informerecepcion(Integer codInformeRecepcion) {
        this.codInformeRecepcion = codInformeRecepcion;
    }

    public Integer getCodInformeRecepcion() {
        return codInformeRecepcion;
    }

    public void setCodInformeRecepcion(Integer codInformeRecepcion) {
        Integer oldCodInformeRecepcion = this.codInformeRecepcion;
        this.codInformeRecepcion = codInformeRecepcion;
        changeSupport.firePropertyChange("codInformeRecepcion", oldCodInformeRecepcion, codInformeRecepcion);
    }
/*
    public Integer getCodOC() {
        return codOC;
    }

    public void setCodOC(Integer codOC) {
        Integer oldCodOC = this.codOC;
        this.codOC = codOC;
        changeSupport.firePropertyChange("codOC", oldCodOC, codOC);
    }

    public Integer getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(Integer nroFactura) {
        Integer oldNroFactura = this.nroFactura;
        this.nroFactura = nroFactura;
        changeSupport.firePropertyChange("nroFactura", oldNroFactura, nroFactura);
    }
*/
    public OrdenCompra getCodOC() {
        return codOC;
    }

    public void setCodOC(OrdenCompra codOC) {
        this.codOC = codOC;
    }

    public FacturaPago getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(FacturaPago nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        String oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(String fechaVto) {
        String oldFechaVto = this.fechaVto;
        this.fechaVto = fechaVto;
        changeSupport.firePropertyChange("fechaVto", oldFechaVto, fechaVto);
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codInformeRecepcion != null ? codInformeRecepcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informerecepcion)) {
            return false;
        }
        Informerecepcion other = (Informerecepcion) object;
        if ((this.codInformeRecepcion == null && other.codInformeRecepcion != null) || (this.codInformeRecepcion != null && !this.codInformeRecepcion.equals(other.codInformeRecepcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Informerecepcion[ codInformeRecepcion=" + codInformeRecepcion + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
