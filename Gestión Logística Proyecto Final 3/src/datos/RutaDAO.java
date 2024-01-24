package datos;

import gui.ProyectoLogistica.Ruta;

import java.util.ArrayList;
import java.util.List;

public class RutaDAO implements DAO<Ruta> {
    private List<Ruta> rutas = new ArrayList<>();

    @Override
    public void agregar(Ruta ruta) {
        rutas.add(ruta);
    }

    @Override
    public List<Ruta> listar() {
        return new ArrayList<>(rutas);
    }
}
