/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import java.util.List;
import modelos.Carta;
import modelos.Usuario;

/**
 *
 * @author Juanfra
 */
public class AdminCarta {
    
     Carta c=null ;
    // inicializar la lista de objetos
    List<Carta> lstCartas = new ArrayList<Carta>();

    // creo un objeto en el constructor
    public AdminCarta() {
        
          this.lstCartas.add(new Carta(null,"PROYECTO CONGA", "10/10/2012", "34567865", "EN PROCESO",null));
     
    }

   
    // Metodo para agregar una tarea
    public Carta agregarTarea(Usuario user, String asunto, String fecha, String dni, String comentario, ArrayList<Carta> tareas){
        c = new Carta();
        
        c.setAsunto(asunto);
        c.setFechaVcmto(fecha);
        c.setComentario(comentario);
        c.setResponsable(user);
 
        c.setStatus(null);
        c.setInvitados(null);
        
     return c;
    }
    
}
