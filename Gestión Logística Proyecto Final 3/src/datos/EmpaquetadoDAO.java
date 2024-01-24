package datos;

import gui.ProyectoLogistica.Empaquetado;

import java.util.ArrayList;
import java.util.List;

public class EmpaquetadoDAO implements DAO<Empaquetado> {
    private List<Empaquetado> empaquetados = new ArrayList<>();

    @Override
    public void agregar(Empaquetado empaquetado) {
        empaquetados.add(empaquetado);
    }

    @Override
    public List<Empaquetado> listar() {
        return new ArrayList<>(empaquetados);
    }
}
