package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Cliente;
import modelo.Conductor;
import modelo.UsuarioDAO;
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
    private UsuarioDAO gestionUsuarios = new UsuarioDAO();
    private final PanelCliente panelCliente = new PanelCliente();
    private final PanelConductor panelConductor = new PanelConductor();

    public ControladorRegistro(ViewSeleccionUsuario seleccionUsuario, ViewRegistroConductor registroConductor, ViewRegistroCliente registroCliente, UsuarioDAO gestionUsuarios) {
        this.seleccionUsuario = seleccionUsuario;
        this.registroConductor = registroConductor;
        this.registroCliente = registroCliente;
        this.gestionUsuarios = gestionUsuarios;

        this.seleccionUsuario.btnCliente.addActionListener(this);
        this.seleccionUsuario.btnConductor.addActionListener(this);
        this.registroConductor.BtnRegistroConductor.addActionListener(this);
        this.registroCliente.btnRegistroCliente.addActionListener(this);

        // Aplicando el limites de caracteres 
        Validaciones.aplicarLimitadorDeLongitud(registroConductor.txtModeloCamion, 100);
        Validaciones.aplicarLimitadorDeLongitud(registroConductor.txtNumPlaca, 8);
        Validaciones.aplicarLimitadorDeLongitud(registroConductor.txtContrasena, 20);
        Validaciones.aplicarLimitadorDeLongitud(registroConductor.txtContrasena2, 20);
        Validaciones.aplicarLimitadorDeLongitud(registroCliente.txtContrasena, 20);
        Validaciones.aplicarLimitadorDeLongitud(registroCliente.txtContrasena2, 20);

    }

    //Registro del Cliente
    public boolean registrarCliente() {
        Cliente cliente = new Cliente();

        cliente.setNombre(registroCliente.txtNombre.getText());
        cliente.setApellido(registroCliente.txtApellido.getText());
        cliente.setCorreo(registroCliente.txtCorreo.getText());
        cliente.setContrasena(registroCliente.txtContrasena.getText());
        String contrasenia = cliente.getContrasena();
        String contrasenia2 = registroCliente.txtContrasena2.getText();

        if (clienteNoVacio(cliente)) {
            if ((Validaciones.validacionContrasena(contrasenia, contrasenia2))) {
                if (Validaciones.verificarCorreoRegistrado(cliente.getCorreo())) {
                    JOptionPane.showMessageDialog(null, "Ya existe una cuenta registrada con ese correo.");
                } else if (UsuarioDAO.registroCliente(cliente)) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el cliente.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete el formulario");
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
        String contrasenia = conductor.getContrasena();
        String contrasenia2 = registroConductor.txtContrasena2.getText();

        if (conductorNoVacio(conductor)) {
            if ((Validaciones.validacionContrasena(contrasenia, contrasenia2))) {
                if (Validaciones.verificarCorreoRegistrado(conductor.getCorreo())) {
                    JOptionPane.showMessageDialog(null, "Ya existe una cuenta registrada con ese correo.");
                } else if (Validaciones.verificarPlaca(conductor.getNumPlaca())) {
                    JOptionPane.showMessageDialog(null, "Ya existe una cuenta registrada con ese num de placa.");
                } else if (UsuarioDAO.registroConductor(conductor)) {
                    JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el cliente.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete el formulario");
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
            if (registrarCliente()) {
                VentanaUtils.cerrarVentana(registroCliente);
                ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(panelCliente);
                controladorPanelCliente.run();
            }

        }
        //Seleccion usuario conductor
        if (e.getSource() == seleccionUsuario.btnConductor) {
            VentanaUtils.cerrarVentana(seleccionUsuario);
            VentanaUtils.mostrarVentana(registroConductor, "Registro Conductor");

        }
        //Logica para el registro del conductor
        if (e.getSource() == registroConductor.BtnRegistroConductor) {
            if (registrarConductor()) {
                VentanaUtils.cerrarVentana(registroConductor);
                ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
                controladorPanelConductor.run();
            }
        }
    }

    public void run() {
        VentanaUtils.mostrarVentana(seleccionUsuario, "Seleccion usuario");
    }

    public boolean clienteNoVacio(Cliente cliente) {
        return !"".equals(cliente.getNombre()) && !"".equals(cliente.getApellido())
                && !"".equals(cliente.getCorreo()) && !"".equals(cliente.getContrasena());
    }

    public boolean conductorNoVacio(Conductor conductor) {
        return !"".equals(conductor.getNombre()) && !"".equals(conductor.getApellido())
                && !"".equals(conductor.getCorreo()) && !"".equals(conductor.getModeloCamion())
                && !"".equals(conductor.getNumPlaca()) && !"".equals(conductor.getContrasena());
    }

    // funcion que recibe el textfield y el maximo de caracteres permitidos
}
