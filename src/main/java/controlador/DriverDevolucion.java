package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.VentanaUtils;
import vista.DriverDevoluciones;
import vista.PanelConductor;

public class DriverDevolucion implements ActionListener {

    PanelConductor panelConductor = new PanelConductor();
    DriverDevoluciones driverDevoluciones = new DriverDevoluciones();

    public DriverDevolucion(DriverDevoluciones driverDevoluciones) {
        this.driverDevoluciones = driverDevoluciones;

        this.driverDevoluciones.BtnMenu.addActionListener(this);
        this.driverDevoluciones.BtnResultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                //Codigo para el Label "Todos los resultados"
                JOptionPane.showMessageDialog(null, "Click!");
            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(driverDevoluciones, "Devoluciones");
    }

    public void menu() {
        ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
        controladorPanelConductor.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == driverDevoluciones.BtnMenu) {
            VentanaUtils.cerrarVentana(driverDevoluciones);
            menu();
        }

    }

}
