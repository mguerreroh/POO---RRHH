/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Usuario;
import modelos.Rol;
import modelos.Carta;
import java.util.ArrayList;
import modelos.Bitacora;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdminCartaTest {
    AdminCarta objAdminCarta = null;
    ArrayList<Carta> lstCarta = new ArrayList<Carta>();
    ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
    RolTest test= new RolTest();
//  test.crearRol();
    Rol rol_actual=test.getRolActual();
   
    @Test
    public  void creaUsers(){
//       users.add(new Usuario("45074193", "Juan"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;  
//       users.add(new Usuario("87074393", "Jose"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
//       users.add(new Usuario("67023343", "Pedro"  , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
//       users.add(new Usuario("12071193", "Carlos" , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo",rol_actual )) ;
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));

    }

    @Test
    public void testCrearCarta() {
        System.out.println("Test para Crear una Carta con su Detalle ");
        System.out.println();
        System.out.println();
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
      
        Usuario resp=dbUsuario.get(0);
        dbUsuario.remove(0);
        Carta tarea = new Carta(resp, "Carta Fianza 1", "10/10/2012","carta Nueva", "EN PROCESO", dbUsuario,"00001",23.7,"Tipo1","111111");
        assertNotNull(tarea.getAsunto());
        System.out.println("Asunto de Carta  " +tarea.getAsunto());
        assertNotNull(tarea.getComentario());
        System.out.println("Comentario de Carta  " +tarea.getComentario());
        assertNotNull(tarea.getStatus());
        System.out.println("Estado de Carta  " +tarea.getStatus());
        assertNotNull(tarea.getStatus());
        System.out.println("Tipo de Carta  " +tarea.getTipo());
        assertNotNull(tarea.getStatus());
        System.out.println("Nro Seleccion de Carta  " +tarea.getSeleccion());
        assertNotNull(tarea.getStatus());
        System.out.println("Estado de Carta  " +tarea.getStatus());
        assertNotNull(tarea.getStatus());
        System.out.println("Importe de Carta  " +tarea.getImporte());
        assertNotNull(tarea.getResponsable());      
        System.out.println("Responsable de Carta: " +tarea.getResponsable().getNombre());
            
//      assertNotNull(tarea.getInvitados());    
        System.out.println("Invitados: " +tarea.getInvitados().size());
        for(int a=0;a<tarea.getInvitados().size();a++){
        System.out.println("Los Invitados Son: " +tarea.getInvitados().get(a).getNombre());         
        
        }
    }
    
    @Test
    public void TestAdmin() {
        System.out.println();
        System.out.println();
        System.out.println("Test de varias Cartas creadas ");
        System.out.println();
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
        Usuario resp=dbUsuario.get(0);
        dbUsuario.remove(0);
             
//      llama a la clase controladora
//      AdmTareasGenerales  objAdminTareasGenerales = new AdmTareasGenerales();
    
        Carta tg1= new Carta(resp,"CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","EN PROCESO", dbUsuario,"00003",23.7,"Tipo1","123111");
        lstCarta.add(tg1);
        Carta tg2= new Carta(resp, "PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO",dbUsuario,"00002",35.67,"Tipo1","112311");
        lstCarta.add(tg2);    
        Carta tg3= new Carta(resp, "PROYECTO YANACA","10/07/2012","Comentario","EN PROCESO",dbUsuario,"00007",45.80,"Tipo2","112399");
        lstCarta.add(tg3); 
        System.out.println("Tamaño de la lista Cartas Fianza: " + lstCarta.size());
        assertEquals(lstCarta.size(), 3);
        assertEquals(lstCarta.get(2).getAsunto(),"PROYECTO YANACA");
        System.out.println("Datos agregados correctamente..");    
    }
}
