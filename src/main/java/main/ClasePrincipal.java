package main;

import vista.*;
import controlador.*;
import modelo.*;

public class ClasePrincipal {

    private static int idUsuarioAutenticado = -1;
    private static String nombreUsuario = "";
    
    public static void main(String args[]) {
        UsuarioDAO modelo = new UsuarioDAO();
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

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario) {
        ClasePrincipal.nombreUsuario = nombreUsuario;
    }
    

}
