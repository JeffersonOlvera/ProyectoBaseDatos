package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.VentanaUtils;
import vista.ViewEntregaPaquete;
import vista.ViewEntregaPaquete2;
import vista.ViewMetodoPago;
import vista.ViewMetodoPago2;
import vista.ViewPanelCliente;

public class ControladorEntregaPaquetes implements ActionListener {

    ViewPanelCliente viewPanelCliente = new ViewPanelCliente();
    ViewEntregaPaquete viewEntregaPaquete = new ViewEntregaPaquete();
    ViewEntregaPaquete2 viewEntregaPaquete2 = new ViewEntregaPaquete2();
    ViewMetodoPago viewMetodoPago = new ViewMetodoPago();
    ViewMetodoPago2 viewMetodoPago2 = new ViewMetodoPago2();

    ;

    public ControladorEntregaPaquetes(ViewEntregaPaquete viewEntegaPaquete, ViewEntregaPaquete2 viewEntregaPaquete2) {
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
