package datos;

import gui.ProyectoLogistica.Facturacion;

import java.util.ArrayList;
import java.util.List;

public class FacturacionDAO implements DAO<Facturacion> {
    private List<Facturacion> facturas = new ArrayList<>();

    @Override
    public void agregar(Facturacion factura) {
        facturas.add(factura);
    }

    @Override
    public List<Facturacion> listar() {
        return new ArrayList<>(facturas);
    }
}
