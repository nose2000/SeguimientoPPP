/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "Estudiante")

public class Decanatura implements Serializable{
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "universidad")
    private String universidad;
    @XmlElement
    @Basic
    @Column(name = "encargado")
    private String encargado;
    @XmlElement
    @Basic
    @Column(name = "tipoTramite")
    private String tipoTramite;
    @XmlElement
    @Basic
    @Column(name = "observaciones")
    private String observaciones;
    @XmlTransient
    @OneToMany(mappedBy = "esEmitida")
    private List<CartaAutorizacion> emite; 
    
    public Decanatura() {
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<CartaAutorizacion> getEmite() {
         if ( this.emite == null) {
            this.emite = new ArrayList<>();
    }
        return emite;
    }

    public void setEmite(List<CartaAutorizacion> emite) {
        this.emite = emite;
    }
    
}
