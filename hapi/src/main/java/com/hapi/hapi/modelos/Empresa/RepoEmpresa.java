package com.hapi.hapi.modelos.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoEmpresa extends JpaRepository<Empresa, Long>{
    
}
