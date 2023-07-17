
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Paquete;
import modelo.VentanaUtils;
import vista.ViewPanelConductor;

public class ControladorPanelConductor implements ActionListener{

    ViewPanelConductor panelConductor;
    Paquete paquete;

    public ControladorPanelConductor(ViewPanelConductor panelConductor, Paquete paquete) {
        this.panelConductor = panelConductor;
        this.paquete = paquete;
        
        this.panelConductor.BtnEntregaAsignada.addActionListener(this);
        this.panelConductor.BtnDevolucionPendiente.addActionListener(this);
        this.panelConductor.BtnHistorialEntregas.addActionListener(this);
    }
    
    public void run() {
        VentanaUtils.mostrarVentana(panelConductor, "Panel Cliente");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == panelConductor.BtnEntregaAsignada) {
            JOptionPane.showMessageDialog(null, "a");
        }
        if (e.getSource() == panelConductor.BtnDevolucionPendiente) {
            JOptionPane.showMessageDialog(null, "b");

        }
        if (e.getSource() == panelConductor.BtnHistorialEntregas) {
            JOptionPane.showMessageDialog(null, "c");

        }
    }
    
}
