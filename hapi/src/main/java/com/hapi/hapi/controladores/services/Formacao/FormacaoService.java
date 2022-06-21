package com.hapi.hapi.controladores.services.Formacao;

import java.util.Optional;

import com.hapi.hapi.controladores.dto.Formacaodto.Formacaodto;
import com.hapi.hapi.modelos.Formacao.Formacao;
import com.hapi.hapi.modelos.Formacao.RepoFormacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacaoService {

    @Autowired
    private RepoFormacao repo;

    public Formacao CadastrarFormacao(Formacaodto formacao)
    {
        Formacao entidade = new Formacao();
        entidade.setInstituicao(formacao.getInstituicao());
        entidade.setCurso(formacao.getCurso());
        entidade.setInicio(formacao.getInicio());
        entidade.setCompleta(formacao.getCompleta());
        entidade.setFim(formacao.getFim());
        entidade.setDescricao(formacao.getDescricao());
        entidade.setFile(formacao.getFile());
        entidade.setColaborador(formacao.getColaborador());
        return repo.save(entidade);

    }

    public Formacaodto RecuperarFormacaoPorId(long id)
    {
        final Optional<Formacao> entidade = repo.findById(id);
        if(entidade.isEmpty())
        {
            return null;
        }
        else
        {
            Formacaodto formacao = new Formacaodto();
            formacao.setInstituicao(entidade.get().getInstituicao());
            formacao.setCurso(entidade.get().getCurso());
            formacao.setInicio(entidade.get().getInicio());
            formacao.setCompleta(entidade.get().getCompleta());
            formacao.setFim(entidade.get().getFim());
            formacao.setDescricao(entidade.get().getDescricao());
            formacao.setFile(entidade.get().getFile());
            formacao.setColaborador(entidade.get().getColaborador());
            return formacao;

        }
    }
}
