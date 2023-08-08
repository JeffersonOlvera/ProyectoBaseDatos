package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.ClasePrincipal;
import modelo.Conductor;
import modelo.UsuarioDAO;
import modelo.SeguimientoPaquete;
import modelo.VentanaUtils;
import vista.DriverPerfil;
import vista.PanelConductor;

public class DriverEditarPerfil implements ActionListener {

    PanelConductor panelConductor = new PanelConductor();
    DriverPerfil driverPerfil = new DriverPerfil();

    public DriverEditarPerfil(DriverPerfil driverPerfil) {
        this.driverPerfil = driverPerfil;

        this.driverPerfil.BtnSiguiente.addActionListener(this);
    }

    public void run() {
        VentanaUtils.mostrarVentana(driverPerfil, "Editar Perfil");
        mostrarDatosConductor();
    }

    public void menu() {
        ControladorPanelConductor controladorPanelConductor = new ControladorPanelConductor(panelConductor);
        controladorPanelConductor.run();
    }

    public void mostrarDatosConductor() {
        int idUsuario = ClasePrincipal.getIdUsuarioAutenticado();
        Conductor conductor = UsuarioDAO.obtenerDatosConductor(idUsuario);

        driverPerfil.txtNombre.setText(conductor.getNombre());
        driverPerfil.txtApellido.setText(conductor.getApellido());
        driverPerfil.txtCorreo.setText(conductor.getCorreo());
        driverPerfil.txtCalificación.setText(String.valueOf(conductor.getCalificacion()));

    }

    // Crea un objeto conductor con los datos del formulario 
    public Conductor obtenerDatosDelFormulario() {
        int idUsuario = ClasePrincipal.getIdUsuarioAutenticado();

        Conductor conductor = new Conductor();
        conductor.setID(idUsuario);
        conductor.setApellido(driverPerfil.txtApellido.getText());
        conductor.setNombre(driverPerfil.txtNombre.getText());
        conductor.setCorreo(driverPerfil.txtCorreo.getText());
        conductor.setCalificacion(0);

        return conductor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == driverPerfil.BtnSiguiente) {
            // Se obtiene los datos y se actualizan
            UsuarioDAO.actualizarDatosConductor(obtenerDatosDelFormulario());

            VentanaUtils.cerrarVentana(driverPerfil);
            menu();
        }

    }

}
