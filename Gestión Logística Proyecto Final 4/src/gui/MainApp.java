package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Aquí se inicia la aplicación creando una instancia de la ventana principal
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.mostrar(primaryStage);
    }
}
