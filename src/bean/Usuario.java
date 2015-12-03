/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCodigoEmpleado", query = "SELECT u FROM Usuario u WHERE u.codigoEmpleado = :codigoEmpleado"),
    @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigoEmpleado")
    private Integer codigoEmpleado;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    
    @JoinTable(name = "usuario_has_rol", joinColumns = {
        @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado")}, inverseJoinColumns = {
        @JoinColumn(name = "idRol", referencedColumnName = "idRol")})
    @ManyToMany
    //@ManyToMany(mappedBy = "usuarioCollection")
    private Collection<Rol> rolCollection;
    
    
    /*@JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Empleado empleado;
    */
    @OneToOne(cascade = {CascadeType.PERSIST, 
        CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}, mappedBy = "usuario")
    private Empleado empleado;
    

    public Usuario() {
    }

    public Usuario(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Usuario(Integer codigoEmpleado, String password) {
        this.codigoEmpleado = codigoEmpleado;
        this.password = password;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Rol> getRolCollection() {
        return rolCollection;
    }

    public void setRolCollection(Collection<Rol> rolCollection) {
        this.rolCollection = rolCollection;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEmpleado != null ? codigoEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codigoEmpleado == null && other.codigoEmpleado != null) || (this.codigoEmpleado != null && !this.codigoEmpleado.equals(other.codigoEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Usuario[ codigoEmpleado=" + codigoEmpleado + " ]";
    }
    
}
