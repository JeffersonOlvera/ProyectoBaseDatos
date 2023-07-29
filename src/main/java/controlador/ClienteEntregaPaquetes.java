package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewEntregaPaquete.BtnCancelar) {
            VentanaUtils.cerrarVentana(viewEntregaPaquete);
            menu();
        }
        if (e.getSource() == viewEntregaPaquete.BtnSiguiente) {
            VentanaUtils.cerrarVentana(viewEntregaPaquete);
            VentanaUtils.mostrarVentana(viewEntregaPaquete2, "Entrega Paquete");

        } else if (e.getSource() == viewEntregaPaquete2.BtnCancelar) {
            VentanaUtils.cerrarVentana(viewEntregaPaquete2);
            VentanaUtils.mostrarVentana(viewEntregaPaquete, "Entrega Paquete");

        } else if (e.getSource() == viewEntregaPaquete2.BtnSiguiente) {
            VentanaUtils.cerrarVentana(viewEntregaPaquete2);
            VentanaUtils.mostrarVentana(viewMetodoPago, "Metodo Pago");

        } else if (e.getSource() == viewMetodoPago.BtnSiguiente) {
            VentanaUtils.cerrarVentana(viewMetodoPago);
            VentanaUtils.mostrarVentana(viewMetodoPago2, "Metodo Pago");
        } else if (e.getSource() == viewMetodoPago2.BtnConfirmar) {
            VentanaUtils.cerrarVentana(viewMetodoPago2);
            menu();
        }

    }
}
