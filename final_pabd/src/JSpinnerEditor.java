import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

class JSpinnerEditor extends DefaultCellEditor {
    private JSpinner spinner;

    public JSpinnerEditor() {
        super(new JTextField());
        spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1)); // Mínimo 0, Máximo 100, Incremento 1
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        spinner.setValue(value != null ? value : 0);
        return spinner;
    }

    @Override
    public Object getCellEditorValue() {
        return spinner.getValue();
    }
}
