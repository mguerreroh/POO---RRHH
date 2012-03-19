/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author mguerrero
 */
public class Bitacora {
    private Integer correlativo;
    private String usCrea;
    private Date fCrea;
    private String usModifica;
    private Date fModifica;
    private String codigoModulo = "ADMBIT";

    public Bitacora(Integer correlativo, String usCrea, Date fCrea, String usModifica, Date fModifica) {
        this.correlativo = correlativo;
        this.usCrea = usCrea;
        this.fCrea = fCrea;
        this.usModifica = usModifica;
        this.fModifica = fModifica;
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public Date getfCrea() {
        return fCrea;
    }

    public Date getfModifica() {
        return fModifica;
    }

    public String getUsCrea() {
        return usCrea;
    }

    public String getUsModifica() {
        return usModifica;
    }

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public void setfCrea(Date fCrea) {
        this.fCrea = fCrea;
    }

    public void setfModifica(Date fModifica) {
        this.fModifica = fModifica;
    }

    public void setUsCrea(String usCrea) {
        this.usCrea = usCrea;
    }

    public void setUsModifica(String usModifica) {
        this.usModifica = usModifica;
    }

    
    
}
