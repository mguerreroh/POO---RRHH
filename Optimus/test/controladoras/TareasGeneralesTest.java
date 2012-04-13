
package controladoras;

import java.util.ArrayList;
import java.util.List;
import modelos.Bitacora;
import modelos.Rol;
import modelos.TareasGenerales;
import modelos.Usuario;
import static org.junit.Assert.*;
import org.junit.Test;


public class TareasGeneralesTest {
 AdmTareasGenerales objAdminTareasGenerales = null;
 ArrayList<TareasGenerales> lstTareasGenerales = new ArrayList<TareasGenerales>();
 ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
 RolTest test= new RolTest();
 //test.crearRol();
 Rol rol_actual=test.getRolActual();
   
//    @Test
//    public  void creaUsers(){
//        users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo", null,"cargo",rol_actual));  
//        users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo", null,"cargo",rol_actual));
//        users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo", null,"cargo",rol_actual));
//        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo", null,"cargo",rol_actual));
//    }
  
    @Test
    public void crearTarea() {  
//        users.add(new Usuario("45074193","Juan"  ,"apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual)); 
//        users.add(new Usuario("87074393","Jose"  ,"apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
//        users.add(new Usuario("67023343","Pedro" ,"apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
//        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
      
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
       dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
       dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
       dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
       dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
      
       Usuario resp=dbUsuario.get(0);
       ArrayList<Usuario> dbInvitado = new ArrayList<Usuario>();
       dbInvitado.add(dbUsuario.get(1));
       dbInvitado.add(dbUsuario.get(2));
//       dbUsuario.remove(0);
    
//   llama a la clase controladora
//   AdmTareasGenerales  objAdminTareasGenerales = new AdmTareasGenerales();
        
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
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
      
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
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
      
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
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
      
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
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
      
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
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
      
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
