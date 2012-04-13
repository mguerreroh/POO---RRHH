/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.sql.Date;
import java.util.ArrayList;
import modelos.Bitacora;

/**
 *
 * @author HP
 */
public class AdmBitacora {
    private ArrayList<Bitacora> dbbitacora = new ArrayList<Bitacora>();
    
    
    public boolean validarCorrelativo(Integer correlativo){
        if(correlativo != null){
            return true;
        }
        return false;
    }
    
    public boolean validarUsCrea(String usCrea){
        if (usCrea != null){
            return true;
        }
        return false;
    }
    
    public boolean validarFCrea(Date fCrea){
        if (fCrea != null){
            return true;
        }
        return false;
    }
    
}
