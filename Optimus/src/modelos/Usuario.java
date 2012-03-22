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
    private Date f_ingreso;
    private String cargo;
    private String codigoRol;
    private String codigoModulo="usuario";

    public Usuario(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String password, String correo, Date f_ingreso, String cargo, String codigoRol) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.usuario = usuario;
        this.password = password;
        this.correo = correo;
        this.f_ingreso = f_ingreso;
        this.cargo = cargo;
        this.codigoRol = codigoRol;
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

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public String getCodigoRol() {
        return codigoRol;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDni() {
        return dni;
    }

    public Date getF_ingreso() {
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

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public void setCodigoRol(String codigoRol) {
        this.codigoRol = codigoRol;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setF_ingreso(Date f_ingreso) {
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
