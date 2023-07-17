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
import vista.ViewPanelCliente;
import vista.ViewPanelConductor;

public class ControladorLogin implements ActionListener {

    ViewLogin login;
    GestionUsuarios gestionUsuarios;
    ViewSeleccionUsuario seleccionUsuario;
    ViewPanelCliente panelCliente;

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

                    Paquete paquete = new Paquete();
                    ViewPanelCliente panelCliente = new ViewPanelCliente();
                    ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(panelCliente, paquete);
                    controladorPanelCliente.run();

                } else if (tipoUsuario.equalsIgnoreCase("conductor")) {
                    VentanaUtils.cerrarVentana(login);
                    
                    Paquete paquete = new Paquete();
                    ViewPanelConductor panelConductor = new ViewPanelConductor();
                    ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor, paquete);
                    controladorPanelConductor.run();

                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        }
        //Boton de registro
        if (e.getSource() == login.btnRegistro) {
            VentanaUtils.cerrarVentana(login);

            ViewSeleccionUsuario seleccionUsuario = new ViewSeleccionUsuario();
            ViewRegistroConductor registroConductor = new ViewRegistroConductor();
            ViewRegistroCliente registroCliente = new ViewRegistroCliente();
            GestionUsuarios gestionUsuarios = new GestionUsuarios();
            ControladorRegistro controladorRegistro = new ControladorRegistro(seleccionUsuario, registroConductor, registroCliente, gestionUsuarios);
            controladorRegistro.run();
        }
    }
}
