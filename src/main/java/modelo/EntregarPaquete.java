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

public class EntregarPaquete {

    public static boolean entregarPaquete(Remitente remitente, Destinatario destinatario, int id_camion, PagoTarjetaCredito datosTarjeta, int idUsuario) {
        String sqlRemitente = "INSERT INTO Remitente (Id_Remitente, Cedula, Nombre, Apellido, Correo, Direccion_P, Direccion_S, Descripcion) VALUES (Inc_Remitente.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
        String sqlDestinatario = "INSERT INTO Destinatario (Id_Destinatario, Nombre, Apellido, Correo, Direccion_P, Direccion_S, Descripcion) VALUES (Inc_Destinatario.NEXTVAL, ?, ?, ?, ?, ?, ?)";
        String sqlMetodoPago = "INSERT INTO Metodo_Pago (Id_Metodo_Pago, Monto_Total) VALUES (Inc_Metodo_Pago.NEXTVAL, ?)";
        String sqlEfectivo = "INSERT INTO Pago_Efectivo (Id_Pago_Efectivo, Cobrado, Id_Metodo_Pago) VALUES (Inc_Pago_Efectivo.NEXTVAL, ? , Inc_Metodo_Pago.CURRVAL)";
        String sqlDatosTarjeta = "INSERT INTO Pago_Tarjeta (Id_Pago_Tarjeta, Codigo_Seguridad, Nombre_propietario, N_Tarjeta, Fecha_Vencimiento, Id_Metodo_Pago) VALUES (Inc_Pago_Tarjeta.NEXTVAL, ?, ?, ?, ?, Inc_Metodo_Pago.CURRVAL )";
        String sqlEnvio = "INSERT INTO Envio (Id_Envio, Codigo, Fecha_Hora_Envio, Fecha_Hora_Entrega, Id_Camion, Id_Estado, Id_Remitente, Id_Destinatario, Id_Metodo_Pago, Id_Cliente) VALUES (Inc_Envio.NEXTVAL, ?, ?, ?, ?, ?, Inc_Remitente.CURRVAL, Inc_Destinatario.CURRVAL, Inc_Metodo_Pago.CURRVAL, ?)";

        String sqlConsultaCliente = "SELECT Id_Cliente FROM Cliente WHERE Id_Usuario = ?";

        try (Connection connection = ConexionBD.conectar(); PreparedStatement statementRemitente = connection.prepareStatement(sqlRemitente); PreparedStatement statementDestinatario = connection.prepareStatement(sqlDestinatario); PreparedStatement statementEnvio = connection.prepareStatement(sqlEnvio); PreparedStatement statementMetodoPago = connection.prepareStatement(sqlMetodoPago); PreparedStatement statementPagoTarjeta = connection.prepareStatement(sqlDatosTarjeta); PreparedStatement statementPagoEfectivo = connection.prepareStatement(sqlEfectivo); PreparedStatement statementConsultaCliente = connection.prepareStatement(sqlConsultaCliente)) {

            int codEnvio = generarCodEnvio();
            Date fecha = new Date(System.currentTimeMillis());

            // Consultar el id_cliente correspondiente al id_usuario
            statementConsultaCliente.setInt(1, idUsuario);
            try (ResultSet resultSet = statementConsultaCliente.executeQuery()) {
                if (resultSet.next()) {
                    int idCliente = resultSet.getInt("Id_Cliente");

                    // Insertar en la tabla "Metodo_Pago"
                    statementMetodoPago.setDouble(1, remitente.getMonto());
                    statementMetodoPago.executeUpdate();

                    // Insertar en la tabla "Remitente"
                    statementRemitente.setString(1, remitente.getCedula());
                    statementRemitente.setString(2, remitente.getNombre());
                    statementRemitente.setString(3, remitente.getApellido());
                    statementRemitente.setString(4, remitente.getCorreo());
                    statementRemitente.setString(5, remitente.getDireccionP());
                    statementRemitente.setString(6, remitente.getDireccionS());
                    statementRemitente.setString(7, remitente.getDescripcion());
                    statementRemitente.executeUpdate();

                    // Insertar en la tabla "Destinatario"
                    statementDestinatario.setString(1, destinatario.getNombre());
                    statementDestinatario.setString(2, destinatario.getApellido());
                    statementDestinatario.setString(3, destinatario.getCorreo());
                    statementDestinatario.setString(4, destinatario.getDireccionP());
                    statementDestinatario.setString(5, destinatario.getDireccionS());
                    statementDestinatario.setString(6, remitente.getDescripcion());
                    statementDestinatario.executeUpdate();

                    // Insertar en la tabla "Envio"
                    statementEnvio.setInt(1, codEnvio);
                    statementEnvio.setDate(2, fecha);
                    statementEnvio.setDate(3, null);
                    statementEnvio.setInt(4, id_camion);
                    statementEnvio.setInt(5, 2); // ID del estado "Pendiente"
                    statementEnvio.setInt(6, idCliente); // Usar el ID del cliente obtenido de la consulta
                    statementEnvio.executeUpdate();

                    // Insertar en la tabla "Pago_Tarjeta" o "Pago_Efectivo" según corresponda
                    if (datosTarjeta.isEsTarjet()) {
                        statementPagoTarjeta.setInt(1, Integer.parseInt(datosTarjeta.getCodigoSeguridad()));
                        statementPagoTarjeta.setString(2, datosTarjeta.getNombre());
                        statementPagoTarjeta.setString(3, datosTarjeta.getNumeroTarjeta());
                        statementPagoTarjeta.setString(4, datosTarjeta.getFechaVencimiento());
                        statementPagoTarjeta.executeUpdate();
                    } else {
                        statementPagoEfectivo.setString(1, "1");
                        statementPagoEfectivo.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(null, "Paquete enviado con éxito. Código: " + codEnvio);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un cliente asociado al usuario.");
                    return false;
                }
            }
        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el conductor.");
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

    public static void pagoTarjeta() {

    }

    public static void pagoEfectivo() {

    }

    //Generar codigo envio
    public static int generarCodEnvio() {
        Random random = new Random();
        int codigo = 10000000 + random.nextInt(90000000); // Genera un número aleatorio entre 10000000 y 99999999
        return codigo;
    }

}
