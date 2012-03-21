/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Ricardo
 */
public class AdmRolesTest {
    
    AdmRoles admRoles = new AdmRoles();
    
    @Test
    public void siNoIngresaRol(){
        assertFalse(admRoles.validaRol(""));
        System.out.println("Rol no puede estar en blanco");
    }
    
    @Test
    public void siIngresaRol(){
        assertTrue(admRoles.validaRol("Administrador"));
        System.out.println("Rol correcto");
    }

    @Test
    public void siNoIngresaDescripcion(){
        assertFalse(admRoles.validaDescripcion(""));
        System.out.println("Descripción no puede estar en blanco");
    }
    
    @Test
    public void siIngresaDescripcion(){
        assertTrue(admRoles.validaDescripcion("Administrador"));
        System.out.println("Descripción correcta");
    }

}
