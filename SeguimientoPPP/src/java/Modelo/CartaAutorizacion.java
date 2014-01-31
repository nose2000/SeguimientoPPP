/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name = "CartaAutorizacion")

public class CartaAutorizacion implements Serializable {
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroCarta")
    private int nroCarta;
    @XmlElement
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
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
    @Column(name = "especialidadEstudiante")
    private String especialidadEstudiante;
    @XmlElement
    @Basic
    @Column(name = "observaciones")
    private String observaciones;
    @XmlElement
    @Basic
    @Column(name = "duracionPPP")
    private int duracionPPP;
    @XmlTransient
    @OneToOne
    @JoinColumn(name = "esSolicitada", referencedColumnName = "codigoEmpresa")
    private Empresa esSolicitada;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esTramitada", referencedColumnName = "codigoEstudiante")
    private Estudiante esTramitada;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esEmitida", referencedColumnName = "universidad")
    private Decanatura esEmitida;
    
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

    public Empresa getEsSolicitada() {
        return esSolicitada;
    }

    public void setEsSolicitada(Empresa esSolicitada) {
        this.esSolicitada = esSolicitada;
    }


    public Estudiante getEsTramitada() {
        return esTramitada;
    }

    public void setEsTramitada(Estudiante esTramitada) {
        this.esTramitada = esTramitada;
    }

    public Decanatura getEsEmitida() {
        return esEmitida;
    }

    public void setEsEmitida(Decanatura esEmitida) {
        this.esEmitida = esEmitida;
    }
    
}
