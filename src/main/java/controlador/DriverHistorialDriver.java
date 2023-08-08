package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ClasePrincipal;
import modelo.EnvioTablas;
import modelo.Validaciones;
import modelo.VentanaUtils;
import vista.DriverHistorialEntregas;
import vista.PanelConductor;

public class DriverHistorialDriver implements ActionListener {

    private PanelConductor panelConductor = new PanelConductor();
    private DriverHistorialEntregas historialEntregas = new DriverHistorialEntregas();

    public DriverHistorialDriver(DriverHistorialEntregas driverAsignardriver) {
        this.historialEntregas = driverAsignardriver;

        this.historialEntregas.BtnMenu.addActionListener(this);
        Validaciones.aplicarLimitadorDeLongitud(historialEntregas.txtCodEnvio, 8);
        this.historialEntregas.BtnResultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                try{
                //Codigo para el Label "Todos los resultados"
                String codigoEnvio = historialEntregas.txtCodEnvio.getText();
                DefaultTableModel busqueda = EnvioTablas.buscarEnvioConCodigo(Integer.parseInt(codigoEnvio));
                historialEntregas.cambiarModeloTabla(busqueda);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un codigo primero");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un codigo valido");    
                }
            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(historialEntregas, "Historial Entregas");
        actualizarTabla();
    }

    public void menu() {
        ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
        controladorPanelConductor.run();
    }

    public void actualizarTabla() {

        // Obtengo el ID
        int idUsuario = ClasePrincipal.getIdUsuarioAutenticado();
        //Envio el id y obtendo el modelo de la tabla
        DefaultTableModel TablaEntregas = EnvioTablas.obtenerHistorialEnvios(idUsuario);
        historialEntregas.cambiarModeloTabla(TablaEntregas);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == historialEntregas.BtnMenu) {
            VentanaUtils.cerrarVentana(historialEntregas);
            menu();
        }
    }

}
