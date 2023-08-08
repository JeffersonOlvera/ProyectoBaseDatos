package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SeguimientoPaquete {

    public static DatosEnvio obtenerDatosEnvio(int codigoEnvio) {
        DatosEnvio datosEnvio = null;

        Connection connection = ConexionBD.conectar();

        PreparedStatement statementEnvio = null;
        PreparedStatement statementCamion = null;
        PreparedStatement statementDestinatario = null;
        PreparedStatement statementEstado = null;
        PreparedStatement statementConductor = null;
        PreparedStatement statementUsuario = null;

        String sqlEnvio = "SELECT Id_Destinatario, Id_Camion, Id_Estado FROM Envio WHERE Codigo = ?";
        String sqlCamion = "SELECT N_Placa, Id_Conductor FROM Camion WHERE Id_Camion = ?";
        String sqlDestinatario = "SELECT Nombre, Apellido, Descripcion FROM Destinatario WHERE Id_Destinatario = ?";
        String sqlEstado = "SELECT Estado FROM Estado WHERE Id_Estado = ?";
        String sqlConductor = "SELECT Id_Usuario FROM Conductor WHERE Id_Conductor = ?";
        String sqlUsuario = "SELECT Nombre, Apellido FROM Usuario WHERE Id_Usuario = ?";

        try {
            // Consultar la tabla "Envio" para obtener Id_Destinatario, Id_Camion e ID_ESTADO
            statementEnvio = connection.prepareStatement(sqlEnvio);
            statementEnvio.setInt(1, codigoEnvio);
            ResultSet resultEnvio = statementEnvio.executeQuery();

            if (resultEnvio.next()) {
                int idDestinatario = resultEnvio.getInt("Id_Destinatario");
                int idCamion = resultEnvio.getInt("Id_Camion");
                int idEstado = resultEnvio.getInt("ID_ESTADO");

                // Consultar la tabla "Camion" para obtener el N_Placa y el Id_Conductor
                statementCamion = connection.prepareStatement(sqlCamion);
                statementCamion.setInt(1, idCamion);
                ResultSet resultCamion = statementCamion.executeQuery();

                if (resultCamion.next()) {
                    String nPlaca = resultCamion.getString("N_Placa");
                    int idConductor = resultCamion.getInt("Id_Conductor");

                    // Consultar la tabla "Destinatario" para obtener la Descripcion
                    statementDestinatario = connection.prepareStatement(sqlDestinatario);
                    statementDestinatario.setInt(1, idDestinatario);
                    ResultSet resultDestinatario = statementDestinatario.executeQuery();

                    if (resultDestinatario.next()) {
                        String descripcionDestinatario = resultDestinatario.getString("Descripcion");
                        String nombreDestinatario = resultDestinatario.getString("Nombre");
                        String apellidoDestinatario = resultDestinatario.getString("Apellido");
                        // Consultar la tabla "Estado" para obtener el Nombre_Estado
                        statementEstado = connection.prepareStatement(sqlEstado);
                        statementEstado.setInt(1, idEstado);
                        ResultSet resultEstado = statementEstado.executeQuery();

                        if (resultEstado.next()) {
//                            String nombreEstado = resultEstado.getString("Nombre_Estado");
                            String estado = resultEstado.getString("Estado");
                            // Consultar la tabla "Conductor" para obtener el Id_Usuario del conductor
                            statementConductor = connection.prepareStatement(sqlConductor);
                            statementConductor.setInt(1, idConductor);
                            ResultSet resultConductor = statementConductor.executeQuery();

                            if (resultConductor.next()) {
                                int idUsuarioConductor = resultConductor.getInt("Id_Usuario");

                                // Consultar la tabla "Usuario" para obtener datos del usuario (conductor)
                                statementUsuario = connection.prepareStatement(sqlUsuario);
                                statementUsuario.setInt(1, idUsuarioConductor);
                                ResultSet resultUsuario = statementUsuario.executeQuery();

                                if (resultUsuario.next()) {
                                    String nombreConductor = resultUsuario.getString("Nombre");
                                    String apellidoConductor = resultUsuario.getString("Apellido");

                                    // Crear el objeto DatosEnvio con los datos obtenidos
                                    datosEnvio = new DatosEnvio();
                                    datosEnvio.setNombreDestinatario(nombreDestinatario);
                                    datosEnvio.setApellidoDestinatario(apellidoDestinatario);
                                    datosEnvio.setDescripcion(descripcionDestinatario);
                                    datosEnvio.setnPlaca(nPlaca);
                                    datosEnvio.setEstado(estado);
                                    datosEnvio.setNombreConductor(nombreConductor);
                                    datosEnvio.setApellidoConductor(apellidoConductor);
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (statementEnvio != null) {
                    statementEnvio.close();
                }
                if (statementCamion != null) {
                    statementCamion.close();
                }
                if (statementDestinatario != null) {
                    statementDestinatario.close();
                }
                if (statementEstado != null) {
                    statementEstado.close();
                }
                if (statementConductor != null) {
                    statementConductor.close();
                }
                if (statementUsuario != null) {
                    statementUsuario.close();
                }
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return datosEnvio;
    }

    public static void calificarConductor(int codigoEnvio, int calificacion, int idUsuario) {

        Connection connection = ConexionBD.conectar();

        PreparedStatement statementEnvio = null;
        PreparedStatement statementCamion = null;
        PreparedStatement statementCalificacion = null;
        PreparedStatement statementCliente = null;

        // Obtener el Id_Cliente asociado al Id_Usuario
        String sqlCliente = "SELECT Id_Cliente FROM Cliente WHERE Id_Usuario = ?";
        // Obtener cod conductor
        String sqlEnvio = "SELECT Id_Camion FROM Envio WHERE Codigo = ?";
        String sqlCamion = "SELECT Id_Conductor FROM Camion WHERE Id_Camion = ?";
        // Enviar datos: codConductor, 
        String sqlCalificacion = "INSERT INTO Calificacion (Id_Calificacion, Calificacion, Id_Cliente, Id_Conductor) VALUES (Inc_Remitente.NEXTVAL, ?, ?, ?)";

        try {
            // Obtener el Id_Cliente
            statementCliente = connection.prepareStatement(sqlCliente);
            statementCliente.setInt(1, idUsuario);
            ResultSet resultCliente = statementCliente.executeQuery();

            if (resultCliente.next()) {
                int idCliente = resultCliente.getInt("Id_Cliente");

                // Obtener el Id_Camion asociado al envío
                statementEnvio = connection.prepareStatement(sqlEnvio);
                statementEnvio.setInt(1, codigoEnvio);
                ResultSet resultEnvio = statementEnvio.executeQuery();

                if (resultEnvio.next()) {
                    int idCamion = resultEnvio.getInt("Id_Camion");

                    // Obtener el Id_Conductor asociado al Id_Camion
                    statementCamion = connection.prepareStatement(sqlCamion);
                    statementCamion.setInt(1, idCamion);
                    ResultSet resultCamion = statementCamion.executeQuery();

                    if (resultCamion.next()) {
                        int idConductor = resultCamion.getInt("Id_Conductor");

                        // Insertar la calificación en la tabla Calificacion
                        statementCalificacion = connection.prepareStatement(sqlCalificacion);
                        statementCalificacion.setInt(1, calificacion);
                        statementCalificacion.setInt(2, idCliente);
                        statementCalificacion.setInt(3, idConductor);

                        // Ejecutar la inserción de la calificación
                        statementCalificacion.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Calificación registrada exitosamente.");

                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el conductor asociado al camión.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el envío con el código proporcionado.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente asociado al usuario.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al calificar al conductor");
            e.printStackTrace();
        } finally {
            try {
                if (statementEnvio != null) {
                    statementEnvio.close();
                }
                if (statementCamion != null) {
                    statementCamion.close();
                }
                if (statementCalificacion != null) {
                    statementCalificacion.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void devolverPaquete(int codigoEnvio) {

        Connection connection = ConexionBD.conectar();

        PreparedStatement statementEnvio = null;
        PreparedStatement statementEstado = null;

        String sqlEnvio = "SELECT Id_Envio FROM Envio WHERE Codigo = ?";
        String sqlEstado = "UPDATE Envio SET Id_Estado = ? WHERE Id_Envio = ?";
        try {
            //Obtener Id_Envio de la tabla Envio
            statementEnvio = connection.prepareStatement(sqlEnvio);
            statementEnvio.setInt(1, codigoEnvio);
            ResultSet resultEnvio = statementEnvio.executeQuery();

            if (resultEnvio.next()) {
                int idEnvio = resultEnvio.getInt("Id_Envio");

                //Cambiar el Id_Estado de la tabla Envio
                statementEstado = connection.prepareStatement(sqlEstado);
                statementEstado.setInt(1, 3); //Codigo correspondiente a los pedidos cancelados
                statementEstado.setInt(2, idEnvio);
                statementEstado.executeUpdate();

                JOptionPane.showMessageDialog(null, "Devolución confirmada, el chofer se dirigirá al punto de recogida del paquete.");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (statementEnvio != null) {
                    statementEnvio.close();
                }
                if (statementEstado != null) {
                    statementEstado.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
