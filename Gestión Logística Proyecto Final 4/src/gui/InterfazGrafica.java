package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import logica.Administrador;
import logica.Usuario;

import java.util.ArrayList;
import java.util.List;

public class InterfazGrafica extends Application {

    private Administrador administrador;
    private List<Usuario> usuarios;

    @Override
    public void start(Stage primaryStage) {
        // Crear objetos de prueba para simular la lógica
        administrador = new Administrador("admin", "Admin", "adminpass", "123456789", "admin@example.com");
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("user1", "User 1", "user1pass", "Usuario", "987654321", "user1@example.com"));
        usuarios.add(new Usuario("user2", "User 2", "user2pass", "Usuario", "987654321", "user2@example.com"));

        // Configurar la ventana principal
        primaryStage.setTitle("Sistema de Gestión Logística");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Botones para realizar acciones administrativas
        Button btnGestionUsuarios = new Button("Gestionar Usuarios");
        btnGestionUsuarios.setOnAction(e -> administrador.gestionarUsuarios(usuarios));

        Button btnRealizarAcciones = new Button("Realizar Acciones Administrativas");
        btnRealizarAcciones.setOnAction(e -> administrador.realizarAccionesAdministrativas());

        Button btnConsultarEstadisticas = new Button("Consultar Estadísticas del Sistema");
        btnConsultarEstadisticas.setOnAction(e -> administrador.consultarEstadisticasSistema());

        Button btnGenerarReportes = new Button("Generar Reportes de Actividad");
        btnGenerarReportes.setOnAction(e -> administrador.generarReportesActividad());

        Button btnAsignarPrivilegios = new Button("Asignar Privilegios a Usuarios");
        btnAsignarPrivilegios.setOnAction(e -> administrador.asignarPrivilegiosUsuario(usuarios.get(0), "Administrador"));

        Button btnRealizarAuditoria = new Button("Realizar Auditoría del Sistema");
        btnRealizarAuditoria.setOnAction(e -> administrador.realizarAuditoriaSistema());

        // Añadir botones al gridPane
        gridPane.addRow(0, btnGestionUsuarios, btnRealizarAcciones, btnConsultarEstadisticas);
        gridPane.addRow(1, btnGenerarReportes, btnAsignarPrivilegios, btnRealizarAuditoria);

        // Configurar la escena y mostrar la ventana
        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
