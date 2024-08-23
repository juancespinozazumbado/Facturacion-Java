
package Interfaces;

import Models.Cliente;
import java.util.List;

public interface ClienteDAO {
    
    public List<Cliente> ObtenerClientes();
    public Cliente ObtenerCliente(String Id);
    public void EliminarCliente(String Id);
    public void ActualizarCliente(Cliente cliente);
    public void CrearCliente(Cliente cliente);
}
