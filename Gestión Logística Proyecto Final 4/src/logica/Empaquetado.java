package logica;

public class Empaquetado {
    private int numeroContenedores;
    private double pesoProducto;
    private double tamanoProducto;

    // Otros atributos según necesidades. //Próximas entregas...

    public Empaquetado(int numeroContenedores, double pesoProducto, double tamanoProducto) {
        this.numeroContenedores = numeroContenedores;
        this.pesoProducto = pesoProducto;
        this.tamanoProducto = tamanoProducto;
    }

    /**
     * Caso de Uso 1: Configurar Número de Contenedores
     * Permite al usuario o sistema configurar el número de contenedores para el empaquetado del producto.
     * Este caso de uso es esencial para adaptar el empaquetado a las necesidades específicas de transporte y almacenamiento.

     *    - Establecer el número exacto de contenedores requeridos para una carga.
     *    - Modificar el número de contenedores según las restricciones de espacio.
     */
    public void configurarNumeroContenedores(int nuevoNumeroContenedores) {
        this.numeroContenedores = nuevoNumeroContenedores;
        // Lógica adicional según necesidad en próximas entregas...
    }

    /**
     * Caso de Uso 2: Actualizar Peso del Producto
     * Permite al usuario o sistema actualizar el peso del producto que será empaquetado.
     * Este caso de uso es crucial para garantizar la precisión en la gestión de la carga y el cálculo de costos asociados.

     *    - Modificar el peso del producto en función de cambios en la composición o cantidad.
     *    - Actualizar el peso para cumplir con regulaciones específicas de carga.
     */
    public void actualizarPesoProducto(double nuevoPesoProducto) {
        this.pesoProducto = nuevoPesoProducto;
        // Lógica adicional según necesidad en próximas entregas...
    }

    /**
     * Caso de Uso 3: Ajustar Tamaño del Producto
     * Permite al usuario o sistema ajustar las dimensiones del producto que será empaquetado.
     * Este caso de uso es fundamental para adaptar el empaquetado a restricciones de espacio y asegurar la eficiencia en el transporte.

     *    - Modificar las dimensiones del producto para maximizar el espacio en el contenedor.
     *    - Ajustar el tamaño para cumplir con requisitos específicos de almacenamiento.
     */
    public void ajustarTamanoProducto(double nuevoTamanoProducto) {
        this.tamanoProducto = nuevoTamanoProducto;
        // Lógica adicional según necesidad en próximas entregas....
    }

    // Otros métodos según necesidades //Para próximas entregas
}
