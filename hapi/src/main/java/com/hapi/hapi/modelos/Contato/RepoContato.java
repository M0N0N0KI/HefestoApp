package com.hapi.hapi.modelos.Contato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoContato extends JpaRepository<Contato, Long> {

}
