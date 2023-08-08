package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;
import modelo.Destinatario;
import modelo.EntregarPaquete;
import modelo.PagoTarjetaCredito;
import modelo.Remitente;
import modelo.Validaciones;
import modelo.VentanaUtils;
import vista.ClientEntregaPaquete;
import vista.ClientEntregaPaquete2;
import vista.ClientMetPago;
import vista.ClientMetPago2;
import vista.PanelCliente;

public class ClienteEntregaPaquetes implements ActionListener {

    PanelCliente viewPanelCliente = new PanelCliente();
    ClientEntregaPaquete viewEntregaPaquete = new ClientEntregaPaquete();
    ClientEntregaPaquete2 viewEntregaPaquete2 = new ClientEntregaPaquete2();
    ClientMetPago viewMetodoPago = new ClientMetPago();
    ClientMetPago2 viewMetodoPago2 = new ClientMetPago2();

    public ClienteEntregaPaquetes(ClientEntregaPaquete viewEntegaPaquete, ClientEntregaPaquete2 viewEntregaPaquete2) {
        this.viewEntregaPaquete = viewEntegaPaquete;
        this.viewEntregaPaquete2 = viewEntregaPaquete2;

        this.viewEntregaPaquete.BtnSiguiente.addActionListener(this);
        this.viewEntregaPaquete.BtnCancelar.addActionListener(this);
        this.viewEntregaPaquete2.BtnSiguiente.addActionListener(this);
        this.viewEntregaPaquete2.BtnCancelar.addActionListener(this);
        this.viewMetodoPago.BtnSiguiente.addActionListener(this);
        this.viewMetodoPago2.BtnConfirmar.addActionListener(this);

        Validaciones.aplicarLimitadorDeLongitud(viewEntegaPaquete.txtCedula, 10);
        Validaciones.aplicarLimitadorDeLongitud(viewEntegaPaquete.txtTelefono, 10);
        Validaciones.aplicarLimitadorDeLongitud(viewEntregaPaquete2.txtTelefono, 10);
        Validaciones.aplicarLimitadorDeLongitud(viewMetodoPago2.txtCodTarjeta, 3);
        Validaciones.aplicarLimitadorDeLongitud(viewMetodoPago2.txtFechaTarjeta, 5);
               Validaciones.aplicarLimitadorDeLongitud(viewMetodoPago2.txtNombreTarjeta, 18);

    }

    public void run() {
        VentanaUtils.mostrarVentana(viewEntregaPaquete, "Entrega Paquete");
    }

    public void menu() {
        ControladorPanelCliente controladorPanelCliente = new ControladorPanelCliente(viewPanelCliente);
        controladorPanelCliente.run();
    }

    public Remitente obtenerDatosRemitente() {
        Remitente remitente = new Remitente();

        remitente.setNombre(viewEntregaPaquete.txtNombre.getText());
        remitente.setApellido(viewEntregaPaquete.txtApellido.getText());
        remitente.setTelefono(viewEntregaPaquete.txtTelefono.getText());
        remitente.setCedula(viewEntregaPaquete.txtCedula.getText());
        remitente.setDireccionP(viewEntregaPaquete.txtDireccionP.getText());
        remitente.setDireccionS(viewEntregaPaquete.txtDireccionS.getText());
        remitente.setCorreo(viewEntregaPaquete.txtCorreo.getText());
        remitente.setDescripcion(viewEntregaPaquete.txtDescripcion.getText());
        // Se redondea el monto a dos decimales
        String montoText = viewEntregaPaquete.txtMonto.getText();
        double monto = Double.parseDouble(montoText);
        BigDecimal roundedMonto = BigDecimal.valueOf(monto).setScale(2, RoundingMode.HALF_UP);
        remitente.setMonto(monto);

        return remitente;
    }

    public Destinatario obtenerDatosDestinatario() {
        Destinatario destinatario = new Destinatario();

        destinatario.setNombre(viewEntregaPaquete2.txtNombre.getText());
        destinatario.setApellido(viewEntregaPaquete2.txtApellido.getText());
        destinatario.setTelefono(viewEntregaPaquete2.txtTelefono.getText());
        destinatario.setDireccionP(viewEntregaPaquete2.txtDireccionP.getText());
        destinatario.setDireccionS(viewEntregaPaquete2.txtDireccionS.getText());
        destinatario.setCorreo(viewEntregaPaquete2.txtCorreo.getText());
        destinatario.setDescripcion(viewEntregaPaquete2.txtDescripcion.getText());
        return destinatario;
    }

    //Realizar envio
    public void realizarEnvio() {
        try {
            Remitente remitente = obtenerDatosRemitente();
            Destinatario destinatario = obtenerDatosDestinatario();
            PagoTarjetaCredito datosTarjeta = obtenerDatosTarjeta();
            datosTarjeta.setEsTarjet(true);

            int idCamionAleatorio = EntregarPaquete.obtenerIdCamionAleatorio();
            EntregarPaquete.entregarPaquete(remitente, destinatario, idCamionAleatorio, datosTarjeta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe poner el . en vez de la ,");
        }

    }

    public void realizarEnvio2() {
        try {
            Remitente remitente = obtenerDatosRemitente();
            Destinatario destinatario = obtenerDatosDestinatario();
            PagoTarjetaCredito datosTarjeta = obtenerDatosTarjeta();
            datosTarjeta.setEsTarjet(false);

            int idCamionAleatorio = EntregarPaquete.obtenerIdCamionAleatorio();
            EntregarPaquete.entregarPaquete(remitente, destinatario, idCamionAleatorio, datosTarjeta);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe poner el . en vez de la ,");
        }

    }

    //Verificar remitente no este vacio
    public boolean remitenteNoVacio(Remitente remitente) {
        return !"".equals(remitente.getNombre()) && !"".equals(remitente.getApellido())
                && !"".equals(remitente.getTelefono()) && !"".equals(remitente.getCedula())
                && !"".equals(remitente.getDireccionP()) && !"".equals(remitente.getDireccionS())
                && !"".equals(remitente.getCorreo()) && !"".equals(remitente.getDescripcion()) && !"".equals(remitente.getMonto());
    }

    //Verificar destinatario no este vacio
    public boolean destinatarioNoVacio(Destinatario destinatario) {
        return !"".equals(destinatario.getNombre()) && !"".equals(destinatario.getApellido())
                && !"".equals(destinatario.getTelefono()) && !"".equals(destinatario.getDireccionP())
                && !"".equals(destinatario.getDireccionS()) && !"".equals(destinatario.getCorreo());
    }

    private PagoTarjetaCredito obtenerDatosTarjeta() {
        PagoTarjetaCredito tarjeta = new PagoTarjetaCredito();

        tarjeta.setNombre(viewMetodoPago2.txtNombreTarjeta.getText());
        tarjeta.setNumeroTarjeta(viewMetodoPago2.txtNumTarjeta.getText());
        tarjeta.setFechaVencimiento(viewMetodoPago2.txtFechaTarjeta.getText());
        tarjeta.setCodigoSeguridad(viewMetodoPago2.txtCodTarjeta.getText());

        return tarjeta;
    }

    public void seleccionarMetodoPago() {
        if (viewMetodoPago.GrupoRad.getSelection() != null) {
            if (viewMetodoPago.RadTarjeta.isSelected()) {
                VentanaUtils.cerrarVentana(viewMetodoPago);
                VentanaUtils.mostrarVentana(viewMetodoPago2, "Metodo Pago");

            } else {
                VentanaUtils.cerrarVentana(viewMetodoPago);
                realizarEnvio2();
                menu();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un motivo de devolución para continuar el proceso");

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Boton Cancelar
        if (e.getSource() == viewEntregaPaquete.BtnCancelar) {
            VentanaUtils.cerrarVentana(viewEntregaPaquete);
            menu();
        }

        // Boton Siguiente
        if (e.getSource() == viewEntregaPaquete.BtnSiguiente) {
            try {
                Remitente remitente = obtenerDatosRemitente();
                if (remitenteNoVacio(remitente)) {
                    if (remitente.getCedula().length() == 10) {
                        if (remitente.getTelefono().length() == 10) {
                            VentanaUtils.cerrarVentana(viewEntregaPaquete);
                            VentanaUtils.mostrarVentana(viewEntregaPaquete2, "Entrega Paquete");
                        } else {
                            JOptionPane.showMessageDialog(null, "El número de telefono no es valida");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cedula no es valida");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar bien el precio");
            }
            // Boton Cancelar    
        } else if (e.getSource() == viewEntregaPaquete2.BtnCancelar) {
            VentanaUtils.cerrarVentana(viewEntregaPaquete2);
            VentanaUtils.mostrarVentana(viewEntregaPaquete, "Entrega Paquete");

            // Boton siguiente
        } else if (e.getSource() == viewEntregaPaquete2.BtnSiguiente) {
            Destinatario destinatario = obtenerDatosDestinatario();
            if (destinatarioNoVacio(destinatario)) {
                VentanaUtils.cerrarVentana(viewEntregaPaquete2);
                VentanaUtils.mostrarVentana(viewMetodoPago, "Metodo Pago");
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }
            //Boton Siguiente
        } else if (e.getSource() == viewMetodoPago.BtnSiguiente) {
            seleccionarMetodoPago();

            //Boton Confirmar
        } else if (e.getSource() == viewMetodoPago2.BtnConfirmar) {
            VentanaUtils.cerrarVentana(viewMetodoPago2);
            realizarEnvio();
            menu();
        }
    }

}
