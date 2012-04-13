/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Modulo;
import modelos.Rol;

/**
 *
 * @author Ricardo
 */
public class AdmRoles {
    
  private ArrayList<Rol> roles = new ArrayList<Rol>();

    public ArrayList<Rol> getRoles() {
        return roles;
    }

  public void agregarRolAdmin(){
      
  Modulo Tarea = new Modulo("Tarea",true,true,true,true);
  Modulo Declaracion = new Modulo("Declaracion",true,true,true,true);
  Modulo Carta = new Modulo("Carta",true,true,true,true);
  Modulo Usu = new Modulo("Admin",true,true,true,true); 
  Modulo Roles = new Modulo("Roles",true,true,true,true); 
    
  ArrayList<Modulo> mods = new ArrayList<Modulo>();
  mods.add(Tarea);
  mods.add(Declaracion);
  mods.add(Carta);
  mods.add(Usu);
                
  Rol nuevo_rol=new Rol ("Admin", "El que admionistra el Sistema", mods);
    roles.add(nuevo_rol);
  }
  
public void agregarRolOtro(){
      
    Modulo Tarea = new Modulo("Tarea",true,true,true,true);
    Modulo Declaracion = new Modulo("Declaracion",true,true,true,true);
    Modulo Carta = new Modulo("Carta",true,true,true,true);
    Modulo Usu = new Modulo("Admin",true,true,true,true); 
    Modulo Roles = new Modulo("Roles",true,true,true,true); 
    
    ArrayList<Modulo> mods = new ArrayList<Modulo>();
    mods.add(Tarea);
    mods.add(Declaracion);
    mods.add(Carta);
    mods.add(Usu);
                
    Rol nuevo_rol=new Rol ("Otro", "Rol Normal del Sistema", mods);
        roles.add(nuevo_rol);
  }
        
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

    public boolean buscaRol(String rol, ArrayList<Rol> dbRol){
        boolean encuentra=false;
        for(int x=0;x<dbRol.size();x++){
            if(dbRol.get(x).getNombre().equals(rol)){
                System.out.println("Rol encontrado :" + dbRol.get(x).getNombre() + " " + dbRol.get(x).getDescrip());
                encuentra = true;
                break;
            }
        }
        return encuentra;
    }
    
    public void eliminaRol(String rol, ArrayList<Rol> dbRol){
        boolean encontrado=false;
        for(int x=0;x<dbRol.size();x++){
            if(dbRol.get(x).getNombre().equals(rol)){
                encontrado=true;
                System.out.println("Rol será eliminado :" + dbRol.get(x).getNombre() + " " + dbRol.get(x).getDescrip());
                dbRol.remove(x);
                break;
                }

            }
        if(encontrado==false){
            System.out.println("Rol " + rol + " no fue encontrado");
        }
        
    }
}
