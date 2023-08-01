package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Conductor;
import modelo.GestionUsuarios;
import modelo.Validaciones;
import modelo.VentanaUtils;
import vista.PanelCliente;
import vista.PanelConductor;
import vista.ViewSeleccionUsuario;
import vista.ViewRegistroConductor;
import vista.ViewRegistroCliente;

public class ControladorRegistro implements ActionListener {

    private ViewSeleccionUsuario seleccionUsuario = new ViewSeleccionUsuario();
    private ViewRegistroConductor registroConductor = new ViewRegistroConductor();
    private ViewRegistroCliente registroCliente = new ViewRegistroCliente();
    private GestionUsuarios gestionUsuarios = new GestionUsuarios();
    private final PanelCliente panelCliente = new PanelCliente();
    private final PanelConductor panelConductor = new PanelConductor();

    public ControladorRegistro(ViewSeleccionUsuario seleccionUsuario, ViewRegistroConductor registroConductor, ViewRegistroCliente registroCliente, GestionUsuarios gestionUsuarios) {
        this.seleccionUsuario = seleccionUsuario;
        this.registroConductor = registroConductor;
        this.registroCliente = registroCliente;
        this.gestionUsuarios = gestionUsuarios;

        this.seleccionUsuario.btnCliente.addActionListener(this);
        this.seleccionUsuario.btnConductor.addActionListener(this);
        this.registroConductor.BtnRegistroConductor.addActionListener(this);
        this.registroCliente.btnRegistroCliente.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(seleccionUsuario, "Seleccion usuario");
    }

    //Registro del Cliente
    public boolean registrarCliente() {
        Cliente cliente = new Cliente();

        cliente.setNombre(registroCliente.txtNombre.getText());
        cliente.setApellido(registroCliente.txtApellido.getText());
        cliente.setCorreo(registroCliente.txtCorreo.getText());
        cliente.setContrasena(registroCliente.txtContrasena.getText());

        if (Validaciones.verificarCorreoRegistrado(cliente.getCorreo())) {
            JOptionPane.showMessageDialog(null, "Ya existe una cuenta registrada con ese correo.");
        } else if (GestionUsuarios.registroCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente.");
        }
        return false;

    }

    //Registro del conductor 
    public boolean registrarConductor() {
        Conductor conductor = new Conductor();

        conductor.setNombre(registroConductor.txtNombre.getText());
        conductor.setApellido(registroConductor.txtApellido.getText());
        conductor.setCorreo(registroConductor.txtCorreo.getText());
        conductor.setModeloCamion(registroConductor.txtModeloCamion.getText());
        conductor.setNumPlaca(registroConductor.txtNumPlaca.getText());
        conductor.setContrasena(registroConductor.txtContrasena.getText());

        if (Validaciones.verificarCorreoRegistrado(conductor.getCorreo())) {
            JOptionPane.showMessageDialog(null, "Ya existe una cuenta registrada con ese correo.");
        } else if (Validaciones.verificarPlaca(conductor.getNumPlaca())) {
            JOptionPane.showMessageDialog(null, "Ya existe una cuenta registrada con ese num de placa.");
        } else if (GestionUsuarios.registroConductor(conductor)) {
            JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente.");
        }
        return false;
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
            String contrasena1 = registroCliente.txtContrasena.getText();
            String contrasena2 = registroCliente.txtContrasena2.getText();

            if (Validaciones.validacionContrasena(contrasena1, contrasena2)) {
                if (registrarCliente()) {
                    VentanaUtils.cerrarVentana(registroCliente);
                    ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(panelCliente);
                    controladorPanelCliente.run();
                }
            }
        }
        //Seleccion usuario conductor
        if (e.getSource() == seleccionUsuario.btnConductor) {
            VentanaUtils.cerrarVentana(seleccionUsuario);
            VentanaUtils.mostrarVentana(registroConductor, "Registro Conductor");

        }
        //Logica para el registro del conductor
        if (e.getSource() == registroConductor.BtnRegistroConductor) {
            String contrasena1 = registroConductor.txtContrasena.getText();
            String contrasena2 = registroConductor.txtContrasena2.getText();
            if (Validaciones.validacionContrasena(contrasena1, contrasena2)) {
                if (registrarConductor()) {
                    VentanaUtils.cerrarVentana(registroConductor);
                    ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
                    controladorPanelConductor.run();
                }
            }
        }
    }

}
