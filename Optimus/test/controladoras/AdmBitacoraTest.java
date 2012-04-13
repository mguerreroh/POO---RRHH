/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import controladoras.AdmBitacora;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mguerrero
 */
public class AdmBitacoraTest {
    AdmBitacora admBitacora = new AdmBitacora();
    
    @Test
    public void siNoingresoElcorrelativoDebeDarError(){
        assertFalse(admBitacora.validarCorrelativo(null));
        System.out.println("El correlativo no debe de estar vacio");
    }
    
    @Test
    public void siNoingresoLaFechaDebedarError(){
        assertFalse(admBitacora.validarFCrea(null));
        System.out.println("La fecha no debe de estar vacia");
    }
}
