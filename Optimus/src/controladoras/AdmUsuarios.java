/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.text.ParseException;
import java.util.ArrayList;
import java.lang.String;
import java.text.DateFormat;
import modelos.Usuario;
import java.util.Date;

/**
 *
 * @author mguerrero
 */
public class AdmUsuarios {
    
    private ArrayList<Usuario> dbUsuarios = new ArrayList<Usuario>();
    
    private void simularTabla(){
        Date fIngreso = new java.util.Date();
        this.dbUsuarios.add(new Usuario("dni", "nombre"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("111", "Ricardo"  , "Giron"          , "S."             , "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("222", "WOLFGANG" , "BOLDT "         , "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("333", "Alex"     , "SEGOVIA "       , "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("444", "Marcelino", "Guerrero"       , "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("555", "Daniel"   , "Subauste"       , "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
    }
    /*<< - USUARIO - >>*/
    public boolean verificarUsuario(String user){
        if(user != null){
            return true;
        }
        return false;
    }
    
    /*<< - NOMBRE - >>*/
    public boolean verificarNombre(String nombre){
        if(nombre != null){
            return true;
        }
        return false;
    }
    
    /*<< - DNI - >>*/
    public boolean validarDNI(String dni){
        if(dni != null){
            return true;
        }
        return false;
    }
    
    /*<< - APELLIDO PATERNO - >>*/
    public boolean validarApellidoPaterno(String apePat){
        if (apePat != null){
            return true;
        }
        return false;
    }
    
    /*<< - APELLIDO MATERNO - >>*/
    public boolean validarApellidoMatermo(String apeMat){
        if (apeMat != null){
            return true;
        }
        return false;
    }
    
    /*<< - PASSWORD - >>*/
    public boolean validarPassword(String password){
        if (password != null){
            return true;
        }
        return false;
    }
    
    /*<< - CORREO - >>*/
    public boolean validarCorreo(String correo){
        if (correo != null){
            return true;
        }
        return false;
    }
    
    /*<< - FECHA - >>*/
    public boolean validarFecha(Date fIngreso){
        if (fIngreso != null){
            return true;
        }
        return false;
    }
    
    /*<< - CARGO - >>*/
    public boolean validarCargo(String cargo){
        if (cargo != null){
            return true;
        }
        return false;
    }
    
    /*<< - CODIGO ROL - >>*/
    public boolean validarCodigoRol(String codigoRol){
        if (codigoRol != null){
            return true;
        }
        return false;
    }
    
    /*<< -  - >>*/
    public Date convertirFecha(String fecha) throws ParseException {
        //SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Date d1 = df.parse(fecha);
        //Date d1 = new Date();
        //System.out.println(df.format(d1));}
        return d1;
    }
}
