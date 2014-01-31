/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Alberto
 */
@Entity
@Table(name = "CartaAutorizacion")

public class CartaAutorizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroCarta")
    private int nroCarta;
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Basic
    @Column(name = "nombreEstudiante")
    private String nombreEstudiante;
    @Basic
    @Column(name = "nombreDocente")
    private String nombreDocente;
    @Basic
    @Column(name = "especialidadEstudiante")
    private String especialidadEstudiante;
    @Basic
    @Column(name = "observaciones")
    private String observaciones;
    @Basic
    @Column(name = "duracionPPP")
    private int duracionPPP;

    public CartaAutorizacion() {
    }

    public int getNroCarta() {
        return nroCarta;
    }

    public void setNroCarta(int nroCarta) {
        this.nroCarta = nroCarta;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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

    public String getEspecialidadEstudiante() {
        return especialidadEstudiante;
    }

    public void setEspecialidadEstudiante(String especialidadEstudiante) {
        this.especialidadEstudiante = especialidadEstudiante;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getDuracionPPP() {
        return duracionPPP;
    }

    public void setDuracionPPP(int duracionPPP) {
        this.duracionPPP = duracionPPP;
    }
    
    
    
}
