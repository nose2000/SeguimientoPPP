/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Modelo.Coordinacion;
import Modelo.DocenteAsesor;
import Modelo.Estudiante;
import Modelo.FichaSeguimiento;
import Modelo.Informe;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alberto
 */
@Stateless
public class ControlSeguimientoPPP implements ControlSeguimientoPPPLocal{
    @PersistenceContext(unitName = "SeguimientoPPPPU")
    private EntityManager em;
    
    
    @Override
    public  List <Coordinacion> listarCoordinacion(){
        List <Coordinacion> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("Coordinacion.listarCoordinacion");
        salida.addAll(consulta.getResultList());
        return salida;
    }
    
    @Override
     public  List <Informe> listarInforme(){
        List <Informe> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("Informe.listarInforme");
        salida.addAll(consulta.getResultList());
        return salida;
    }
     
    @Override
     public  List <FichaSeguimiento> listarFichaSeguimiento(){
        List <FichaSeguimiento> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("FichaSeguimiento.listarFichaSeguimiento");
        salida.addAll(consulta.getResultList());
        return salida;
    }
     
    @Override

    public  List <Estudiante> listarEstudiante(){
        List <Estudiante> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("Estudiante.listarEstudiante");
        salida.addAll(consulta.getResultList());
        return salida;
    }
     
    @Override
     public  List <DocenteAsesor> listarDocenteAsesor(){
        List <DocenteAsesor> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("DocenteAsesor.listarDocenteAsesor");
        salida.addAll(consulta.getResultList());
        return salida;
    }
}
