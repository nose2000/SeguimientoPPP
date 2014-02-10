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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
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
    @NamedQuery(name = "Informe.modificarInforme",
            query = "UPDATE Informe i SET i.nroCarta = :nroCarta, i.fechaFinPPP = :fechaFinPPP, i.fechaInicioPPP = :fechaInicioPPP, i.nombreEstudiante = :nombreEstudiante, i.nombreDocenteAsesor = :nombreDocenteAsesor, i.nombreEmpresa = :nombreEmpresa WHERE i.nroInforme = :nroInforme "),
    @NamedQuery(name = "Informe.mostrarInforme",
            query = "select i from Informe i "
            + "WHERE i.nroInforme = :nroInforme "
            + "and i.nombreEmpresa = :nombreEmpresa "
            + "and i.nombreDocenteAsesor = :nombreDocenteAsesor "
            + "and i.nombreEstudiante = :nombreEstudiante "
            + "and i.fechaInicioPPP = :fechaInicioPPP "
            + "and i.fechaFinPPP = :fechaFinPPP "
            + "and i.nroCarta = :nroCarta "),
    @NamedQuery(name = "Informe.eliminarInforme",
            query = "DELETE FROM Informe i "
            + "WHERE i.nroInforme = :nroInforme "
            + "and i.nombreEmpresa = :nombreEmpresa "
            + "and i.nombreDocenteAsesor = :nombreDocenteAsesor "
            + "and i.nombreEstudiante = :nombreEstudiante "
            + "and i.fechaInicioPPP = :fechaInicioPPP "
            + "and i.fechaFinPPP = :fechaFinPPP "
            + "and i.nroCarta = :nroCarta "),
    @NamedQuery(name = "Informe.listarInforme",
            query = " select i from Informe i" )})
@Table(name = "Informe")

public class Informe implements Serializable{
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroInforme")
    private int nroInforme;
    @XmlElement
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @XmlElement
    @Basic
    @Column(name = "nombreDocenteAsesor")
    private String nombreDocenteAsesor;
    @XmlElement
    @Basic
    @Column(name = "nombreEstudiante")
    private String nombreEstudiante;
    @XmlElement
    @Basic
    @Column(name = "fechaInicioPPP")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaInicioPPP;
    @XmlElement
    @Basic
    @Column(name = "fechaFinPPP")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaFinPPP;
    @XmlElement
    @Basic
    @Column(name = "nroCarta")
    private int nroCarta;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esRealizado", referencedColumnName = "codigoEstudiante")
    private Estudiante esRealizado;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esEvaluado", referencedColumnName = "carreraProfesional")
    private Coordinacion esEvaluado;
    
    public Informe() {
    }

    public int getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(int nroInforme) {
        this.nroInforme = nroInforme;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreDocenteAsesor() {
        return nombreDocenteAsesor;
    }

    public void setNombreDocenteAsesor(String nombreDocenteAsesor) {
        this.nombreDocenteAsesor = nombreDocenteAsesor;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public Calendar getFechaInicioPPP() {
        return fechaInicioPPP;
    }

    public void setFechaInicioPPP(Calendar fechaInicioPPP) {
        this.fechaInicioPPP = fechaInicioPPP;
    }

    public Calendar getFechaFinPPP() {
        return fechaFinPPP;
    }

    public void setFechaFinPPP(Calendar fechaFinPPP) {
        this.fechaFinPPP = fechaFinPPP;
    }

    public int getNroCarta() {
        return nroCarta;
    }

    public void setNroCarta(int nroCarta) {
        this.nroCarta = nroCarta;
    }

    public Estudiante getEsRealizado() {
        return esRealizado;
    }

    public void setEsRealizado(Estudiante esRealizado) {
        this.esRealizado = esRealizado;
    }

    public Coordinacion getEsEvaluado() {
        return esEvaluado;
    }

    public void setEsEvaluado(Coordinacion esEvaluado) {
        this.esEvaluado = esEvaluado;
    }
    
}
