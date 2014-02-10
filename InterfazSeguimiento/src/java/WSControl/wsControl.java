/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WSControl;

import proyecto.modelo.Coordinacion;
import proyecto.modelo.DocenteAsesor;
import proyecto.modelo.Empresa;
import proyecto.modelo.Estudiante;
import proyecto.modelo.FichaSeguimiento;
import proyecto.modelo.Informe;

/**
 *
 * @author Alberto
 */
public class wsControl {

    private static boolean nuevoInforme(proyecto.modelo.Informe pInforme) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.nuevoInforme(pInforme);
    }

    private static boolean nuevoFichaSeguimiento(proyecto.modelo.FichaSeguimiento pFichaSeguimiento) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.nuevoFichaSeguimiento(pFichaSeguimiento);
    }

    private static boolean nuevoEstudiante(proyecto.modelo.Estudiante pEstudiante) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.nuevoEstudiante(pEstudiante);
    }

    private static boolean nuevoEmpresa(proyecto.modelo.Empresa pEmpresa) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.nuevoEmpresa(pEmpresa);
    }

    private static boolean nuevoDocenteAsesor(proyecto.modelo.DocenteAsesor pDocenteAsesor) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.nuevoDocenteAsesor(pDocenteAsesor);
    }

    private static boolean nuevoCCoordinacion(proyecto.modelo.Coordinacion pCoordinacion) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.nuevoCCoordinacion(pCoordinacion);
    }

    private static Informe mostrarInforme(int nroInforme, java.lang.String nombreEmpresa, java.lang.String nombreDocenteAsesor, java.lang.String nombreEstudiante, javax.xml.datatype.XMLGregorianCalendar fechaInicioPPP, javax.xml.datatype.XMLGregorianCalendar fechaFinPPP, int nroCarta) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.mostrarInforme(nroInforme, nombreEmpresa, nombreDocenteAsesor, nombreEstudiante, fechaInicioPPP, fechaFinPPP, nroCarta);
    }

    private static FichaSeguimiento mostrarFichaSeguimiento(int nroInforme, int nroFicha, java.lang.String nombreEstudiante, java.lang.String nombreDocente, java.lang.String nombreEmpresa, javax.xml.datatype.XMLGregorianCalendar fecha) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.mostrarFichaSeguimiento(nroInforme, nroFicha, nombreEstudiante, nombreDocente, nombreEmpresa, fecha);
    }

    private static Estudiante mostrarEstudiante(java.lang.String codigoEstudiante, java.lang.String nombre, java.lang.String carreraProfesional, int nroCreditos, int rankingEstudiante) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.mostrarEstudiante(codigoEstudiante, nombre, carreraProfesional, nroCreditos, rankingEstudiante);
    }

    private static Empresa mostrarEmpresa(java.lang.String codigoEmpresa, java.lang.String nombreEmpresa, java.lang.String tipoEmpresa, java.lang.String estadoEmpresa, int rankingEmpresa, boolean apto) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.mostrarEmpresa(codigoEmpresa, nombreEmpresa, tipoEmpresa, estadoEmpresa, rankingEmpresa, apto);
    }

    private static DocenteAsesor mostrarDocenteAsesor(java.lang.String codigoDocente, java.lang.String nombre, java.lang.String apellidoPaterno, java.lang.String apellidoMaterno, java.lang.String carreraProfesional, boolean apto) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.mostrarDocenteAsesor(codigoDocente, nombre, apellidoPaterno, apellidoMaterno, carreraProfesional, apto);
    }

    private static Coordinacion mostrarCoordinacio(java.lang.String carreraProfesional, java.lang.String jefeCoordinacion) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.mostrarCoordinacio(carreraProfesional, jefeCoordinacion);
    }

    private static int modificarInforme(proyecto.modelo.Informe pInforme) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.modificarInforme(pInforme);
    }

    private static int modificarFichaSeguimiento(proyecto.modelo.FichaSeguimiento pFichaSeguimiento) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.modificarFichaSeguimiento(pFichaSeguimiento);
    }

    private static int modificarEstudiante(proyecto.modelo.Estudiante pEstudiante) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.modificarEstudiante(pEstudiante);
    }

    private static int modificarEmpresa(proyecto.modelo.Empresa pEmpresa) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.modificarEmpresa(pEmpresa);
    }

    private static int modificarDocenteAsesor(proyecto.modelo.DocenteAsesor pDocenteAsesor) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.modificarDocenteAsesor(pDocenteAsesor);
    }

    private static int modificarCoordinacion(proyecto.modelo.Coordinacion pCliente) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.modificarCoordinacion(pCliente);
    }

    private static java.util.List<proyecto.modelo.Informe> listarInforme() {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.listarInforme();
    }

    private static java.util.List<proyecto.modelo.FichaSeguimiento> listarFichaSeguimiento() {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.listarFichaSeguimiento();
    }

    private static java.util.List<proyecto.modelo.Estudiante> listarEstudiante() {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.listarEstudiante();
    }

    private static java.util.List<proyecto.modelo.Empresa> listarEmpresa() {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.listarEmpresa();
    }

    private static java.util.List<proyecto.modelo.DocenteAsesor> listarDocenteAsesor() {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.listarDocenteAsesor();
    }

    private static java.util.List<proyecto.modelo.Coordinacion> listarCoordinacion() {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.listarCoordinacion();
    }

    private static int eliminarInforme(proyecto.modelo.Informe pInforme) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.eliminarInforme(pInforme);
    }

    private static int eliminarFichaSeguimiento(proyecto.modelo.FichaSeguimiento pFichaSeguimiento) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.eliminarFichaSeguimiento(pFichaSeguimiento);
    }

    private static int eliminarEstudiante(proyecto.modelo.Estudiante pEstudiante) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.eliminarEstudiante(pEstudiante);
    }

    private static int eliminarEmpresa(proyecto.modelo.Empresa pEmpresa) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.eliminarEmpresa(pEmpresa);
    }

    private static int eliminarDocenteAsesor(proyecto.modelo.DocenteAsesor pDocenteAsesor) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.eliminarDocenteAsesor(pDocenteAsesor);
    }

    private static int eliminarCoordinacion(proyecto.modelo.Coordinacion pCoordinacion) {
        vista.WSSeguimientoPPP_Service service = new vista.WSSeguimientoPPP_Service();
        vista.WSSeguimientoPPP port = service.getWSSeguimientoPPPPort();
        return port.eliminarCoordinacion(pCoordinacion);
    }
}
