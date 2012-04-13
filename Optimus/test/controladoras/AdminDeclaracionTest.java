/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.io.IOException;
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
import controladoras.TestGeneral;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdminDeclaracionTest{
    AdminDeclaracion objAdminDeclaracion = null;
    ArrayList<Declaracion> lstDeclaracion = new ArrayList<Declaracion>();
    //ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
    RolTest test= new RolTest();
//  test.crearRol();
    Rol rol_actual=test.getRolActual();
    AdminDeclaracion admDeclaracion = new AdminDeclaracion();
    TestGeneral xTestGeneral= new TestGeneral(); 
    ArrayList<Usuario> dbUsuario= xTestGeneral.simularTabla();
   
    @Test
    public  void creaUsers(){
        
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1",rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1",rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
       
//      for(int a=0;a<users.size();a++)
//           {
//           System.out.println( "Los usuario son: " + users );
//           }
    }
  

    @Test
    public void testCrearTarea() {
        System.out.println("Test para crear una Declaracion y su detalle");
        System.out.println();
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1",rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1",rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));

        Usuario resp=dbUsuario.get(0);
        //dbUsuario.remove(0);
        ArrayList<Usuario> dbInvitado1 = new ArrayList<Usuario>();
        dbInvitado1.add(dbUsuario.get(2));
        dbInvitado1.add(dbUsuario.get(1));
        
        Declaracion tarea = new Declaracion(resp, "PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO", dbInvitado1,"Cargo 1","Publicacion 2","Doc2","10/10/2012","10/10/2012","10/10/2012");
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

//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1",rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1",rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
// 
        Usuario resp=dbUsuario.get(0);
        //dbUsuario.remove(0);
        ArrayList<Usuario> dbInvitado2 = new ArrayList<Usuario>();
        dbInvitado2.add(dbUsuario.get(2));
        dbInvitado2.add(dbUsuario.get(1));
  
//      llama a la clase controladora
//      AdmTareasGenerales  objAdminTareasGenerales = new AdmTareasGenerales();
  
        Declaracion tg1= new Declaracion(resp, "CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","EN PROCESO", dbInvitado2,"Cargo 20","Publicacion 2","Doc2","23/10/2012","10/10/2012","10/10/2012");
        lstDeclaracion.add(tg1);
        Declaracion tg2= new Declaracion(resp, "PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO", dbInvitado2,"Cargo 5","Publicacion 2","Doc5","10/10/2012","11/09/2012","10/10/2012");
        lstDeclaracion.add(tg2);        
        System.out.println("Tamano De la lista Declaraciones " + lstDeclaracion.size());
        assertEquals(lstDeclaracion.size(), 2);
        System.out.println("Datos agregados correctamente..");
//      assertEquals(lstDeclaracion.get(0).getAsunto(), "CREAR RESOLUCION MENSUAL");
       
    }
    
    @Test
    public void campoResponsableDebeContenerDato(){
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1",rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1",rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
        //test
        assertFalse(admDeclaracion.campoUsuarioVacio(dbUsuario.get(1).getNombre()));
//        assertFalse(admDeclaracion.campoUsuarioVacio(""));
        //resultado en pantalla
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoResponsableDebeContenerDato");
        System.out.println("-------------------------------------------------");
        System.out.println("Se ha ingresado el responsable");
        System.out.println("--- FIN TEST ---");
        System.out.println();
    
    }
    
    @Test
    public void campoMotivoDebeContenerDato(){
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1",rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1",rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
        Usuario resp=dbUsuario.get(0);
        //dbUsuario.remove(0);
        ArrayList<Usuario> dbInvitado3 = new ArrayList<Usuario>();
        dbInvitado3.add(dbUsuario.get(2));
        dbInvitado3.add(dbUsuario.get(1));
        
        Declaracion tg1= new Declaracion(resp, "CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","EN PROCESO", dbInvitado3,"Cargo 20","Publicacion 2","Doc2","23/10/2012","10/10/2012","10/10/2012");
        
        //test
        assertFalse(admDeclaracion.campoMotivoVacio(tg1.getAsunto()));
//        assertFalse(admDeclaracion.campoMotivoVacio(""));
        //resultado en pantalla
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoMotivoDebeContenerDato");
        System.out.println("-------------------------------------------------");
        System.out.println("Se ha ingresado un Motivo");
        System.out.println("--- FIN TEST ---");
        System.out.println();
    
    }
    
    @Test
    public void campoFechaDeVencimientoDebeContenerDato(){
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1",rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1",rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
    
        Usuario resp=dbUsuario.get(0);
        //dbUsuario.remove(0);
        ArrayList<Usuario> dbInvitado4 = new ArrayList<Usuario>();
        dbInvitado4.add(dbUsuario.get(2));
        dbInvitado4.add(dbUsuario.get(1));
        
        Declaracion tg1= new Declaracion(resp, "CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","EN PROCESO", dbInvitado4,"Cargo 20","Publicacion 2","Doc2","23/10/2012","10/10/2012","10/10/2012");
        
        //test
        assertFalse(admDeclaracion.campoFechaVencimientoVacio(tg1.getFechaVcmto()));
//        assertFalse(admDeclaracion.campoMotivoVacio(""));
        //resultado en pantalla
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoFechaDeVencimientoDebeContenerDato");
        System.out.println("-------------------------------------------------");
        System.out.println("Se ha ingresado la fecha de vencimiento");
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void siTareaSeConfirmoSoloSePuedeModificarCampoPublicar(){
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1",rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1",rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
   

        Usuario resp=dbUsuario.get(0);
        //dbUsuario.remove(0);
        ArrayList<Usuario> dbInvitado5 = new ArrayList<Usuario>();
        dbInvitado5.add(dbUsuario.get(2));
        dbInvitado5.add(dbUsuario.get(1));
        
        Declaracion tg1= new Declaracion(resp, "CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","ASIGNADA", dbInvitado5,"Cargo 20","Publicacion 2","Doc2","23/10/2012","10/10/2012","10/10/2012");
        
        //test
        assertFalse(admDeclaracion.validarStatusDeTarea(tg1.getStatus()));
//        assertFalse(admDeclaracion.campoMotivoVacio(""));
        //resultado en pantalla
        System.out.println("-------------------------------------------------");
        System.out.println("Test: siTareaSeConfirmoSoloSePuedeModificarCampoPublicar");
        System.out.println("-------------------------------------------------");
        System.out.println("El status de la tarea es: "+tg1.getStatus()+" y no se puede modificar ningún campo, solo publicar");
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void siStatusEsAsignadaNoSePuedeModificarCampoResponsable() {
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1",rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1",rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1",rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
   
        Usuario resp=dbUsuario.get(0);
        //dbUsuario.remove(0);
        ArrayList<Usuario> dbInvitado6 = new ArrayList<Usuario>();
        dbInvitado6.add(dbUsuario.get(2));
        dbInvitado6.add(dbUsuario.get(1));
        
        //xTestGeneral.simularTabla().add(4, dbUsuario.get(1));
        
        Declaracion tg1 = new Declaracion(resp, "CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","ASIGNADA", dbInvitado6,"Cargo 20","Publicacion 2","Doc2","23/10/2012","10/10/2012","10/10/2012");
        boolean asignacion=false;
        
        asignacion=tg1.validarModifcacionesSiStatusEsAsignada();
        
//            System.out.println("-------------------------------------------------");
//            System.out.println("Escoger que campo desea modificar");
//            System.out.println("1. Cargo");
//            System.out.println("2. Comentario");
//            System.out.println("3. Fecha de Asumpcion");
//            System.out.println("4. Fecha de Referencia");
//            System.out.println("5. Fecha de Documento");
//            System.out.println("6. Tipo");
//            System.out.println("7. Publicacion");
//            System.out.println("8. Nro de Documento");
////           System.in.read(parametro);
           
        String lineRead;
             System.out.println(""+asignacion);
           tg1.pruebaModifica(7, asignacion, "Nuevo Dato");
            

        System.out.println("-------------------------------------------------");
        System.out.println("Test: siTareaSeConfirmoSoloSePuedeModificarCampoPublicar");
        System.out.println("-------------------------------------------------");
        System.out.println("El status de la tarea es: "+tg1.getStatus()+" y no se puede modificar ningún campo, solo publicar");
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
}
