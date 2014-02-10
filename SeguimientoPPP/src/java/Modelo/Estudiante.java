/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alberto
 */
@XmlRootElement
@Entity
@NamedQueries({
    @NamedQuery(name = "Estudiante.modificarEstudiante",
            query = "UPDATE Estudiante e SET e.rankingEstudiante = :rankingEstudiante, e.nroCreditos = :nroCreditos, e.carreraProfesional = :carreraProfesional, e.nombre = :nombre WHERE e.codigoEstudiante = :codigoEstudiante "),
    @NamedQuery(name = "Estudiante.mostrarEstudiante",
            query = "select e from Estudiante e "
            + "WHERE e.codigoEstudiante = :codigoEstudiante "
            + "and e.nombre = :nombre "
            + "and e.carreraProfesional = :carreraProfesional "
            + "and e.nroCreditos = :nroCreditos "
            + "and e.rankingEstudiante = :rankingEstudiante "),
    @NamedQuery(name = "Estudiante.eliminarEstudiante",
            query = "DELETE FROM Estudiante e "
            + "WHERE e.codigoEstudiante = :codigoEstudiante "
            + "and e.nombre = :nombre "
            + "and e.carreraProfesional = :carreraProfesional "
            + "and e.nroCreditos = :nroCreditos "
            + "and e.rankingEstudiante = :rankingEstudiante "),
    @NamedQuery(name = "Estudiante.listarEstudiante",
            query = " select e from Estudiante e" )})
@Table(name = "Estudiante")

public class Estudiante implements Serializable {
    @XmlElement
    @Id
    @Column(name = "codigoEstudiante")
    private String codigoEstudiante;
    @XmlElement
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @XmlElement
    @Basic
    @Column(name = "carreraProfesional")
    private String carreraProfesional;
    @XmlElement
    @Basic
    @Column(name = "nroCreditos")
    private int nroCreditos;
    @XmlElement
    @Basic
    @Column(name = "rankingEstudiante")
    private int rankingEstudiante;
    @XmlTransient
    @OneToMany(mappedBy = "esRealizado")
    private List<Informe> realiza;  
    @XmlTransient
    @OneToMany(mappedBy = "esHecha")
    private List<SolicitudPPP> hace; 
    @XmlTransient
    @OneToMany(mappedBy = "esTramitada")
    private List<CartaAutorizacion> tramita; 
    @XmlTransient
    @OneToMany(mappedBy = "esSolicitada")
    private List<FichaSeguimiento> solicita; 
    
    public Estudiante() {
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarreraProfesional() {
        return carreraProfesional;
    }

    public void setCarreraProfesional(String carreraProfesional) {
        this.carreraProfesional = carreraProfesional;
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public int getRankingEstudiante() {
        return rankingEstudiante;
    }

    public void setRankingEstudiante(int rankingEstudiante) {
        this.rankingEstudiante = rankingEstudiante;
    }

    public List<Informe> getRealiza() {
        if ( this.realiza == null) {
            this.realiza = new ArrayList<>();
        }
        return realiza;
    }

    public void setRealiza(List<Informe> realiza) {
        this.realiza = realiza;
    }

    public List<SolicitudPPP> getHace() {
         if ( this.hace == null) {
            this.hace = new ArrayList<>();
        }
        return hace;
    }

    public void setHace(List<SolicitudPPP> hace) {
        this.hace = hace;
    }

    public List<CartaAutorizacion> getTramita() {
         if ( this.tramita == null) {
            this.tramita = new ArrayList<>();
        }
        return tramita;
    }

    public void setTramita(List<CartaAutorizacion> tramita) {
        this.tramita = tramita;
    }

    public List<FichaSeguimiento> getSolicita() {
         if ( this.solicita == null) {
            this.solicita = new ArrayList<>();
        }
        return solicita;
    }

    public void setSolicita(List<FichaSeguimiento> solicita) {
        this.solicita = solicita;
    }
   
}
