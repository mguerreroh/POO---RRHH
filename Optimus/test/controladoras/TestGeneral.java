/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Rol;
import modelos.Usuario;
import controladoras.AdmUsuarios;
import java.text.ParseException;
import java.util.ArrayList;
import modelos.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mguerrero
 */
public class TestGeneral {
    AdmUsuarios admUsuarios = new AdmUsuarios();
    static ArrayList<Usuario> dbUsuarioX = new ArrayList<Usuario>();
    static RolTest test= new RolTest();
    static Rol rol_actual=test.getRolActual();
    
    public static void simularTabla(){
        dbUsuarioX.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuarioX.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuarioX.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuarioX.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
    }
    
    @Test
    public void procesoCompleto() {
        RolTest test= new RolTest();
        test.crearRol();
        Rol rol_actual=test.getRolActual();
        
        //dbUsuarioX.get(1);
               
        Usuario user1 = new Usuario("06109064", "Ricardo", "Giron", "Salas", "rgiron", "rgiron", "rgiron@optimus.net", null, "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", ""));
        System.out.println("*----- Inicio verificacion Usuario :" + user1.getUsuario() + " -----*");
        System.out.println("El Nombre del Usuario es: "    + user1.getNombre());
        System.out.println("El Ape. Pat. del Usuario es: " + user1.getApellidoPaterno());
        System.out.println("El Ape. Mat. del Usuario es: " + user1.getApellidoMaterno());
        System.out.println("El Usuario  del Usuario es: "  + user1.getUsuario());
        System.out.println("El Password del Usuario es: "  + user1.getPassword());
        System.out.println("El Correo del Usuario es: "    + user1.getCorreo());
        System.out.println("El F.ingreso del Usuario es: " + user1.getF_ingreso());
        System.out.println("El Cargo del Usuario es: "     + user1.getCargo());
        System.out.println("El Rol del Usuario es: "       + user1.getRol_actual().getDescrip());
        System.out.println("El usuario quien lo creo es: " + user1.getBitacora().getUsCrea());
        System.out.println("La fecha de creacion es: "     + user1.getBitacora().getfCrea());
        System.out.println("*----- Fin verificacion Usuario -----*");
        System.out.println("\n");

        Usuario user2 = new Usuario("99999999", "Wolfgang", "Boldt", "De Rivero", "wboldt", "wboldt", "wboldt@optimus.net", null, "cargo2", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", ""));
        System.out.println("*----- Inicio verificacion Usuario :" + user2.getUsuario() + " -----*");
        System.out.println("El Nombre del Usuario es: "    + user2.getNombre());
        System.out.println("El Ape. Pat. del Usuario es: " + user2.getApellidoPaterno());
        System.out.println("El Ape. Mat. del Usuario es: " + user2.getApellidoMaterno());
        System.out.println("El Usuario  del Usuario es: "  + user2.getUsuario());
        System.out.println("El Password del Usuario es: "  + user2.getPassword());
        System.out.println("El Correo del Usuario es: "    + user2.getCorreo());
        System.out.println("El F.ingreso del Usuario es: " + user2.getF_ingreso());
        System.out.println("El Cargo del Usuario es: "     + user2.getCargo());
        System.out.println("El Rol del Usuario es: "       + user2.getRol_actual().getDescrip());
        System.out.println("El usuario quien lo creo es: " + user2.getBitacora().getUsCrea());
        System.out.println("La fecha de creacion es: "     + user2.getBitacora().getfCrea());
        System.out.println("*----- Fin verificacion Usuario -----*");
        System.out.println("\n");
        
        Usuario user3 = new Usuario("88888888", "Alex", "Segovia", "Segovia", "asegovia", "asegovia", "asegovia@optimus.net", null, "cargo2", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", ""));
        System.out.println("*----- Inicio verificacion Usuario :" + user2.getUsuario() + " -----*");
        System.out.println("El Nombre del Usuario es: "    + user3.getNombre());
        System.out.println("El Ape. Pat. del Usuario es: " + user3.getApellidoPaterno());
        System.out.println("El Ape. Mat. del Usuario es: " + user3.getApellidoMaterno());
        System.out.println("El Usuario  del Usuario es: "  + user3.getUsuario());
        System.out.println("El Password del Usuario es: "  + user3.getPassword());
        System.out.println("El Correo del Usuario es: "    + user3.getCorreo());
        System.out.println("El F.ingreso del Usuario es: " + user3.getF_ingreso());
        System.out.println("El Cargo del Usuario es: "     + user3.getCargo());
        System.out.println("El Rol del Usuario es: "       + user3.getRol_actual().getDescrip());
        System.out.println("El usuario quien lo creo es: " + user3.getBitacora().getUsCrea());
        System.out.println("La fecha de creacion es: "     + user3.getBitacora().getfCrea());
        System.out.println("*----- Fin verificacion Usuario -----*");
        System.out.println("\n");
        
        Usuario user4 = new Usuario("09534044", "Marcelino", "Guerrero", "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", null, "cargo2", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", ""));
        System.out.println("*----- Inicio verificacion Usuario :" + user2.getUsuario() + " -----*");
        System.out.println("El Nombre del Usuario es: "    + user4.getNombre());
        System.out.println("El Ape. Pat. del Usuario es: " + user4.getApellidoPaterno());
        System.out.println("El Ape. Mat. del Usuario es: " + user4.getApellidoMaterno());
        System.out.println("El Usuario  del Usuario es: "  + user4.getUsuario());
        System.out.println("El Password del Usuario es: "  + user4.getPassword());
        System.out.println("El Correo del Usuario es: "    + user4.getCorreo());
        System.out.println("El F.ingreso del Usuario es: " + user4.getF_ingreso());
        System.out.println("El Cargo del Usuario es: "     + user4.getCargo());
        System.out.println("El Rol del Usuario es: "       + user4.getRol_actual().getDescrip());
        System.out.println("El usuario quien lo creo es: " + user4.getBitacora().getUsCrea());
        System.out.println("La fecha de creacion es: "     + user4.getBitacora().getfCrea());
        System.out.println("*----- Fin verificacion Usuario -----*");
        System.out.println("\n");
        
        //Inicio Test con Array
        ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
        
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
        
        String usuarioBuscar="mguerrero";
        
        System.out.println("Validando la existencia del Usuario " + usuarioBuscar);
        System.out.println("------------------------------------------------------------");
        if (AdmUsuarios.buscaUsuario(usuarioBuscar, dbUsuario)){
            System.out.println("El usuario " + usuarioBuscar + ", ya existe!!!!");
        } else System.out.println("El usuario " + usuarioBuscar + ", no existe!!!!");
        System.out.println("\n");
        
        String usuarioDatos="wboldt";
        
        if (AdmUsuarios.buscaUsuario(usuarioDatos, dbUsuario)){
            System.out.println("Los datos de usuario " + usuarioBuscar + ", son los siguientes:");
            System.out.println("---------------------------------------------------------------");
            AdmUsuarios.DatosUsuarioBuscado(usuarioDatos, dbUsuario);
            System.out.println("\n");
        }
        
//        for(int x=0;x<dbUsuario.size();x++){
//            System.out.println("Bitacora (" + x + "): "  + dbUsuario.get(x).getBitacora().getUsCrea());
//        }
        
        //<< crearTarea >>
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
        
        //<< TestAdmin >>
        Usuario resp2 = dbUsuario.get(0);
       ArrayList<Usuario> dbInvitado2 = new ArrayList<Usuario>();
       dbInvitado2.add(dbUsuario.get(1));
       dbInvitado2.add(dbUsuario.get(2));
       ArrayList<TareasGenerales> lstTareasGenerales = new ArrayList<TareasGenerales>();
        
       TareasGenerales tg1= new TareasGenerales(resp2,"CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","EN PROCESO",dbInvitado2);
       lstTareasGenerales.add(tg1);
       TareasGenerales tg2= new TareasGenerales(resp2,"PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO",dbInvitado2);
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
       
       //<< campoAsuntoNoDebeEstaVacio >>
       
        Usuario resp3=dbUsuario.get(0);
        ArrayList<Usuario> dbInvitado3 = new ArrayList<Usuario>();
        dbInvitado3.add(dbUsuario.get(1));
        dbInvitado3.add(dbUsuario.get(2));
        dbInvitado3.add(dbUsuario.get(3));

        TareasGenerales tarea3 = new TareasGenerales(resp3,"PROYECTO MARCONI","10/10/2012","Comentario","EN PROCESO",dbInvitado3);
        assertNotNull(tarea3.getAsunto());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoAsuntoNoDebeEstarVacio");
        System.out.println("-------------------------------------------------");
        System.out.println("El Asunto es: "+tarea3.getAsunto());
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
        
}
