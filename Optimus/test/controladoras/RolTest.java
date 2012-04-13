/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;


import java.util.ArrayList;
import modelos.Modulo;
import org.junit.Test;
import static org.junit.Assert.*;
import modelos.Rol;
import controladoras.AdmRoles;

public class RolTest {
    
    private Rol rolActual;

    Modulo Tarea = new Modulo("Tarea",false,true,true,true);
    Modulo Declaracion = new Modulo("Declaracion",true,false,true,true);
    Modulo Carta = new Modulo("Carta",true,true,false,true);
    Modulo Admin = new Modulo("Admin",true,true,true,false); 
   
    ArrayList<Modulo> Modulos = new ArrayList<Modulo>();
    
    
    public Rol getRolActual() {
        return rolActual;
    }
    public RolTest() {
   
    }

    @Test
    public void crearRol(){
        Modulos.add(Tarea);
        Modulos.add(Declaracion);
        Modulos.add(Carta);
        Modulos.add(Admin);
   
        Rol administrador = new Rol("Admin","Rol de administrador",Modulos);
   
        assertNotNull(administrador.getNombre());
        System.out.println("El nombre del Rol es: "+administrador.getNombre());
     
            for (int i=0;i<administrador.getModulos().size();i++){
                assertNotNull(administrador.getModulos().get(i).getAcceso());
                System.out.println("El Modulo es : "+administrador.getModulos().get(i).getNombre());
                System.out.println("El permiso para acceder   : "+administrador.getModulos().get(i).getAcceso().toString()); 
                System.out.println("El permiso para adicionar : "+administrador.getModulos().get(i).getAdiccionar().toString());
                System.out.println("El permiso para editar    : "+administrador.getModulos().get(i).getEditar().toString());
                System.out.println("El permiso para eliminar  : "+administrador.getModulos().get(i).getEliminar().toString());
            }
        this.rolActual=administrador;
  }
   
   @Test
   public void nombreDelRolNoSeaNuloOVacio(){
   
       Modulos.add(Tarea);
       Modulos.add(Declaracion);
       Modulos.add(Carta);
       Modulos.add(Admin);  
       Rol administrador = new Rol("Admin","Rol de administrador",Modulos);
       AdmRoles controladoraRoles = new AdmRoles(); 
       assertTrue(controladoraRoles.validaNombreRol(administrador));

   }

   @Test
   public void permisosDelRolNoSeaNulo(){
       Modulos.add(Tarea);
       Modulos.add(Declaracion);
       Modulos.add(Carta);
       Modulos.add(Admin);  
       Rol administrador = new Rol("Admin","Rol de administrador",Modulos);
       AdmRoles controladoraRoles = new AdmRoles();
       assertTrue(controladoraRoles.validaEstadoRol(administrador));
   }

   @Test
   public void validaDescripcionRolNoSeaNuloOVacio(){
       Modulos.add(Tarea);
       Modulos.add(Declaracion);
       Modulos.add(Carta);
       Modulos.add(Admin);
       Rol administrador = new Rol("Admin","Rol de administrador",Modulos);
       AdmRoles controladoraRoles = new AdmRoles();
       assertTrue(controladoraRoles.validaDescripcionRol(administrador));
   }

   @Test
   public void verificaBusquedaRol(){
       Modulos.add(Tarea);
       Modulos.add(Declaracion);
       Modulos.add(Carta);
       Modulos.add(Admin);
       
       ArrayList<Rol>aRoles = new ArrayList<Rol>();
       
       Rol administrador = new Rol("Admin","Rol de administrador",Modulos);
       Rol digitador = new Rol("Digit", "Digitador", Modulos);
       
       aRoles.add(administrador);
       aRoles.add(digitador);
       
       AdmRoles controladoraRoles = new AdmRoles();
       assertEquals(true, controladoraRoles.buscaRol("Admin", aRoles));
   }
   
   @Test
   public void verificaEliminaRol(){
       Modulos.add(Tarea);
       Modulos.add(Declaracion);
       Modulos.add(Carta);
       Modulos.add(Admin);
       
       ArrayList<Rol>aRoles = new ArrayList<Rol>();
       
       Rol administrador = new Rol("Admin","Rol de administrador",Modulos);
       Rol digitador = new Rol("Digit", "Digitador", Modulos);
       
       aRoles.add(administrador);
       aRoles.add(digitador);
       
       AdmRoles controladoraRoles = new AdmRoles();
       //Elimina el Rol
       controladoraRoles.eliminaRol("Digit", aRoles);
       //Busca el Rol Eliminado
       assertFalse(controladoraRoles.buscaRol("Digit", aRoles));
       
   }
}
