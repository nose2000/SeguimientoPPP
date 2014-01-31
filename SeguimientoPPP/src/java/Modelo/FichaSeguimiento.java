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
@Table(name = "FichaSeguimiento")

public class FichaSeguimiento implements Serializable{
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroInforme")
    private int nroInforme;
    @XmlElement
    @Basic
    @Column(name = "nroFicha")
    private int nroFicha;
    @XmlElement
    @Basic
    @Column(name = "nombreEstudiante")
    private String nombreEstudiante;
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
    @Column(name = "Fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar Fecha;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esEvaluada", referencedColumnName = "codigoDocente")
    private DocenteAsesor esEvaluada;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esSolicitada", referencedColumnName = "codigoEstudiante")
    private Estudiante esSolicitada;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esEmitida", referencedColumnName = "carreraProfesional")
    private Coordinacion esEmitida;
    
    public FichaSeguimiento() {
    }

    public int getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(int nroInforme) {
        this.nroInforme = nroInforme;
    }

    public int getNroFicha() {
        return nroFicha;
    }

    public void setNroFicha(int nroFicha) {
        this.nroFicha = nroFicha;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
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
        return Fecha;
    }

    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }

    public DocenteAsesor getEsEvaluada() {
        return esEvaluada;
    }

    public void setEsEvaluada(DocenteAsesor esEvaluada) {
        this.esEvaluada = esEvaluada;
    }

    public Estudiante getEsSolicitada() {
        return esSolicitada;
    }

    public void setEsSolicitada(Estudiante esSolicitada) {
        this.esSolicitada = esSolicitada;
    }

    public Coordinacion getEsEmitida() {
        return esEmitida;
    }

    public void setEsEmitida(Coordinacion esEmitida) {
        this.esEmitida = esEmitida;
    }
    
}
