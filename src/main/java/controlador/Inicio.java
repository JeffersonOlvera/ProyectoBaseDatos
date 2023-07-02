package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//Clases del modelo y vista utilizados
import modelo.GestionUsuarios;
import modelo.VentanaUtils;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaPrincipal.btnLogin) {
            VentanaUtils.cerrarVentana(ventanaPrincipal);
            JOptionPane.showMessageDialog(null, "Se abre ventana de inicio de sesión");

        }
        if (e.getSource() == ventanaPrincipal.btnRegistro) {
            
            VentanaUtils.cerrarVentana(ventanaPrincipal);
            
            SeleccionUsuario seleccionUsuario = new SeleccionUsuario();
            RegistroConductor registroConductor = new RegistroConductor();
            RegistroCliente registroCliente = new RegistroCliente();
            ControladorRegistro controladorRegistro = new ControladorRegistro(seleccionUsuario, registroConductor, registroCliente);
            controladorRegistro.run();
            
        }
    }

}
