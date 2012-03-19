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

    
    
}
