/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Control.ControlSeguimientoPPPLocal;
import Modelo.Coordinacion;
import Modelo.DocenteAsesor;
import Modelo.Empresa;
import Modelo.Estudiante;
import Modelo.FichaSeguimiento;
import Modelo.Informe;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Alberto
 */
@WebService(serviceName = "WS_SeguimientoPPP")
public class WS_SeguimientoPPP {
    @EJB
    private ControlSeguimientoPPPLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "ListarCoordinacion")
    public List<Coordinacion> ListarCoordinacion() {
        return ejbRef.ListarCoordinacion();
    }

    @WebMethod(operationName = "NuevoCCoordinacion")
    public boolean NuevoCCoordinacion(@WebParam(name = "pCoordinacion") Coordinacion pCoordinacion) {
        return ejbRef.NuevoCCoordinacion(pCoordinacion);
    }

    @WebMethod(operationName = "ModificarCoordinacion")
    public int ModificarCoordinacion(@WebParam(name = "pCliente") Coordinacion pCliente) {
        return ejbRef.ModificarCoordinacion(pCliente);
    }

    @WebMethod(operationName = "EliminarCoordinacion")
    public int EliminarCoordinacion(@WebParam(name = "pCoordinacion") Coordinacion pCoordinacion) {
        return ejbRef.EliminarCoordinacion(pCoordinacion);
    }

    @WebMethod(operationName = "MostrarCoordinacio")
    public Coordinacion MostrarCoordinacio(@WebParam(name = "carreraProfesional") String carreraProfesional, @WebParam(name = "jefeCoordinacion") String jefeCoordinacion) {
        return ejbRef.MostrarCoordinacio(carreraProfesional, jefeCoordinacion);
    }

    @WebMethod(operationName = "ListarDocenteAsesor")
    public List<DocenteAsesor> ListarDocenteAsesor() {
        return ejbRef.ListarDocenteAsesor();
    }

    @WebMethod(operationName = "NuevoDocenteAsesor")
    public boolean NuevoDocenteAsesor(@WebParam(name = "pDocenteAsesor") DocenteAsesor pDocenteAsesor) {
        return ejbRef.NuevoDocenteAsesor(pDocenteAsesor);
    }

    @WebMethod(operationName = "ModificarDocenteAsesor")
    public int ModificarDocenteAsesor(@WebParam(name = "pDocenteAsesor") DocenteAsesor pDocenteAsesor) {
        return ejbRef.ModificarDocenteAsesor(pDocenteAsesor);
    }

    @WebMethod(operationName = "EliminarDocenteAsesor")
    public int EliminarDocenteAsesor(@WebParam(name = "pDocenteAsesor") DocenteAsesor pDocenteAsesor) {
        return ejbRef.EliminarDocenteAsesor(pDocenteAsesor);
    }

    @WebMethod(operationName = "MostrarDocenteAsesor")
    public DocenteAsesor MostrarDocenteAsesor(@WebParam(name = "codigoDocente") String codigoDocente, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellidoPaterno") String apellidoPaterno, @WebParam(name = "apellidoMaterno") String apellidoMaterno, @WebParam(name = "carreraProfesional") String carreraProfesional, @WebParam(name = "apto") boolean apto) {
        return ejbRef.MostrarDocenteAsesor(codigoDocente, nombre, apellidoPaterno, apellidoMaterno, carreraProfesional, apto);
    }

    @WebMethod(operationName = "ListarEmpresa")
    public List<Empresa> ListarEmpresa() {
        return ejbRef.ListarEmpresa();
    }

    @WebMethod(operationName = "NuevoEmpresa")
    public boolean NuevoEmpresa(@WebParam(name = "pEmpresa") Empresa pEmpresa) {
        return ejbRef.NuevoEmpresa(pEmpresa);
    }

    @WebMethod(operationName = "ModificarEmpresa")
    public int ModificarEmpresa(@WebParam(name = "pEmpresa") Empresa pEmpresa) {
        return ejbRef.ModificarEmpresa(pEmpresa);
    }

    @WebMethod(operationName = "EliminarEmpresa")
    public int EliminarEmpresa(@WebParam(name = "pEmpresa") Empresa pEmpresa) {
        return ejbRef.EliminarEmpresa(pEmpresa);
    }

    @WebMethod(operationName = "MostrarEmpresa")
    public Empresa MostrarEmpresa(@WebParam(name = "codigoEmpresa") String codigoEmpresa, @WebParam(name = "nombreEmpresa") String nombreEmpresa, @WebParam(name = "tipoEmpresa") String tipoEmpresa, @WebParam(name = "estadoEmpresa") String estadoEmpresa, @WebParam(name = "rankingEmpresa") int rankingEmpresa, @WebParam(name = "apto") boolean apto) {
        return ejbRef.MostrarEmpresa(codigoEmpresa, nombreEmpresa, tipoEmpresa, estadoEmpresa, rankingEmpresa, apto);
    }

    @WebMethod(operationName = "ListarEstudiante")
    public List<Estudiante> ListarEstudiante() {
        return ejbRef.ListarEstudiante();
    }

    @WebMethod(operationName = "NuevoEstudiante")
    public boolean NuevoEstudiante(@WebParam(name = "pEstudiante") Estudiante pEstudiante) {
        return ejbRef.NuevoEstudiante(pEstudiante);
    }

    @WebMethod(operationName = "ModificarEstudiante")
    public int ModificarEstudiante(@WebParam(name = "pEstudiante") Estudiante pEstudiante) {
        return ejbRef.ModificarEstudiante(pEstudiante);
    }

    @WebMethod(operationName = "EliminarEstudiante")
    public int EliminarEstudiante(@WebParam(name = "pEstudiante") Estudiante pEstudiante) {
        return ejbRef.EliminarEstudiante(pEstudiante);
    }

    @WebMethod(operationName = "MostrarEstudiante")
    public Estudiante MostrarEstudiante(@WebParam(name = "codigoEstudiante") String codigoEstudiante, @WebParam(name = "nombre") String nombre, @WebParam(name = "carreraProfesional") String carreraProfesional, @WebParam(name = "nroCreditos") int nroCreditos, @WebParam(name = "rankingEstudiante") int rankingEstudiante) {
        return ejbRef.MostrarEstudiante(codigoEstudiante, nombre, carreraProfesional, nroCreditos, rankingEstudiante);
    }

    @WebMethod(operationName = "ListarFichaSeguimiento")
    public List<FichaSeguimiento> ListarFichaSeguimiento() {
        return ejbRef.ListarFichaSeguimiento();
    }

    @WebMethod(operationName = "NuevoFichaSeguimiento")
    public boolean NuevoFichaSeguimiento(@WebParam(name = "pFichaSeguimiento") FichaSeguimiento pFichaSeguimiento) {
        return ejbRef.NuevoFichaSeguimiento(pFichaSeguimiento);
    }

    @WebMethod(operationName = "ModificarFichaSeguimiento")
    public int ModificarFichaSeguimiento(@WebParam(name = "pFichaSeguimiento") FichaSeguimiento pFichaSeguimiento) {
        return ejbRef.ModificarFichaSeguimiento(pFichaSeguimiento);
    }

    @WebMethod(operationName = "EliminarFichaSeguimiento")
    public int EliminarFichaSeguimiento(@WebParam(name = "pFichaSeguimiento") FichaSeguimiento pFichaSeguimiento) {
        return ejbRef.EliminarFichaSeguimiento(pFichaSeguimiento);
    }

    @WebMethod(operationName = "MostrarFichaSeguimiento")
    public FichaSeguimiento MostrarFichaSeguimiento(@WebParam(name = "nroInforme") int nroInforme, @WebParam(name = "nroFicha") int nroFicha, @WebParam(name = "nombreEstudiante") String nombreEstudiante, @WebParam(name = "nombreDocente") String nombreDocente, @WebParam(name = "nombreEmpresa") String nombreEmpresa, @WebParam(name = "Fecha") Calendar Fecha) {
        return ejbRef.MostrarFichaSeguimiento(nroInforme, nroFicha, nombreEstudiante, nombreDocente, nombreEmpresa, Fecha);
    }

    @WebMethod(operationName = "ListarInforme")
    public List<Informe> ListarInforme() {
        return ejbRef.ListarInforme();
    }

    @WebMethod(operationName = "NuevoInforme")
    public boolean NuevoInforme(@WebParam(name = "pInforme") Informe pInforme) {
        return ejbRef.NuevoInforme(pInforme);
    }

    @WebMethod(operationName = "ModificarInforme")
    public int ModificarInforme(@WebParam(name = "pInforme") Informe pInforme) {
        return ejbRef.ModificarInforme(pInforme);
    }

    @WebMethod(operationName = "EliminarInforme")
    public int EliminarInforme(@WebParam(name = "pInforme") Informe pInforme) {
        return ejbRef.EliminarInforme(pInforme);
    }

    @WebMethod(operationName = "MostrarInforme")
    public Informe MostrarInforme(@WebParam(name = "nroInforme") int nroInforme, @WebParam(name = "nombreEmpresa") String nombreEmpresa, @WebParam(name = "nombreDocenteAsesor") String nombreDocenteAsesor, @WebParam(name = "nombreEstudiante") String nombreEstudiante, @WebParam(name = "fechaInicioPPP") Calendar fechaInicioPPP, @WebParam(name = "fechaFinPPP") Calendar fechaFinPPP, @WebParam(name = "nroCarta") int nroCarta) {
        return ejbRef.MostrarInforme(nroInforme, nombreEmpresa, nombreDocenteAsesor, nombreEstudiante, fechaInicioPPP, fechaFinPPP, nroCarta);
    }
    
}
