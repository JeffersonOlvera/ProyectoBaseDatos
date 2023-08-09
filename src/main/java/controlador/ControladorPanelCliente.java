package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import main.ClasePrincipal;
import modelo.UsuarioDAO;
import modelo.VentanaUtils;
import vista.ClientCalificacion;
import vista.ClientDevolucion;
import vista.ClientEntregaPaquete;
import vista.ClientEntregaPaquete2;
import vista.ClientFactura;

import vista.PanelCliente;
import vista.ViewNotificacionExito;
import vista.ClientHistorial;
import vista.ClientSegPaquete;
import vista.ViewPrincipal;

public class ControladorPanelCliente implements ActionListener {

    private PanelCliente panelCliente = new PanelCliente();

    public ControladorPanelCliente(PanelCliente panelCliente) {
        this.panelCliente = panelCliente;

        this.panelCliente.BtnEntregaPaquete.addActionListener(this);
        this.panelCliente.BtnHistorialEnvios.addActionListener(this);
        this.panelCliente.BtnSeguimientoPaquete.addActionListener(this);

        this.panelCliente.BtnCerrarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Se ha cerrado sesión correctamente.");
                menu();

            }
        });

    }

    public void run() {
        VentanaUtils.mostrarVentana(panelCliente, "Panel Cliente");
    }

    public void menu() {
        VentanaUtils.cerrarVentana(panelCliente);
        UsuarioDAO modelo = new UsuarioDAO();
        ViewPrincipal ventanaPrincipal = new ViewPrincipal();
        Inicio controlador = new Inicio(modelo, ventanaPrincipal);
        controlador.run();
    }

    //Botones
    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton Entrega Paquete
        if (e.getSource() == panelCliente.BtnEntregaPaquete) {
            VentanaUtils.cerrarVentana(panelCliente);
            ClientEntregaPaquete viewEntregaPaquete = new ClientEntregaPaquete();
            ClientEntregaPaquete2 viewEntregaPaquete2 = new ClientEntregaPaquete2();
            ClienteEntregaPaquetes controladorEntregaPaquetes = new ClienteEntregaPaquetes(viewEntregaPaquete, viewEntregaPaquete2);
            controladorEntregaPaquetes.run();
        }

        //Boton Historial Envios
        if (e.getSource() == panelCliente.BtnHistorialEnvios) {
            VentanaUtils.cerrarVentana(panelCliente);
            ClientFactura viewFactura = new ClientFactura();
            ClientHistorial viewSeguimientoP = new ClientHistorial();
            ClienteHistorialEnvio clienteHistorialEnvio = new ClienteHistorialEnvio(viewFactura, viewSeguimientoP);
            clienteHistorialEnvio.run();
        }

        // Boton Seguimiento Paquete
        if (e.getSource() == panelCliente.BtnSeguimientoPaquete) {
            VentanaUtils.cerrarVentana(panelCliente);
            ClientCalificacion viewCalificacion = new ClientCalificacion();
            ClientSegPaquete viewSeguimiento = new ClientSegPaquete();
            ClientDevolucion viewDevolucion = new ClientDevolucion();
            ClienteSeguimiento clienteSeguimiento = new ClienteSeguimiento(viewCalificacion, viewSeguimiento, viewDevolucion);
            clienteSeguimiento.run();

        }

    }
}
