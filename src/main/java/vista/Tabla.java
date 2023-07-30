package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla {

    public void tablaSeleccionar1(JTable tabla) {

        tabla.setDefaultRenderer(Object.class, new Render());

        JButton btnSeleccionar = new JButton("Seleccionar");
        btnSeleccionar.setBackground(new java.awt.Color(97, 150, 171));
        btnSeleccionar.setFont(new java.awt.Font("Arial Black", 1, 12));
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));

        btnSeleccionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tabla.getSelectedRow();
                if (filaSeleccionada != -1) {
                    // Aquí obtienes los datos de la fila seleccionada
                    String nombre = (String) tabla.getValueAt(filaSeleccionada, 0);
                    String apellido = (String) tabla.getValueAt(filaSeleccionada, 1);
                    String puntoRecogida = (String) tabla.getValueAt(filaSeleccionada, 2);
                    // ... y así sucesivamente con los datos de las demás columnas

                    // Realiza la acción que desees con los datos obtenidos
                    System.out.println("Fila seleccionada: " + nombre + " " + apellido);
                }
            }
        });

        DefaultTableModel d = new DefaultTableModel(
                new Object[][]{
                    {"b1", "b1", "c1", "d1", "f1", "g1", 542, "Activo", btnSeleccionar},
                    {"b2", "b2", "c2", "d2", "f2", "g2", 543, "Inactivo", btnSeleccionar}
                },
                new String[]{"Nombres", "Apellidos", "Punto recogida", "Punto entrega", "Receptor", "Teléfono", "Código", "Disponibilidad", ""}
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            /*           @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();
            }*/
        };
        tabla.setModel(d);
        tabla.setRowSelectionAllowed(false);
    }

    public void tablaSeleccionar2(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new Render());

        JButton btnSeleccionar = new JButton("Seleccionar");
        btnSeleccionar.setBackground(new java.awt.Color(97, 150, 171));
        btnSeleccionar.setFont(new java.awt.Font("Arial Black", 1, 12));
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));

        DefaultTableModel d = new DefaultTableModel(
                new Object[][]{
                    {"b1", "b1", "c1", "d1", 542, "Activo", btnSeleccionar},
                    {"b2", "b2", "c2", "d2", 543, "Inactivo", btnSeleccionar}
                },
                new String[]{"Nombres", "Apellidos", "Punto recogida", "Teléfono", "Código", "Disponibilidad", ""}
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tabla.setModel(d);
        tabla.setRowSelectionAllowed(false);
    }

    public void tablaNormal(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new Render());

        JButton btnSeleccionar = new JButton("Seleccionar");
        btnSeleccionar.setBackground(new java.awt.Color(97, 150, 171));
        btnSeleccionar.setFont(new java.awt.Font("Arial Black", 1, 12));
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));

        DefaultTableModel d = new DefaultTableModel(
                new Object[][]{
                    {"b1", "b1", "c1", "d1", 542, "Activo", btnSeleccionar},
                    {"b2", "b2", "c2", "d2", 543, "Inactivo", btnSeleccionar}
                },
                new String[]{"Nombres", "Apellidos", "Punto recogida", "Teléfono", "Código", "Disponibilidad", ""}
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tabla.setModel(d);
        tabla.setRowSelectionAllowed(false);
    }
}
