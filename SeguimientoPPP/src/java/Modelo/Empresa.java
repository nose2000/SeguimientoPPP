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
@Table(name = "Empresa")

public class Empresa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoEmpresa")
    private String codigoEmpresa;
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Basic
    @Column(name = "tipoEmresa")
    private String tipoEmresa;
    @Basic
    @Column(name = "estadoEmpresa")
    private String estadoEmpresa;
    @Basic
    @Column(name = "rankingEmpresa")
    private int rankingEmpresa;
    @Basic
    @Column(name = "apto")
    private boolean apto;

    public Empresa() {
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoEmresa() {
        return tipoEmresa;
    }

    public void setTipoEmresa(String tipoEmresa) {
        this.tipoEmresa = tipoEmresa;
    }

    public String getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public int getRankingEmpresa() {
        return rankingEmpresa;
    }

    public void setRankingEmpresa(int rankingEmpresa) {
        this.rankingEmpresa = rankingEmpresa;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }
    
    
    
}
