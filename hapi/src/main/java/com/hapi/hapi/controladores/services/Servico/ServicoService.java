package com.hapi.hapi.controladores.services.Servico;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hapi.hapi.controladores.dto.Servicodto.Servicodto;
import com.hapi.hapi.modelos.Servico.RepoServico;
import com.hapi.hapi.modelos.Servico.Servico;

@Service
public class ServicoService {

    @Autowired
    private RepoServico repo;

    public Servico CadastrarServico(Servicodto servico)
    {
        Servico entidade = new Servico();
        entidade.setFuncao(servico.getFuncao());
        entidade.setValorEstimado(servico.getValorEstimado());
        entidade.setDescricao(servico.getDescricao());
        entidade.setEndereco(servico.getEndereco());
        entidade.setRequerente(servico.getRequerente());
        entidade.setStatus(servico.getStatus());
        return repo.save(entidade);

    }

    public Servicodto RecuperarServicoPorId(long id)
    {
        final Optional<Servico> entidade = repo.findById(id);
        if(entidade.isEmpty())
        {
            return null;
        }
        else
        {
            Servicodto servico = new Servicodto();
            servico.setFuncao(entidade.get().getFuncao());
            servico.setValorEstimado(entidade.get().getValorEstimado());
            servico.setDescricao(entidade.get().getDescricao());
            servico.setEndereco(entidade.get().getEndereco());
            servico.setRequerente(entidade.get().getRequerente());
            servico.setStatus(entidade.get().getStatus());
            return servico;
        }
    }
    
}
