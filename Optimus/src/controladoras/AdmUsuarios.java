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
    
    ArrayList<Usuario> dbUsuario;
    Usuario objUsuarioEncontrado;
    
    public Usuario getObjUsuarioEncontrado() {
        return objUsuarioEncontrado;
    }
        
    //private ArrayList<Usuario> dbUsuarios = new ArrayList<Usuario>();
    /*
    private void simularTabla(){
        Date fIngreso = new java.util.Date();
        this.dbUsuarios.add(new Usuario("dni", "nombre"   , "apellidoPaterno", "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("111", "Ricardo"  , "Giron"          , "S."             , "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("222", "WOLFGANG" , "BOLDT "         , "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("333", "Alex"     , "SEGOVIA "       , "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("444", "Marcelino", "Guerrero"       , "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
        this.dbUsuarios.add(new Usuario("555", "Daniel"   , "Subauste"       , "apellidoMaterno", "usuario", "password", "correo", null, "cargo", "codigoRol"));
    }*/
    /*<< - USUARIO - >>*/
    public boolean verificarUsuario(String user){
        if(user != null){
            return true;
        }
        return false;
    }
    
    public boolean vacioUsuario(String user){
        if(user.trim().length() > 0){
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
    
    public boolean buscaUsuario(String usuario){
        boolean encuentra=false;        
        System.out.println("XXXXXXXX Entra a buscaUsuario");
        //for(int x=0;x<dbUsuario.size();x++){
        for(Usuario unUsuario:dbUsuario){
            System.out.println("XXXXXXXX Entra al FOR");
            System.out.println("XXXXXXXX Nuestra al Usuario -->" + unUsuario.getUsuario());
            //if(dbUsuario.get(x).getUsuario().equals(usuario)){
                encuentra = true;
                break;
            //}
        }
        System.out.println("XXXXXXXX Termino el FOR");
        return encuentra;
   }
    
        public void DatosUsuarioBuscado(String user){
        for(Usuario unUsuario:dbUsuario){
            if(unUsuario.getUsuario().equals(user)){
                objUsuarioEncontrado = new Usuario(unUsuario.getDni(), unUsuario.getNombre(), unUsuario.getApellidoPaterno(), 
                        unUsuario.getApellidoMaterno(), unUsuario.getUsuario(), unUsuario.getPassword(), 
                        unUsuario.getCorreo(), unUsuario.getF_ingreso(), unUsuario.getCargo(), unUsuario.getRol_actual());
//                objUsuarioEncontrado = new Usuario(dni, nombre, apepat, apemat, usuario, password, correo, f_ingreso, cargo, rol)
                break;
            }
        }
   }    
}
