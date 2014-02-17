/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alberto
 */
@Stateless
public class ControlSeguimientoPPP implements ControlSeguimientoPPPLocal{
    @PersistenceContext(unitName = "SeguimientoPPPPU")
    private EntityManager em;
}
