package com.turma33.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turma33.minhaLojaDeGames.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
}
