/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;


public class Declaracion {
    
    
    private Usuario responsable;
    private String Cargo;
    private String Tipo;
    private String fechaAsump;
    private String fechaRef;
    private String fechaDoc;
    private String NroDoc;
    private String Publicacion;
    private String asunto;
    private String fechaVcmto;
    private String comentario;
    private String status;

   
    private ArrayList<Usuario> Invitados = new ArrayList<Usuario>();

    public Declaracion(){}

    public Declaracion(Usuario responsable, String asunto, String fechaVcmto, String comentario, String status, ArrayList<Usuario> users,String cargo,String doc,String publicacion,
            String asump,String fdoc,String ref) {
        this.responsable = responsable;
        
       
        this.fechaVcmto = fechaVcmto;
        this.comentario = comentario;
        this.status = status;
        this.Cargo= cargo;
        this.NroDoc=doc;
        this.Publicacion=publicacion;
        this.fechaAsump=asump;
        this.fechaDoc=fdoc;
        this.fechaRef=ref;
        this.asunto=asunto;
         for (int i=0; i<users.size();i++)
           {
       this.Invitados.add(users.get(i));
       }
     
    }
    
    
     public ArrayList<Usuario> getInvitados() {
        return Invitados;
    }

   

    public String getComentario() {
        return comentario;
    }

    public String getFechaVcmto() {
        return fechaVcmto;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public String getStatus() {
        return status;
    }

    public void setInvitados(ArrayList<Usuario> Invitados) {
        this.Invitados = Invitados;
    }

    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setFechaVcmto(String fechaVcmto) {
        this.fechaVcmto = fechaVcmto;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public void setStatus(String status) {
        this.status = status;
    }
      public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setNroDoc(String NroDoc) {
        this.NroDoc = NroDoc;
    }

    public void setPublicacion(String Publicacion) {
        this.Publicacion = Publicacion;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setFechaAsump(String fechaAsump) {
        this.fechaAsump = fechaAsump;
    }

    public void setFechaDoc(String fechaDoc) {
        this.fechaDoc = fechaDoc;
    }

    public void setFechaRef(String fechaRef) {
        this.fechaRef = fechaRef;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getNroDoc() {
        return NroDoc;
    }

    public String getPublicacion() {
        return Publicacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getFechaAsump() {
        return fechaAsump;
    }

    public String getFechaDoc() {
        return fechaDoc;
    }

    public String getFechaRef() {
        return fechaRef;
    }
  
}
