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
@Table(name = "Coordinacion")

public class Coordinacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carreraProfesional")
    private String carreraProfesional;
    @Basic
    @Column(name = "jefeCoordinacion")
    private String jefeCoordinacion;

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
    
    
    
}
