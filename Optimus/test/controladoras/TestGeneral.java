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
    ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
    RolTest test= new RolTest();
    Rol rol_actual=test.getRolActual();
    
    public ArrayList simularTabla(){
        
        dbUsuario.add(new Usuario("06109064", "Ricardo",   "Giron",        "Salas",    "rgiron",    "rgiron",    "rgiron@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("99999999", "Wolfgang",  "Boldt",    "De Rivero",    "wboldt",    "wboldt",    "wboldt@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("88888888", "Alex",      "Segovia",    "Segovia",  "asegovia",  "asegovia",  "asegovia@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(3,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534044", "Marcelino", "Guerrero",   "Cordova", "mguerrero", "mguerrero", "mguerrero@optimus.net", "16/02/2012", "cargo1", rol_actual, new Bitacora(4,"Adm", "12/04/2012", "", "")));
        
        return dbUsuario; 
    }
    
    @Test
    public void procesoCompleto() {
//        RolTest test= new RolTest();
//        test.crearRol();
//        Rol rol_actual=test.getRolActual();
        
        //<< Test de AdmUsuarioTest >>
        AdmUsuarioTest xAdmUsuarioTest = new AdmUsuarioTest();
        xAdmUsuarioTest.CrearUsuario();

        //<< Test de Tareas Generales >>
        TareasGeneralesTest xTareasGeneralesTest = new TareasGeneralesTest();
        xTareasGeneralesTest.crearTarea();
        xTareasGeneralesTest.TestAdmin();
        xTareasGeneralesTest.campoAsuntoNoDebeEstaVacio();
        
        //<< Test de Login >>
        AdmLoginTest xAdmLoginTest = new AdmLoginTest();
        xAdmLoginTest.siNoSeIngresaContraseñaMuestraError();
        xAdmLoginTest.siNoSeIngresaUsuarioMuestraMensajeError();
        xAdmLoginTest.siSeIngresaContraseñaIncorrectaMuestraAdvertencia();
        
        //<< Test de Rol >>
        RolTest xRolTest = new RolTest();
        xRolTest.crearRol();
        xRolTest.nombreDelRolNoSeaNuloOVacio();
        xRolTest.permisosDelRolNoSeaNulo();
        xRolTest.validaDescripcionRolNoSeaNuloOVacio();
        xRolTest.verificaBusquedaRol();
        xRolTest.verificaEliminaRol();
        
        //<< Test de AdminDeclaracionTest >>
        AdminDeclaracionTest xAdminDeclaracionTest = new AdminDeclaracionTest();
        xAdminDeclaracionTest.creaUsers();
        xAdminDeclaracionTest.testCrearTarea();
        xAdminDeclaracionTest.TestAdmin();
        xAdminDeclaracionTest.campoResponsableDebeContenerDato();
        xAdminDeclaracionTest.campoMotivoDebeContenerDato();
        xAdminDeclaracionTest.campoFechaDeVencimientoDebeContenerDato();
        xAdminDeclaracionTest.siTareaSeConfirmoSoloSePuedeModificarCampoPublicar();
        
    }
        
}
