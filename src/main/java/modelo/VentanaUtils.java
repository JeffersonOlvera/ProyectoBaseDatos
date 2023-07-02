
package modelo;

import javax.swing.JFrame;

public class VentanaUtils {
   public static void mostrarVentana(JFrame ventana, String titulo) {
        ventana.setTitle(titulo);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    } 
   
   public static void cerrarVentana(JFrame ventana){
       ventana.dispose();
   }
}
