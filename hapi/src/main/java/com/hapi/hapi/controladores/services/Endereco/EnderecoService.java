package com.hapi.hapi.controladores.services.Endereco;

import java.util.Optional;

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

    public Enderecodto RecuperarEnderecoPorId(Long id)
    {
        final Optional<Endereco> entidade = repo.findById(id);
        if(entidade.isEmpty())
        {
            return null;
        }
        else
        {
            Enderecodto endereco = new Enderecodto();
            endereco.setId(entidade.get().getId());
            endereco.setRua(entidade.get().getRua());
            endereco.setNumero(entidade.get().getNumero());
            endereco.setBairro(entidade.get().getBairro());
            endereco.setComplemento(entidade.get().getComplemento());
            endereco.setCidade(entidade.get().getCidade());
            endereco.setEstado(entidade.get().getEstado());
            endereco.setPais(entidade.get().getPais());
            endereco.setCep(entidade.get().getCep());
            return endereco;
        }
    }
    
}
