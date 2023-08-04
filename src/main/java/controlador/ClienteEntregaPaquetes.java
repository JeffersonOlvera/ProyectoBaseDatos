package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Destinatario;
import modelo.Envios;
import modelo.Remitente;
import modelo.VentanaUtils;
import vista.ClientEntregaPaquete;
import vista.ClientEntregaPaquete2;
import vista.ClientMetPago;
import vista.ClientMetPago2;
import vista.PanelCliente;

public class ClienteEntregaPaquetes implements ActionListener {

    PanelCliente viewPanelCliente = new PanelCliente();
    ClientEntregaPaquete viewEntregaPaquete = new ClientEntregaPaquete();
    ClientEntregaPaquete2 viewEntregaPaquete2 = new ClientEntregaPaquete2();
    ClientMetPago viewMetodoPago = new ClientMetPago();
    ClientMetPago2 viewMetodoPago2 = new ClientMetPago2();

    public ClienteEntregaPaquetes(ClientEntregaPaquete viewEntegaPaquete, ClientEntregaPaquete2 viewEntregaPaquete2) {
        this.viewEntregaPaquete = viewEntegaPaquete;
        this.viewEntregaPaquete2 = viewEntregaPaquete2;

        this.viewEntregaPaquete.BtnSiguiente.addActionListener(this);
        this.viewEntregaPaquete.BtnCancelar.addActionListener(this);
        this.viewEntregaPaquete2.BtnSiguiente.addActionListener(this);
        this.viewEntregaPaquete2.BtnCancelar.addActionListener(this);
        this.viewMetodoPago.BtnSiguiente.addActionListener(this);
        this.viewMetodoPago2.BtnConfirmar.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(viewEntregaPaquete, "Entrega Paquete");
    }

    public void menu() {
        ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(viewPanelCliente);
        controladorPanelCliente.run();
    }

    public Remitente obtenerDatosRemitente() {
        Remitente remitente = new Remitente();

        remitente.setNombre(viewEntregaPaquete.txtNombre.getText());
        remitente.setApellido(viewEntregaPaquete.txtApellido.getText());
        remitente.setTelefono(viewEntregaPaquete.txtTelefono.getText());
        remitente.setCedula(viewEntregaPaquete.txtCedula.getText());
        remitente.setDireccionP(viewEntregaPaquete.txtDireccionP.getText());
        remitente.setDireccionS(viewEntregaPaquete.txtDireccionS.getText());
        remitente.setCorreo(viewEntregaPaquete.txtCorreo.getText());
        remitente.setDescripcion(viewEntregaPaquete.txtDescripcion.getText());

        return remitente;
    }

    public Destinatario obtenerDatosDestinatario() {
        Destinatario destinatario = new Destinatario();

        destinatario.setNombre(viewEntregaPaquete2.txtNombre.getText());
        destinatario.setApellido(viewEntregaPaquete2.txtApellido.getText());
        destinatario.setTelefono(viewEntregaPaquete2.txtTelefono.getText());
        destinatario.setDireccionP(viewEntregaPaquete2.txtDireccionP.getText());
        destinatario.setDireccionS(viewEntregaPaquete2.txtDireccionS.getText());
        destinatario.setCorreo(viewEntregaPaquete2.txtCorreo.getText());

        return destinatario;
    }

    public void realizarEnvio() {
        Remitente remitente = obtenerDatosRemitente();
        Destinatario destinatario = obtenerDatosDestinatario();
        int idCamionAleatorio = Envios.obtenerIdCamionAleatorio();
        Envios.entregarPaquete(remitente, destinatario, idCamionAleatorio);
        
    }

    public boolean remitenteNoVacio(Remitente remitente) {
        return !"".equals(remitente.getNombre()) && !"".equals(remitente.getApellido()) && !"".equals(remitente.getTelefono())
                && !"".equals(remitente.getCedula()) && !"".equals(remitente.getDireccionP()) && !"".equals(remitente.getDireccionS())
                && !"".equals(remitente.getCorreo()) && !"".equals(remitente.getDescripcion());
    }

    public boolean destinatarioNoVacio(Destinatario destinatario) {
        return !"".equals(destinatario.getNombre()) && !"".equals(destinatario.getApellido()) && !"".equals(destinatario.getTelefono())
                && !"".equals(destinatario.getDireccionP()) && !"".equals(destinatario.getDireccionS())
                && !"".equals(destinatario.getCorreo());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewEntregaPaquete.BtnCancelar) {
            VentanaUtils.cerrarVentana(viewEntregaPaquete);
            menu();
        }
        if (e.getSource() == viewEntregaPaquete.BtnSiguiente) {
            Remitente remitente = obtenerDatosRemitente();
            if (remitenteNoVacio(remitente)) {
                VentanaUtils.cerrarVentana(viewEntregaPaquete);
                VentanaUtils.mostrarVentana(viewEntregaPaquete2, "Entrega Paquete");
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }

        } else if (e.getSource() == viewEntregaPaquete2.BtnCancelar) {
            VentanaUtils.cerrarVentana(viewEntregaPaquete2);
            VentanaUtils.mostrarVentana(viewEntregaPaquete, "Entrega Paquete");

        } else if (e.getSource() == viewEntregaPaquete2.BtnSiguiente) {
            Destinatario destinatario = obtenerDatosDestinatario();
            if (destinatarioNoVacio(destinatario)) {
                VentanaUtils.cerrarVentana(viewEntregaPaquete2);
                VentanaUtils.mostrarVentana(viewMetodoPago, "Metodo Pago");
            }  else{
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }

        } else if (e.getSource() == viewMetodoPago.BtnSiguiente) {
            VentanaUtils.cerrarVentana(viewMetodoPago);
            VentanaUtils.mostrarVentana(viewMetodoPago2, "Metodo Pago");
        } else if (e.getSource() == viewMetodoPago2.BtnConfirmar) {
            realizarEnvio();

            VentanaUtils.cerrarVentana(viewMetodoPago2);
            menu();
        }

    }
}
