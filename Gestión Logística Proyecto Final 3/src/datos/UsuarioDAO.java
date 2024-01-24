package datos;

import gui.ProyectoLogistica.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements DAO<Usuario> {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void agregar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return new ArrayList<>(usuarios);
    }
}
