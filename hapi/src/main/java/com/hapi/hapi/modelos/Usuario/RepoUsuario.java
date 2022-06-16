package com.hapi.hapi.modelos.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUsuario extends JpaRepository<Usuario, Long>{
    
    /**
     * Sempre lembrar que a anotação column_name muda o nome na tabela 
     * mas nao no mapeamento do springboot entao em querys personalizadas 
     * ainda usa os nomes da classe e nao do banco
     */
    @Query("select u from Usuario u where u.identificador = ?1")
    public Optional<Usuario> buscarPorIdentificador(String identificador);

    @Query("select u from Usuario u where u.identificador = ?1 and u.senha = ?2")
    public Optional<Usuario> validarPorIdentificador(String identificador, String senha);

    @Query("select u from Usuario u where u.nome = ?1 and u.identificador = ?2")
    public Optional<Usuario> validarNomeID(String nome, String identificador);

    @Query("select u from Usuario u where u.nome = ?1 and u.senha = ?2")
    public Optional<Usuario> validarPorNome(String identificador, String senha);
}
