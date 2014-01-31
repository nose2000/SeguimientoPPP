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
import javax.persistence.Table;

/**
 *
 * @author Alberto
 */
@Entity
@Table(name = "SolicitudPPP")

public class SolicitudPPP implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroSolicitud")
    private int nroSolicitud;
    @Basic
    @Column(name = "codigoEstudiante")
    private String codigoEstudiante;
    @Basic
    @Column(name = "codigoDocente")
    private String codigoDocente;
    @Basic
    @Column(name = "codigoEmpresa")
    private String codigoEmpresa;
    @Basic
    @Column(name = "tipoSolicitud")
    private String tipoSolicitud;

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
    
    
    
}
