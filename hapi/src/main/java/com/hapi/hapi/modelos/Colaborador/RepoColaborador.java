package com.hapi.hapi.modelos.Colaborador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoColaborador extends JpaRepository<Colaborador, Long> {
    
}
