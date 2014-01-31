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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "DocenteAsesor")

public class DocenteAsesor implements Serializable{
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoDocente")
    private String codigoDocente;
    @XmlElement
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @XmlElement
    @Basic
    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;
    @XmlElement
    @Basic
    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;
    @XmlElement
    @Basic
    @Column(name = "carreraProfecional")
    private String carreraProfecional;
    @XmlElement
    @Basic
    @Column(name = "apto")
    private boolean  apto;
    @XmlTransient
    @OneToOne
    @JoinColumn(name = "esAsignado", referencedColumnName = "carreraProfesional")
    private Coordinacion esAsignado;
    @XmlTransient
    @OneToMany(mappedBy = "esEvaluada")
    private List<FichaSeguimiento> evalua; 
    
    public DocenteAsesor() {
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCarreraProfecional() {
        return carreraProfecional;
    }

    public void setCarreraProfecional(String carreraProfecional) {
        this.carreraProfecional = carreraProfecional;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public Coordinacion getEsAsignado() {
        return esAsignado;
    }

    public void setEsAsignado(Coordinacion esAsignado) {
        this.esAsignado = esAsignado;
    }

    public List<FichaSeguimiento> getEvalua() {
          if ( this.evalua == null) {
            this.evalua = new ArrayList<>();
    }
        return evalua;
    }

    public void setEvalua(List<FichaSeguimiento> evalua) {
        this.evalua = evalua;
    }
 
}
