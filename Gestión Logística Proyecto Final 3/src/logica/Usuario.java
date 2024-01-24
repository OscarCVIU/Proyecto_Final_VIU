package logica;

import java.util.List;

public class Usuario {
    private String id;
    private String nombre;
    private String clave;
    private String tipoUsuario;
    private String telefono;
    private String email;

    // Constructor
    public Usuario(String id, String nombre, String clave, String tipoUsuario, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
        this.email = email;
    }

    // Métodos GET para acceder a los atributos
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Método para cambiar la clave
    public void cambiarClave(String nuevaClave) {
        this.clave = nuevaClave;
    }

    // Caso de Uso 1: Registro de Usuario
    public void registrarUsuario() {
        // Implementa la lógica de registro de usuario aquí
        System.out.println("Usuario registrado correctamente.");
    }

    // Caso de Uso 2: Modificación de Datos de Usuario
    public void modificarDatosUsuario(String nuevoTelefono, String nuevoEmail) {
        // Implementa la lógica de modificación de datos aquí
        this.telefono = nuevoTelefono;
        this.email = nuevoEmail;
        System.out.println("Datos de usuario modificados correctamente.");
    }

    // Caso de Uso 3: Eliminación de Usuario
    public void eliminarUsuario() {
        // Implementa la lógica de eliminación de usuario aquí
        System.out.println("Usuario eliminado correctamente.");
    }

    // Caso de Uso 4: Consulta de Información de Usuario
    public void consultarInformacionUsuario() {
        // Implementa la lógica de consulta de información aquí
        System.out.println("Información del usuario:");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de Usuario: " + tipoUsuario);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }

    // Caso de Uso 5: Cambio de Clave
    public void cambiarClaveUsuario(String nuevaClave) {
        // Implementa la lógica de cambio de clave aquí
        cambiarClave(nuevaClave);
        System.out.println("Clave cambiada correctamente.");
    }
}
