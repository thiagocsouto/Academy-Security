package br.com.academy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.academy.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	@Query("select a from Usuario a where a.email = :email")
	public Usuario findByEmail(String email); 
	
//	@Query("select b from Usuario b where b.login = :login and b.senha = :senha")
//	public Usuario buscarLogin(String login, String senha);

	public Usuario findByUsername(String username); 

}
