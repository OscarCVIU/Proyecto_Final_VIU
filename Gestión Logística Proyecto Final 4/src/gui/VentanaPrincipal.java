package gui;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class VentanaPrincipal {

    public void mostrar(Stage primaryStage) {
        primaryStage.setTitle("Gestión Logística");

        TabPane tabPane = new TabPane();
        Tab userTab = new GestionUsuariosTab().getTab();
        Tab routeTab = new GestionRutasTab().getTab();
        Tab packagingTab = new GestionEmpaquetadoTab().getTab();
        Tab billingTab = new GestionFacturacionTab().getTab();

        tabPane.getTabs().addAll(userTab, routeTab, packagingTab, billingTab);

        primaryStage.setScene(new Scene(tabPane, 800, 600));
        primaryStage.show();
    }
}
