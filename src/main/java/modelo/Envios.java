package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class Envios {

    public static boolean entregarPaquete(Remitente remitente, Destinatario destinatario, int id_camion) {
        Connection connection = ConexionBD.conectar();

        PreparedStatement statementRemitente = null;
        PreparedStatement statementDestinatario = null;
        PreparedStatement statementEnvio = null;
        PreparedStatement statementEstado = null;

        String sqlRemitente = "INSERT INTO Remitente (Id_Remitente, Cedula, Nombre, Apellido, Correo, Direccion_P, Direccion_S, Descripcion) VALUES (Inc_Remitente.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
        String sqlDestinatario = "INSERT INTO Destinatario (Id_Destinatario, Nombre, Apellido, Correo, Direccion_P, Direccion_S) VALUES (Inc_Destinatario.NEXTVAL, ?, ?, ?, ?, ?)";
//        String sqlEnvio = "INSERT INTO Envio (Id_Envio, Codigo, Fecha_Hora_Envio, Fecha_Hora_Entrega, Id_Camion, Id_Estado, Id_Remitente, Id_Destinatario) VALUES (Inc_Envio.NEXTVAL, ?, ?, ?, Inc_Conductor.CURRVAL, ?, Inc_Remitente.CURRVAL, Inc_Destinatario.CURRVAL)";
        String sqlEnvio = "INSERT INTO Envio (Id_Envio, Codigo, Fecha_Hora_Envio, Fecha_Hora_Entrega, Id_Camion, Id_Estado, Id_Remitente, Id_Destinatario) VALUES (Inc_Envio.NEXTVAL, ?, ?, ?, ?,Inc_Estado.CURRVAL, Inc_Remitente.CURRVAL, Inc_Destinatario.CURRVAL)";
        String sqlEstado = "INSERT INTO Estado (Id_Estado, Estado) VALUES (Inc_Estado.NEXTVAL, ?)";

        try {
            //Se genera el codenvio
            int codEnvio = generarCodEnvio();
            Date fecha = new Date(System.currentTimeMillis());

            // Insertar en la tabla "Remitente"
            statementRemitente = connection.prepareStatement(sqlRemitente);
            statementRemitente.setString(1, remitente.getCedula()); // Establecer el valor de la cédula
            statementRemitente.setString(2, remitente.getNombre());
            statementRemitente.setString(3, remitente.getApellido());
            statementRemitente.setString(4, remitente.getCorreo());
            statementRemitente.setString(5, remitente.getDireccionP());
            statementRemitente.setString(6, remitente.getDireccionS());
            statementRemitente.setString(7, remitente.getDescripcion());
            statementRemitente.executeUpdate();

            // Insertar en la tabla "Destinatario"
            statementDestinatario = connection.prepareStatement(sqlDestinatario);
            statementDestinatario.setString(1, destinatario.getNombre());
            statementDestinatario.setString(2, destinatario.getApellido());
            statementDestinatario.setString(3, destinatario.getCorreo());
            statementDestinatario.setString(4, destinatario.getDireccionP());
            statementDestinatario.setString(5, destinatario.getDireccionS());
            statementDestinatario.executeUpdate();

            // Insertar en la tabla "Estado"
            statementEstado = connection.prepareStatement(sqlEstado);
            statementEstado.setString(1, "Pendiente");
            statementEstado.executeUpdate();

            // Insertar en la tabla "Envio"
            statementEnvio = connection.prepareStatement(sqlEnvio);
            statementEnvio.setInt(1, codEnvio);
            statementEnvio.setDate(2, fecha);
            statementEnvio.setDate(3, null);
            statementEnvio.setInt(4, id_camion);
            statementEnvio.executeUpdate();

            connection.close();

            JOptionPane.showMessageDialog(null, "Paquete enviado con exito. Codigo: " + codEnvio);
            return true;

        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            //"Error al registrar el conductor."
            JOptionPane.showMessageDialog(null, "Erro");
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static int obtenerIdCamionAleatorio() {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statementCamiones = null;
        String sqlCamiones = "SELECT Id_Camion FROM Camion";

        List<Integer> idCamiones = new ArrayList<>();

        try {
            // Consultar todos los id_camion de la tabla "Camion"
            statementCamiones = connection.prepareStatement(sqlCamiones);
            ResultSet resultSet = statementCamiones.executeQuery();

            while (resultSet.next()) {
                int idCamion = resultSet.getInt("Id_Camion");
                idCamiones.add(idCamion);
            }

            connection.close();

            // Elegir un id_camion aleatorio
            if (idCamiones.size() > 0) {
                Random random = new Random();
                int indiceAleatorio = random.nextInt(idCamiones.size());
                return idCamiones.get(indiceAleatorio);
            } else {
                throw new RuntimeException("No hay camiones disponibles en la base de datos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        throw new RuntimeException("Error al obtener el id_camion aleatorio.");
    }

    //Generar codigo envio
    public static int generarCodEnvio() {
        Random random = new Random();
        int codigo = 10000000 + random.nextInt(90000000); // Genera un número aleatorio entre 10000000 y 99999999
        return codigo;
    }

}
