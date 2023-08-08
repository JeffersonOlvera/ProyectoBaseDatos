package vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render2 extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        int estadoColumnIndex = 3; // Índice de la columna "Disponibilidad"

        // Cambiar el fondo de la celda según el índice de la columna
        if (column == estadoColumnIndex) {
            // Obtener el valor de la celda
            String estadoValue = table.getModel().getValueAt(row, column).toString();

            if (null == estadoValue) {
                setBackground(table.getBackground());
            } else {
                switch (estadoValue) {
                    case "Completado":
                        Color verde = new Color(79, 209, 59);
                        setBackground(verde);
                        break;
                    case "Cancelado":
                        Color rojoClaro = new Color(227, 47, 34);
                        setBackground(rojoClaro);
                        break;
                    case "Pendiente":
                        setBackground(Color.YELLOW);
                        break;
                    default:
                        // Si el valor no es "Activo" ni "Inactivo", establecer un color de fondo predeterminado
                        setBackground(table.getBackground());
                        break;
                }
            }
        } else {
            setBackground(table.getBackground());
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
