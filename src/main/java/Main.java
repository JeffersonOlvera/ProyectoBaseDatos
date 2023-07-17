
import vista.*;
import controlador.*;
import modelo.*;

public class Main {

    public static void main(String args[]) {
        GestionUsuarios modelo = new GestionUsuarios();
        ViewPrincipal ventanaPrincipal = new ViewPrincipal();
        Inicio controlador = new Inicio(modelo, ventanaPrincipal);
        controlador.run();
        
    }
}
