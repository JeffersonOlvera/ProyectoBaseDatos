package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//Clases adsdad 
import modelo.Cliente;
import modelo.Conductor;
import modelo.GestionUsuarios;
import modelo.VentanaUtils;
import vista.SeleccionUsuario;
import vista.RegistroConductor;
import vista.RegistroCliente;

public class ControladorRegistro implements ActionListener {

    SeleccionUsuario seleccionUsuario;
    RegistroConductor registroConductor;
    RegistroCliente registroCliente;
    Cliente cliente;
    Conductor conductor;

    public ControladorRegistro(SeleccionUsuario seleccionUsuario, RegistroConductor registroConductor, RegistroCliente registroCliente) {
        this.seleccionUsuario = seleccionUsuario;
        this.registroConductor = registroConductor;
        this.registroCliente = registroCliente;

        this.seleccionUsuario.btnCliente.addActionListener(this);
        this.seleccionUsuario.btnConductor.addActionListener(this);
        this.registroConductor.btnRegistroConductor.addActionListener(this);
        this.registroCliente.btnRegistroCliente.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(seleccionUsuario, "Seleccion usuario");
    }

    public void registrarCliente() {
        cliente.setNombre(registroCliente.txtNombre.getText());
        cliente.setCorreo(registroCliente.txtCorreo.getText());
        cliente.setContrasena(registroCliente.txtContrasena1.getText());

        if (GestionUsuarios.registroCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } else {
            JOptionPane.showMessageDialog(null, "Registro exitoso");

        }
    }

    public void registrarConductor() {
        conductor.setNombre(registroConductor.txtNombre.getText());
        conductor.setCorreo(registroConductor.txtCorreo.getText());
        conductor.setContrasena(registroConductor.txtContrasena1.getText());
        conductor.setModeloCamion(registroConductor.txtModeloCamion.getText());
        conductor.setNumPlaca(registroConductor.txtMatricula.getText());

        if (GestionUsuarios.registroConductor(conductor)) {
            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } else {
            JOptionPane.showMessageDialog(null, "Registro exitoso");

        }
    }

    public boolean validacionContrasena(String contrasena1, String contrasena2) {
        if (contrasena1.equals(contrasena2)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return false;
        }
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
            String contrasena1 = registroConductor.txtContrasena1.getText();
            String contrasena2 = registroConductor.txtContrasena2.getText();
            while (validacionContrasena(contrasena1, contrasena2)) {
                registrarConductor();
            }
        }
        if (e.getSource() == registroCliente.btnRegistroCliente) {
            //Logica para el registro del cliente
            String contrasena1 = registroCliente.txtContrasena1.getText();
            String contrasena2 = registroCliente.txtContrasena2.getText();
            while (validacionContrasena(contrasena1, contrasena2)) {
                registrarCliente();
            }
        }

    }

}
