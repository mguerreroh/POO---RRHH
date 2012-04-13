/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EDGE XIII
 */
public class TareasGenerales {

    private Usuario responsable;
    private String asunto;
    private String fechaVcmto;
    private String comentario;
    private String status;

   
      private ArrayList<Usuario> Invitados = new ArrayList<Usuario>();

 

    public TareasGenerales(Usuario responsable, String asunto, String fechaVcmto, String comentario, String status, ArrayList<Usuario> users) {
        this.responsable = responsable;
        this.asunto = asunto;
        this.fechaVcmto = fechaVcmto;
        this.comentario = comentario;
        this.status = status;
<<<<<<< HEAD
//      for (int i=0; i<users.size();i++)
//           {
//      this.Invitados.add(users.get(i));
//      }
//     
=======
         for (int i=0; i<users.size();i++)
           {
       this.Invitados.add(users.get(i));
       }
     
>>>>>>> 56dbc6173fe50e8cc46c77393fc6ed41863bfc58
    }
    
    public TareasGenerales(){
        
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

      public void setInvitados(ArrayList<Usuario> Invitados) {
        this.Invitados = Invitados;
    }

    public ArrayList<Usuario> getInvitados() {
        return Invitados;
    }

       public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

   
    public String getFechaVcmto() {
        return fechaVcmto;
    }

    public void setFechaVcmto(String fechaVcmto) {
        this.fechaVcmto = fechaVcmto;
    }

    
    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String noSePuedeEditarTarea(){
        String stat = this.getStatus();
        if(stat == "ASIGNADA"){
           return "No se puede editar tarea, ya fue grabada"; 
        }
        return "";
    }
        
    
}
