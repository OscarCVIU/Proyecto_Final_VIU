package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ProyectoLogistica extends Application {

    private List<Usuario> usuarios = new ArrayList<>();
    private List<Ruta> rutas = new ArrayList<>();
    private List<Empaquetado> empaquetados = new ArrayList<>();
    private List<Facturacion> facturas = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gestión Logística");

        TabPane tabPane = new TabPane();
        Tab userTab = createUserTab();
        Tab routeTab = createRouteTab();
        Tab packagingTab = createPackagingTab();
        Tab billingTab = createBillingTab();

        tabPane.getTabs().addAll(userTab, routeTab, packagingTab, billingTab);

        primaryStage.setScene(new Scene(tabPane, 800, 600));
        primaryStage.show();
    }

    private Tab createUserTab() {
        GridPane addUserForm = new GridPane();
        addUserForm.setHgap(10);
        addUserForm.setVgap(10);

        Label nameLabel = new Label("Nombre:");
        TextField nameField = new TextField();

        Label idLabel = new Label("ID:");
        TextField idField = new TextField();

        Label roleLabel = new Label("Rol:");
        ComboBox<String> roleComboBox = new ComboBox<>();
        roleComboBox.getItems().addAll("Administrador", "Jefe de Sección", "Operario");

        Button addUserButton = new Button("Agregar Usuario");
        addUserButton.setOnAction(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            String role = roleComboBox.getValue();

            usuarios.add(new Usuario(id, name, role));
            // Aquí podría agregar lógica para persistir

            // Limpiamos los campos después de agregar usuario
            nameField.clear();
            idField.clear();
            roleComboBox.setValue(null);
        });

        addUserForm.add(nameLabel, 0, 0);
        addUserForm.add(nameField, 1, 0);
        addUserForm.add(idLabel, 0, 1);
        addUserForm.add(idField, 1, 1);
        addUserForm.add(roleLabel, 0, 2);
        addUserForm.add(roleComboBox, 1, 2);
        addUserForm.add(addUserButton, 1, 3);

        return new Tab("Gestión de Usuarios", addUserForm);
    }

    private Tab createRouteTab() {
        GridPane addRouteForm = new GridPane();
        addRouteForm.setHgap(10);
        addRouteForm.setVgap(10);

        Label originLabel = new Label("Origen:");
        TextField originField = new TextField();

        Label destinationLabel = new Label("Destino:");
        TextField destinationField = new TextField();

        Label transportLabel = new Label("Medio de Transporte:");
        ComboBox<String> transportComboBox = new ComboBox<>();
        transportComboBox.getItems().addAll("Terrestre", "Marítima", "Aérea");

        Button addRouteButton = new Button("Agregar Ruta");
        addRouteButton.setOnAction(e -> {
            String origin = originField.getText();
            String destination = destinationField.getText();
            String transport = transportComboBox.getValue();

            rutas.add(new Ruta(origin, destination, transport));
            // lógica

            // Limpiamos
            originField.clear();
            destinationField.clear();
            transportComboBox.setValue(null);
        });

        addRouteForm.add(originLabel, 0, 0);
        addRouteForm.add(originField, 1, 0);
        addRouteForm.add(destinationLabel, 0, 1);
        addRouteForm.add(destinationField, 1, 1);
        addRouteForm.add(transportLabel, 0, 2);
        addRouteForm.add(transportComboBox, 1, 2);
        addRouteForm.add(addRouteButton, 1, 3);

        return new Tab("Gestión de Rutas", addRouteForm);
    }

    private Tab createPackagingTab() {
        GridPane addPackagingForm = new GridPane();
        addPackagingForm.setHgap(10);
        addPackagingForm.setVgap(10);

        Label containersLabel = new Label("Número de Contenedores:");
        TextField containersField = new TextField();

        Label weightLabel = new Label("Peso del Producto:");
        TextField weightField = new TextField();

        Label sizeLabel = new Label("Tamaño del Producto:");
        TextField sizeField = new TextField();

        Button addPackagingButton = new Button("Agregar Empaquetado");
        addPackagingButton.setOnAction(e -> {
            int containers = Integer.parseInt(containersField.getText());
            double weight = Double.parseDouble(weightField.getText());
            double size = Double.parseDouble(sizeField.getText());

            empaquetados.add(new Empaquetado(containers, weight, size));
            // Podemos agregar lógica para persistir datos de empaquetado en la base de datos

            // Limpiar
            containersField.clear();
            weightField.clear();
            sizeField.clear();
        });

        addPackagingForm.add(containersLabel, 0, 0);
        addPackagingForm.add(containersField, 1, 0);
        addPackagingForm.add(weightLabel, 0, 1);
        addPackagingForm.add(weightField, 1, 1);
        addPackagingForm.add(sizeLabel, 0, 2);
        addPackagingForm.add(sizeField, 1, 2);
        addPackagingForm.add(addPackagingButton, 1, 3);

        return new Tab("Gestión de Empaquetado", addPackagingForm);
    }

    private Tab createBillingTab() {
        GridPane addBillingForm = new GridPane();
        addBillingForm.setHgap(10);
        addBillingForm.setVgap(10);

        Label conceptLabel = new Label("Concepto:");
        TextField conceptField = new TextField();

        Label costLabel = new Label("Costo del Concepto:");
        TextField costField = new TextField();

        Label ivaLabel = new Label("Tasa de IVA:");
        TextField ivaField = new TextField();

        Button addBillingButton = new Button("Agregar Facturación");
        addBillingButton.setOnAction(e -> {
            String concept = conceptField.getText();
            double cost = Double.parseDouble(costField.getText());
            double iva = Double.parseDouble(ivaField.getText());

            facturas.add(new Facturacion(concept, cost, iva));
            // to do: agregar lógica para persistir datos de facturación en la base de datos

            // Limpiar
            conceptField.clear();
            costField.clear();
            ivaField.clear();
        });

        addBillingForm.add(conceptLabel, 0, 0);
        addBillingForm.add(conceptField, 1, 0);
        addBillingForm.add(costLabel, 0, 1);
        addBillingForm.add(costField, 1, 1);
        addBillingForm.add(ivaLabel, 0, 2);
        addBillingForm.add(ivaField, 1, 2);
        addBillingForm.add(addBillingButton, 1, 3);

        return new Tab("Gestión de Facturación", addBillingForm);
    }

    public static class Usuario {
        private String id;
        private String nombre;
        private String rol;

        public Usuario(String id, String nombre, String rol) {
            this.id = id;
            this.nombre = nombre;
            this.rol = rol;
        }

        // To do: Valoraré agregar más métodos.
    }

    public static class Ruta {
        private String origen;
        private String destino;
        private String medioTransporte;

        public Ruta(String origen, String destino, String medioTransporte) {
            this.origen = origen;
            this.destino = destino;
            this.medioTransporte = medioTransporte;
        }

        // To do: Valoraré agregar más métodos.
    }

    public static class Empaquetado {
        private int numeroContenedores;
        private double pesoProducto;
        private double tamanoProducto;

        public Empaquetado(int numeroContenedores, double pesoProducto, double tamanoProducto) {
            this.numeroContenedores = numeroContenedores;
            this.pesoProducto = pesoProducto;
            this.tamanoProducto = tamanoProducto;
        }

        // To do: Valoraré agregar más métodos.
    }

    public static class Facturacion {
        private String concepto;
        private double costoConcepto;
        private double iva;

        public Facturacion(String concepto, double costoConcepto, double iva) {
            this.concepto = concepto;
            this.costoConcepto = costoConcepto;
            this.iva = iva;
        }

        // To do: Valoraré agregar más métodos.
    }
}
