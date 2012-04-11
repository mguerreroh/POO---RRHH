/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Rol;
import modelos.Usuario;
import modelos.TareasGenerales;
import modelos.Declaracion;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juanfra
 */
public class AdminDeclaracionTest {
 AdminDeclaracion objAdminDeclaracion = null;
   ArrayList<Declaracion> lstDeclaracion = new ArrayList<Declaracion>();
  ArrayList<Usuario> users = new ArrayList<Usuario>();
  RolTest test= new RolTest();
//       test.crearRol();
      Rol rol_actual=test.getRolActual();
   
@Test
public  void creaUsers()
{
     
    
       users.add(new Usuario("45074193", "Juan"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;  
       users.add(new Usuario("87074393", "Jose"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
       users.add(new Usuario("67023343", "Pedro"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
       users.add(new Usuario("12071193", "Carlos"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
          }
  

    @Test
    public void testCrearTarea() {
    System.out.println("Test para crear una Declaracion y su detalle");
         System.out.println();
       users.add(new Usuario("45074193", "Juan"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;  
       users.add(new Usuario("87074393", "Jose"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
       users.add(new Usuario("67023343", "Pedro"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
       users.add(new Usuario("12071193", "Carlos"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
      
        Usuario resp=users.get(0);
        users.remove(0);
        Declaracion tarea = new Declaracion(resp, "PROYECTO CONGA", "10/10/2012","Comentario", "EN PROCESO", users,"Cargo 1","Publicacion 2","Doc2","10/10/2012","10/10/2012","10/10/2012");
         assertNotNull(tarea.getAsunto());
         System.out.println("Asunto de Declaracion  " +tarea.getAsunto());
         assertNotNull(tarea.getComentario());
           System.out.println("Comentario de Declaracion  " +tarea.getComentario());
         assertNotNull(tarea.getStatus());
           System.out.println("Estado de Declaracion  " +tarea.getStatus());
            assertNotNull(tarea.getStatus());
           System.out.println("Cargo de Declaracion  " +tarea.getCargo());
            assertNotNull(tarea.getStatus());
           System.out.println("Tipo de Declaracion  " +tarea.getTipo());
            assertNotNull(tarea.getStatus());
           System.out.println("Publicacion de Declaracion  " +tarea.getPublicacion());
            assertNotNull(tarea.getStatus());
           System.out.println("Doc de Declaracion  " +tarea.getNroDoc());
            assertNotNull(tarea.getStatus());
           System.out.println("Fecha de Asumpcion de Declaracion  " +tarea.getFechaAsump());
         assertNotNull(tarea.getResponsable());      
          System.out.println("Responsable de Declaracion: " +tarea.getResponsable().getNombre());
           
//          assertNotNull(tarea.getInvitados());    
           System.out.println("Invitados: " +tarea.getInvitados().size());
           for(int a=0;a<tarea.getInvitados().size();a++)
           {
           System.out.println("Los Invitados Son: " +tarea.getInvitados().get(a).getNombre());
          
           }
          
        

    }
    
    @Test
    public void TestAdmin() {
          System.out.println();
          
           System.out.println("Test para cargar varias Declaraciones");
         System.out.println();
        
       users.add(new Usuario("45074193", "Juan"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;  
       users.add(new Usuario("87074393", "Jose"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
       users.add(new Usuario("67023343", "Pedro"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
       users.add(new Usuario("12071193", "Carlos"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
      
        Usuario resp=users.get(0);
        users.remove(0);
        
        
         
//           llama a la clase controladora
//   AdmTareasGenerales  objAdminTareasGenerales = new AdmTareasGenerales();
//        
        Declaracion tg1= new Declaracion(resp, "CREAR RESOLUCION MENSUAL", "10/10/2012","Comentario", "EN PROCESO", users,"Cargo 20","Publicacion 2","Doc2","23/10/2012","10/10/2012","10/10/2012");
        lstDeclaracion.add(tg1);
       Declaracion tg2= new Declaracion(resp, "PROYECTO CONGA", "10/10/2012","Comentario", "EN PROCESO", users,"Cargo 5","Publicacion 2","Doc5","10/10/2012","11/09/2012","10/10/2012");
         lstDeclaracion.add(tg2);        
          System.out.println("Tamano De la lista Declaraciones " + lstDeclaracion.size());
        assertEquals(lstDeclaracion.size(), 2);
 System.out.println("Datos agregados correctamente..");
//       assertEquals(lstDeclaracion.get(0).getAsunto(), "CREAR RESOLUCION MENSUAL");
       
        
        
    }
}
