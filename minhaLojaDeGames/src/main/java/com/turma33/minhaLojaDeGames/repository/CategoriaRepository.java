package com.turma33.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turma33.minhaLojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository < Categoria, Long >{
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
