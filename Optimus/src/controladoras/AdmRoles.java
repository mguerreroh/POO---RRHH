/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//prueba2
package controladoras;

import java.util.ArrayList;
import modelos.Modulo;
import modelos.Rol;

/**
 *
 * @author Ricardo
 */
public class AdmRoles {
    

//        private Modulo Tarea = new Modulo(null,false,true,true,true);
//        private Modulo Declaracion = new Modulo("Declaracion",true,false,true,true);
//        private Modulo Carta = new Modulo("Carta",true,true,false,true);
//        private Modulo Admin = new Modulo("Admin",true,true,true,false); 
//   
//        private ArrayList<Modulo> Modulos = new ArrayList<Modulo>();

    public boolean validaNombreRol(Rol unRol){
        
        //Valida que el Rol no tenga un nulo en el nombre o vacio
        //recibe un objeto de tipo rol
        
        boolean llOk=true;
        
        for(int i=0; i<unRol.getModulos().size();i++){
            if(unRol.getModulos().get(i).getNombre() == null || unRol.getModulos().get(i).getNombre().equals("")){
                llOk = false;
            }
        }
        return llOk;
    }
    
    public boolean validaEstadoRol(Rol unRol){
        //Valida que el Rol no tenga un nulo en alguno de los permisos
        //recibe un objeto de tipo rol
        
        boolean llOk = true;
        
        for(int i=0; i<unRol.getModulos().size();i++){
            if(unRol.getModulos().get(i).getAcceso() == null){
                llOk = false;
            } else if(unRol.getModulos().get(i).getAdiccionar() == null){
                llOk = false;
            } else if(unRol.getModulos().get(i).getEditar() == null){
                llOk = false;
            } else if(unRol.getModulos().get(i).getEliminar() == null){
                llOk = false;
            }
        }
        return llOk;
    }
    
    public boolean validaDescripcionRol(Rol unRol){
        
        //Valida que el Rol no tenga un nulo en la descripción o vacio
        //recibe un objeto de tipo rol
        
        boolean llOk=true;
        
        if(unRol.getDescrip() == null || unRol.getDescrip().equals("")){
                llOk = false;
            }
        
        return llOk;
    }
}
