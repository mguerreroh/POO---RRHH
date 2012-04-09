/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import java.lang.String;
import java.text.DateFormat;
import static org.junit.Assert.*;
import controladoras.AdmUsuarios;

/**
 *
 * @author mguerrero
 * 
 */
public class AdmUsuarioTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
    
    //simularTabla();

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
    }
    
    //Faltan validaciones de Usuarios
    //Actualizaciones para pruebas
    //
    @Test
    public void testear() throws ParseException{
        System.out.println("Esta es una fecha de prueba" + admUsuarios.convertirFecha("28/01/2012"));
        System.out.println("Esta es una fecha de prueba" + admUsuarios.convertirFecha("29/01/2012"));
        System.out.println("Esta es una fecha de prueba" + admUsuarios.convertirFecha("30/01/2012"));
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
