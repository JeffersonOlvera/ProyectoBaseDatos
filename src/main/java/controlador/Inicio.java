package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Clases del modelo y vista utilizados
import modelo.GestionUsuarios;
import modelo.VentanaUtils;
import vista.Login;
import vista.RegistroCliente;
import vista.RegistroConductor;
import vista.SeleccionUsuario;
import vista.VentanaPrincipal;

public class Inicio implements ActionListener {

    GestionUsuarios modelo;
    VentanaPrincipal ventanaPrincipal;

    public Inicio(GestionUsuarios modelo, VentanaPrincipal ventanaPrincipal) {
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
            Login login = new Login();
            GestionUsuarios gestionUsuarios = new GestionUsuarios();
            SeleccionUsuario seleccionUsuario = new SeleccionUsuario();
            ControladorLogin controladorLogin = new ControladorLogin(login, gestionUsuarios, seleccionUsuario);
            controladorLogin.run();
        }
        if (e.getSource() == ventanaPrincipal.btnRegistro) {
            VentanaUtils.cerrarVentana(ventanaPrincipal);

            SeleccionUsuario seleccionUsuario = new SeleccionUsuario();
            RegistroConductor registroConductor = new RegistroConductor();
            RegistroCliente registroCliente = new RegistroCliente();
            GestionUsuarios gestionUsuarios = new GestionUsuarios();
            ControladorRegistro controladorRegistro = new ControladorRegistro(seleccionUsuario, registroConductor, registroCliente, gestionUsuarios);
            controladorRegistro.run();

        }
    }

}
