package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.VentanaUtils;
import vista.DriverHistorialEntregas;
import vista.DriverCheckEntrega;
import vista.DriverComision;
import vista.DriverDevoluciones;
import vista.DriverEntregasAsignadas;
import vista.DriverPerfil;
import vista.PanelConductor;

public class ControladorPanelConductor implements ActionListener {

    private PanelConductor panelConductor = new PanelConductor();

    public ControladorPanelConductor(PanelConductor panelConductor) {
        this.panelConductor = panelConductor;

        this.panelConductor.BtnEntregaAsignada.addActionListener(this);
        this.panelConductor.BtnDevolucionPendiente.addActionListener(this);
        this.panelConductor.BtnHistorialEntregas.addActionListener(this);
        this.panelConductor.BtnEditarPerfil.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(panelConductor, "Panel Conductor");
    }

    // Botones
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Boton entregas asignadas
        if (ae.getSource() == panelConductor.BtnEntregaAsignada) {
            VentanaUtils.cerrarVentana(panelConductor);
            DriverEntregasAsignadas driverEntregasAsignadas = new DriverEntregasAsignadas();
            DriverComision driverComision = new DriverComision();
            DriverCheckEntrega DriverCheckEntrega = new DriverCheckEntrega();
            DriverEntregasAsig entregaAsignadas = new DriverEntregasAsig(driverEntregasAsignadas, driverComision, DriverCheckEntrega);
            entregaAsignadas.run();
        }
        // Boton entregas devoluciones pendientes
        if (ae.getSource() == panelConductor.BtnDevolucionPendiente) {
            VentanaUtils.cerrarVentana(panelConductor);
            DriverDevoluciones driverDevoluciones = new DriverDevoluciones();
            DriverDevolucion panelDevolucion = new DriverDevolucion(driverDevoluciones);
            panelDevolucion.run();

        }
        // Boton Historial entregas
        if (ae.getSource() == panelConductor.BtnHistorialEntregas) {
            VentanaUtils.cerrarVentana(panelConductor);
            DriverHistorialEntregas driverAsignarDriver = new DriverHistorialEntregas();
            DriverHistorialDriver driverHistorialDriver = new DriverHistorialDriver(driverAsignarDriver);
            driverHistorialDriver.run();
        }
        // Boton editar perfil
        if (ae.getSource() == panelConductor.BtnEditarPerfil) {
            VentanaUtils.cerrarVentana(panelConductor);
            DriverPerfil driverPerfil = new DriverPerfil();
            DriverEditarPerfil driverEditarPerfil = new DriverEditarPerfil(driverPerfil);
            driverEditarPerfil.run();
        }
    }

}
