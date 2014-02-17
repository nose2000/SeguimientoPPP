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
    @NamedQuery(name = "Usuario.validarUsuario",
            query = "select u from Usuario u "
            + "where u.login = :login "
            + "and u.contrasena = :contrasena "),
    @NamedQuery(name = "Usuario.mostrarUsuario",
            query = "select u from Usuario u "
            + "where u.login = :login "),
    @NamedQuery(name = "Usuario.listarUsuarios",
            query = "select u from Usuario u")})
@Table(name = "Usuario")

public class Usuario implements Serializable{
    @Id
    @Column(name = "codigousuario")
    private long codigoUsuario;
    @XmlElement
    @Basic
    @Column(name = "login", length = 20)
    private String login;
    @XmlElement
    @Basic
    @Column(name = "contrasena", length = 20)
    private String contrasena;
    @XmlElement
    @Basic
    @Column(name = "nombre", length = 50)
    private String nombre;

    public Usuario() {
    }

    public long getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(long codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
