package gui;

import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GestionRutasTab {

    public Tab getTab() {
        GridPane addRouteForm = new GridPane();
        // ... (aquí pondré el código para la pestaña de gestión de rutas)

        return new Tab("Gestión de Rutas", addRouteForm);
    }
}
