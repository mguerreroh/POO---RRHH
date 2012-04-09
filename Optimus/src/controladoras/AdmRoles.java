/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//prueba2
package controladoras;

import java.util.ArrayList;
import modelos.ModuloXRol;

/**
 *
 * @author Ricardo
 */
public class AdmRoles {
    
    
    private ModuloXRol objModuloxRol = new ModuloXRol("Prueba", "Prueba");
    public ArrayList<ModuloXRol> dbModuloXRol;
    public String[][] aPermisos = new String[4][4];
    
    public void inicializaDatos(){
        int filas=4;
        int colum=3;
        
        //Cargamos Matriz para Administrador con valores de true en las cuatro
        //primeras columnas y el código de módulo
        for(int fil=0; fil < filas; fil++){
            for(int col=0; col < colum; col++){
                aPermisos[fil][col]="True";
                if(col == 4)
                    switch(fil){
                        case 0:
                            aPermisos[fil][col] = "DECJUR";
                            break;
                        case 1:
                            aPermisos[fil][col] = "CARFIN";
                            break;
                        case 2:
                            aPermisos[fil][col] = "TARGEN";
                            break;
                        case 3:
                            aPermisos[fil][col] = "ADMUSU";
                            break;
                        case 4:
                            aPermisos[fil][col] = "ADMROL";
                    }
            }
        }
        
        //Cargamos Matriz para Digitador con valores de true en las tres
        //primeras columnas, la cuarta en false y el código de módulo
        //significa que el digitador tiene acceso a los modulos para ingresar
        //pero no puede eliminar
        // No tendrá acceso a la Administración de Usuarios y Roles
        for(int fil=0; fil < filas; fil++){
            for(int col=0; col < colum; col++){
                if(fil < 3)
                    //los tres primeros módulos
                    aPermisos[fil][col]="true";
                else
                    //los modulos de administración de usuarios y roles
                    aPermisos[fil][col]="false";
                if(col == 4)
                    switch(fil){
                        case 0:
                            aPermisos[fil][col] = "DECJUR";
                            break;
                        case 1:
                            aPermisos[fil][col] = "CARFIN";
                            break;
                        case 2:
                            aPermisos[fil][col] = "TARGEN";
                            break;
                        case 3:
                            aPermisos[fil][col] = "ADMUSU";
                            break;
                        case 4:
                            aPermisos[fil][col] = "ADMROL";
                    }
            }
        }
        
        dbModuloXRol.add(new ModuloXRol("Administrador", "Administra el Sistema"));
        dbModuloXRol.add(new ModuloXRol("Digitador", "Registra datos en el sistema"));
    }
    
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
