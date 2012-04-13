/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Rol;
import modelos.Usuario;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import modelos.Bitacora;
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
        
        Usuario user1 = new Usuario("09534044", "Zadith", "Guerrero", "Cordova", "zguerrero", "zguerrero", "zguerrero@", null, "cargo", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", ""));
        System.out.println("*----- Inicio verificacion Usuario :" + user1.getUsuario() + " -----*");
        System.out.println("El Nombre del Usuario es: "    + user1.getNombre());
        System.out.println("El Ape. Pat. del Usuario es: " + user1.getApellidoPaterno());
        System.out.println("El Ape. Mat. del Usuario es: " + user1.getApellidoMaterno());
        System.out.println("El Usuario  del Usuario es: "  + user1.getUsuario());
        System.out.println("El Password del Usuario es: "  + user1.getPassword());
        System.out.println("El Correo del Usuario es: "    + user1.getCorreo());
        System.out.println("El F.ingreso del Usuario es: " + user1.getF_ingreso());
        System.out.println("El Cargo del Usuario es: "     + user1.getCargo());
        System.out.println("El usuario quien lo creo es: " + user1.getBitacora().getUsCrea());
        System.out.println("La fecha de creacion es: "     + user1.getBitacora().getfCrea());
        System.out.println("*----- Fin verificacion Usuario -----*");
        System.out.println("\n");

        Usuario user2 = new Usuario("09534045", "Ricardo", "Guerrero", "Cordova", "rguerrero", "rguerrero", "rguerrero@", null, "cargo", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", ""));
        System.out.println("*----- Inicio verificacion Usuario :" + user2.getUsuario() + " -----*");
        System.out.println("El Nombre del Usuario es: "     + user2.getNombre());
        System.out.println("El Ape. Pat. del Usuario es: "  + user2.getApellidoPaterno());
        System.out.println("El Ape. Mat. del Usuario es: "  + user2.getApellidoMaterno());
        System.out.println("El Usuario  del Usuario es: "   + user2.getUsuario());
        System.out.println("El Password del Usuario es: "   + user2.getPassword());
        System.out.println("El Correo del Usuario es: "     + user2.getCorreo());
        System.out.println("El F.ingreso del Usuario es: "  + user2.getF_ingreso());
        System.out.println("El Cargo del Usuario es: "      + user2.getCargo());
        System.out.println("El Rol del Usuario es: "        + user2.getRol_actual().getDescrip());
        System.out.println("El usuario quien lo creo es: "  + user2.getBitacora().getUsCrea());
        System.out.println("La fecha de creacion es: "      + user2.getBitacora().getfCrea());
        System.out.println("*----- Fin verificacion Usuario -----*");
        System.out.println("\n");
        
        //Inicio Test con Array
        ArrayList<Usuario> dbUsuario = new ArrayList<Usuario>();
        
        dbUsuario.add(new Usuario("09534044",  "Zadith", "Guerrero", "Cordova", "zguerrero", "zguerrero", "zguerrero@", null, "cargo", rol_actual, new Bitacora(1,"Adm", "12/04/2012", "", "")));
        dbUsuario.add(new Usuario("09534045", "Ricardo", "Guerrero", "Cordova", "rguerrero", "rguerrero", "rguerrero@", null, "cargo", rol_actual, new Bitacora(2,"Adm", "12/04/2012", "", "")));
        
        String usuarioBuscar="zguerrero";
        
        System.out.println("Validando la existencia del Usuario " + usuarioBuscar);
        System.out.println("------------------------------------------------------------");
        if (AdmUsuarios.buscaUsuario(usuarioBuscar, dbUsuario)){
            System.out.println("El usuario " + usuarioBuscar + ", ya existe!!!!");
        } else System.out.println("El usuario " + usuarioBuscar + ", no existe!!!!");
        System.out.println("\n");
        
        String usuarioDatos="zguerrero";
        
        if (AdmUsuarios.buscaUsuario(usuarioDatos, dbUsuario)){
            System.out.println("Los datos de usuario " + usuarioBuscar + ", son los siguientes:");
            System.out.println("---------------------------------------------------------------");
            AdmUsuarios.DatosUsuarioBuscado(usuarioDatos, dbUsuario);
            System.out.println("\n");
        }
        
//        //DatosUsuarioBuscado
//        if (AdmUsuarios.DatosUsuarioBuscado(usuarioDatos, dbUsuario)){
//            System.out.println("El usuario " + usuarioBuscar + ", ya existe!!!!");
//        } else System.out.println("El usuario " + usuarioBuscar + ", no existe!!!!");
//        
        //Fin Test con ArraydbUsuario
    }

    @Test
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
         System.out.println("El rol no debe de estar vacio");
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
