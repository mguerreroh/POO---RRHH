/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;


public class Carta {
    
    
    private Usuario responsable;
    private String codigo; 
    private String asunto;
    private String fechaVcmto;
    private String comentario;
    private String status;
    private String Banco;
    private String Tipo;
    private double Importe;

    public String getBanco() {
        return Banco;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getImporte() {
        return Importe;
    }

    public String getSeleccion() {
        return Seleccion;
    }
     private String Seleccion;

   
      private ArrayList<Usuario> Invitados = new ArrayList<Usuario>();

 public Carta(){}

    public Carta(Usuario responsable, String asunto, String fechaVcmto, String comentario, String status, ArrayList<Usuario> users,String banco, Double importe,String tipo, String seleccion) {
        this.responsable = responsable;
        this.asunto = asunto;
        this.fechaVcmto = fechaVcmto;
        this.comentario = comentario;
        this.status = status;
        this.Banco=banco;
        this.Importe=importe;
        this.Tipo=tipo;
        this.Seleccion=seleccion;
        for (int i=0; i<users.size();i++){
            this.Invitados.add(users.get(i));
        }
     
    }
    
    public ArrayList<Usuario> getInvitados() {
        return Invitados;
    }

    public String getAsunto() {
        return asunto;
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

    public void setAsunto(String asunto) {
        this.asunto = asunto;
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
    
}
