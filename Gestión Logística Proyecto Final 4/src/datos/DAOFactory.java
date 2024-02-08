package datos;

public class DAOFactory {
    public static UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAO();
    }

    public static RutaDAO getRutaDAO() {
        return new RutaDAO();
    }

    public static EmpaquetadoDAO getEmpaquetadoDAO() {
        return new EmpaquetadoDAO();
    }

    public static FacturacionDAO getFacturacionDAO() {
        return new FacturacionDAO();
    }
}
