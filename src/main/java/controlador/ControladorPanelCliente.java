package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Paquete;
import modelo.VentanaUtils;
import vista.ViewPanelCliente;

public class ControladorPanelCliente implements ActionListener {

    ViewPanelCliente panelCliente;
    Paquete paquete;

    public ControladorPanelCliente(ViewPanelCliente panelCliente, Paquete paquete) {
        this.panelCliente = panelCliente;
        this.paquete = paquete;

        this.panelCliente.BtnEntregaPaquete.addActionListener(this);
        this.panelCliente.BtnHistorialEnvios.addActionListener(this);
        this.panelCliente.BtnSeguimientoPaquete.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(panelCliente, "Panel Cliente");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelCliente.BtnEntregaPaquete) {
            JOptionPane.showMessageDialog(null, "Paquete");
        }
        if (e.getSource() == panelCliente.BtnHistorialEnvios) {
            JOptionPane.showMessageDialog(null, "Historial");

        }
        if (e.getSource() == panelCliente.BtnSeguimientoPaquete) {
            JOptionPane.showMessageDialog(null, "Seguimiento");

        }

    }

}
