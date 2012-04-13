
package controladoras;

import java.util.ArrayList;
import java.util.List;
import modelos.Rol;
import modelos.TareasGenerales;
import modelos.Usuario;
import static org.junit.Assert.*;
import org.junit.Test;


public class TareasGeneralesTest {
 AdmTareasGenerales objAdminTareasGenerales = null;
 ArrayList<TareasGenerales> lstTareasGenerales = new ArrayList<TareasGenerales>();
 ArrayList<Usuario> users = new ArrayList<Usuario>();
 RolTest test= new RolTest();
 //test.crearRol();
 Rol rol_actual=test.getRolActual();
   
//    @Test
//    public  void creaUsers(){
//        users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo", null,"cargo",rol_actual));  
//        users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo", null,"cargo",rol_actual));
//        users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo", null,"cargo",rol_actual));
//        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo", null,"cargo",rol_actual));
//    }
  
    @Test
    public void crearTarea() {  
        users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual)); 
        users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
      
        Usuario resp=users.get(0);
        users.remove(0);
        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO",users);
        assertNotNull(tarea.getAsunto());
        System.out.println("Asunto de Tarea: "+tarea.getAsunto());
        assertNotNull(tarea.getComentario());
        System.out.println("Comentario de Tarea: "+tarea.getComentario());
        assertNotNull(tarea.getStatus());
        System.out.println("Estado de Tarea: "+tarea.getStatus());
        assertNotNull(tarea.getResponsable());      
        System.out.println("Responsable de Tarea: "+tarea.getResponsable().getNombre());  
//      assertNotNull(tarea.getInvitados());    
        System.out.println("Invitados: " +tarea.getInvitados().size());
        for(int a=0;a<tarea.getInvitados().size();a++){
            System.out.println("Los Invitados son: " +tarea.getInvitados().get(a).getNombre());
        }
        System.out.println("El rol actual es: "+users.get(0).getRol_actual());
    }
    
    @Test
    public void TestAdmin(){
       users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));  
       users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
       users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
       users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
      
       Usuario resp=users.get(0);
       users.remove(0);
    
//   llama a la clase controladora
//   AdmTareasGenerales  objAdminTareasGenerales = new AdmTareasGenerales();
        
       TareasGenerales tg1= new TareasGenerales(resp,"CREAR RESOLUCION MENSUAL","10/10/2012","Comentario","EN PROCESO",users);
       lstTareasGenerales.add(tg1);
       TareasGenerales tg2= new TareasGenerales(resp,"PROYECTO CONGA","10/10/2012","Comentario","EN PROCESO",users);
       lstTareasGenerales.add(tg2);   
       System.out.println("-------------------------------------------------");
       System.out.println("Test: cantidadDeTareasIngresadas");
       System.out.println("-------------------------------------------------");
       System.out.println("Cantidad de Tareas ingresadas: " +lstTareasGenerales.size()+" tarea(s)");
       System.out.println("--- FIN TEST ---");
       System.out.println();
       System.out.println("-------------------------------------------------");
       System.out.println("Test: validarSiSeEstanGrabandoLosDatosCorrectamente");
       System.out.println("-------------------------------------------------");
       assertEquals(lstTareasGenerales.size(),2);                               //esta consultando si hay dos registros
       assertEquals(lstTareasGenerales.get(0).getAsunto(), "CREAR RESOLUCION MENSUAL");
       System.out.println("Datos agregados correctamente..");
       System.out.println("--- FIN TEST ---");
       System.out.println();
        
        
    }
    
    @Test
    public void campoAsuntoNoDebeEstaVacio(){
        users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual)); 
        users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
      
        Usuario resp=users.get(0);
        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","EN PROCESO",users);
        assertNotNull(tarea.getAsunto());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoAsuntoNoDebeEstarVacio");
        System.out.println("-------------------------------------------------");
        System.out.println("El Asunto es: "+tarea.getAsunto());
        System.out.println("--- FIN TEST ---");
        System.out.println();
        
    }
    
    @Test
    public void campoFechaVctoNoDebeEstaVacio(){
        users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual)); 
        users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
      
        Usuario resp=users.get(0);
        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","EN PROCESO",users);
        assertNotNull(tarea.getFechaVcmto());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoFechaVctoNoDebeEstarVacio");
        System.out.println("-------------------------------------------------");
        System.out.println("La fecha de vencimiento de la tarea es: "+tarea.getFechaVcmto());
        System.out.println("--- FIN TEST ---");
        System.out.println();
        
    }
    
    @Test
    public void campoResponsableNoDebeEstaVacio(){
        users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual)); 
        users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
      
        Usuario resp=users.get(0);
        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","EN PROCESO",users);
        assertNotNull(tarea.getResponsable());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: campoResponsableNoDebeEstaVacio");
        System.out.println("-------------------------------------------------");
        System.out.println("La fecha de vencimiento de la tarea es: "+tarea.getFechaVcmto());
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void siTareaFueAsignadaNoSePodráModificar(){
        users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual)); 
        users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
      
        Usuario resp=users.get(0);
        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","ASIGNADA",users);
        assertEquals("No se puede editar tarea, ya fue grabada", tarea.noSePuedeEditarTarea());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: siTareaFueAsignadaNoSePodráModificar ");
        System.out.println("-------------------------------------------------");
        System.out.println("El Status de la tarea es: "+tarea.getStatus());
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void siTareaNoFueAsignadaSePodraModificar(){
        users.add(new Usuario("45074193","Juan","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual)); 
        users.add(new Usuario("87074393","Jose","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("67023343","Pedro","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
        users.add(new Usuario("12071193","Carlos","apellidoPaterno","apellidoMaterno","usuario","password","correo",null,"cargo",rol_actual));
      
        Usuario resp=users.get(0);
        TareasGenerales tarea = new TareasGenerales(resp,"PROYECTO MARCONI","10/10/2012","Comentario","ASIGN",users);
        assertNotSame("No se puede editar tarea, ya fue grabada", tarea.noSePuedeEditarTarea());
        System.out.println("-------------------------------------------------");
        System.out.println("Test: siTareaNoFueAsignadaSePodraModificar ");
        System.out.println("-------------------------------------------------");
        System.out.println("El Status de la tarea es: "+tarea.getStatus());
        System.out.println("--- FIN TEST ---");
        System.out.println();
    }
    
    @Test
    public void Test6(){
        
    }
    
    @Test
    public void Test7(){
        
    }
    
}
