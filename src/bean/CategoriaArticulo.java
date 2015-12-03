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
@Table(name = "categoria_articulo")
@NamedQueries({
    @NamedQuery(name = "CategoriaArticulo.findAll", query = "SELECT c FROM CategoriaArticulo c"),
    @NamedQuery(name = "CategoriaArticulo.findByCodCategoria", query = "SELECT c FROM CategoriaArticulo c WHERE c.codCategoria = :codCategoria"),
    @NamedQuery(name = "CategoriaArticulo.findByDescripcion", query = "SELECT c FROM CategoriaArticulo c WHERE c.descripcion = :descripcion")
  })
public class CategoriaArticulo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_categoria")
    private Integer codCategoria;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    public CategoriaArticulo() {
    }

    public CategoriaArticulo(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    public CategoriaArticulo(Integer codCategoria, String descripcion
    ) {
        this.codCategoria = codCategoria;
        this.descripcion = descripcion;
    
    }

    public Integer getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Integer codCategoria) {
        Integer oldCodCategoria = this.codCategoria;
        this.codCategoria = codCategoria;
        changeSupport.firePropertyChange("codCategoria", oldCodCategoria, codCategoria);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCategoria != null ? codCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaArticulo)) {
            return false;
        }
        CategoriaArticulo other = (CategoriaArticulo) object;
        if ((this.codCategoria == null && other.codCategoria != null) || (this.codCategoria != null && !this.codCategoria.equals(other.codCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.CategoriaArticulo[ codCategoria=" + codCategoria + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
