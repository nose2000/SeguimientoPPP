/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Modelo.Coordinacion;
import Modelo.DocenteAsesor;
import Modelo.Empresa;
import Modelo.Estudiante;
import Modelo.FichaSeguimiento;
import Modelo.Informe;
import java.util.ArrayList;
import java.util.Calendar;
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
    public List<Coordinacion>ListarCoordinacion() {
        List<Coordinacion> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("Coordinacion.listarCoordinacion");
        salida.addAll(consulta.getResultList());
        return salida;
    }
    
    @Override
    public int ModificarCoordinacion(Coordinacion pCoordinacion){
        Query consulta = em.createNamedQuery("Coordinacion.modificarCoordinacion");
        consulta.setParameter("carreraProfesional", pCoordinacion.getCarreraProfesional());
        consulta.setParameter("jefeCoordinacion",pCoordinacion.getJefeCoordinacion());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public int EliminarCoordinacion(Coordinacion pCoordinacion){
        Query consulta = em.createNamedQuery("Coordinacion.eliminarCoordinacion");
        consulta.setParameter("carreraProfesional", pCoordinacion.getCarreraProfesional());
        consulta.setParameter("jefeCoordinacion",pCoordinacion.getJefeCoordinacion());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public Coordinacion MostrarCoordinacio (String carreraProfesional, String jefeCoordinacion ){
        Query consulta = em.createNamedQuery("Cliente.mostrarCliente");
        consulta.setParameter("carreraProfesional", carreraProfesional);
        consulta.setParameter("jefeCoordinacion", jefeCoordinacion);
        return (Coordinacion) consulta.getSingleResult();
    }
    
    @Override
     public  List <DocenteAsesor> ListarDocenteAsesor(){
        List <DocenteAsesor> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("DocenteAsesor.listarDocenteAsesor");
        salida.addAll(consulta.getResultList());
        return salida;
    }
     
    @Override
    public boolean NuevoDocenteAsesor(DocenteAsesor pDocenteAsesor){
        em.persist(pDocenteAsesor);
        return true;
    }
    
    @Override
    public int ModificarDocenteAsesor(DocenteAsesor pDocenteAsesor){
        Query consulta = em.createNamedQuery("DocenteAsesor.modificarDocenteAsesor");
        consulta.setParameter("codigoDocente", pDocenteAsesor.getCodigoDocente());
        consulta.setParameter("nombre",pDocenteAsesor.getNombre());
        consulta.setParameter("apellidoPaterno",pDocenteAsesor.getApellidoPaterno());
        consulta.setParameter("apellidoMaterno",pDocenteAsesor.getApellidoMaterno());
        consulta.setParameter("carreraProfecional",pDocenteAsesor.getCarreraProfesional());
        consulta.setParameter("apto",pDocenteAsesor.isApto());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public int EliminarDocenteAsesor(DocenteAsesor pDocenteAsesor){
        Query consulta = em.createNamedQuery("DocenteAsesor.modificarDocenteAsesor");
        consulta.setParameter("codigoDocente", pDocenteAsesor.getCodigoDocente());
        consulta.setParameter("nombre",pDocenteAsesor.getNombre());
        consulta.setParameter("apellidoPaterno",pDocenteAsesor.getApellidoPaterno());
        consulta.setParameter("apellidoMaterno",pDocenteAsesor.getApellidoMaterno());
        consulta.setParameter("carreraProfecional",pDocenteAsesor.getCarreraProfesional());
        consulta.setParameter("apto",pDocenteAsesor.isApto());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public DocenteAsesor MostrarDocenteAsesor (String codigoDocente, String nombre, String apellidoPaterno, String apellidoMaterno, String carreraProfesional, boolean  apto){
        Query consulta = em.createNamedQuery("DocenteAsesor.mostrarDocenteAsesor");
        consulta.setParameter("codigoDocente", codigoDocente);
        consulta.setParameter("nombre", nombre);
        consulta.setParameter("apellidoPaterno", apellidoPaterno);
        consulta.setParameter("apellidoMaterno", apellidoMaterno);
        consulta.setParameter("carreraProfescional", carreraProfesional);
        consulta.setParameter("apto", apto);
        return (DocenteAsesor) consulta.getSingleResult();
    }
    
    @Override
     public  List <Empresa> ListarEmpresa(){
        List <Empresa> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("Empresa.listarEmpresa");
        salida.addAll(consulta.getResultList());
        return salida;
    }
     
    @Override
    public boolean NuevoEmpresa(Empresa pEmpresa){
        em.persist(pEmpresa);
        return true;
    }
    
    @Override
    public int ModificarEmpresa(Empresa pEmpresa){
        Query consulta = em.createNamedQuery("Empresa.modificarEmpresa");
        consulta.setParameter("codigoEmpresa",pEmpresa.getCodigoEmpresa());
        consulta.setParameter("nombreEmpresa",pEmpresa.getNombreEmpresa());
        consulta.setParameter("tipoEmpresa",pEmpresa.getTipoEmpresa());
        consulta.setParameter("estadoEmpresa",pEmpresa.getEstadoEmpresa());
        consulta.setParameter("rankingEmpresa",pEmpresa.getRankingEmpresa());
        consulta.setParameter("apto",pEmpresa.isApto());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public int EliminarEmpresa(Empresa pEmpresa){
        Query consulta = em.createNamedQuery("Empresa.eliminarEmpresa");
        consulta.setParameter("codigoEmpresa",pEmpresa.getCodigoEmpresa());
        consulta.setParameter("nombreEmpresa",pEmpresa.getNombreEmpresa());
        consulta.setParameter("tipoEmpresa",pEmpresa.getTipoEmpresa());
        consulta.setParameter("estadoEmpresa",pEmpresa.getEstadoEmpresa());
        consulta.setParameter("rankingEmpresa",pEmpresa.getRankingEmpresa());
        consulta.setParameter("apto",pEmpresa.isApto());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public Empresa MostrarEmpresa (String codigoEmpresa, String nombreEmpresa, String tipoEmpresa, String estadoEmpresa, int rankingEmpresa, boolean apto ){
        Query consulta = em.createNamedQuery("Empresa.mostrarEmpresa");
        consulta.setParameter("codigoEmpresa",codigoEmpresa);
        consulta.setParameter("nombreEmpresa",nombreEmpresa);
        consulta.setParameter("tipoEmpresa",tipoEmpresa);
        consulta.setParameter("estadoEmpresa",estadoEmpresa);
        consulta.setParameter("rankingEmpresa",rankingEmpresa);
        consulta.setParameter("apto",apto);
        return (Empresa) consulta.getSingleResult();
    }
    
    @Override
     public  List <Estudiante> ListarEstudiante(){
        List <Estudiante> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("Estudiante.listarEstudiante");
        salida.addAll(consulta.getResultList());
        return salida;
    }
     
    @Override
    public boolean NuevoEstudiante(Estudiante pEstudiante){
        em.persist(pEstudiante);
        return true;
    }
    
    @Override
    public int ModificarEstudiante(Estudiante pEstudiante){
        Query consulta = em.createNamedQuery("Estudiante.modificarEstudiante");
        consulta.setParameter("codigoEstudiante",pEstudiante.getCodigoEstudiante());
        consulta.setParameter("nombre",pEstudiante.getNombre());
        consulta.setParameter("carreraProfesional",pEstudiante.getCarreraProfesional());
        consulta.setParameter("nroCreditos",pEstudiante.getNroCreditos());
        consulta.setParameter("rankingEstudiante",pEstudiante.getRankingEstudiante());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public int EliminarEstudiante(Estudiante pEstudiante){
        Query consulta = em.createNamedQuery("Estudiante.eliminarEstudiante");
        consulta.setParameter("codigoEstudiante",pEstudiante.getCodigoEstudiante());
        consulta.setParameter("nombre",pEstudiante.getNombre());
        consulta.setParameter("carreraProfesional",pEstudiante.getCarreraProfesional());
        consulta.setParameter("nroCreditos",pEstudiante.getNroCreditos());
        consulta.setParameter("rankingEstudiante",pEstudiante.getRankingEstudiante());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public Estudiante MostrarEstudiante (String codigoEstudiante, String nombre, String carreraProfesional, int nroCreditos, int rankingEstudiante ){
        Query consulta = em.createNamedQuery("Estudiante.mostrarEstudiante");
        consulta.setParameter("codigoEstudiante",codigoEstudiante);
        consulta.setParameter("nombre",nombre);
        consulta.setParameter("carreraProfesional",carreraProfesional);
        consulta.setParameter("nroCreditos",nroCreditos);
        consulta.setParameter("rankingEstudiante",rankingEstudiante);
        return (Estudiante) consulta.getSingleResult();
    }
    
    @Override
     public  List <FichaSeguimiento> ListarFichaSeguimiento(){
        List <FichaSeguimiento> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("FichaSeguimiento.listarFichaSeguimiento");
        salida.addAll(consulta.getResultList());
        return salida;
    }
     
    @Override
    public boolean NuevoFichaSeguimiento(FichaSeguimiento pFichaSeguimiento){
        em.persist(pFichaSeguimiento);
        return true;
    }
    
    @Override
    public int ModificarFichaSeguimiento(FichaSeguimiento pFichaSeguimiento){
        Query consulta = em.createNamedQuery("FichaSeguimiento.modificarFichaSeguimiento");
        consulta.setParameter("nroInforme",pFichaSeguimiento.getNroInforme());
        consulta.setParameter("nroFicha",pFichaSeguimiento.getNroFicha());
        consulta.setParameter("nombreEstudiante",pFichaSeguimiento.getNombreEstudiante());
        consulta.setParameter("nombreDocente",pFichaSeguimiento.getNombreDocente());
        consulta.setParameter("nombreEmpresa",pFichaSeguimiento.getNombreEmpresa());
        consulta.setParameter("Fecha",pFichaSeguimiento.getFecha());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public int EliminarFichaSeguimiento(FichaSeguimiento pFichaSeguimiento){
        Query consulta = em.createNamedQuery("FichaSeguimiento.eliminarFichaSeguimiento");
        consulta.setParameter("nroInforme",pFichaSeguimiento.getNroInforme());
        consulta.setParameter("nroFicha",pFichaSeguimiento.getNroFicha());
        consulta.setParameter("nombreEstudiante",pFichaSeguimiento.getNombreEstudiante());
        consulta.setParameter("nombreDocente",pFichaSeguimiento.getNombreDocente());
        consulta.setParameter("nombreEmpresa",pFichaSeguimiento.getNombreEmpresa());
        consulta.setParameter("Fecha",pFichaSeguimiento.getFecha());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public FichaSeguimiento MostrarFichaSeguimiento (int nroInforme, int nroFicha, String nombreEstudiante, String nombreDocente, String nombreEmpresa, Calendar Fecha ){
        Query consulta = em.createNamedQuery("FichaSeguimiento.mostrarFichaSeguimiento");
        consulta.setParameter("nroInforme",nroInforme);
        consulta.setParameter("nroFicha",nroFicha);
        consulta.setParameter("nombreEstudiante",nombreEstudiante);
        consulta.setParameter("nombreDocente",nombreDocente);
        consulta.setParameter("nombreEmpresa",nombreEmpresa);
        consulta.setParameter("Fecha",Fecha);
        return (FichaSeguimiento) consulta.getSingleResult();
    }
    
    @Override
     public  List <Informe> ListarInforme(){
        List <Informe> salida = new ArrayList<>();
        Query consulta = em.createNamedQuery("Informe.listarInforme");
        salida.addAll(consulta.getResultList());
        return salida;
    }
     
    @Override
    public boolean NuevoInforme(Informe pInforme){
        em.persist(pInforme);
        return true;
    }
    
    @Override
    public int ModificarInforme(Informe pInforme){
        Query consulta = em.createNamedQuery("Informe.modificarInforme");
        consulta.setParameter("nroInforme",pInforme.getNroInforme());
        consulta.setParameter("nombreEmpresa",pInforme.getNombreEmpresa());
        consulta.setParameter("nombreDocenteAsesor",pInforme.getNombreDocenteAsesor());
        consulta.setParameter("nombreEstudiante",pInforme.getNombreEstudiante());
        consulta.setParameter("fechaInicioPPP",pInforme.getFechaInicioPPP());
        consulta.setParameter("fechaFinPPP",pInforme.getFechaFinPPP());
        consulta.setParameter("nroCarta",pInforme.getNroCarta());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public int EliminarInforme(Informe pInforme){
        Query consulta = em.createNamedQuery("Informe.eliminarInforme");      
        consulta.setParameter("nroInforme",pInforme.getNroInforme());
        consulta.setParameter("nombreEmpresa",pInforme.getNombreEmpresa());
        consulta.setParameter("nombreDocenteAsesor",pInforme.getNombreDocenteAsesor());
        consulta.setParameter("nombreEstudiante",pInforme.getNombreEstudiante());
        consulta.setParameter("fechaInicioPPP",pInforme.getFechaInicioPPP());
        consulta.setParameter("fechaFinPPP",pInforme.getFechaFinPPP());
        consulta.setParameter("nroCarta",pInforme.getNroCarta());
        int up=consulta.executeUpdate();
        return up;
    }
    
    @Override
    public Informe MostrarInforme (int nroInforme, String nombreEmpresa, String nombreDocenteAsesor, String nombreEstudiante, Calendar fechaInicioPPP, Calendar fechaFinPPP, int nroCarta ){
        Query consulta = em.createNamedQuery("Informe.mostrarInforme");
        consulta.setParameter("nroInforme",nroInforme);
        consulta.setParameter("nombreEmpresa",nombreEmpresa);
        consulta.setParameter("nombreDocenteAsesor",nombreDocenteAsesor);
        consulta.setParameter("nombreEstudiante",nombreEstudiante);
        consulta.setParameter("fechaInicioPPP",fechaInicioPPP);
        consulta.setParameter("fechaFinPPP",fechaFinPPP);
        consulta.setParameter("nroCarta",nroCarta);
        return (Informe) consulta.getSingleResult();
    }

    @Override
    public boolean NuevoCCoordinacion(Coordinacion pCoordinacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
