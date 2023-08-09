package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.ClasePrincipal;
import modelo.DatosEnvio;
import modelo.EnvioTablas;
import modelo.SeguimientoPaquete;
import modelo.VentanaUtils;
import vista.ClientFactura;
import vista.PanelCliente;
import vista.ClientHistorial;

public class ClienteHistorialEnvio implements ActionListener {

    ClientFactura viewFactura = new ClientFactura();
    ClientHistorial viewHistorial = new ClientHistorial();
    PanelCliente panelCliente = new PanelCliente();

    public ClienteHistorialEnvio(ClientFactura viewFactura, ClientHistorial viewSeguimientoP) {
        this.viewFactura = viewFactura;
        this.viewHistorial = viewSeguimientoP;

        this.viewFactura.BtnMenu.addActionListener(this);
        this.viewHistorial.BtnGenerarFactura.addActionListener(this);
        this.viewHistorial.BtnCancelar.addActionListener(this);

        this.viewHistorial.txtCodEnvio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Manejar el evento cuando se presiona "Enter"
                    int codEnvio = Integer.parseInt(viewHistorial.txtCodEnvio.getText());
                    consultarCodigoEnvio(codEnvio);
                } catch (NumberFormatException ex) {
                    clearTextField();
                    JOptionPane.showMessageDialog(null, "El código de envío debe solo contener números.");

                }
            }
        });
        this.viewFactura.txtCodEnvio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Manejar el evento cuando se presiona "Enter"
                    int codEnvio = Integer.parseInt(viewFactura.txtCodEnvio.getText());
                    generarFactura(codEnvio);
                    DefaultTableModel tablaHistorial = EnvioTablas.generarFactura(codEnvio);
                    viewFactura.cambiarModeloTabla(tablaHistorial);

                } catch (NumberFormatException ex) {
                    clearTextField();
                    JOptionPane.showMessageDialog(null, "El código de envío debe solo contener números.");

                }
            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(viewHistorial, "Menu - Cliente");
        actualizarTabla();

    }

    public void menu() {
        ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(panelCliente);
        controladorPanelCliente.run();
    }

    public void actualizarTabla() {
        // Obtengo el ID
        int idUsuario = ClasePrincipal.getIdUsuarioAutenticado();
        //Envio el id y obtendo el modelo de la tabla
        DefaultTableModel TablaEntregas = EnvioTablas.obtenerHistorialCliente(idUsuario);
        viewHistorial.cambiarModeloTabla(TablaEntregas);
    }

    public void consultarCodigoEnvio(int codEnvio) {
        DatosEnvio datos = SeguimientoPaquete.obtenerDatosEnvio(codEnvio);

        if (datos != null) {
            // Mostrar los datos en los JTextFields de la interfaz
            viewHistorial.txtDescripcion.setText(datos.getDescripcion());
            viewHistorial.txtNombreConductor.setText(datos.getNombreConductor() + " " + datos.getApellidoConductor());
            viewHistorial.txtEstado.setText(datos.getEstado());
            viewHistorial.txtDireccionP.setText(datos.getDireccion());
        } else {
            clearTextField();
            JOptionPane.showMessageDialog(null, "Código de envío no encontrado en la base de datos.");
        }
    }

    public void clearTextField() {
        viewHistorial.txtNombreConductor.setText("");
        viewHistorial.txtDescripcion.setText("");
        viewHistorial.txtEstado.setText("");
        viewHistorial.txtDescripcion.setText("");
    }

    public void generarFactura(int codEnvio) {
        DatosEnvio datos = SeguimientoPaquete.obtenerDatosEnvio(codEnvio);

        if (datos != null) {
            // Mostrar los datos en los JTextFields de la interfaz

            viewFactura.txtNombreDestinatario.setText(datos.getNombreDestinatario() + " " + datos.getApellidoDestinatario());
            viewFactura.txtDireccionDestinatario.setText(datos.getDireccion());
            viewFactura.txtFecha.setText(datos.getFechaEnvio());
        } else {
            clearTextField();
            JOptionPane.showMessageDialog(null, "Código de envío no encontrado en la base de datos.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewHistorial.BtnCancelar) {
            VentanaUtils.cerrarVentana(viewHistorial);
            menu();
        }
        if (e.getSource() == viewHistorial.BtnGenerarFactura) {
            VentanaUtils.cerrarVentana(viewHistorial);
            VentanaUtils.mostrarVentana(viewFactura, "Generar Factura");

        }
        if (e.getSource() == viewFactura.BtnMenu) {
            VentanaUtils.cerrarVentana(viewFactura);
            menu();
        }
    }
}
