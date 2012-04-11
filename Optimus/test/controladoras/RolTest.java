/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Rol;
import java.util.ArrayList;
import modelos.Modulo;
import org.junit.Test;
import static org.junit.Assert.*;


public class RolTest {
    
    private Rol rolActual;

    public Rol getRolActual() {
        return rolActual;
    }
    public RolTest() {
        
        
    }

   @Test
   public void crearRol()
   {
    Modulo Tarea = new Modulo("Tarea",false,true,true,true);
    Modulo Declaracion = new Modulo("Declaracion",true,false,true,true);
    Modulo Carta = new Modulo("Carta",true,true,false,true);
    Modulo Admin = new Modulo("Admin",true,true,true,false); 
   
    ArrayList<Modulo> Modulos = new ArrayList<Modulo>();
    Modulos.add(Tarea);
    Modulos.add(Declaracion);
    Modulos.add(Carta);
    Modulos.add(Admin);
   
   Rol administrador = new Rol("Admin","Rol de administrador",Modulos);
   assertNotNull(administrador.getNombre());
   System.out.println("El nombre del Rol es: "+administrador.getNombre());
     
    for (int i=0;i<administrador.getModulos().size();i++)
        {
            assertNotNull(administrador.getModulos().get(i).getAcceso());
            System.out.println("El Modulo es : "+administrador.getModulos().get(i).getNombre());
         
              System.out.println("El permiso para acceder   : "+administrador.getModulos().get(i).getAcceso().toString()); 
              System.out.println("El permiso para adicionar : "+administrador.getModulos().get(i).getAdiccionar().toString());
              System.out.println("El permiso para editar    : "+administrador.getModulos().get(i).getEditar().toString());
              System.out.println("El permiso para eliminar  : "+administrador.getModulos().get(i).getEliminar().toString());
 
         }
   this.rolActual=administrador;
  }
   
   //@Test
   
   
}
