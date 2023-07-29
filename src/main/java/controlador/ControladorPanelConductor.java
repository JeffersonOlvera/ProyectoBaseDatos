
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.VentanaUtils;
import vista.PanelConductor;

public class ControladorPanelConductor implements ActionListener{

    PanelConductor panelConductor;

    public ControladorPanelConductor(PanelConductor panelConductor) {
        this.panelConductor = panelConductor;
        
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
