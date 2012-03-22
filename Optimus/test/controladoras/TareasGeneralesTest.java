
package controladoras;

import java.util.ArrayList;
import java.util.List;
import modelos.TareasGenerales;
import static org.junit.Assert.*;
import org.junit.Test;


public class TareasGeneralesTest {
    AdmTareasGenerales objAdminTareasGenerales = null;
    List<TareasGenerales> lstTareasGenerales = new ArrayList<TareasGenerales>();

    public TareasGeneralesTest() {
        this.lstTareasGenerales.add(new TareasGenerales("34567865", "PROYECTO CONGA", "10/10/2012", "EN PROCESO", null, 0, null));

    }

    @Test
    public void testAgregarTarea() {
        
        // llama a la clase modelo
        TareasGenerales tg=new TareasGenerales();
        // llama a la clase controladora
        objAdminTareasGenerales = new AdmTareasGenerales();
        
        tg=objAdminTareasGenerales.agregarTarea("CREAR INFORME MENSUAL", "18/03/2012","42396377", "MUY URGENTE, ENTREGA RAPIDO");
        lstTareasGenerales.add(tg);
        tg=objAdminTareasGenerales.agregarTarea("CREAR RESOLUCION MENSUAL", "19/03/2012","12345678", "MUY URGENTE, PARA AYER RAPIDO");
        lstTareasGenerales.add(tg);        
        
        System.out.println("Tamano De la lista TareasGenerales " + lstTareasGenerales.size());
        assertEquals(lstTareasGenerales.size(), 3);
        assertEquals(lstTareasGenerales.get(0).getResponsable(), "34567865");
        assertEquals(lstTareasGenerales.get(0).getFechaVcmto(), "10/10/2012");
        assertEquals(lstTareasGenerales.get(1).getResponsable(), "42396377");
        assertEquals(lstTareasGenerales.get(2).getAsunto(), "CREAR RESOLUCION MENSUAL");
        System.out.println("Datos agregados correctamente..");

    }
}
