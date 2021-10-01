package generation.com.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import generation.com.farmacia.model.Categoria;
import generation.com.farmacia.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {

	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);

	
}
