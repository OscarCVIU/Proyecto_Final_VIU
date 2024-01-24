package gui;

import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GestionEmpaquetadoTab {

    public Tab getTab() {
        GridPane addPackagingForm = new GridPane();
        // ... (haré un código para la pestaña de gestión de empaquetado)

        return new Tab("Gestión de Empaquetado", addPackagingForm);
    }
}
