package modelos;

//

import java.util.ArrayList;


public class Rol {
    private String nombre;
    private String descrip;
	
    private ArrayList<Modulo> Modulos = new ArrayList<Modulo>();

    public Rol(String nombre, String descrip, ArrayList<Modulo> modulos) {
        this.nombre = nombre;
        this.descrip = descrip;
        for (int i=0; i<modulos.size();i++){
            this.Modulos.add(modulos.get(i));
        }
    }

    
  public void setModulos(ArrayList<Modulo> Modulos) {
        this.Modulos = Modulos;
    }

    public ArrayList<Modulo> getModulos() {
        return Modulos;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
