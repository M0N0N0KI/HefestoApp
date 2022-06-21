package com.hapi.hapi.modelos.Servico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoServico extends JpaRepository<Servico, Long> {
}