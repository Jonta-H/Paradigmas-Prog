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
}
