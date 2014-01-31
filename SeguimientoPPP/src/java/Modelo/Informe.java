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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Alberto
 */
@Entity
@Table(name = "Informe")

public class Informe implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroInforme")
    private int nroInforme;
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Basic
    @Column(name = "nombreDocenteAsesor")
    private String nombreDocenteAsesor;
    @Basic
    @Column(name = "nombreEstudiante")
    private String nombreEstudiante;
    @Basic
    @Column(name = "fechaInicioPPP")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaInicioPPP;
    @Basic
    @Column(name = "fechaFinPPP")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaFinPPP;
    @Basic
    @Column(name = "nroCarta")
    private int nroCarta;

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
    
    
}
