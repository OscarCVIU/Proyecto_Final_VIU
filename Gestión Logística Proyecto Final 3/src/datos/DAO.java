package datos;

import java.util.List;

public interface DAO<T> {
    void agregar(T entidad);
    List<T> listar();
}
