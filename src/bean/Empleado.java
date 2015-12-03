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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "empleado")
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByCodigoEmpleado", query = "SELECT e FROM Empleado e WHERE e.codigoEmpleado = :codigoEmpleado"),
    @NamedQuery(name = "Empleado.findByNombre", query = "SELECT e FROM Empleado e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleado.findByApellido", query = "SELECT e FROM Empleado e WHERE e.apellido = :apellido"),
    @NamedQuery(name = "Empleado.findByCedula", query = "SELECT e FROM Empleado e WHERE e.cedula = :cedula"),
    @NamedQuery(name = "Empleado.findByEmail", query = "SELECT e FROM Empleado e WHERE e.email = :email"),
    @NamedQuery(name = "Empleado.findByDireccion", query = "SELECT e FROM Empleado e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Empleado.findByTelefono", query = "SELECT e FROM Empleado e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Empleado.findByFechaNacimiento", query = "SELECT e FROM Empleado e WHERE e.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Empleado.findByFechaIngreso", query = "SELECT e FROM Empleado e WHERE e.fechaIngreso = :fechaIngreso")})
public class Empleado implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoEmpleado")
    private Integer codigoEmpleado;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "fechaIngreso")
    private String fechaIngreso;
    @OneToMany(mappedBy = "codigoJefe")
    private Collection<Empleado> empleadoCollection;
    @JoinColumn(name = "codigoJefe", referencedColumnName = "codigoEmpleado")
    @ManyToOne
    private Empleado codigoJefe;
    @JoinColumn(name = "codigoCargo", referencedColumnName = "codigoCargo")
    @ManyToOne(optional = false)
    private Cargo codigoCargo;
    /*@OneToOne(cascade = CascadeType.ALL, mappedBy = "empleado")
    private Usuario usuario;
    */
    @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado",
            insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoEmpleado")
    private Collection<Asistencia> asistenciaCollection;

    public Empleado() {
    }

    public Empleado(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Empleado(Integer codigoEmpleado, String nombre, String apellido, String cedula, String direccion, String telefono, Date fechaNacimiento, String fechaIngreso) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        Integer oldCodigoEmpleado = this.codigoEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        changeSupport.firePropertyChange("codigoEmpleado", oldCodigoEmpleado, codigoEmpleado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        String oldApellido = this.apellido;
        this.apellido = apellido;
        changeSupport.firePropertyChange("apellido", oldApellido, apellido);
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        Date oldFechaNacimiento = this.fechaNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        changeSupport.firePropertyChange("fechaNacimiento", oldFechaNacimiento, fechaNacimiento);
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        String oldFechaIngreso = this.fechaIngreso;
        this.fechaIngreso = fechaIngreso;
        changeSupport.firePropertyChange("fechaIngreso", oldFechaIngreso, fechaIngreso);
    }

    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    public Empleado getCodigoJefe() {
        return codigoJefe;
    }

    public void setCodigoJefe(Empleado codigoJefe) {
        Empleado oldCodigoJefe = this.codigoJefe;
        this.codigoJefe = codigoJefe;
        changeSupport.firePropertyChange("codigoJefe", oldCodigoJefe, codigoJefe);
    }

    public Cargo getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(Cargo codigoCargo) {
        Cargo oldCodigoCargo = this.codigoCargo;
        this.codigoCargo = codigoCargo;
        changeSupport.firePropertyChange("codigoCargo", oldCodigoCargo, codigoCargo);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.codigoEmpleado == null && other.codigoEmpleado != null) || (this.codigoEmpleado != null && !this.codigoEmpleado.equals(other.codigoEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Empleado[ codigoEmpleado=" + codigoEmpleado + " ]";
    }

    public Collection<Asistencia> getAsistenciaCollection() {
        return asistenciaCollection;
    }

    public void setAsistenciaCollection(Collection<Asistencia> asistenciaCollection) {
        this.asistenciaCollection = asistenciaCollection;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
