package gui;

import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GestionFacturacionTab {

    public Tab getTab() {
        GridPane addBillingForm = new GridPane();
        // ... (haré un código para la pestaña de gestión de facturación)

        return new Tab("Gestión de Facturación", addBillingForm);
    }
}
