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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@NamedQueries({
    @NamedQuery(name = "Coordinacion.modificarCoordinacion",
            query = "UPDATE Coordinacion c SET c.jefeCoordinacion = :jefeCoordinacion WHERE c.carreraProfesional = :carreraProfesional "),
    @NamedQuery(name = "Coordinacion.mostrarCoordinacion",
            query = "select c from Coordinacion c "
            + "WHERE c.carreraProfesional = :carreraProfesional "
            + "and c.jefeCoordinacion = :jefeCoordinacion "),
    @NamedQuery(name = "Coordinacion.eliminarCoordinacion",
            query = "DELETE FROM Coordinacion c "
           + "WHERE c.carreraProfesional = :carreraProfesional "
           + "and c.jefeCoordinacion = :jefeCoordinacion "),
    @NamedQuery(name = "Coordinacion.listarCoordinacion",
            query = "select c from Coordinacion c")})
@Table(name = "Coordinacion")

public class Coordinacion implements Serializable{
    @XmlElement
    @Id
    @Column(name = "carreraProfesional")
    private String carreraProfesional;
    @XmlElement
    @Basic
    @Column(name = "jefeCoordinacion")
    private String jefeCoordinacion;
    @XmlTransient
    @OneToMany(mappedBy = "esEvaluado")
    private List<Informe> evalua;
    @XmlTransient
    @OneToMany(mappedBy = "esRevisada")
    private List<SolicitudPPP> revisa;
    @XmlTransient
    @OneToMany(mappedBy = "esVerificada")
    private List<Empresa> verifica;
    @XmlTransient
    @OneToOne(mappedBy = "esAsignado")
    private DocenteAsesor asigna;
    @XmlTransient
    @OneToOne(mappedBy = "esEmitida")
    private FichaSeguimiento emite;
    
    public Coordinacion() {
    }

    public String getCarreraProfesional() {
        return carreraProfesional;
    }

    public void setCarreraProfesional(String carreraProfesional) {
        this.carreraProfesional = carreraProfesional;
    }

    public String getJefeCoordinacion() {
        return jefeCoordinacion;
    }

    public void setJefeCoordinacion(String jefeCoordinacion) {
        this.jefeCoordinacion = jefeCoordinacion;
    }

    public List<Informe> getEvalua() {
        if ( this.evalua == null) {
            this.evalua = new ArrayList<>();
        }
        return evalua;
    }

    public void setEvalua(List<Informe> evalua) {
        this.evalua = evalua;
    }    

    public List<SolicitudPPP> getRevisa() {
        if ( this.revisa == null) {
            this.revisa = new ArrayList<>();
    }
        return revisa;
    }

    public void setRevisa(List<SolicitudPPP> revisa) {
        this.revisa = revisa;
    }

    public List<Empresa> getVerifica() {
        if ( this.verifica == null) {
            this.verifica = new ArrayList<>();
    }
        return verifica;
    }

    public void setVerifica(List<Empresa> verifica) {
        this.verifica = verifica;
    }

    public DocenteAsesor getAsigna() {
        return asigna;
    }

    public void setAsigna(DocenteAsesor asigna) {
        this.asigna = asigna;
    }

    public FichaSeguimiento getEmite() {
        return emite;
    }

    public void setEmite(FichaSeguimiento emite) {
        this.emite = emite;
    }
    
}
