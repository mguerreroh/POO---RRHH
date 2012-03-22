/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author EDGE XIII
 */
public class TareasGenerales {
    private String codModulo = "TARGEN";
    private String responsable;
    private String asunto;
    private String fechaVcmto;
    private String comentario;
    private String status;
    private int correlativo;
    private String invitados;

    public TareasGenerales(String responsable, String asunto, String fechaVcmto, String comentario, String status, int correlativo, String invitados) {
        this.responsable = responsable;
        this.asunto = asunto;
        this.fechaVcmto = fechaVcmto;
        this.comentario = comentario;
        this.status = status;
        this.correlativo = correlativo;
        this.invitados = invitados;
    }
    
    public TareasGenerales(){
        
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCodModulo() {
        return codModulo;
    }

       public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public String getFechaVcmto() {
        return fechaVcmto;
    }

    public void setFechaVcmto(String fechaVcmto) {
        this.fechaVcmto = fechaVcmto;
    }

    public String getInvitados() {
        return invitados;
    }

    public void setInvitados(String invitados) {
        this.invitados = invitados;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
