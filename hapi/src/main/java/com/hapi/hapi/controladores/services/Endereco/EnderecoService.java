package com.hapi.hapi.controladores.services.Endereco;

import com.hapi.hapi.controladores.dto.Enderecodto.Enderecodto;
import com.hapi.hapi.modelos.Endereco.Endereco;
import com.hapi.hapi.modelos.Endereco.RepoEndereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private RepoEndereco repo;

    public Endereco CadastrarEndereco(Enderecodto endereco)
    {
        Endereco entidade = new Endereco();
        entidade.setRua(endereco.getRua());
        entidade.setNumero(endereco.getNumero());
        entidade.setBairro(endereco.getBairro());
        entidade.setComplemento(endereco.getComplemento());
        entidade.setCidade(endereco.getCidade());
        entidade.setEstado(endereco.getEstado());
        entidade.setPais(endereco.getPais());
        entidade.setCep(endereco.getCep());
        return repo.save(entidade);
    }
    
}
