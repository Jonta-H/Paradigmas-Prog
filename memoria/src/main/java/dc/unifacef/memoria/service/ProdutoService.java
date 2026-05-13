package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Produto;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
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

    // Remove um produto com id
    public boolean remove(Long id){
        return this.produtos.removeIf(produto -> produto.getId().equals(id));
    }

    // Atualiza um produto por id
    public Produto atualiza(Long id, Produto produto){
        produto.setId(id);
        // Percorre para atualizar o produto
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getId().equals(id)){
                produtos.set(i, produto);
                return produto;
            }
        }
        return null;
    }
}
