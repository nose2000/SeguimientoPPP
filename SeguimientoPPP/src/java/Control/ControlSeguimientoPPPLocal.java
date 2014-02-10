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
import java.util.Calendar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alberto
 */
@Local
public interface ControlSeguimientoPPPLocal {
    
    public List<Coordinacion> ListarCoordinacion();
    public boolean NuevoCCoordinacion(Coordinacion pCoordinacion);
    public int ModificarCoordinacion(Coordinacion pCliente);
    public int EliminarCoordinacion(Coordinacion pCoordinacion);
    public Coordinacion MostrarCoordinacio (String carreraProfesional, String jefeCoordinacion );
    
    public List<DocenteAsesor> ListarDocenteAsesor();
    public boolean NuevoDocenteAsesor(DocenteAsesor pDocenteAsesor);
    public int ModificarDocenteAsesor(DocenteAsesor pDocenteAsesor);
    public int EliminarDocenteAsesor(DocenteAsesor pDocenteAsesor);
    public DocenteAsesor MostrarDocenteAsesor (String codigoDocente, String nombre, String apellidoPaterno, String apellidoMaterno, String carreraProfesional, boolean  apto);    
    
    public List<Empresa> ListarEmpresa();
    public boolean NuevoEmpresa(Empresa pEmpresa);
    public int ModificarEmpresa(Empresa pEmpresa);
    public int EliminarEmpresa(Empresa pEmpresa);
    public Empresa MostrarEmpresa (String codigoEmpresa, String nombreEmpresa, String tipoEmpresa, String estadoEmpresa, int rankingEmpresa, boolean apto );
    
    public List<Estudiante> ListarEstudiante();
    public boolean NuevoEstudiante(Estudiante pEstudiante);
    public int ModificarEstudiante(Estudiante pEstudiante);
    public int EliminarEstudiante(Estudiante pEstudiante);
    public Estudiante MostrarEstudiante (String codigoEstudiante, String nombre, String carreraProfesional, int nroCreditos, int rankingEstudiante );
    
    public List<FichaSeguimiento> ListarFichaSeguimiento();
    public boolean NuevoFichaSeguimiento(FichaSeguimiento pFichaSeguimiento);
    public int ModificarFichaSeguimiento(FichaSeguimiento pFichaSeguimiento);
    public int EliminarFichaSeguimiento(FichaSeguimiento pFichaSeguimiento);
    public FichaSeguimiento MostrarFichaSeguimiento (int nroInforme, int nroFicha, String nombreEstudiante, String nombreDocente, String nombreEmpresa, Calendar Fecha );
   
    public List<Informe> ListarInforme();
    public boolean NuevoInforme(Informe pInforme);
    public int ModificarInforme(Informe pInforme);
    public int EliminarInforme(Informe pInforme);
    public Informe MostrarInforme (int nroInforme, String nombreEmpresa, String nombreDocenteAsesor, String nombreEstudiante, Calendar fechaInicioPPP, Calendar fechaFinPPP, int nroCarta );
}
