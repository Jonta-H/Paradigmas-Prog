package dc.unifacef.bd.service;

import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    // A injeção de dependência será pelo construtor
    private ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo){
        this.repo = repo;
    }

    // Listar os produtos da tabela produtos
    public List<Produto> listar(){
        return repo.findAll();
    }

    // Listar os produtos da tabela produtos por um id
    public Optional<Produto> buscarPorId(Long id){
        return repo.findById(id); // Pode ou não retornar um produto
    }

    // Remove um produto da tabela Produtos
    public boolean remover(Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true; // Remove
        } return false; // Não remove
    }

    // Atualiza um produto por um Id e retorna o produto alterado
    public Produto atualizar(Long id, Produto alterado){
        if(repo.existsById(id)){
            // Produto existe para atualizar
            alterado.setId(id);
            return repo.save(alterado); // Como alterado tem Id, ele faz update
        }
        return null; // Produto não existe
    }

    // Metodo cria ou insere o produto no banco
    public Produto salva(Produto produto){
        return repo.save(produto);
    }
}
