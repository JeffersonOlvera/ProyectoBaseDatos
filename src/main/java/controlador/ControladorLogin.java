package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import vista.ViewLogin;
import modelo.GestionUsuarios;
import modelo.Paquete;
import modelo.VentanaUtils;
import vista.ViewRegistroCliente;
import vista.ViewRegistroConductor;
import vista.ViewSeleccionUsuario;
import vista.PanelCliente;
import vista.PanelConductor;

public class ControladorLogin implements ActionListener {

    private ViewLogin login = new ViewLogin();
    private GestionUsuarios gestionUsuarios = new GestionUsuarios();
    private ViewSeleccionUsuario seleccionUsuario = new ViewSeleccionUsuario();
    private final PanelCliente panelCliente = new PanelCliente();
    private final Paquete paquete = new Paquete();
    private final PanelConductor panelConductor = new PanelConductor();
    private final ViewRegistroConductor registroConductor = new ViewRegistroConductor();
    private final ViewRegistroCliente registroCliente = new ViewRegistroCliente();

    public ControladorLogin(ViewLogin login, GestionUsuarios gestionUsuarios, ViewSeleccionUsuario seleccionUsuario) {
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
        String contrasenia = login.txtContrasena.getText();

        String tipoUsuario = GestionUsuarios.autentificacionUsuario(correo, contrasenia);

        return tipoUsuario;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Boton de inicio de sesion
        if (e.getSource() == login.btnLogin) {

            String tipoUsuario = login();
            if (tipoUsuario != null) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso como " + tipoUsuario);

                // Inicio como Cliente
                if (tipoUsuario.equalsIgnoreCase("cliente")) {
                    VentanaUtils.cerrarVentana(login);
                    ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(panelCliente);
                    controladorPanelCliente.run();
                } // Inicio como Conductor
                else if (tipoUsuario.equalsIgnoreCase("conductor")) {
                    VentanaUtils.cerrarVentana(login);
                    ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
                    controladorPanelConductor.run();
                }
            } // Credenciales incorrectos / incompletos
            else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
 
        }// Boton de registro
        if (e.getSource() == login.btnRegistro) {
            VentanaUtils.cerrarVentana(login);
            ControladorRegistro controladorRegistro = new ControladorRegistro(seleccionUsuario, registroConductor, registroCliente, gestionUsuarios);
            controladorRegistro.run();
        }
    }
}
