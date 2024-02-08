package logica;

import java.util.Date;

public class Ruta {
    private String tipoRuta;
    private String origen;
    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String medioTransporte;

    // Constructor
    public Ruta(String tipoRuta, String origen, String destino, Date fechaSalida, Date fechaLlegada, String medioTransporte) {
        this.tipoRuta = tipoRuta;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.medioTransporte = medioTransporte;
    }

    // Métodos GET para acceder a los atributos //...

    /**
     * Caso de Uso 1: Obtener Duración Estimada de la Ruta
     * Permite calcular y devolver la duración estimada de la ruta en horas o días,
     * basándose en la diferencia entre las fechas de salida y llegada.
     * Este caso de uso es útil para proporcionar a los usuarios una estimación del tiempo de transporte.

     *    - Calcular la duración estimada de una ruta marítima desde el puerto A al puerto B.
     *    - Proporcionar a los usuarios la estimación del tiempo de entrega para una ruta terrestre.
     */
    public double obtenerDuracionEstimada() {
        // Lógica para calcular la duración estimada en horas o días según sea necesario...
        // Retorna la duración estimada
        return 0.0; // Reemplazar con la implementación real
    }

    /**
     * Caso de Uso 2: Verificar Disponibilidad de Ruta
     * Permite verificar la disponibilidad de una ruta específica en función de su tipo y fechas de salida y llegada.
     * Este caso de uso es importante para evitar conflictos de planificación y garantizar la disponibilidad de recursos.

     *    - Verificar si hay disponibilidad para una ruta aérea en una fecha específica.
     *    - Evitar la asignación de una ruta marítima que ya está programada para otro envío.
     */
    public boolean verificarDisponibilidad() {
        // Lógica para verificar la disponibilidad de la ruta según las fechas y otros criterios...
        // Retorna true si la ruta está disponible, false en caso contrario
        return false; // Reemplazar con la implementación real
    }

    // Otros métodos según necesidades //Próximas entregas prácticas
}
