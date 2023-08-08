package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import main.ClasePrincipal;
import modelo.DatosEnvio;
import modelo.SeguimientoPaquete;
import modelo.Validaciones;
import modelo.VentanaUtils;
import vista.ClientCalificacion;
import vista.ClientDevolucion;
import vista.PanelCliente;
import vista.ClientSegPaquete;

public class ClienteSeguimiento implements ActionListener {

    ClientCalificacion viewCalificacion = new ClientCalificacion();
    ClientSegPaquete viewSeguimiento = new ClientSegPaquete();
    PanelCliente panelCliente = new PanelCliente();
    ClientDevolucion viewDevolucion = new ClientDevolucion();
    int codEnvio;

    public ClienteSeguimiento(ClientCalificacion viewCalificacion, ClientSegPaquete viewSeguimiento, ClientDevolucion viewDevolucion) {
        this.viewCalificacion = viewCalificacion;
        this.viewSeguimiento = viewSeguimiento;
        this.viewDevolucion = viewDevolucion;

        this.viewSeguimiento.BtnMenu.addActionListener(this);
        this.viewSeguimiento.BtnDevolucion.addActionListener(this);
        this.viewSeguimiento.BtnCalificar.addActionListener(this);
        this.viewCalificacion.BtnConfirmar.addActionListener(this);
        this.viewDevolucion.BtnConfirmar.addActionListener(this);

        Validaciones.aplicarLimitadorDeLongitud(viewSeguimiento.txtCodEnvio, 8);
        Validaciones.aplicarLimitadorDeLongitud(viewCalificacion.txtCalificacion, 1);

//        Validaciones.aplicarLimitadorDeLongitud(viewSeguimiento.txtCodEnvio, 8);
        this.viewSeguimiento.txtCodEnvio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Manejar el evento cuando se presiona "Enter"
                    int codEnvio = Integer.parseInt(viewSeguimiento.txtCodEnvio.getText());
                    consultarCodigoEnvio(codEnvio);
                } catch (NumberFormatException ex) {
                    clearTextField();
                    JOptionPane.showMessageDialog(null, "El código de envío debe solo contener números.");

                }
            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(viewSeguimiento, "Menu - Cliente");
    }

    public void menu() {
        ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(panelCliente);
        controladorPanelCliente.run();
    }

    public void clearTextField() {
        viewSeguimiento.txtNombre.setText("");
        viewSeguimiento.txtDescripcion.setText("");
        viewSeguimiento.txtChofer.setText("");
        viewSeguimiento.txtPlaca.setText("");
        viewSeguimiento.txtEstado.setText("");
    }

    public void consultarCodigoEnvio(int codEnvio) {
        DatosEnvio datos = SeguimientoPaquete.obtenerDatosEnvio(codEnvio);

        if (datos != null) {
            // Mostrar los datos en los JTextFields de la interfaz
            viewSeguimiento.txtNombre.setText(datos.getNombreDestinatario() + " " + datos.getApellidoDestinatario());
            viewSeguimiento.txtDescripcion.setText(datos.getDescripcion());
            viewSeguimiento.txtChofer.setText(datos.getNombreConductor() + " " + datos.getApellidoConductor());
            viewSeguimiento.txtPlaca.setText(datos.getnPlaca());
            viewSeguimiento.txtEstado.setText(datos.getEstado());
        } else {
            // Mostrar el JOptionPane si el código de envío no existe en la base de datos
            clearTextField();
            JOptionPane.showMessageDialog(null, "Código de envío no encontrado en la base de datos.");
        }
    }

    public void calificarConductor() {
        int calificacion = Integer.parseInt(viewCalificacion.txtCalificacion.getText());
        int idUsuario = ClasePrincipal.getIdUsuarioAutenticado();

        // Logica calificar conductor
        if (calificacion >= 1 && calificacion <= 5) {
            SeguimientoPaquete.calificarConductor(codEnvio, calificacion, idUsuario);
            VentanaUtils.cerrarVentana(viewCalificacion);
            menu();
        } else {
            JOptionPane.showMessageDialog(null, "La calificación debe ser entre 1 y 5.");

        }
    }

    public void devolverPedido() {
        try {
            codEnvio = Integer.parseInt(viewDevolucion.txtCodEnvio.getText());
            // Se valida el codigo
            if (Validaciones.verificarCodigoEnvio(codEnvio)) {
                //Se valida que haya seleccionado un Radio Button
                if (viewDevolucion.btnGrupo.getSelection() != null) {
                    SeguimientoPaquete.devolverPaquete(codEnvio);
                    VentanaUtils.cerrarVentana(viewDevolucion);
                    menu();
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor seleccione un motivo de devolución para continuar el proceso");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Codigo no encontrado. Verifique el codigo de envio. ");

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el codigo del envio.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Boton calificar
        if (e.getSource() == viewSeguimiento.BtnCalificar) {
            try {
                codEnvio = Integer.parseInt(viewSeguimiento.txtCodEnvio.getText());
                if (Validaciones.verificarCodigoEnvio(codEnvio)) {
                    VentanaUtils.cerrarVentana(viewSeguimiento);
                    VentanaUtils.mostrarVentana(viewCalificacion, "Calificación");
                } else {
                    JOptionPane.showMessageDialog(null, "Codigo no encontrado. Verifique el codigo de envio. ");

                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese el codigo del envio.");
            }
        } else if (e.getSource() == viewCalificacion.BtnConfirmar) {
            // Califica conductor
            calificarConductor();
        }
        // Boton devolucion
        if (e.getSource() == viewSeguimiento.BtnDevolucion) {
            VentanaUtils.cerrarVentana(viewSeguimiento);
            VentanaUtils.mostrarVentana(viewDevolucion, "Devolución");

        } else if (e.getSource() == viewDevolucion.BtnConfirmar) {
            devolverPedido();
        }

        // Volver al menú
        if (e.getSource() == viewSeguimiento.BtnMenu) {
            VentanaUtils.cerrarVentana(viewSeguimiento);
            menu();
        }

    }

}
