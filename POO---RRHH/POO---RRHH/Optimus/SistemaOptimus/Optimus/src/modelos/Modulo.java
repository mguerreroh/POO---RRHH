package modelos;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Modulo.java
//  @ Date : 16/03/2012
//  @ Author : 
//
//




public class Modulo {
	private String codigoModulo = "ADMROL";
        private String codigo;
	private String nombre;
	private Boolean acceso;
	private Boolean adiccionar;
	private Boolean editar;
	private Boolean eliminar;

    public Modulo(String codigo, String nombre, Boolean acceso, Boolean adiccionar, Boolean editar, Boolean eliminar) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.acceso = acceso;
        this.adiccionar = adiccionar;
        this.editar = editar;
        this.eliminar = eliminar;
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }
    
    public Boolean getAcceso() {
        return acceso;
    }

    public void setAcceso(Boolean acceso) {
        this.acceso = acceso;
    }

    public Boolean getAdiccionar() {
        return adiccionar;
    }

    public void setAdiccionar(Boolean adiccionar) {
        this.adiccionar = adiccionar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getEditar() {
        return editar;
    }

    public void setEditar(Boolean editar) {
        this.editar = editar;
    }

    public Boolean getEliminar() {
        return eliminar;
    }

    public void setEliminar(Boolean eliminar) {
        this.eliminar = eliminar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}