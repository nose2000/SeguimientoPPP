/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alberto
 */
@XmlRootElement
@Entity
@NamedQueries({
    @NamedQuery(name = "FichaDatosGenerales.modificarFichaDatosGenerales",
            query = "UPDATE FichaDatosGenerales f SET f.tareaAsignada = :tareaAsignada, f.fechaFinal = :fechaFinal, f.fechaInicio = :fechaInicio, f.nombreCoordinadorCarrra = :nombreCoordinadorCarrra, f.nombreEmpresa = :nombreEmpresa, f.nombreDocente = :nombreDocente, f.nombreAlumno = :nombreAlumno WHERE f.numeroFichaDatosGenerales = :numeroFichaDatosGenerales "),
    @NamedQuery(name = "FichaDatosGenerales.mostrarFichaDatosGenerales",
            query = "select f from FichaDatosGenerales f "
            + "WHERE f.numeroFichaDatosGenerales = :numeroFichaDatosGenerales "
            + "and f.nombreAlumno = :nombreAlumno "
            + "and f.nombreDocente = :nombreDocente "
            + "and f.nombreEmpresa = :nombreEmpresa "
            + "and f.nombreCoordinadorCarrra = :nombreCoordinadorCarrra "
            + "and f.fechaInicio = :fechaInicio "
            + "and f.fechaFinal = :fechaFinal "
            + "and f.tareaAsignada = :tareaAsignada"),
    @NamedQuery(name = "FichaDatosGenerales.eliminarFichaDatosGenerales",
            query = "DELETE FROM FichaDatosGenerales f "
            + "WHERE f.numeroFichaDatosGenerales = :numeroFichaDatosGenerales "
            + "and f.nombreAlumno = :nombreAlumno "
            + "and f.nombreDocente = :nombreDocente "
            + "and f.nombreEmpresa = :nombreEmpresa "
            + "and f.nombreCoordinadorCarrra = :nombreCoordinadorCarrra "
            + "and f.fechaInicio = :fechaInicio "
            + "and f.fechaFinal = :fechaFinal "
            + "and f.tareaAsignada = :tareaAsignada"),
    @NamedQuery(name = "FichaDatosGenerales.listarFichaDatosGenerales",
            query = " select f from FichaDatosGenerales f" )})
@Table(name = "FichaDatosGenerales")

public class FichaDatosGenerales implements Serializable{
    @XmlElement
    @Id
    @Column (name = "numeroFichaDatosGenerales")
    private int numeroFichaDatosGenerales;
    @XmlElement
    @Basic
    @Column(name = "nombreAlumno")
    private String nombreAlumno;
    @XmlElement
    @Basic
    @Column(name = "nombreDocente")
    private String nombreDocente;
    @XmlElement
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @XmlElement
    @Basic
    @Column(name = "nombreCoordinadorCarrra")
    private String nombreCoordinadorCarrra;
    @XmlElement
    @Basic
    @Column(name = "fechaInicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaInicio;
    @XmlElement
    @Basic
    @Column(name = "fechaFinal")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaFinal;
    @XmlElement
    @Basic
    @Column(name = "tareaAsignada")
    private String tareaAsignada;

    public FichaDatosGenerales() {
    }

    public int getNumeroFichaDatosGenerales() {
        return numeroFichaDatosGenerales;
    }

    public void setNumeroFichaDatosGenerales(int numeroFichaDatosGenerales) {
        this.numeroFichaDatosGenerales = numeroFichaDatosGenerales;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreCoordinadorCarrra() {
        return nombreCoordinadorCarrra;
    }

    public void setNombreCoordinadorCarrra(String nombreCoordinadorCarrra) {
        this.nombreCoordinadorCarrra = nombreCoordinadorCarrra;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getTareaAsignada() {
        return tareaAsignada;
    }

    public void setTareaAsignada(String tareaAsignada) {
        this.tareaAsignada = tareaAsignada;
    }

}
