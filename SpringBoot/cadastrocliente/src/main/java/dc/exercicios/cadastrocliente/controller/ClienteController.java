package dc.exercicios.cadastrocliente.controller;

import dc.exercicios.cadastrocliente.model.Cliente;
import dc.exercicios.cadastrocliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> consulta(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> consulta(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente){
        Cliente c = service.criar(cliente);

        URI uri = URI.create("/clientes" + c.getId());
        return ResponseEntity.created(uri).body(c);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        if(service.remover(id)){
            return ResponseEntity.noContent().build();
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        Cliente clienteNovo = service.atualizar(id, cliente);
        if(clienteNovo != null) {
            return ResponseEntity.ok(clienteNovo);
        }else return ResponseEntity.notFound().build();
        /* Importante a utilização do ResponseEntity.notFound().build()
            para que haja uma clara e transparente comunicação entre API e requisitor,
            deixando claro que a busca no banco de dados foi efetuada porém o
            recurso requisitado não existe (ERRO 404 - Not Found).
         */
    }
}
