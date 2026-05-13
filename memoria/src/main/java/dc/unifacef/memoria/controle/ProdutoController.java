package dc.unifacef.memoria.controle;

import dc.unifacef.memoria.model.Produto;
import dc.unifacef.memoria.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController // Controlador de requisição REST
@RequestMapping("/produto") // Mapeamento da requisição
public class ProdutoController {

    // Injeção de dependência
    // Chamar métodos de um objeto sem instanciá-lo
    @Autowired
    ProdutoService service;

    // ResponseEntity é um tipo de dado de retorno do controller para FE
    @GetMapping
    public ResponseEntity<List<Produto>> consulta(){
        return ResponseEntity.ok(service.consulta());
    }

    @PostMapping
    public ResponseEntity<Produto> cria(@RequestBody Produto produto){
        Produto novo = service.cria(produto);

        // URI Uniform Resource Identifier
        URI uri = URI.create("/produto/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id){
        if(service.remove(id)){
            return ResponseEntity.noContent().build(); // sucesso - 204
        } else{
            return ResponseEntity.notFound().build(); // erro cliente - 404
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualiza(@PathVariable Long id, @RequestBody Produto novo){
        Produto resposta = service.atualiza(id, novo);
        if(resposta != null){
            return ResponseEntity.ok(resposta); // ok - 200
        } else return ResponseEntity.notFound().build(); // not found - 404
    }
}
