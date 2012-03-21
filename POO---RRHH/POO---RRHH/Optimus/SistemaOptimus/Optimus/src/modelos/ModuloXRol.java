/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import modelos.Modulo;
import modelos.Rol;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class ModuloXRol{
    
    Rol objRol = new Rol();
    private ArrayList<Modulo> arrObjModulo = new ArrayList<Modulo>();

    public ModuloXRol() {
        this.arrObjModulo.add(new Modulo("DECJUR", "Control de Declaraciones Jurada", false, false, false, false));
        this.arrObjModulo.add(new Modulo("CARFIN", "Control de Cartas Fianza", false, false, false, false));
        this.arrObjModulo.add(new Modulo("TARGEN", "Control de Tareas Generales", false, false, false, false));
        this.arrObjModulo.add(new Modulo("ADMUSU", "Administración de Usuarios", false, false, false, false));
        this.arrObjModulo.add(new Modulo("ADMROL", "Administración de Roles", false, false, false, false));   
    }

    
    
    public Modulo getModuloXRol(String codigoModulo){
        
        Modulo objModulo = null;
        
        for(Modulo objMod:arrObjModulo){
            if(objMod.getCodigo().equals(codigoModulo))
                objModulo = objMod;
        }
        return objModulo;
    }
    
}
