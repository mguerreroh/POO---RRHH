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
    
//    ArrayList<Usuario> dbUsuario;
//    Usuario objUsuarioEncontrado;
    
    static ArrayList<Usuario> dbUsuario=new ArrayList<Usuario>();
    
        public ArrayList<Usuario> getDbUsuario() {
        return dbUsuario;
    }
    Usuario objUsuarioEncontrado;
    
    public Usuario getObjUsuarioEncontrado() {
        return objUsuarioEncontrado;
    }
          public void agregarUsuario(Usuario user) {
        dbUsuario.add(user);
    }
      
    public Usuario getUsu_nombre(String nombre) {
        Usuario temp=null;
        for (int i=0; i<dbUsuario.size();i++){
            if (nombre.equals(dbUsuario.get(i).getNombre()))
                temp=dbUsuario.get(i);
                break;
       }
            return temp;
    }

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
    
    public static boolean buscaUsuario(String usuario, ArrayList<Usuario> dbArray){
        boolean encuentra=false;
        for(int x=0;x<dbArray.size();x++){
            if(dbArray.get(x).getUsuario().equals(usuario)){
                System.out.println("Encontro a :" + dbArray.get(x).getNombre() + " " + dbArray.get(x).getApellidoPaterno());
                encuentra = true;
                break;
            }
        }
        return encuentra;
    }
    
    public static void DatosUsuarioBuscado(String usuario, ArrayList<Usuario> dbArray){
        for(int x=0;x<dbArray.size();x++){
            if(dbArray.get(x).getUsuario().equals(usuario)){
                System.out.println("Nombre:    "  + dbArray.get(x).getNombre());
                System.out.println("Ape. Pat.: "  + dbArray.get(x).getApellidoPaterno());
                System.out.println("Ape. Mat.: "  + dbArray.get(x).getApellidoMaterno());
                System.out.println("Usuario:   "  + dbArray.get(x).getUsuario());
                System.out.println("Password:  "  + dbArray.get(x).getPassword());
                System.out.println("Correo:    "  + dbArray.get(x).getCorreo());
                System.out.println("F.ingreso: "  + dbArray.get(x).getF_ingreso());
                System.out.println("Cargo:     "  + dbArray.get(x).getCargo());
            }
        }
    }  
}
