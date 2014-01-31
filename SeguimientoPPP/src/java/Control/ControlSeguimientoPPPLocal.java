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
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alberto
 */
@Local
public interface ControlSeguimientoPPPLocal {
    
    public List<Coordinacion> listarCoordinacion();
    public List<Informe> listarInforme();
    public List<FichaSeguimiento> listarFichaSeguimiento();
    public List<Estudiante> listarEstudiante();
    public List<DocenteAsesor> listarDocenteAsesor();
}
