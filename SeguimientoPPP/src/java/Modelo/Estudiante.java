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
@Table(name = "Estudiante")

public class Estudiante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoEstudiante")
    private String codigoEstudiante;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "carreraProfesional")
    private String carreraProfesional;
    @Basic
    @Column(name = "nroCreditos")
    private int nroCreditos;
    @Basic
    @Column(name = "rankingEstudiante")
    private int rankingEstudiante;

    public Estudiante() {
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarreraProfesional() {
        return carreraProfesional;
    }

    public void setCarreraProfesional(String carreraProfesional) {
        this.carreraProfesional = carreraProfesional;
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public int getRankingEstudiante() {
        return rankingEstudiante;
    }

    public void setRankingEstudiante(int rankingEstudiante) {
        this.rankingEstudiante = rankingEstudiante;
    }
    
    
}
