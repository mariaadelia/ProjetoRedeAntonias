package br.org.generation.projetoIntegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.org.generation.projetoIntegrador.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByProdutoServicosContainingIgnoreCase(String produto);

	public List<Categoria> findAllByPalavraChaveContainingIgnoreCase(String chave);

}
