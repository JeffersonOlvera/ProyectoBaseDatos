package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Clases del modelo y vista utilizados
import modelo.GestionUsuarios;
import modelo.VentanaUtils;
import vista.ViewLogin;
import vista.ViewRegistroCliente;
import vista.ViewRegistroConductor;
import vista.ViewSeleccionUsuario;
import vista.ViewPrincipal;

public class Inicio implements ActionListener {

    GestionUsuarios modelo;
    ViewPrincipal ventanaPrincipal;

    public Inicio(GestionUsuarios modelo, ViewPrincipal ventanaPrincipal) {
        this.modelo = modelo;
        this.ventanaPrincipal = ventanaPrincipal;
        //Botones
        this.ventanaPrincipal.btnLogin.addActionListener(this);
        this.ventanaPrincipal.btnRegistro.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(ventanaPrincipal, "Venta Principal");
    }

    //Acciones de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaPrincipal.btnLogin) {
            VentanaUtils.cerrarVentana(ventanaPrincipal);
            ViewLogin login = new ViewLogin();
            GestionUsuarios gestionUsuarios = new GestionUsuarios();
            ViewSeleccionUsuario seleccionUsuario = new ViewSeleccionUsuario();
            ControladorLogin controladorLogin = new ControladorLogin(login, gestionUsuarios, seleccionUsuario);
            controladorLogin.run();
        }
        if (e.getSource() == ventanaPrincipal.btnRegistro) {
            VentanaUtils.cerrarVentana(ventanaPrincipal);

            ViewSeleccionUsuario seleccionUsuario = new ViewSeleccionUsuario();
            ViewRegistroConductor registroConductor = new ViewRegistroConductor();
            ViewRegistroCliente registroCliente = new ViewRegistroCliente();
            GestionUsuarios gestionUsuarios = new GestionUsuarios();
            ControladorRegistro controladorRegistro = new ControladorRegistro(seleccionUsuario, registroConductor, registroCliente, gestionUsuarios);
            controladorRegistro.run();

        }
    }

}
