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
@Table(name = "FichaSeguimiento")

public class FichaSeguimiento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroInforme")
    private int nroInforme;
    @Basic
    @Column(name = "nombreEmpresa")
    private int nroFicha;
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEstudiante;
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreDocente;
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Basic
    @Column(name = "nombreEmpresa")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar Fecha;

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
    
    
    
}
