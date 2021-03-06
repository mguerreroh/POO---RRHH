package modelos;


public class Modulo {
	
       
	private String nombre;
	private Boolean acceso;
	private Boolean adiccionar;
	private Boolean editar;
	private Boolean eliminar;

    public Modulo( String nombre, Boolean acceso, Boolean adiccionar, Boolean editar, Boolean eliminar) {
      
        this.nombre = nombre;
        this.acceso = acceso;
        this.adiccionar = adiccionar;
        this.editar = editar;
        this.eliminar = eliminar;
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
