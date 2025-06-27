package GUI;

import App.Conexion;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class ButtonEditor extends DefaultCellEditor {
    protected JButton button;
    private String label;
    private boolean isPushed;
    private String accion;
    private VistaAspirante parent;

    public ButtonEditor(JCheckBox checkBox, VistaAspirante parent, String accion) {
        super(checkBox);
        this.parent = parent;
        this.accion = accion;
        button = new JButton();
        button.setOpaque(true);

        button.addActionListener(e -> fireEditingStopped());
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            int fila = parent.tablaAspirantes.getSelectedRow();
            String numInterno = parent.tablaAspirantes.getValueAt(fila, 0).toString();

            if ("editar".equalsIgnoreCase(accion)) {
                new VistaEditarAspirante(numInterno, parent).setVisible(true);
            } else if ("eliminar".equalsIgnoreCase(accion)) {
                int confirm = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar este registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    eliminarAspirante(numInterno);
                    parent.mostrarAspirantes();
                }
            }
        }
        isPushed = false;
        return label;
    }

    private void eliminarAspirante(String numInterno) {
        try (Connection conn = new Conexion().ConectarBD()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM aspirante WHERE numeroInternoJuventud = ?");
            ps.setString(1, numInterno);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
        }
    }

    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }
}
