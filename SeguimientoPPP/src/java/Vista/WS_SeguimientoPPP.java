/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Control.ControlSeguimientoPPPLocal;
import Modelo.Coordinacion;
import Modelo.DocenteAsesor;
import Modelo.Estudiante;
import Modelo.FichaSeguimiento;
import Modelo.Informe;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
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

    @WebMethod(operationName = "listarCoordinacion")
    public List<Coordinacion> listarCoordinacion() {
        return ejbRef.listarCoordinacion();
    }

    @WebMethod(operationName = "listarInforme")
    public List<Informe> listarInforme() {
        return ejbRef.listarInforme();
    }

    @WebMethod(operationName = "listarFichaSeguimiento")
    public List<FichaSeguimiento> listarFichaSeguimiento() {
        return ejbRef.listarFichaSeguimiento();
    }

    @WebMethod(operationName = "listarEstudiante")
    public List<Estudiante> listarEstudiante() {
        return ejbRef.listarEstudiante();
    }

    @WebMethod(operationName = "listarDocenteAsesor")
    public List<DocenteAsesor> listarDocenteAsesor() {
        return ejbRef.listarDocenteAsesor();
    }
    
}
