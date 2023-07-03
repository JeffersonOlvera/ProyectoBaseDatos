package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import vista.Login;
import modelo.GestionUsuarios;
import modelo.VentanaUtils;
import vista.RegistroCliente;
import vista.RegistroConductor;
import vista.SeleccionUsuario;
import vista.PanelCliente;
import vista.PanelConductor;

public class ControladorLogin implements ActionListener {

    Login login;
    GestionUsuarios gestionUsuarios;
    SeleccionUsuario seleccionUsuario;
    PanelCliente panelCliente;

    public ControladorLogin(Login login, GestionUsuarios gestionUsuarios, SeleccionUsuario seleccionUsuario) {
        this.login = login;
        this.gestionUsuarios = gestionUsuarios;
        this.seleccionUsuario = seleccionUsuario;

        this.login.btnLogin.addActionListener(this);
        this.login.btnRegistro.addActionListener(this);

    }

    public void run() {
        VentanaUtils.mostrarVentana(login, "Login");
    }

    public String login() {
        String correo = login.txtCorreo.getText();
        String contrasena = login.txtContrasena.getText();

        String tipoUsuario = GestionUsuarios.autentificacionUsuario(correo, contrasena);
        return tipoUsuario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton de inicio de sesion
        if (e.getSource() == login.btnLogin) {
            String tipoUsuario = login();
            if (tipoUsuario != null) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso como " + tipoUsuario);
                if (tipoUsuario.equalsIgnoreCase("cliente")) {
                    VentanaUtils.cerrarVentana(login);
                    PanelCliente panelCliente = new PanelCliente();
                    VentanaUtils.mostrarVentana(panelCliente, "Panel Conductor");
                } else if (tipoUsuario.equalsIgnoreCase("conductor")) {
                    VentanaUtils.cerrarVentana(login);
                    PanelConductor panelConductor = new PanelConductor();
                    VentanaUtils.mostrarVentana(panelConductor, "Panel Conductor");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        }
        //Boton de registro
        if (e.getSource() == login.btnRegistro) {
            VentanaUtils.cerrarVentana(login);

            SeleccionUsuario seleccionUsuario = new SeleccionUsuario();
            RegistroConductor registroConductor = new RegistroConductor();
            RegistroCliente registroCliente = new RegistroCliente();
            GestionUsuarios gestionUsuarios = new GestionUsuarios();
            ControladorRegistro controladorRegistro = new ControladorRegistro(seleccionUsuario, registroConductor, registroCliente, gestionUsuarios);
            controladorRegistro.run();
        }
    }
}
