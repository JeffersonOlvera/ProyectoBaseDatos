package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.VentanaUtils;
import vista.DriverCheckEntrega;
import vista.DriverComision;
import vista.DriverEntregasAsignadas;
import vista.PanelConductor;

public class DriverEntregasAsig implements ActionListener {

    PanelConductor panelConductor = new PanelConductor();
    DriverEntregasAsignadas driverEntregasAsignadas = new DriverEntregasAsignadas();
    DriverComision driverComision = new DriverComision();
    DriverCheckEntrega DriverCheckEntrega = new DriverCheckEntrega();

    public DriverEntregasAsig(DriverEntregasAsignadas driverEntregasAsignadas, DriverComision driverComision, DriverCheckEntrega DriverCheckEntrega) {
        this.driverEntregasAsignadas = driverEntregasAsignadas;
        this.driverComision = driverComision;
        this.DriverCheckEntrega = DriverCheckEntrega;

        this.DriverCheckEntrega.BtnSiguiente.addActionListener(this);
        this.driverComision.BtnSiguiente.addActionListener(this);
        this.driverComision.BtnCancelar.addActionListener(this);
        this.driverEntregasAsignadas.BtnMenu.addActionListener(this);
        this.driverEntregasAsignadas.BtnResultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                //Codigo para el Label "Todos los resultados"
                JOptionPane.showMessageDialog(null, "Click!");
            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(driverEntregasAsignadas, "Entregas Asignadas");
    }

    public void menu() {
        ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
        controladorPanelConductor.run();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == driverEntregasAsignadas.BtnMenu) {
            VentanaUtils.cerrarVentana(driverEntregasAsignadas);
            menu();
        }
    }

}
