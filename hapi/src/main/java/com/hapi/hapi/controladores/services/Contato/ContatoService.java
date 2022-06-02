package com.hapi.hapi.controladores.services.Contato;

import com.hapi.hapi.controladores.dto.Contatodto.Contatodto;
import com.hapi.hapi.modelos.Contato.Contato;
import com.hapi.hapi.modelos.Contato.RepoContato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {
    
    @Autowired
    private RepoContato repo;

    public Contato CadastrarContato(Contatodto contato)
    {
        Contato entidade = new Contato();
        entidade.setEmail(contato.getEmail());
        entidade.setTelefone(contato.getTelefone());
        entidade.setCelular(contato.getCelular());
        return repo.save(entidade);
    }
    
}
