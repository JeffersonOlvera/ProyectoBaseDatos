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
import vista.DriverDevoluciones;
import vista.PanelConductor;

public class DriverDevolucion implements ActionListener {

    PanelConductor panelConductor = new PanelConductor();
    DriverDevoluciones driverDevoluciones = new DriverDevoluciones();

    public DriverDevolucion(DriverDevoluciones driverDevoluciones) {
        this.driverDevoluciones = driverDevoluciones;

        this.driverDevoluciones.tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int filaSeleccionada = driverDevoluciones.tabla.rowAtPoint(evt.getPoint());
                int columnaSeleccionada = driverDevoluciones.tabla.columnAtPoint(evt.getPoint());
                if (filaSeleccionada != -1 && columnaSeleccionada == 7) { // Verifica la columna del botón Seleccionar
                    String codigoEnvio = (String) driverDevoluciones.tabla.getValueAt(filaSeleccionada, 6); // Índice de la columna del código de envío

                    EnvioTablas.cancelarEnvios(codigoEnvio);
                    actualizarTabla();
                }
            }
        });

        this.driverDevoluciones.BtnMenu.addActionListener(this);
        Validaciones.aplicarLimitadorDeLongitud(driverDevoluciones.txtCodEnvio, 8);

        this.driverDevoluciones.BtnResultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                //Codigo para el Label "Todos los resultados"
                try {
                    //Codigo para el Label "Todos los resultados"
                    String codigoEnvio = driverDevoluciones.txtCodEnvio.getText();
                    DefaultTableModel busqueda = EnvioTablas.buscarEnvioConCodigo(Integer.parseInt(codigoEnvio));
                    driverDevoluciones.cambiarModeloTabla(busqueda);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un codigo primero");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un codigo valido");
                }
            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(driverDevoluciones, "Devoluciones");
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
        DefaultTableModel TablaEntregas = EnvioTablas.obtenerEntregasAsignadas(idUsuario);
        driverDevoluciones.cambiarModeloTabla(TablaEntregas);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == driverDevoluciones.BtnMenu) {
            VentanaUtils.cerrarVentana(driverDevoluciones);
            menu();
        }

    }

}
