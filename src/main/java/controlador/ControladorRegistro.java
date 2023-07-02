package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//Clases adsdad 
import modelo.VentanaUtils;
import vista.SeleccionUsuario;
import vista.RegistroConductor;
import vista.RegistroCliente;

public class ControladorRegistro implements ActionListener {

    SeleccionUsuario seleccionUsuario;
    RegistroConductor registroConductor;
    RegistroCliente registroCliente;

    public ControladorRegistro(SeleccionUsuario SeleccionUsuario, RegistroConductor RegistroConductor, RegistroCliente RegistroCliente) {
        this.seleccionUsuario = SeleccionUsuario;
        this.registroConductor = RegistroConductor;
        this.registroCliente = RegistroCliente;

        this.seleccionUsuario.btnCliente.addActionListener(this);
        this.seleccionUsuario.btnConductor.addActionListener(this);
        this.registroConductor.btnRegistroConductor.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(seleccionUsuario, "Seleecion usuario");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == seleccionUsuario.btnCliente) {
            VentanaUtils.cerrarVentana(seleccionUsuario);
            VentanaUtils.mostrarVentana(registroCliente, "Registro Cliente");

        }
        if (e.getSource() == seleccionUsuario.btnConductor) {
            VentanaUtils.cerrarVentana(seleccionUsuario);
            VentanaUtils.mostrarVentana(registroConductor, "Registro Conductor");

        }
        if (e.getSource() == registroConductor.btnRegistroConductor) {
            //Logica para el registro del conductor

            JOptionPane.showMessageDialog(null, "Assdada");
        }

    }

}
