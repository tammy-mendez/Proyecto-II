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
import javax.persistence.Transient;

/**
 *
 * @author tammy
 */
@Entity
@Table(name = "proveedor")
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByCodigoProveedor", query = "SELECT p FROM Proveedor p WHERE p.codigoProveedor = :codigoProveedor"),
    @NamedQuery(name = "Proveedor.findByTipo", query = "SELECT p FROM Proveedor p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Proveedor.findByRazonSocial", query = "SELECT p FROM Proveedor p WHERE p.razonSocial = :razonSocial"),
    @NamedQuery(name = "Proveedor.findByRuc", query = "SELECT p FROM Proveedor p WHERE p.ruc = :ruc"),
    @NamedQuery(name = "Proveedor.findByCedula", query = "SELECT p FROM Proveedor p WHERE p.cedula = :cedula"),
    @NamedQuery(name = "Proveedor.findByEmail", query = "SELECT p FROM Proveedor p WHERE p.email = :email"),
    @NamedQuery(name = "Proveedor.findByDireccion", query = "SELECT p FROM Proveedor p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Proveedor.findByTelefono", query = "SELECT p FROM Proveedor p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Proveedor.findByCodigoCategoria", query = "SELECT p FROM Proveedor p WHERE p.codigoCategoria = :codigoCategoria")})
public class Proveedor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoProveedor")
    private Integer codigoProveedor;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "razonSocial")
    private String razonSocial;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "cedula")
    private String cedula;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "telefono")
    private int telefono;
 @JoinColumn(name = "codigoCategoria", referencedColumnName = "cod_categoria")
    @ManyToOne
    private CategoriaArticulo codigoCategoria;
    public Proveedor() {
    }

    public Proveedor(Integer codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Proveedor(Integer codigoProveedor, String tipo, String razonSocial, String email, String direccion, int telefono, CategoriaArticulo codigoCategoria) {
        this.codigoProveedor = codigoProveedor;
        this.tipo = tipo;
        this.razonSocial = razonSocial;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoCategoria = codigoCategoria;
    }

    public Integer getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Integer codigoProveedor) {
        Integer oldCodigoProveedor = this.codigoProveedor;
        this.codigoProveedor = codigoProveedor;
        changeSupport.firePropertyChange("codigoProveedor", oldCodigoProveedor, codigoProveedor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        String oldRazonSocial = this.razonSocial;
        this.razonSocial = razonSocial;
        changeSupport.firePropertyChange("razonSocial", oldRazonSocial, razonSocial);
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        String oldRuc = this.ruc;
        this.ruc = ruc;
        changeSupport.firePropertyChange("ruc", oldRuc, ruc);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        String oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        int oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }
        public CategoriaArticulo getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(CategoriaArticulo codigoCategoria) {
        CategoriaArticulo oldCodigoCategoria = this.codigoCategoria;
        this.codigoCategoria = codigoCategoria;
        changeSupport.firePropertyChange("codigoCategoria", oldCodigoCategoria, codigoCategoria);
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoProveedor != null ? codigoProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.codigoProveedor == null && other.codigoProveedor != null) || (this.codigoProveedor != null && !this.codigoProveedor.equals(other.codigoProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Proveedor[ codigoProveedor=" + codigoProveedor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
