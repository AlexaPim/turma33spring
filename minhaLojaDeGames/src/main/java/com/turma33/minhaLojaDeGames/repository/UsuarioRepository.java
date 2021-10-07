package com.turma33.minhaLojaDeGames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.turma33.minhaLojaDeGames.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);

}
