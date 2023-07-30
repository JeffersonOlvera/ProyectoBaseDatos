package vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        int disponibilidadColumnIndex = 7; // Índice de la columna "Disponibilidad"

        // Cambiar el fondo de la celda según el índice de la columna
        if (column == disponibilidadColumnIndex) {
            // Obtener el valor de la celda
            String disponibilidadValue = table.getModel().getValueAt(row, column).toString();

            if (null == disponibilidadValue) {
                setBackground(table.getBackground());
            } else {
                switch (disponibilidadValue) {
                    case "Activo":
                        setBackground(Color.GREEN);
                        break;
                    case "Inactivo":
                        setBackground(Color.RED);
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

        if (value instanceof JButton) {
            JButton button = (JButton) value;
            return button;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
