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
    @NamedQuery(name = "Alumno.modificarAlumno",
            query = "UPDATE Alumno a SET a.estadoA = :estadoA, a.carreraA = :carreraA, a.facultadA = :facultadA, a.apellidoMaternoA = :apellidoMaternoA, a.apellidoPaternoA = :apellidoPaternoA, a.nombreA = :nombreA WHERE a.codigoAlumno = :codigoAlumno "),
    @NamedQuery(name = "Alumno.mostrarAlumno",
            query = "select a from Alumno a "
            + "WHERE a.codigoAlumno = :codigoAlumno "
            + "and a.nombreA = :nombreA "
            + "and a.apellidoPaternoA = :apellidoPaternoA "
            + "and a.apellidoMaternoA = :apellidoMaternoA "
            + "and a.facultadA = :facultadA "
            + "and a.carreraA = :carreraA "
            + "and a.estadoA = :estadoA"),
    @NamedQuery(name = "Alumno.eliminarAlumno",
            query = "DELETE FROM Alumno a "
            + "WHERE a.codigoAlumno = :codigoAlumno "
            + "and a.nombreA = :nombreA "
            + "and a.apellidoPaternoA = :apellidoPaternoA "
            + "and a.apellidoMaternoA = :apellidoMaternoA "
            + "and a.facultadA = :facultadA "
            + "and a.carreraA = :carreraA "
            + "and a.estadoA = :estadoA"),
    @NamedQuery(name = "Alumno.listarAlumno",
            query = " select a from Alumno a" )})
@Table(name = "Alumno")

public class Alumno implements Serializable{
    @XmlElement
    @Id
    @Column (name = "codigoAlumno", length = 20)
    private String codigoAlumno;
    @XmlElement
    @Basic
    @Column (name = "nombreA", length = 100)
    private String nombreA;
    @XmlElement
    @Basic
    @Column (name = "apellidoPaternoA", length = 100)
    private String apellidoPaternoA;
    @XmlElement
    @Basic
    @Column (name = "apellidoMaternoA", length = 100)
    private String apellidoMaternoA;
    @XmlElement
    @Basic
    @Column (name = "facultadA", length = 100)
    private String facultadA;
    @XmlElement
    @Basic
    @Column (name = "carreraA", length = 100)
    private String carreraA;
    @XmlElement
    @Basic
    @Column (name = "estadoA", length = 100)
    private String estadoA;

    public Alumno() {
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getApellidoPaternoA() {
        return apellidoPaternoA;
    }

    public void setApellidoPaternoA(String apellidoPaternoA) {
        this.apellidoPaternoA = apellidoPaternoA;
    }

    public String getApellidoMaternoA() {
        return apellidoMaternoA;
    }

    public void setApellidoMaternoA(String apellidoMaternoA) {
        this.apellidoMaternoA = apellidoMaternoA;
    }     

    public String getFacultadA() {
        return facultadA;
    }

    public void setFacultadA(String facultadA) {
        this.facultadA = facultadA;
    }

    public String getCarreraA() {
        return carreraA;
    }

    public void setCarreraA(String carreraA) {
        this.carreraA = carreraA;
    }

    public String getEstadoA() {
        return estadoA;
    }

    public void setEstadoA(String estadoA) {
        this.estadoA = estadoA;
    }
    
    
}
