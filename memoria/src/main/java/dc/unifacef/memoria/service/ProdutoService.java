package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    // Cria o ArrayList
    List<Produto> produtos = new ArrayList<Produto>();
    private Long id = 1L;

    // Consulta os produtos da lista
    public List<Produto> consulta(){
        return this.produtos;
    }

    // Insere produto na lista
    public Produto cria(Produto produto){
        produto.setId(id);
        id++;
        this.produtos.add(produto);
        return produto;
    }
}
