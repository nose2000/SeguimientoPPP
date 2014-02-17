/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alberto
 */
@XmlRootElement
@Entity
@NamedQueries({
    @NamedQuery(name = "FichaSeguimiento.modificarFichaSeguimiento",
            query = "UPDATE FichaSeguimiento f SET f.fechaEntrega = :fechaEntrega, f.promedioFinal = :promedioFinal, f.nota = :nota, f.aportes = :aportes, f.investigacion = :investigacion, f.tratoSocial = :tratoSocial, f.logrosObjetivos = :logrosObjetivos, f.disciplina = :disciplina, f.eficiencia = :eficiencia, f.iniciativa = :iniciativa, f.responsabilidad = :responsabilidad, f.puntualidad = :puntualidad, f.objetivos = :objetivos, f.descripcionActividad = :descripcionActividad WHERE f.numeroFichaSeguimiento = :numeroFichaSeguimiento "),
    @NamedQuery(name = "FichaSeguimiento.mostrarFichaSeguimiento",
            query = "select f from FichaSeguimiento f "
            + "WHERE f.numeroFichaSeguimiento = :numeroFichaSeguimiento "
            + "and f.descripcionActividad = :descripcionActividad "
            + "and f.objetivos = :objetivos "
            + "and f.puntualidad = :puntualidad "
            + "and f.reponsabilidad = :responsabilidad "
            + "and f.iniciativa = :iniciativa "
            + "and f.eficiencia = :eficiencia "
            + "and f.disciplina = :disciplina "
            + "and f.logrosObjetivos = :logrosObjetivos "
            + "and f.trabajoSocial = :trabajoSocial " 
            + "and f.investigacion = :investigacion "
            + "and f.aportes = :aportes "
            + "and f.nota = :nota "
            + "and f.promedioFinal = :promedioFinal "
            + "and f.fechaEntrega = :fechaEntrega "),
    @NamedQuery(name = "FichaSeguimiento.eliminarFichaSeguimiento",
            query = "DELETE FROM FichaSeguimiento f "
            + "WHERE f.numeroFichaSeguimiento = :numeroFichaSeguimiento "
            + "and f.fechaEntrega = :fechaEntrega "),
    @NamedQuery(name = "FichaSeguimiento.listarFichaSeguimiento",
            query = " select f from FichaSeguimiento f" )})
@Table(name = "FichaSeguimiento")


public class FichaSeguimiento implements Serializable {
    @XmlElement
    @Id
    @Column (name = "numeroFichaSeguimiento")
    private int numeroFichaSeguimiento;
    @XmlElement
    @Basic
    @Column(name = "descripcionActividad")
    private String descripcionActividad;
    @XmlElement
    @Basic
    @Column(name = "objetivos")
    private String objetivos;
    @XmlElement
    @Basic
    @Column(name = "puntualidad")
    private int puntualidad;
    @XmlElement
    @Basic
    @Column(name = "responsabilidad")
    private int responsabilidad;
    @XmlElement
    @Basic
    @Column(name = "iniciativa")
    private int iniciativa;
    @XmlElement
    @Basic
    @Column(name = "eficiencia")
    private int eficiencia;
    @XmlElement
    @Basic
    @Column(name = "disciplina")
    private int disciplina;
    @XmlElement
    @Basic
    @Column(name = "logrosObjetivos")
    private int logrosObjetivos;
    @XmlElement
    @Basic
    @Column(name = "tratoSocial")
    private int tratoSocial;
    @XmlElement
    @Basic
    @Column(name = "investigacion")
    private int investigacion;
    @XmlElement
    @Basic
    @Column(name = "aportes")
    private int aportes;
    @XmlElement
    @Basic
    @Column(name = "nota")
    private int nota;
    @XmlElement
    @Basic
    @Column(name = "promedioFinal")
    private int promedioFinal;
    @XmlElement
    @Basic
    @Column(name = "fechaEntrega")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaEntrega;

    public FichaSeguimiento() {
    }

    public int getNumeroFichaSeguimiento() {
        return numeroFichaSeguimiento;
    }

    public void setNumeroFichaSeguimiento(int numeroFichaSeguimiento) {
        this.numeroFichaSeguimiento = numeroFichaSeguimiento;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public int getPuntualidad() {
        return puntualidad;
    }

    public void setPuntualidad(int puntualidad) {
        this.puntualidad = puntualidad;
    }

    public int getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(int responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    public int getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }

    public int getLogrosObjetivos() {
        return logrosObjetivos;
    }

    public void setLogrosObjetivos(int logrosObjetivos) {
        this.logrosObjetivos = logrosObjetivos;
    }

    public int getTratoSocial() {
        return tratoSocial;
    }

    public void setTratoSocial(int tratoSocial) {
        this.tratoSocial = tratoSocial;
    }

    public int getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(int investigacion) {
        this.investigacion = investigacion;
    }

    public int getAportes() {
        return aportes;
    }

    public void setAportes(int aportes) {
        this.aportes = aportes;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(int promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public Calendar getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Calendar fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
