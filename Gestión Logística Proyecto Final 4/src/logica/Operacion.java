package logica;

import java.util.ArrayList;
import java.util.List;

public class Operacion {
    private String tipoRuta;
    private Ruta ruta;
    private Empaquetado empaquetado;
    private Facturacion facturacion;
    private List<String> logs;

    public Operacion(String tipoRuta) {
        this.tipoRuta = tipoRuta;
        this.logs = new ArrayList<>();
    }

    /**
     * Caso de Uso 1: Asignar Ruta a la Operación
     * Permite asignar una ruta específica a la operación, registrando la información de origen y destino.
     * Este caso de uso es esencial para coordinar y seguir la ruta de transporte asociada a la operación.
     *    - Asignar una ruta marítima desde el puerto A al puerto B.
     *    - Registrar la ruta terrestre desde el almacén X hasta el centro de distribución Y.
     */
    public void asignarRuta(Ruta ruta) {
        this.ruta = ruta;
        registrarLog("Ruta asignada: " + ruta.getOrigen() + " a " + ruta.getDestino());
        // Lógica adicional según sea necesario...más adelante se diseñará
    }

    /**
     * Caso de Uso 2: Asignar Empaquetado a la Operación
     * Permite asignar un empaquetado específico a la operación, registrando la cantidad de contenedores.
     * Este caso de uso es crucial para gestionar la preparación de la mercancía para el transporte.

     *    - Asignar el empaquetado con 3 contenedores para un envío específico.
     *    - Registrar el empaquetado con 5 contenedores para otro tipo de operación.
     */
    public void asignarEmpaquetado(Empaquetado empaquetado) {
        this.empaquetado = empaquetado;
        registrarLog("Empaquetado asignado: " + empaquetado.getNumeroContenedores() + " contenedores");
        // Lógica adicional según sea necesario que más adelante se diseñará
    }

    /**
     * Caso de Uso 3: Asignar Facturación a la Operación
     * Permite asignar una facturación específica a la operación, registrando el concepto asociado.
     * Este caso de uso es fundamental para gestionar la facturación de la operación logística.

     *    - Asignar la facturación con el concepto "Transporte Internacional".
     *    - Registrar la facturación con el concepto "Almacenamiento Temporal".
     */
    public void asignarFacturacion(Facturacion facturacion) {
        this.facturacion = facturacion;
        registrarLog("Facturación asignada: " + facturacion.getConcepto());
        // Lógica adicional según sea necesario que más adelante se diseñará
    }

    /**
     * Caso de Uso 4: Obtener Logs de la Operación
     * Permite obtener la lista de registros (logs) asociados a la operación.
     * Este caso de uso es útil para el seguimiento y la resolución de problemas durante la operación.

     *    - Consultar los logs para identificar eventos o irregularidades en la operación.
     *    - Obtener un historial de registros para fines de auditoría.
     */
    public List<String> obtenerLogs() {
        return new ArrayList<>(logs);
        // Lógica adicional según sea necesario que más adelante se diseñará
    }

    // Otros métodos según necesidades //Próximas entregas...
}
