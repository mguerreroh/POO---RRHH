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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mguerrero
 * 
 */
public class AdmUsuarioTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
    
    //simularTabla();
    
    @Test
    public void CrearUsuario() {
        RolTest test= new RolTest();
        test.crearRol();
        Rol rol_actual=test.getRolActual();
               
        Usuario user1 = new Usuario("09534044", "Zadith", "Guerrero", "Cordova", "zguerrero", "zguerrero", "zguerrero@", null, "cargo", rol_actual);
        System.out.println("El Nombre del Usuario es: "    + user1.getNombre());
        System.out.println("El Ape. Pat. del Usuario es: " + user1.getApellidoPaterno());
        System.out.println("El Ape. Mat. del Usuario es: " + user1.getApellidoMaterno());
        System.out.println("El Usuario  del Usuario es: "  + user1.getUsuario());
        System.out.println("El Password del Usuario es: "  + user1.getPassword());
        System.out.println("El Correo del Usuario es: "    + user1.getCorreo());
        System.out.println("El F.ingreso del Usuario es: " + user1.getF_ingreso());
        System.out.println("El Cargo del Usuario es: "     + user1.getCargo());

        Usuario user2 = new Usuario("09534044", "Ricardo", "Guerrero", "Cordova", "rguerrero", "rguerrero", "rguerrero@", null, "cargo", rol_actual);
        System.out.println("El Nombre del Usuario es: "     + user2.getNombre());
        System.out.println("El Ape. Pat. del Usuario es: "  + user2.getApellidoPaterno());
        System.out.println("El Ape. Mat. del Usuario es: "  + user2.getApellidoMaterno());
        System.out.println("El Usuario  del Usuario es: "   + user2.getUsuario());
        System.out.println("El Password del Usuario es: "   + user2.getPassword());
        System.out.println("El Correo del Usuario es: "     + user2.getCorreo());
        System.out.println("El F.ingreso del Usuario es: "  + user2.getF_ingreso());
        System.out.println("El Cargo del Usuario es: "      + user2.getCargo());
        
        //Inicio Test con Array
        ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
        
        dbUsuario.add(new Usuario("09534044",  "Zadith", "Guerrero", "Cordova", "zguerrero", "zguerrero", "zguerrero@", null, "cargo", rol_actual));
        dbUsuario.add(new Usuario("09534045", "Ricardo", "Guerrero", "Cordova", "rguerrero", "rguerrero", "rguerrero@", null, "cargo", rol_actual));
        
        AdmUsuarios objAdmUsuarios = new AdmUsuarios();
        if(objAdmUsuarios.buscaUsuario("dni9999")){
            objAdmUsuarios.DatosClienteBuscado("dni0101");
            System.out.println(objAdmUsuarios.getObjClienteEncontrado().getNombre());
            System.out.println(objAdmUsuarios.getObjClienteEncontrado().getApellido());
            
        } else
            System.out.println("No se encontró DNI");
        //Fin Test con ArraydbUsuario
    }

    public void siNoingresoElusuarioMeDebeDarError(){
        assertFalse(admUsuarios.verificarUsuario(null));
        System.out.println("Usuario no debe estar vacio");
    }
    @Test
    public void siIngresoEspaciosEnElUsuarioMeDebeDarError(){
        assertFalse(admUsuarios.vacioUsuario("    "));
        System.out.println("Usuario no debe tener espacios en blanco");
    }
        
    @Test
    public void siNoingresoElNombreDebeDarError(){
        assertFalse(admUsuarios.verificarNombre(null));
        System.out.println("El nombre no debe estar vacio");
    }
    
    @Test
    public void siNoIngresoelDniDebeDarError(){
        assertFalse(admUsuarios.validarDNI(null));
        System.out.println("El DNI no debe de estar vacio");
    }
    
    @Test
    public void siNoIngresoelApePatDebeDarError(){
        assertFalse(admUsuarios.validarApellidoPaterno(null));
        System.out.println("El apellido paterno no debe de estar vacio");
    }
    
    @Test
    public void siNoIngresoelApeMatDebeDarError(){
        assertFalse(admUsuarios.validarApellidoMatermo(null));
        System.out.println("El apellido materno no debes de estar vacio");
    }
    
    @Test
    public void siNoIngresoelPasswordDebeDarError(){
        assertFalse(admUsuarios.validarPassword(null));
        System.out.println("El password no debe de estar vacio");
    }
    
    @Test
    public void siNoIngresoelCorreoDebeDarError(){
        assertFalse(admUsuarios.validarCorreo(null));
        System.out.println("El correo no debe de estar vacio");
    }
    
    @Test
    public void siNoTieneFechaIngresoDebeDarError(){
        assertFalse(admUsuarios.validarFecha(null));
        System.out.println("La fecha no debe de estar vacia");
    }
    
    @Test
    public void siNoIngresaCargoDebeDarError(){
        assertFalse(admUsuarios.validarCargo(null));
        System.out.println("El cargo no debe de estar vacio");
    }
    
    @Test
    public void siNoIngresaCodigoRolDebeDarError(){
        assertFalse(admUsuarios.validarCodigoRol(null));
    }
    
    //Faltan validaciones de Usuarios
    //Actualizaciones para pruebas
    //
    @Test
    public void testear() throws ParseException{
        System.out.println("Esta es una fecha de prueba 1" + admUsuarios.convertirFecha("28/01/2012"));
        System.out.println("Esta es una fecha de prueba 2" + admUsuarios.convertirFecha("29/01/2012"));
        System.out.println("Esta es una fecha de prueba 3" + admUsuarios.convertirFecha("30/01/2012"));
    }
    /*
    @Test
    public void testear() throws ParseException{
        //Calendar calendario = GregorianCalendar.getInstance();
        String fecha = "28-01-2012";
        //System.out.println(fecha);
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd-MM-yyyy");
        //System.out.println(formatoDeFecha.format(fecha));
        System.out.println(formatoDeFecha.format(new Date()));
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Date d = df.parse("28/01/2012");
        System.out.println(d);
    }*/
    
}
