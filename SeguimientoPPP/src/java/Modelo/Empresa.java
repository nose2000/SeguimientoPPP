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
    @NamedQuery(name = "Empresa.modificarEmpresa",
            query = "UPDATE Empresa e SET e.estadoE = :estadoE, e.rubroE = :rubroE, e.nombreE = :nombreE WHERE e.codigoEmpresa = :codigoEmpresa "),
    @NamedQuery(name = "Empresa.mostrarEmpresa",
            query = "select e from Empresa e "
            + "WHERE e.codigoEmpresa = :codigoEmpresa "
            + "and e.nombreE = :nombreE "
            + "and e.rubroE = :rubroE "
            + "and e.estadoE = :estadoE "),
    @NamedQuery(name = "Empresa.eliminarEmpresa",
            query = "DELETE FROM Empresa e "
            + "WHERE e.codigoEmpresa = :codigoEmpresa "
            + "and e.nombreE = :nombreE "
            + "and e.rubroE = :rubroE "
            + "and e.estadoE = :estadoE "),
    @NamedQuery(name = "Empresa.listarEmpresa",
            query = " select e from Empresa e" )})
@Table(name = "Empresa")

public class Empresa implements Serializable{
    @Id
    @Column(name = "codigoEmpresa", length = 20)
    private String codigoEmpresa;
    @XmlElement
    @Basic
    @Column(name = "nombreE", length = 100)
    private String nombreE;
    @XmlElement
    @Basic
    @Column(name = "rubroE")
    private String rubroE;
    @XmlElement
    @Basic
    @Column(name = "estadoE")
    private String estadoE;

    public Empresa() {
    }
    
    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getRubroE() {
        return rubroE;
    }

    public void setRubroE(String rubroE) {
        this.rubroE = rubroE;
    }

    public String getEstadoE() {
        return estadoE;
    }

    public void setEstadoE(String estadoE) {
        this.estadoE = estadoE;
    }
}
