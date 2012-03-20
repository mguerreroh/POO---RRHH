/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import java.lang.String;
import java.sql.Date;
import modelos.Usuario;

/**
 *
 * @author mguerrero
 */
public class AdmUsuarios {
    
    private ArrayList<Usuario> dbUsuarios = new ArrayList<Usuario>();
    
    private void simularTabla(){
        Date fingreso="01/01/2010".t;
        this.dbUsuarios.add(new Usuario("dni", "nombre", "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", fingreso, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("dni", "nombre", "apellidoPaterno", "apellidoMaterno","usuario", "password", "correo", "01/01/2010", "cargo", "codigoRol"));
        //this.dbUsuarios.add("001", "Carlos", "Salinas", "Carbonel", "csalinas", "carsal11");
        //this.dbUsuarios.add("002", "Sandra", "Perez", "sanper", "sanper222");
        //this.dbUsuarios.add("003", "Jose", "Rabanal", "josrab", "josrab333");
        //this.dbUsuarios.add("004", "Gonzalo", "Gutierrez", "gongut", "gongut444");
    }
    
    public boolean verificarUsuario(String user){
        if(user != null){
            return true;
        }
        return false;
    }
    
    public boolean validarUsuario(String nombre){
        if(nombre != null){
            return true;
        }
        return false;
    }
    public boolean validarDNI(String dni){
        if(dni != null){
            return true;
        }
        return false;
    }
    
    public boolean validarApellidoPaterno(String apePat){
        if (apePat != null){
            return true;
        }
        return false;
    }
    
    public boolean validarApellidoMatermo(String apeMat){
        if (apeMat != null){
            return true;
        }
        return false;
    }
    
    public boolean validarPassword(String password){
        if (password != null){
            return true;
        }
        return false;
    }
    
    public boolean validarCorreo(String correo){
        if (correo != null){
            return true;
        }
        return false;
    }
    
    public boolean validarFecha(Date fIngreso){
        if (fIngreso != null){
            return true;
        }
        return false;
    }
    
    public boolean validarCargo(String cargo){
        if (cargo != null){
            return true;
        }
        return false;
    }
    
    public boolean validarCodigoRol(String codigoRol){
        if (codigoRol != null){
            return true;
        }
        return false;
    }
}
