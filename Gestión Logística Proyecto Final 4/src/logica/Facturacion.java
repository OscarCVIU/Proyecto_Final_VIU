package logica;

public class Facturacion {
    private String concepto;
    private double costoConcepto;
    private double iva;

    public Facturacion(String concepto, double costoConcepto, double iva) {
        this.concepto = concepto;
        this.costoConcepto = costoConcepto;
        this.iva = iva;
    }

    /**
     * Caso de Uso 1: Configurar Concepto de Facturación
     * Permite al usuario o sistema configurar el concepto asociado a la facturación.
     * Este caso de uso es esencial para definir claramente la naturaleza del costo en la factura.

     *    - Establecer el concepto como "Transporte de Mercancías" o "Almacenamiento".
     *    - Modificar el concepto para reflejar cambios en la naturaleza del servicio.
     */
    public void configurarConcepto(String nuevoConcepto) {
        this.concepto = nuevoConcepto;
        // Lógica adicional según sea necesario...próximas entregas...
    }

    /**
     * Caso de Uso 2: Actualizar Costo del Concepto
     * Permite al usuario o sistema actualizar el costo asociado al concepto en la facturación.
     * Este caso de uso es crucial para reflejar cambios en los costos de los servicios prestados.

     *    - Modificar el costo del concepto en función de cambios en las tarifas.
     *    - Ajustar el costo para reflejar cambios en los gastos operativos.
     */
    public void actualizarCostoConcepto(double nuevoCostoConcepto) {
        this.costoConcepto = nuevoCostoConcepto;
        // Lógica adicional según sea necesario...próximas entregas...
    }

    /**
     * Caso de Uso 3: Ajustar Tasa de Impuesto (IVA)
     * Permite al usuario o sistema ajustar la tasa de impuesto al valor agregado (IVA) asociada a la facturación.
     * Este caso de uso es fundamental para adaptarse a cambios en las regulaciones fiscales.

     *    - Modificar la tasa de IVA para cumplir con nuevas normativas fiscales.
     *    - Ajustar la tasa de IVA en respuesta a cambios en las políticas gubernamentales.
     */
    public void ajustarTasaIVA(double nuevaTasaIVA) {
        this.iva = nuevaTasaIVA;
        // Lógica adicional según sea necesario...próximas entregas...
    }

    // Otros métodos según necesidades //Próximas entregas de la práctica
}
