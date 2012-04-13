/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Date; 

/**
 *
 * @author mguerrero
 */
public class Usuario {
    private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String usuario;
    private String password;
    private String correo;
    private String f_ingreso;
    private String cargo;
    private Rol rol_actual;

    public Usuario(){}
    public Usuario(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String password, String correo, String f_ingreso, String cargo, Rol rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.usuario = usuario;
        this.password = password;
        this.correo = correo;
        this.f_ingreso = f_ingreso;
        this.cargo = cargo;
        this.rol_actual=rol;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getCargo() {
        return cargo;
    }

   public Rol getRol_actual() {
        return rol_actual;
    }

    public void setRol_actual(Rol rol_actual) {
        this.rol_actual = rol_actual;
    }
    

    public String getCorreo() {
        return correo;
    }

    public String getDni() {
        return dni;
    }

    public String getF_ingreso() {
        return f_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

   
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setF_ingreso(String f_ingreso) {
        this.f_ingreso = f_ingreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
