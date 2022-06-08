package com.hapi.hapi.modelos.Experiencia;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoExperiencia extends JpaRepository<Experiencia, Long>{

    @Query("select e from Experiencia e where e.empresa = ?1 and e.cargo = ?2 and e.inicio = ?3 and e.fim = ?4")
    public Optional<Experiencia> verSeExiste(String empresa, 
        String cargo, 
        Date inicio, 
        Date fim
    );
    
    @Query("select e from experiencia e where e.colaborador = ?1")
    public List<Experiencia> carregarExp(Long id);

}
