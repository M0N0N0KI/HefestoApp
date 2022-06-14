package com.hapi.hapi.controladores.services.Vaga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hapi.hapi.controladores.dto.Vaga.VagaDto;
import com.hapi.hapi.modelos.Vaga.RepoVaga;
import com.hapi.hapi.modelos.Vaga.Vaga;

@Service
public class vaga {
    @Autowired
    private RepoVaga repo;

    public Vaga CadastrarVaga(VagaDto vaga){
        Vaga entidade = new Vaga();
        entidade.setId(vaga.getId());
        return entidade;
        
    }
}
