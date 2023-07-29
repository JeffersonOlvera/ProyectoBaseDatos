package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.VentanaUtils;
import vista.ClientFactura;
import vista.PanelCliente;
import vista.ClientHistorial;

public class ClienteHistorialEnvio implements ActionListener {

    ClientFactura viewFactura = new ClientFactura();
    ClientHistorial viewHistorial = new ClientHistorial();
    PanelCliente panelCliente = new PanelCliente();

    public ClienteHistorialEnvio(ClientFactura viewFactura, ClientHistorial viewSeguimientoP) {
        this.viewFactura = viewFactura;
        this.viewHistorial = viewSeguimientoP;

        this.viewFactura.BtnMenu.addActionListener(this);
        this.viewHistorial.BtnGenerarFactura.addActionListener(this);
        this.viewHistorial.BtnCancelar.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(viewHistorial, "Menu - Cliente");

    }

    public void menu() {
        ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(panelCliente);
        controladorPanelCliente.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewHistorial.BtnCancelar) {
           VentanaUtils.cerrarVentana(viewHistorial);
           menu();
        }
        if (e.getSource() == viewHistorial.BtnGenerarFactura) {
            VentanaUtils.cerrarVentana(viewHistorial);
            VentanaUtils.mostrarVentana(viewFactura, "Generar Factura");
        } 
        if (e.getSource() == viewFactura.BtnMenu) {
            VentanaUtils.cerrarVentana(viewFactura);
            menu();
        }
    }
}
