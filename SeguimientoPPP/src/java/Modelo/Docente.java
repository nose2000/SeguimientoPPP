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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alberto
 */
@XmlRootElement
@Entity
@NamedQueries({
    @NamedQuery(name = "Docente.modificarDocente",
            query = "UPDATE Docente d SET d.estadoD = :estadoD, d.carreraD = :carreraD, d.facultadD = :facultadD, d.apellidoMaternoD = :apellidoMaternoD, d.apellidoPaternoD = :apellidoPaternoD, d.nombreD = :nombreD WHERE d.codigoDocente = :codigoDocente "),
    @NamedQuery(name = "Docente.mostrarDocente",
            query = "select d from Docente d "
            + "WHERE d.codigoDocente = :codigoDocente "
            + "and d.nombreD = :nombreD "
            + "and d.apellidoPaternoD = :apellidoPaternoD "
            + "and d.apellidoMaternoD = :apellidoMaternoD "
            + "and d.facultadD = :facultadD "
            + "and d.carreraD = :carreraD "
            + "and d.estadoD = :estadoD"),
    @NamedQuery(name = "Docente.eliminarDocente",
            query = "DELETE FROM Docente d "
             + "WHERE d.codigoDocente = :codigoDocente "
            + "and d.nombreD = :nombreD "
            + "and d.apellidoPaternoD = :apellidoPaternoD "
            + "and d.apellidoMaternoD = :apellidoMaternoD "
            + "and d.facultadD = :facultadD "
            + "and d.carreraD = :carreraD "
            + "and d.estadoD = :estadoD"),
    @NamedQuery(name = "Docente.listarDocente",
            query = " select d from Docente d" )})
@Table(name = "Docente")

public class Docente implements Serializable{
    @XmlElement
    @Id
    @Column (name = "codigoDocente", length = 20)
    private String codigoDocente;
    @XmlElement
    @Basic
    @Column (name = "nombreD", length = 100)
    private String nombreD;
    @XmlElement
    @Basic 
    @Column (name = "apellidoPaternoD", length = 100)
    private String apellidoPaternoD;
    @XmlElement
    @Basic
    @Column (name = "apellidoMaternoD", length = 100)
    private String apellidoMaternoD;
    @XmlElement
    @Basic
    @Column (name = "facultadD", length = 100)
    private String facultadD;
    @XmlElement
    @Basic
    @Column (name = "carreraD", length = 100)
    private String carreraD;
    @XmlElement
    @Basic
    @Column (name = "estadoD", length = 100)
    private String estadoD;

    public Docente() {
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getApellidoPaternoD() {
        return apellidoPaternoD;
    }

    public void setApellidoPaternoD(String apellidoPaternoD) {
        this.apellidoPaternoD = apellidoPaternoD;
    }

    public String getApellidoMaternoD() {
        return apellidoMaternoD;
    }

    public void setApellidoMaternoD(String apellidoMaternoD) {
        this.apellidoMaternoD = apellidoMaternoD;
    }

    public String getFacultadD() {
        return facultadD;
    }

    public void setFacultadD(String facultadD) {
        this.facultadD = facultadD;
    }

    public String getCarreraD() {
        return carreraD;
    }

    public void setCarreraD(String carreraD) {
        this.carreraD = carreraD;
    }

    public String getEstadoD() {
        return estadoD;
    }

    public void setEstadoD(String estadoD) {
        this.estadoD = estadoD;
    }
    
}
