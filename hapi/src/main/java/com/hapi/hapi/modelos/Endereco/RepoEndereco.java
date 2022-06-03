package com.hapi.hapi.modelos.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoEndereco extends JpaRepository<Endereco, Long> {
}
