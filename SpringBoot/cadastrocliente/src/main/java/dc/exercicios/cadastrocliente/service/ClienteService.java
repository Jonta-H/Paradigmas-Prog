package dc.exercicios.cadastrocliente.service;

import dc.exercicios.cadastrocliente.model.Cliente;
import org.springframework.stereotype.Service;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> listaClientes = new ArrayList<>();
    private Long id = 1L;

    public List<Cliente> listar(){
        return this.listaClientes;
    }

    public Cliente criar(Cliente c){
        c.setId(id);
        id++;
        this.listaClientes.add(c);
        return c;
    }

    public Cliente buscarId(Long id){
        Cliente c = listaClientes.stream().filter(cl -> cl.getId() == id).findFirst().orElse(null);
        return c;
    }

    public boolean remover(Long id){
        return listaClientes.removeIf(c -> c.getId().equals(id));
    }

    public Cliente atualizar(Long id, Cliente novo){
        Cliente cliente = buscarId(id);
        if(cliente != null) {
            novo.setId(id);
            listaClientes.set(listaClientes.indexOf(cliente), novo);
            return cliente;
        }
        return null;
    }
}
