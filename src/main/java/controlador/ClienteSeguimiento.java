package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.VentanaUtils;
import vista.ClientCalificacion;
import vista.ClientDevolucion;
import vista.PanelCliente;
import vista.ClientSegPaquete;

public class ClienteSeguimiento implements ActionListener {

    ClientCalificacion viewCalificacion = new ClientCalificacion();
    ClientSegPaquete viewSeguimiento = new ClientSegPaquete();
    PanelCliente panelCliente = new PanelCliente();
    ClientDevolucion viewDevolucion = new ClientDevolucion();

    public ClienteSeguimiento(ClientCalificacion viewCalificacion, ClientSegPaquete viewSeguimiento, ClientDevolucion viewDevolucion) {
        this.viewCalificacion = viewCalificacion;
        this.viewSeguimiento = viewSeguimiento;
        this.viewDevolucion = viewDevolucion;

        this.viewSeguimiento.BtnMenu.addActionListener(this);
        this.viewSeguimiento.BtnDevolucion.addActionListener(this);
        this.viewSeguimiento.BtnCalificar.addActionListener(this);
        this.viewCalificacion.BtnConfirmar.addActionListener(this);
        this.viewDevolucion.BtnConfirmar.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(viewSeguimiento, "Menu - Cliente");
    }

    public void menu() {
        ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(panelCliente);
        controladorPanelCliente.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewSeguimiento.BtnCalificar) {
            VentanaUtils.cerrarVentana(viewSeguimiento);
            VentanaUtils.mostrarVentana(viewCalificacion, "Calificación");
            
        } else if (e.getSource() == viewCalificacion.BtnConfirmar) {
            VentanaUtils.cerrarVentana(viewCalificacion);
            menu();
        }
        if (e.getSource() == viewSeguimiento.BtnMenu) {
            VentanaUtils.cerrarVentana(viewSeguimiento);
            menu();
        }
        if (e.getSource() == viewSeguimiento.BtnDevolucion) {
            VentanaUtils.cerrarVentana(viewSeguimiento);
            VentanaUtils.mostrarVentana(viewDevolucion, "Devolución");
        }else if (e.getSource() == viewDevolucion.BtnConfirmar) {
            VentanaUtils.cerrarVentana(viewDevolucion);
            menu();
        }

    }

}
