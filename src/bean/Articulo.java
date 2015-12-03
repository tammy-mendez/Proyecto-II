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
@Table(name = "articulo")
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a"),
    @NamedQuery(name = "Articulo.findByCodigoArticulo", query = "SELECT a FROM Articulo a WHERE a.codigoArticulo = :codigoArticulo"),
    @NamedQuery(name = "Articulo.findByNombre", query = "SELECT a FROM Articulo a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Articulo.findByCantidadStock", query = "SELECT a FROM Articulo a WHERE a.cantidadStock = :cantidadStock"),
    @NamedQuery(name = "Articulo.findByCantidadMinima", query = "SELECT a FROM Articulo a WHERE a.cantidadMinima = :cantidadMinima"),
    @NamedQuery(name = "Articulo.findByCantidadMaxima", query = "SELECT a FROM Articulo a WHERE a.cantidadMaxima = :cantidadMaxima"),
    @NamedQuery(name = "Articulo.findByCosto", query = "SELECT a FROM Articulo a WHERE a.costo = :costo"),
    @NamedQuery(name = "Articulo.findByPrecio", query = "SELECT a FROM Articulo a WHERE a.precio = :precio"),
    @NamedQuery(name = "Articulo.findByTipo", query = "SELECT a FROM Articulo a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "Articulo.findByCodigoProveedor", query = "SELECT a FROM Articulo a WHERE a.codigoProveedor = :codigoProveedor"),
    @NamedQuery(name = "Articulo.findByCodCategoria", query = "SELECT a FROM Articulo a WHERE a.codCategoria = :codCategoria")})
public class Articulo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoArticulo")
    private Integer codigoArticulo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "cantidadStock")
    private int cantidadStock;
    @Basic(optional = false)
    @Column(name = "cantidadMinima")
    private int cantidadMinima;
    @Basic(optional = false)
    @Column(name = "cantidadMaxima")
    private int cantidadMaxima;
    @Column(name = "costo")
    private Integer costo;
     @Column(name = "precio")
    private Integer precio;
       @Column(name = "tipo")
    private String tipo;
     @JoinColumn(name = "cod_categoria", referencedColumnName = "cod_categoria")
    @ManyToOne
    private CategoriaArticulo codCategoria;
      @JoinColumn(name = "codigoProveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne(optional = false)
    private Proveedor codigoProveedor;

    public Articulo() {
    }

    public Articulo(Integer codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public Articulo(Integer codigoArticulo, String nombre, int cantidadStock, int cantidadMinima, int cantidadMaxima, CategoriaArticulo codCategoria) {
        this.codigoArticulo = codigoArticulo;
        this.nombre = nombre;
        this.cantidadStock = cantidadStock;
        this.cantidadMinima = cantidadMinima;
        this.cantidadMaxima = cantidadMaxima;
       this.codCategoria = codCategoria;
    }

    public Integer getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(Integer codigoArticulo) {
        Integer oldCodigoArticulo = this.codigoArticulo;
        this.codigoArticulo = codigoArticulo;
        changeSupport.firePropertyChange("codigoArticulo", oldCodigoArticulo, codigoArticulo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        int oldCantidadStock = this.cantidadStock;
        this.cantidadStock = cantidadStock;
        changeSupport.firePropertyChange("cantidadStock", oldCantidadStock, cantidadStock);
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        int oldCantidadMinima = this.cantidadMinima;
        this.cantidadMinima = cantidadMinima;
        changeSupport.firePropertyChange("cantidadMinima", oldCantidadMinima, cantidadMinima);
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        int oldCantidadMaxima = this.cantidadMaxima;
        this.cantidadMaxima = cantidadMaxima;
        changeSupport.firePropertyChange("cantidadMaxima", oldCantidadMaxima, cantidadMaxima);
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        Integer oldCosto = this.costo;
        this.costo = costo;
        changeSupport.firePropertyChange("costo", oldCosto, costo);
    }
    public Proveedor getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Proveedor codigoProveedor) {
        Proveedor oldCodigoProveedor = this.codigoProveedor;
        this.codigoProveedor = codigoProveedor;
        changeSupport.firePropertyChange("codigoProveedor", oldCodigoProveedor, codigoProveedor);
    }
    
        public CategoriaArticulo getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(CategoriaArticulo codCategoria) {
        CategoriaArticulo oldCodCategoria = this.codCategoria;
        this.codCategoria = codCategoria;
        changeSupport.firePropertyChange("codCategoria", oldCodCategoria, codCategoria);
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        Integer oldPrecio = this.precio;
        this.precio = precio;
        changeSupport.firePropertyChange("precio", oldPrecio, precio);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoArticulo != null ? codigoArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.codigoArticulo == null && other.codigoArticulo != null) || (this.codigoArticulo != null && !this.codigoArticulo.equals(other.codigoArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Articulo[ codigoArticulo=" + codigoArticulo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
