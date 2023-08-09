package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.UsuarioDAO;

import modelo.VentanaUtils;
import vista.DriverHistorialEntregas;
import vista.DriverCheckEntrega;
import vista.DriverComision;
import vista.DriverDevoluciones;
import vista.DriverEntregasAsignadas;
import vista.DriverPerfil;
import vista.PanelConductor;
import vista.ViewPrincipal;

public class ControladorPanelConductor implements ActionListener {

    private PanelConductor panelConductor = new PanelConductor();

    public ControladorPanelConductor(PanelConductor panelConductor) {
        this.panelConductor = panelConductor;

        this.panelConductor.BtnEntregaAsignada.addActionListener(this);
        this.panelConductor.BtnDevolucionPendiente.addActionListener(this);
        this.panelConductor.BtnHistorialEntregas.addActionListener(this);
        this.panelConductor.BtnEditarPerfil.addActionListener(this);
        
        this.panelConductor.BtnCerrarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Se ha cerrado sesión correctamente.");
                menu();

            }
        });
    }

    public void run() {
        VentanaUtils.mostrarVentana(panelConductor, "Panel Conductor");
    }

    public void menu() {
        VentanaUtils.cerrarVentana(panelConductor);
        UsuarioDAO modelo = new UsuarioDAO();
        ViewPrincipal ventanaPrincipal = new ViewPrincipal();
        Inicio controlador = new Inicio(modelo, ventanaPrincipal);
        controlador.run();
    }
    
    // Botones
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Boton entregas asignadas
        if (ae.getSource() == panelConductor.BtnEntregaAsignada) {
            VentanaUtils.cerrarVentana(panelConductor);
            DriverEntregasAsignadas driverEntregasAsignadas = new DriverEntregasAsignadas();
            DriverComision driverComision = new DriverComision();
            DriverCheckEntrega DriverCheckEntrega = new DriverCheckEntrega();
            DriverEntregasAsig entregaAsignadas = new DriverEntregasAsig(driverEntregasAsignadas, driverComision, DriverCheckEntrega);
            entregaAsignadas.run();
        }
        // Boton entregas devoluciones pendientes
        if (ae.getSource() == panelConductor.BtnDevolucionPendiente) {
            VentanaUtils.cerrarVentana(panelConductor);
            DriverDevoluciones driverDevoluciones = new DriverDevoluciones();
            DriverDevolucion panelDevolucion = new DriverDevolucion(driverDevoluciones);
            panelDevolucion.run();

        }
        // Boton Historial entregas
        if (ae.getSource() == panelConductor.BtnHistorialEntregas) {
            VentanaUtils.cerrarVentana(panelConductor);
            DriverHistorialEntregas driverAsignarDriver = new DriverHistorialEntregas();
            DriverHistorialDriver driverHistorialDriver = new DriverHistorialDriver(driverAsignarDriver);
            driverHistorialDriver.run();
        }
        // Boton editar perfil
        if (ae.getSource() == panelConductor.BtnEditarPerfil) {
            VentanaUtils.cerrarVentana(panelConductor);
            DriverPerfil driverPerfil = new DriverPerfil();
            DriverEditarPerfil driverEditarPerfil = new DriverEditarPerfil(driverPerfil);
            driverEditarPerfil.run();
        }
    }

}
