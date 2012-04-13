
package controladoras;

import java.util.ArrayList;
import modelos.Rol;
import modelos.TareasGenerales;
import modelos.Usuario;
import static org.junit.Assert.*;
import org.junit.Test;
import modelos.Bitacora;
import controladoras.TestGeneral;


public class TareasGeneralesTest {
 AdmTareasGenerales objAdminTareasGenerales = null;
 ArrayList<TareasGenerales> lstTareasGenerales = new ArrayList<TareasGenerales>();
 //ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
 RolTest test= new RolTest();
 //test.crearRol();
 Rol rol_actual=test.getRolActual();

//    public void simularTabla(){
//        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
//    }
 
    
   TestGeneral xTestGeneral= new TestGeneral(); 
   ArrayList<Usuario> dbUsuario= xTestGeneral.simularTabla();
 
    @Test
    public void crearTarea() {  
        
       // this.simularTabla();
//        System.out.println(TestGeneral.dbUsuarioX.get(0).getNombre());
        //dbUsuario.add(TestGeneral.dbUsuarioX.get(1));
        //dbUsuario.add(TestGeneral.dbUsuarioX.get(2));
        
        Usuario resp=dbUsuario.get(0);
        
        ArrayList<Usuario> dbInvitado = new ArrayList<Usuario>();
        dbInvitado.add(dbUsuario.get(2));
        dbInvitado.add(dbUsuario.get(1));
        
        //dbUsuario.remove(0);
        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO",dbInvitado);
        assertNotNull(tarea.getAsunto());
        System.out.println("Asunto de Tarea: "+tarea.getAsunto());
        assertNotNull(tarea.getComentario());
        System.out.println("Comentario de Tarea: "+tarea.getComentario());
        assertNotNull(tarea.getStatus());
        System.out.println("Estado de Tarea: "+tarea.getStatus());
        assertNotNull(tarea.getResponsable());      
        System.out.println("Responsable de Tarea: "+tarea.getResponsable().getNombre());  
//      assertNotNull(tarea.getInvitados());    
        System.out.println("Invitados: " +tarea.getInvitados().size());
        for(int a=0;a<tarea.getInvitados().size();a++){
            System.out.println("Los Invitados son(" + a + "): " +tarea.getInvitados().get(a).getNombre());
        }
        System.out.println("El rol actual es: "+dbUsuario.get(0).getRol_actual());
    }
    
    @Test
    public void TestAdmin(){
       
       //this.simularTabla();
      
       Usuario resp=dbUsuario.get(0);
       ArrayList<Usuario> dbInvitado = new ArrayList<Usuario>();
       dbInvitado.add(dbUsuario.get(1));
       dbInvitado.add(dbUsuario.get(2));
        
       TareasGenerales tg1= new TareasGenerales(resp,"CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","EN PROCESO",dbInvitado);
       lstTareasGenerales.add(tg1);
       TareasGenerales tg2= new TareasGenerales(resp,"PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO",dbInvitado);
       lstTareasGenerales.add(tg2);   
       System.out.println("-------------------------------------------------");
       System.out.println("Test: cantidadDeTareasIngresadas");
       System.out.println("-------------------------------------------------");
       System.out.println("Cantidad de Tareas ingresadas: " +lstTareasGenerales.size()+" tarea(s)");
       System.out.println("--- FIN TEST ---");
       System.out.println();
       System.out.println("-------------------------------------------------");
       System.out.println("Test: validarSiSeEstanGrabandoLosDatosCorrectamente");
       System.out.println("-------------------------------------------------");
       assertEquals(lstTareasGenerales.size(),2);                               //esta consultando si hay dos registros
       assertEquals(lstTareasGenerales.get(0).getAsunto(), "CREAR RESOLUCION MENSUAL");
       System.out.println("Datos agregados correctamente..");
       System.out.println("--- FIN TEST ---");
       System.out.println();
        
        
    }
    
    @Test
    public void campoAsuntoNoDebeEstaVacio(){

        //this.simularTabla();
      
        Usuario resp=dbUsuario.get(0);
        ArrayList<Usuario> dbInvitado = new ArrayList<Usuario>();
        dbInvitado.add(dbUsuario.get(1));
        dbInvitado.add(dbUsuario.get(2));
        dbInvitado.add(dbUsuario.get(3));

        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","EN PROCESO",dbInvitado);
        assertNotNull(tarea.getAsunto());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoAsuntoNoDebeEstarVacio");
        System.out.println("-------------------------------------------------");
        System.out.println("El Asunto es: "+tarea.getAsunto());
        System.out.println("--- FIN TEST ---");
        System.out.println();
        
    }
    
    @Test
    public void campoFechaVctoNoDebeEstaVacio(){
        
        //this.simularTabla();
      
        Usuario resp=dbUsuario.get(0);
        ArrayList<Usuario> dbInvitado = new ArrayList<Usuario>();
        dbInvitado.add(dbUsuario.get(1));
        dbInvitado.add(dbUsuario.get(2));

        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","EN PROCESO",dbInvitado);
        assertNotNull(tarea.getFechaVcmto());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoFechaVctoNoDebeEstarVacio");
        System.out.println("-------------------------------------------------");
        System.out.println("La fecha de vencimiento de la tarea es: "+tarea.getFechaVcmto());
        System.out.println("--- FIN TEST ---");
        System.out.println();
        
    }
    
    @Test
    public void campoResponsableNoDebeEstaVacio(){
        
        //this.simularTabla();
      
        Usuario resp=dbUsuario.get(0);
        ArrayList<Usuario> dbInvitado = new ArrayList<Usuario>();
        dbInvitado.add(dbUsuario.get(1));
        dbInvitado.add(dbUsuario.get(3));

        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","EN PROCESO",dbInvitado);
        assertNotNull(tarea.getResponsable());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoResponsableNoDebeEstaVacio");
        System.out.println("-------------------------------------------------");
        System.out.println("La fecha de vencimiento de la tarea es: "+tarea.getFechaVcmto());
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void siTareaFueAsignadaNoSePodráModificar(){
        
       // this.simularTabla();
      
        Usuario resp=dbUsuario.get(0);
        ArrayList<Usuario> dbInvitado = new ArrayList<Usuario>();
        dbInvitado.add(dbUsuario.get(1));
        dbInvitado.add(dbUsuario.get(3));

        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","ASIGNADA",dbInvitado);
        assertEquals("No se puede editar tarea, ya fue grabada", tarea.noSePuedeEditarTarea());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: siTareaFueAsignadaNoSePodráModificar ");
        System.out.println("-------------------------------------------------");
        System.out.println("El Status de la tarea es: "+tarea.getStatus());
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void siTareaNoFueAsignadaSePodraModificar(){
        
       // this.simularTabla();
      
        Usuario resp=dbUsuario.get(0);
        ArrayList<Usuario> dbInvitado = new ArrayList<Usuario>();
        dbInvitado.add(dbUsuario.get(1));

        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","ASIGN",dbInvitado);
        assertNotSame("No se puede editar tarea, ya fue grabada", tarea.noSePuedeEditarTarea());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: siTareaNoFueAsignadaSePodraModificar ");
        System.out.println("-------------------------------------------------");
        System.out.println("El Status de la tarea es: "+tarea.getStatus());
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void Test6(){
        
    } 
   
    
}
