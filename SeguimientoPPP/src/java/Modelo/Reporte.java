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
    @NamedQuery(name = "Reporte.modificarReporte",
            query = "UPDATE Reporte r SET r.conclusion = :conclusion, r.descripcion = :descripcion, r.fecha = :fecha, r.nombreEmpresa = :nombreEmpresa, r.nombreDocente = :nombreDocente, r.nombreAlumno = :nombreAlumno WHERE r.numeroReporte = :numeroReporte "),
    @NamedQuery(name = "Reporte.mostrarReporte",
            query = "select r from Reporte r "
            + "WHERE r.numeroReporte = :numeroReporte "
            + "and r.nombreAlumno = :nombreAlumno "
            + "and r.nombreDocente = :nombreDocente "
            + "and r.nombreEmpresa = :nombreEmpresa "
            + "and r.fecha = :fecha "
            + "and r.descripcion = :descripcion "
            + "and r.conclusion = :conclusion "),
    @NamedQuery(name = "Reporte.eliminarReporte",
            query = "DELETE FROM Reporte r "
             + "WHERE r.numeroReporte = :numeroReporte "
            + "and r.nombreAlumno = :nombreAlumno "
            + "and r.nombreDocente = :nombreDocente "
            + "and r.nombreEmpresa = :nombreEmpresa "
            + "and r.fecha = :fecha "
            + "and r.descripcion = :descripcion "
            + "and r.conclusion = :conclusion "),
    @NamedQuery(name = "Reporte.listarReporte",
            query = " select r from Reporte r" )})
@Table(name = "Reporte")

public class Reporte implements Serializable{
    @XmlElement
    @Id
    @Column(name = "numeroReporte" )
    private int numeroReporte;
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
    @Column(name = "fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fecha;
    @XmlElement
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @XmlElement
    @Basic
    @Column(name = "conclusion")
    private String conclusion;

    public Reporte() {
    }

    public int getNumeroReporte() {
        return numeroReporte;
    }

    public void setNumeroReporte(int numeroReporte) {
        this.numeroReporte = numeroReporte;
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

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    
    
}
