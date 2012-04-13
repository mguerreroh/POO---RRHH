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
import modelos.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdminDeclaracionTest{
    AdminDeclaracion objAdminDeclaracion = null;
    ArrayList<Declaracion> lstDeclaracion = new ArrayList<Declaracion>();
    ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
    RolTest test= new RolTest();
//  test.crearRol();
    Rol rol_actual=test.getRolActual();
   
    @Test
    public  void creaUsers(){
//        users.add(new Usuario("45074193", "Juan"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual ));  
//        users.add(new Usuario("87074393", "Jose"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual ));
//        users.add(new Usuario("67023343", "Pedro"  , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual ));
//        users.add(new Usuario("12071193", "Carlos" , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual ));
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
       
//      for(int a=0;a<users.size();a++)
//           {
//           System.out.println( "Los usuario son: " + users );
//           }
    }
  

    @Test
    public void testCrearTarea() {
        System.out.println("Test para crear una Declaracion y su detalle");
        System.out.println();
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));

        Usuario resp=dbUsuario.get(0);
        dbUsuario.remove(0);
        Declaracion tarea = new Declaracion(resp, "PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO", dbUsuario,"Cargo 1","Publicacion 2","Doc2","10/10/2012","10/10/2012","10/10/2012");
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
           
//      assertNotNull(tarea.getInvitados());    
        System.out.println("Invitados: " +tarea.getInvitados().size());
            for(int a=0;a<tarea.getInvitados().size();a++){
                System.out.println("Los Invitados Son: " +tarea.getInvitados().get(a).getNombre());
           }
    }
    
    @Test
    public void TestAdmin() {
        System.out.println();  
        System.out.println("Test para cargar varias Declaraciones");
        System.out.println();

        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
 
        Usuario resp=dbUsuario.get(0);
        dbUsuario.remove(0);
        
        
         
//      llama a la clase controladora
//      AdmTareasGenerales  objAdminTareasGenerales = new AdmTareasGenerales();
  
        Declaracion tg1= new Declaracion(resp, "CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","EN PROCESO", dbUsuario,"Cargo 20","Publicacion 2","Doc2","23/10/2012","10/10/2012","10/10/2012");
        lstDeclaracion.add(tg1);
        Declaracion tg2= new Declaracion(resp, "PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO", dbUsuario,"Cargo 5","Publicacion 2","Doc5","10/10/2012","11/09/2012","10/10/2012");
        lstDeclaracion.add(tg2);        
        System.out.println("Tamano De la lista Declaraciones " + lstDeclaracion.size());
        assertEquals(lstDeclaracion.size(), 2);
        System.out.println("Datos agregados correctamente..");
//      assertEquals(lstDeclaracion.get(0).getAsunto(), "CREAR RESOLUCION MENSUAL");
       
    }
}
