
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;
import modelos.Modulo;



public class ModuloTest {
    
   public ModuloTest() {
    }
    
   @Test
    public void moduloDebeCrearseConDniNombreyClave(){
        System.out.println("Modulo debe crearse con nombreModulo, acceso, adicionar, editar y eliminar");

        String nombre="Administracion de Roles";
        boolean acceso = false;
        boolean adicionar = false;
        boolean editar = false;
        boolean eliminar = false;
        // Act
        // Ejecutar el metodo a probar
        Modulo modulo = new Modulo(nombre, acceso, adicionar, editar, eliminar);
        // Assert
        // Comprobar que el el resultado esperado es igual al retornado
        assertNotNull(nombre);
        assertEquals(nombre, modulo.getNombre());
        assertEquals(acceso, modulo.getAcceso());
        assertEquals(adicionar, modulo.getAdiccionar());
        assertEquals(editar, modulo.getEditar());
        assertEquals(eliminar, modulo.getEliminar());
    }
    
}
