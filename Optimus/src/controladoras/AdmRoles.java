/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//prueba2
package controladoras;

import modelos.ModuloXRol;

/**
 *
 * @author Ricardo
 */
public class AdmRoles {
    
    
    private ModuloXRol objModuloxRol = new ModuloXRol("Prueba", "Prueba");
    
    public Boolean validaRol(String rol){
        
        Boolean valido = false;
        
        if(!rol.equals("")){
            valido = true;
        }
        
        return valido;
    }
    
    public Boolean validaDescripcion(String descrip){
        
        Boolean valido = false;
        
        if(!descrip.equals("")){
            valido = true;
        }
        
        return valido;
    }
    
    
    
}
