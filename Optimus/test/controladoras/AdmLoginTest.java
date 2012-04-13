/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Bitacora;
import modelos.Rol;
import modelos.TareasGenerales;
import modelos.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;
import controladoras.TestGeneral;


/**
 *
 * @author EDGE XIII
 */
public class AdmLoginTest {
    
    AdmLogin admLogin = new AdmLogin();
    
    public AdmLoginTest() {
    }
    

    AdmTareasGenerales objAdminTareasGenerales = null;
    ArrayList<TareasGenerales> lstTareasGenerales = new ArrayList<TareasGenerales>();
    //ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
    RolTest test= new RolTest();
    Rol rol_actual=test.getRolActual();
    
    TestGeneral xTestGeneral= new TestGeneral(); 
    ArrayList<Usuario> dbUsuario= xTestGeneral.simularTabla();
    
    
    @Test
    public void siNoSeIngresaUsuarioMuestraMensajeError(){
        //datos de prueba
        
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
        
   
        //test
        assertFalse(admLogin.usuarioVacio(dbUsuario.get(0).getUsuario()));
//        assertFalse(admLogin.usuarioVacio(""));
        //resultado en pantalla
        System.out.println("-------------------------------------------------");
        System.out.println("Test: siNoSeIngresaUsuarioMuestraMensajeError");
        System.out.println("-------------------------------------------------");
        System.out.println("Se ha ingresado el usuario");
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void siNoSeIngresaContraseñaMuestraError(){
        //datos de prueba
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
        //test
        assertFalse(admLogin.passwordVacio(dbUsuario.get(0).getPassword()));
//        assertFalse(admLogin.usuarioVacio(""));
        //resultado en pantalla
        System.out.println("-------------------------------------------------");
        System.out.println("Test: siNoSeIngresaContraseñaMuestraError");
        System.out.println("-------------------------------------------------");
        System.out.println("Se ha ingresado la contraseña");
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void siSeIngresaContraseñaIncorrectaMuestraAdvertencia(){
         //datos de prueba
//        dbUsuario.add(new Usuario("06109064", "Ricardo"  ,"Giron"   ,"Salas"    ,"rgiron"   ,"rgiron"   ,"rgiron@optimus.net"   ,"16/02/2012","cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("99999999", "Wolfgang" ,"Boldt"   ,"De Rivero","wboldt"   ,"wboldt"   ,"wboldt@optimus.net"   ,"16/02/2012","cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("88888888", "Alex"     ,"Segovia" ,"Segovia"  ,"asegovia" ,"asegovia" ,"asegovia@optimus.net" ,"16/02/2012","cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
//        dbUsuario.add(new Usuario("09534044", "Marcelino","Guerrero","Cordova"  ,"mguerrero","mguerrero","mguerrero@optimus.net","16/02/2012","cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
        //test
        assertSame("Password Incorrecto", admLogin.passwordIncorrecto("rgiron","rgiron1",dbUsuario));
        //resultado en pantalla
        System.out.println("-------------------------------------------------");
        System.out.println("Test: siSeIngresaContraseñaIncorrectaMuestraAdvertencia");
        System.out.println("-------------------------------------------------");
        System.out.println("El usuario o password es incorrecto. Intente nuevamente!");
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
}
