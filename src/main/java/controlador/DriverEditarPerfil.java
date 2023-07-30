package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.VentanaUtils;
import vista.DriverPerfil;
import vista.PanelConductor;

public class DriverEditarPerfil implements ActionListener {

    PanelConductor panelConductor = new PanelConductor();
    DriverPerfil driverPerfil = new DriverPerfil();

    public DriverEditarPerfil(DriverPerfil driverPerfil) {
        this.driverPerfil = driverPerfil;

        this.driverPerfil.BtnSiguiente.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(driverPerfil, "Editar Perfil");
    }

    public void menu() {
        ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
        controladorPanelConductor.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == driverPerfil.BtnSiguiente) {
            VentanaUtils.cerrarVentana(driverPerfil);
            menu();
        }

    }

}
