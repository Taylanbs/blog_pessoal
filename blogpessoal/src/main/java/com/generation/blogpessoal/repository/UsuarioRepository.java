package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Usuário;

public interface UsuarioRepository extends JpaRepository<Usuário, Long>{

	public Optional<Usuário> findByUsuario(String usuario);
	
}