package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.VentanaUtils;
import vista.DriverAsignarDriver;
import vista.PanelConductor;

public class DriverHistorialDriver implements ActionListener {

    private PanelConductor panelConductor = new PanelConductor();
    private DriverAsignarDriver driverAsignarDriver = new DriverAsignarDriver();

    public DriverHistorialDriver(DriverAsignarDriver driverAsignardriver) {
        this.driverAsignarDriver = driverAsignardriver;

        this.driverAsignarDriver.BtnMenu.addActionListener(this);
        this.driverAsignarDriver.BtnResultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {

                //Codigo para el Label "Todos los resultados"
                JOptionPane.showMessageDialog(null, "Click!");
            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(driverAsignarDriver, "Asignar conductor");
    }

    public void menu() {
        ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
        controladorPanelConductor.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == driverAsignarDriver.BtnMenu) {
            VentanaUtils.cerrarVentana(driverAsignarDriver);
            menu();
        }
    }

}
