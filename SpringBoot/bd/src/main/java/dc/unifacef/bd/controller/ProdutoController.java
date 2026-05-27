package dc.unifacef.bd.controller;

import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.repository.ProdutoRepository;
import dc.unifacef.bd.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Indica que recebe as requisições
@RequestMapping("/produtos")
public class ProdutoController {

    // Vamos usar um objeto da classe ProdutoService - injeção de depencência
    private ProdutoService service;
    public ProdutoController(ProdutoService service){
        this.service = service;
    }

    // Utiliza-se o ResponseEntity para retornar diferentes statusCode no FE
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(service.listar());
    }
}
