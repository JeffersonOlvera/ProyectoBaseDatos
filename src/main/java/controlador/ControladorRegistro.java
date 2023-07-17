package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Conductor;
import modelo.GestionUsuarios;
import modelo.VentanaUtils;
import vista.ViewPanelCliente;
import vista.ViewPanelConductor;
import vista.ViewSeleccionUsuario;
import vista.ViewRegistroConductor;
import vista.ViewRegistroCliente;

public class ControladorRegistro implements ActionListener {

    ViewSeleccionUsuario seleccionUsuario;
    ViewRegistroConductor registroConductor;
    ViewRegistroCliente registroCliente;
    GestionUsuarios gestionUsuarios;
    ViewPanelCliente panelCliente;
    ViewPanelConductor panelConductor;

    public ControladorRegistro(ViewSeleccionUsuario seleccionUsuario, ViewRegistroConductor registroConductor, ViewRegistroCliente registroCliente, GestionUsuarios gestionUsuarios) {
        this.seleccionUsuario = seleccionUsuario;
        this.registroConductor = registroConductor;
        this.registroCliente = registroCliente;
        this.gestionUsuarios = gestionUsuarios;

        this.seleccionUsuario.btnCliente.addActionListener(this);
        this.seleccionUsuario.btnConductor.addActionListener(this);
        this.registroConductor.btnRegistroConductor.addActionListener(this);
        this.registroCliente.btnRegistroCliente.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(seleccionUsuario, "Seleccion usuario");
    }

    //Registro del Cliente
    public void registrarCliente() {
        Cliente cliente = new Cliente();

        cliente.setNombre(registroCliente.txtNombre.getText());
        cliente.setCorreo(registroCliente.txtCorreo.getText());
        cliente.setContrasena(registroCliente.txtContrasena1.getText());

        if (GestionUsuarios.registroCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");

        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente.");
        }
    }

    //Registro del conductor 
    public void registrarConductor() {
        Conductor conductor = new Conductor();

        conductor.setNombre(registroConductor.txtNombre.getText());
        conductor.setCorreo(registroConductor.txtCorreo.getText());
        conductor.setContrasena(registroConductor.txtContrasena1.getText());
        conductor.setModeloCamion(registroConductor.txtModeloCamion.getText());
        conductor.setNumPlaca(registroConductor.txtMatricula.getText());

        if (GestionUsuarios.registroConductor(conductor)) {
            JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el conductor.");

        }
    }

    //Valida que las dos contraseñas sean iguale
    public boolean validacionContrasena(String contrasena1, String contrasena2) {
        if (contrasena1.equals(contrasena2)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return false;
        }
    }

    //Acciones de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        //Seleccion usuario cliente
        if (e.getSource() == seleccionUsuario.btnCliente) {
            VentanaUtils.cerrarVentana(seleccionUsuario);
            VentanaUtils.mostrarVentana(registroCliente, "Registro Cliente");

        }
        //Logica para el registro del cliente
        if (e.getSource() == registroCliente.btnRegistroCliente) {
            String contrasena1 = registroCliente.txtContrasena1.getText();
            String contrasena2 = registroCliente.txtContrasena2.getText();
            if (validacionContrasena(contrasena1, contrasena2)) {
                registrarCliente();
                VentanaUtils.cerrarVentana(registroCliente);
                ViewPanelCliente panelCliente = new ViewPanelCliente();
                VentanaUtils.mostrarVentana(panelCliente, "Panel Conductor");
            }
        }
        //Seleccion usuario conductor
        if (e.getSource() == seleccionUsuario.btnConductor) {
            VentanaUtils.cerrarVentana(seleccionUsuario);
            VentanaUtils.mostrarVentana(registroConductor, "Registro Conductor");

        }
        //Logica para el registro del conductor
        if (e.getSource() == registroConductor.btnRegistroConductor) {
            String contrasena1 = registroConductor.txtContrasena1.getText();
            String contrasena2 = registroConductor.txtContrasena2.getText();
            if (validacionContrasena(contrasena1, contrasena2)) {
                registrarConductor();
                VentanaUtils.cerrarVentana(registroConductor);
                ViewPanelConductor panelConductor = new ViewPanelConductor();
                VentanaUtils.mostrarVentana(panelConductor, "Panel Conductor");
            }
        }

    }

}
