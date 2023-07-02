
import vista.*;
import controlador.*;
import modelo.*;

public class Main {

    public static void main(String args[]) {
        GestionUsuarios modelo = new GestionUsuarios();
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        Inicio controlador = new Inicio(modelo, ventanaPrincipal);
        controlador.run();
        
    }
}
