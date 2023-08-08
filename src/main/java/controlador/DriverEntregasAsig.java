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
import vista.DriverCheckEntrega;
import vista.DriverComision;
import vista.DriverEntregasAsignadas;
import vista.PanelConductor;

public class DriverEntregasAsig implements ActionListener {

    PanelConductor panelConductor = new PanelConductor();
    DriverEntregasAsignadas driverEntregasAsignadas = new DriverEntregasAsignadas();
    DriverComision driverComision = new DriverComision();
    DriverCheckEntrega DriverCheckEntrega = new DriverCheckEntrega();
    DriverHistorialEntregas asignarDriver = new DriverHistorialEntregas();

    public DriverEntregasAsig(DriverEntregasAsignadas driverEntregasAsignadas, DriverComision driverComision, DriverCheckEntrega DriverCheckEntrega) {
        this.driverEntregasAsignadas = driverEntregasAsignadas;
        this.driverComision = driverComision;
        this.DriverCheckEntrega = DriverCheckEntrega;

        this.DriverCheckEntrega.BtnSiguiente.addActionListener(this);
        this.driverComision.BtnSiguiente.addActionListener(this);
        this.driverComision.BtnCancelar.addActionListener(this);
        this.driverEntregasAsignadas.BtnMenu.addActionListener(this);

        this.driverEntregasAsignadas.tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int filaSeleccionada = driverEntregasAsignadas.tabla.rowAtPoint(evt.getPoint());
                int columnaSeleccionada = driverEntregasAsignadas.tabla.columnAtPoint(evt.getPoint());
                if (filaSeleccionada != -1 && columnaSeleccionada == 7) { // Verifica la columna del botón Seleccionar
                    String codigoEnvio = (String) driverEntregasAsignadas.tabla.getValueAt(filaSeleccionada, 6); // Índice de la columna del código de envío

                    EnvioTablas.completarEnvios(codigoEnvio);
                    actualizarTabla();
                }
            }
        });
        Validaciones.aplicarLimitadorDeLongitud(driverEntregasAsignadas.txtCodEnvio, 8);

        this.driverEntregasAsignadas.BtnResultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                //Codigo para el Label "Todos los resultados"
                try {
                    String codigoEnvio = driverEntregasAsignadas.txtCodEnvio.getText();
                    DefaultTableModel busqueda = EnvioTablas.buscarEnvioConCodigo(Integer.parseInt(codigoEnvio));
                    driverEntregasAsignadas.cambiarModeloTabla(busqueda);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un codigo primero");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un codigo valido");
                }
            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(driverEntregasAsignadas, "Entregas Asignadas");
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
        driverEntregasAsignadas.cambiarModeloTabla(TablaEntregas);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == driverEntregasAsignadas.BtnMenu) {
            VentanaUtils.cerrarVentana(driverEntregasAsignadas);
            menu();
        }
    }

}
