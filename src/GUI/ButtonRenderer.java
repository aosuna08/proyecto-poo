package GUI;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ButtonRenderer extends JButton implements TableCellRenderer {

    public ButtonRenderer() {
        setOpaque(true); // Asegura que el botón se pinte correctamente
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        // El valor de la celda define el texto del botón ("EDITAR" o "ELIMINAR")
        setText((value == null) ? "" : value.toString());

        return this;
    }
}