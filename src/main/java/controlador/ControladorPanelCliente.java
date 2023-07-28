package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Paquete;
import modelo.VentanaUtils;
import vista.ViewEntregaPaquete;
import vista.ViewEntregaPaquete2;
import vista.ViewMetodoPago;
import vista.ViewMetodoPago2;
import vista.ViewPanelCliente;
import vista.ViewNotificacionExito;
import controlador.ControladorEntregaPaquetes;

public class ControladorPanelCliente implements ActionListener {

    private final ViewEntregaPaquete viewEntregaPaquete = new ViewEntregaPaquete();
    private final ViewEntregaPaquete2 viewEntregaPaquete2 = new ViewEntregaPaquete2();
    private final ViewMetodoPago viewMetodoPago = new ViewMetodoPago();
    private final ViewMetodoPago2 viewMetodoPago2 = new ViewMetodoPago2();
    private ViewPanelCliente panelCliente = new ViewPanelCliente();
     private ViewNotificacionExito noti = new ViewNotificacionExito("");

    public ControladorPanelCliente(ViewPanelCliente panelCliente) {
        this.panelCliente = panelCliente;

        this.panelCliente.BtnEntregaPaquete.addActionListener(this);
        this.panelCliente.BtnHistorialEnvios.addActionListener(this);
        this.panelCliente.BtnSeguimientoPaquete.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(panelCliente, "Panel Cliente");
    }

    public void enviarNoti(String mensaje) {
        ViewNotificacionExito newNotificacion = new ViewNotificacionExito(mensaje);
        VentanaUtils.notificacionExito(newNotificacion);
    }

    //Botones
    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton Entrega Paquete
        if (e.getSource() == panelCliente.BtnEntregaPaquete) {
            VentanaUtils.cerrarVentana(panelCliente);
            ViewEntregaPaquete viewEntregaPaquete = new ViewEntregaPaquete();
            ViewEntregaPaquete2 viewEntregaPaquete2 = new ViewEntregaPaquete2();
            ControladorEntregaPaquetes controladorEntregaPaquetes = new ControladorEntregaPaquetes(viewEntregaPaquete, viewEntregaPaquete2);
            controladorEntregaPaquetes.run();
        }

        //Boton Historial Envios
        if (e.getSource() == panelCliente.BtnHistorialEnvios) {
            enviarNoti("Hola");
        } else if (e.getSource() == noti.BtnMenu) {
            VentanaUtils.mostrarVentana(panelCliente, "Panel Cliente");
        } else if (e.getSource() == noti.BtnNewEntrega) {
            VentanaUtils.mostrarVentana(viewEntregaPaquete, "Panel Cliente");
        }
        // Boton Seguimiento Paquete
        if (e.getSource() == panelCliente.BtnSeguimientoPaquete) {
            JOptionPane.showMessageDialog(null, "Seguimiento");

        }

    }

}
