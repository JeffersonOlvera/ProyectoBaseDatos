package main;

import vista.*;
import controlador.*;
import modelo.*;

public class ClasePrincipal {

    private static int idUsuarioAutenticado = -1;

    public static void main(String args[]) {
        GestionUsuarios modelo = new GestionUsuarios();
        ViewPrincipal ventanaPrincipal = new ViewPrincipal();
        Inicio controlador = new Inicio(modelo, ventanaPrincipal);
        controlador.run();

    }

    // Getter para obtener el ID del usuario autenticado
    public static int getIdUsuarioAutenticado() {
        return idUsuarioAutenticado;
    }

    // Setter para establecer el ID del usuario autenticado
    public static void setIdUsuarioAutenticado(int idUsuario) {
        idUsuarioAutenticado = idUsuario;
    }
}
