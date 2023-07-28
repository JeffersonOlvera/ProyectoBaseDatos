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

    private GestionUsuarios gestionUsuarios = new GestionUsuarios();
    private ViewPrincipal ventanaPrincipal = new ViewPrincipal();
    private ViewLogin login = new ViewLogin();
    private ViewSeleccionUsuario seleccionUsuario = new ViewSeleccionUsuario();
    private ViewRegistroConductor registroConductor = new ViewRegistroConductor();
    private ViewRegistroCliente registroCliente = new ViewRegistroCliente();

    public Inicio(GestionUsuarios gestionUsuarios, ViewPrincipal ventanaPrincipal) {
        this.gestionUsuarios = gestionUsuarios;
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
            ControladorLogin controladorLogin = new ControladorLogin(login, gestionUsuarios, seleccionUsuario);
            controladorLogin.run();
        }
        if (e.getSource() == ventanaPrincipal.btnRegistro) {
            VentanaUtils.cerrarVentana(ventanaPrincipal);
            ControladorRegistro controladorRegistro = new ControladorRegistro(seleccionUsuario, registroConductor, registroCliente, gestionUsuarios);
            controladorRegistro.run();

        }
    }

}
