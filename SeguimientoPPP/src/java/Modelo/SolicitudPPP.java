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
@Table(name = "SolicitudPPP")

public class SolicitudPPP implements Serializable{
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroSolicitud")
    private int nroSolicitud;
    @XmlElement
    @Basic
    @Column(name = "codigoEstudiante")
    private String codigoEstudiante;
    @XmlElement
    @Basic
    @Column(name = "codigoDocente")
    private String codigoDocente;
    @XmlElement
    @Basic
    @Column(name = "codigoEmpresa")
    private String codigoEmpresa;
    @XmlElement
    @Basic
    @Column(name = "tipoSolicitud")
    private String tipoSolicitud;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esHecha", referencedColumnName = "codigoEstudiante")
    private Estudiante esHecha;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esRevisada", referencedColumnName = "carreraProfesional")
    private Coordinacion esRevisada;
    
    public SolicitudPPP() {
    }

    public int getNroSolicitud() {
        return nroSolicitud;
    }

    public void setNroSolicitud(int nroSolicitud) {
        this.nroSolicitud = nroSolicitud;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public Estudiante getEsHecha() {
        return esHecha;
    }

    public void setEsHecha(Estudiante esHecha) {
        this.esHecha = esHecha;
    }

    public Coordinacion getEsRevisada() {
        return esRevisada;
    }

    public void setEsRevisada(Coordinacion esRevisada) {
        this.esRevisada = esRevisada;
    }
    
}
