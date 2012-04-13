
package controladoras;

import java.util.ArrayList;
import java.util.List;
import modelos.TareasGenerales;
import modelos.Usuario;


public class AdmTareasGenerales {
    // creo el objeto en nulo
    TareasGenerales tg=null ;
    // inicializar la lista de objetos
    List<TareasGenerales> lstTareasGenerales = new ArrayList<TareasGenerales>();

    // creo un objeto en el constructor
    public AdmTareasGenerales() {
        
          this.lstTareasGenerales.add(new TareasGenerales(null,"PROYECTO CONGA", "10/10/2012", "34567865", "EN PROCESO",null));
     
    }

   
    // Metodo para agregar una tarea
    public TareasGenerales agregarTarea(Usuario user, String asunto, String fecha, String dni, String comentario, ArrayList<TareasGenerales> tareas){
        tg = new TareasGenerales();
        tg.setAsunto(asunto);
        tg.setFechaVcmto(fecha);
        tg.setComentario(comentario);
        tg.setResponsable(user);
        tg.setStatus(null);
        tg.setInvitados(null);
        
     return tg;
    }
}
