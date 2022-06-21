package com.hapi.hapi.modelos.Formacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoFormacao extends JpaRepository<Formacao, Long> {
}