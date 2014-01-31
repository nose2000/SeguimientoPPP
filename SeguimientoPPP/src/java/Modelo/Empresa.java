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
@Table(name = "Empresa")

public class Empresa implements Serializable{
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoEmpresa")
    private String codigoEmpresa;
    @XmlElement
    @Basic
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @XmlElement
    @Basic
    @Column(name = "tipoEmresa")
    private String tipoEmresa;
    @XmlElement
    @Basic
    @Column(name = "estadoEmpresa")
    private String estadoEmpresa;
    @XmlElement
    @Basic
    @Column(name = "rankingEmpresa")
    private int rankingEmpresa;
    @XmlElement
    @Basic
    @Column(name = "apto")
    private boolean apto;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "esVerificada", referencedColumnName = "carreraProfesional")
    private Coordinacion esVerificada;
    @XmlTransient
    @OneToOne(mappedBy = "esSolicitada")
    private CartaAutorizacion solicita;

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

    public Coordinacion getEsVerificada() {
        return esVerificada;
    }

    public void setEsVerificada(Coordinacion esVerificada) {
        this.esVerificada = esVerificada;
    }

    public CartaAutorizacion getSolicita() {
        return solicita;
    }

    public void setSolicita(CartaAutorizacion solicita) {
        this.solicita = solicita;
    }
}
