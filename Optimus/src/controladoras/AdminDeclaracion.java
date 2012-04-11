/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import java.util.List;
import modelos.Carta;
import modelos.Declaracion;
import modelos.Usuario;

/**
 *
 * @author Juanfra
 */
public class AdminDeclaracion {
    
      Declaracion c=null ;
    // inicializar la lista de objetos
    List<Declaracion> lstCartas = new ArrayList<Declaracion>();

    // creo un objeto en el constructor
    public AdminDeclaracion() {
        
          this.lstCartas.add(new Declaracion(null,"PROYECTO CONGA", "10/10/2012", "34567865", "EN PROCESO",null));
     
    }

   
    // Metodo para agregar una tarea
    public Declaracion agregarTarea(Usuario user, String asunto, String fecha, String dni, String comentario, ArrayList<Declaracion> tareas){
        c = new Declaracion();
        
        c.setAsunto(asunto);
        c.setFechaVcmto(fecha);
        c.setComentario(comentario);
        c.setResponsable(user);
 
        c.setStatus(null);
        c.setInvitados(null);
        
     return c;
    }
    
}
