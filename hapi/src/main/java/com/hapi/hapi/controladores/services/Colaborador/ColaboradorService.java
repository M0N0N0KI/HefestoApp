package com.hapi.hapi.controladores.services.Colaborador;

import java.util.Optional;

import com.hapi.hapi.controladores.dto.Colaboradordto.Colaboradordto;
import com.hapi.hapi.modelos.Colaborador.Colaborador;
import com.hapi.hapi.modelos.Colaborador.RepoColaborador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService {
    
    @Autowired
    private RepoColaborador repo;

    public Colaborador CadastrarColaborador(Colaboradordto colaborador)
    {
        Colaborador entidade = new Colaborador();
        entidade.setGithub(colaborador.getGithub());
        entidade.setBehance(colaborador.getBehance());
        entidade.setLinkedin(colaborador.getLinkedin());
        return repo.save(entidade);
    }

    public Colaboradordto RecuperarColaboradorPorId(Long id)
    {
        final Optional<Colaborador> entidade = repo.findById(id);
        if(entidade.isEmpty())
        {
            return null;
        }
        else
        {
            Colaboradordto colaborador = new Colaboradordto();
            colaborador.setId(entidade.get().getId());
            colaborador.setGithub(entidade.get().getGithub());
            colaborador.setBehance(entidade.get().getBehance());
            colaborador.setLinkedin(entidade.get().getLinkedin());
            return colaborador;
        }
    }
}