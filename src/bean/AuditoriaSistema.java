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
@Table(name = "auditoria_sistema")
@NamedQueries({
    @NamedQuery(name = "AuditoriaSistema.findAll", query = "SELECT a FROM AuditoriaSistema a"),
    @NamedQuery(name = "AuditoriaSistema.findByCodigoAuditoria", query = "SELECT a FROM AuditoriaSistema a WHERE a.codigoAuditoria = :codigoAuditoria"),
    @NamedQuery(name = "AuditoriaSistema.findByTabla", query = "SELECT a FROM AuditoriaSistema a WHERE a.tabla = :tabla"),
    @NamedQuery(name = "AuditoriaSistema.findByAccion", query = "SELECT a FROM AuditoriaSistema a WHERE a.accion = :accion"),
    @NamedQuery(name = "AuditoriaSistema.findByFechaHora", query = "SELECT a FROM AuditoriaSistema a WHERE a.fechaHora = :fechaHora"),
    @NamedQuery(name = "AuditoriaSistema.findByUsuario", query = "SELECT a FROM AuditoriaSistema a WHERE a.usuario = :usuario")})
public class AuditoriaSistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoAuditoria")
    private Integer codigoAuditoria;
    @Basic(optional = false)
    @Column(name = "tabla")
    private String tabla;
    @Basic(optional = false)
    @Column(name = "accion")
    private String accion;
    @Basic(optional = false)
    @Column(name = "fechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;

    public AuditoriaSistema() {
    }

    public AuditoriaSistema(Integer codigoAuditoria) {
        this.codigoAuditoria = codigoAuditoria;
    }

    public AuditoriaSistema(Integer codigoAuditoria, String tabla, String accion, Date fechaHora, String usuario) {
        this.codigoAuditoria = codigoAuditoria;
        this.tabla = tabla;
        this.accion = accion;
        this.fechaHora = fechaHora;
        this.usuario = usuario;
    }

    public Integer getCodigoAuditoria() {
        return codigoAuditoria;
    }

    public void setCodigoAuditoria(Integer codigoAuditoria) {
        this.codigoAuditoria = codigoAuditoria;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoAuditoria != null ? codigoAuditoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuditoriaSistema)) {
            return false;
        }
        AuditoriaSistema other = (AuditoriaSistema) object;
        if ((this.codigoAuditoria == null && other.codigoAuditoria != null) || (this.codigoAuditoria != null && !this.codigoAuditoria.equals(other.codigoAuditoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.AuditoriaSistema[ codigoAuditoria=" + codigoAuditoria + " ]";
    }
    
}
