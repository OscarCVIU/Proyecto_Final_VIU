package gui;

import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GestionUsuariosTab {

    public Tab getTab() {
        GridPane addUserForm = new GridPane();
        // ... (aquí pondré el código para la pestaña de gestión de usuarios)

        return new Tab("Gestión de Usuarios", addUserForm);
    }
}
