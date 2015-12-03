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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "habitacion")
@NamedQueries({
    @NamedQuery(name = "Habitacion.findAll", query = "SELECT h FROM Habitacion h"),
    @NamedQuery(name = "Habitacion.findByNumero", query = "SELECT h FROM Habitacion h WHERE h.numero = :numero")})
public class Habitacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numero")
    private Integer numero;
    @JoinColumn(name = "codigoCategoria", referencedColumnName = "codigoCategoria")
    @ManyToOne
    private CategHabitacion codigoCategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numHabitacion")
    private Collection<Reserva> reservaCollection;

    public Habitacion() {
    }

    public Habitacion(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public CategHabitacion getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(CategHabitacion codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitacion)) {
            return false;
        }
        Habitacion other = (Habitacion) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", codigoCategoria=" + codigoCategoria;
    }

  
    
}
