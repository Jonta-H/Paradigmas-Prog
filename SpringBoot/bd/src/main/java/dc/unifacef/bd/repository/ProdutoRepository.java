package dc.unifacef.bd.repository;

import dc.unifacef.bd.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Essa interface vao conter os métodos de CRUD da tabela produto
    // save(), findAll(), findById(), remove(), existsById(), count()

}
