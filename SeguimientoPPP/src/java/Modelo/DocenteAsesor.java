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
import javax.persistence.JoinColumn;
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
    @NamedQuery(name = "DocenteAsesor.modificarDocenteAsesor",
            query = "UPDATE DocenteAsesor d SET d.apto = :apto, d.carreraProfesional = :carreraProfesional, d.apellidoMaterno = :apellidoMaterno, d.apellidoPaterno = :apellidoPaternon, d.nombre = :nombre WHERE d.codigoDocente = :codigoDocente "),
    @NamedQuery(name = "DocenteAsesor.mostrarDocenteAsesor",
            query = "select d from DocenteAsesor d "
            + "WHERE d.codigoDocente = :codigoDocente "
            + "and d.nombre = :nombre "
            + "and d.apellidoPaterno = :apellidoPaterno "
            + "and d.apellidoMaterno = :apellidoMaterno "
            + "and d.carreraProfesional = :carreraProfesional "
            + "and d.apto = :apto "),
    @NamedQuery(name = "DocenteAsesor.eliminarDocenteAsesor",
            query = "DELETE FROM DocenteAsesor d "
            + "WHERE d.codigoDocente = :codigoDocente "
            + "and d.nombre = :nombre "
            + "and d.apellidoPaterno = :apellidoPaterno "
            + "and d.apellidoMaterno = :apellidoMaterno "
            + "and d.carreraProfesional = :carreraProfesional "
            + "and d.apto = :apto "),
    @NamedQuery(name = "DocenteAsesor.listarDocenteAsesor",
            query = " select d from DocenteAsesor d" )})
@Table(name = "DocenteAsesor")

public class DocenteAsesor implements Serializable{
    @XmlElement
    @Id
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
    @Column(name = "carreraProfesional")
    private String carreraProfesional;
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

    public String getCarreraProfesional() {
        return carreraProfesional;
    }

    public void setCarreraProfesional(String carreraProfesional) {
        this.carreraProfesional = carreraProfesional;
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
