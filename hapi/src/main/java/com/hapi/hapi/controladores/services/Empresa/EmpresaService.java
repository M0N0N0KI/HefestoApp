package com.hapi.hapi.controladores.services.Empresa;

import java.util.Optional;

import com.hapi.hapi.controladores.dto.Empresadto.Empresadto;
import com.hapi.hapi.modelos.Empresa.Empresa;
import com.hapi.hapi.modelos.Empresa.RepoEmpresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    
    @Autowired
    private RepoEmpresa repo;

    public Empresa CadastrarEmpresa(Empresadto empresa)
    {
        Empresa entidade = new Empresa();
        entidade.setSite(empresa.getSite());
        entidade.setTipo(empresa.getTipo());
        return repo.save(entidade);
    }

    public Empresadto RecuperarmpresaPorId(Long id)
    {
        final Optional<Empresa> entidade = repo.findById(id);
        if(entidade.isEmpty())
        {
            return null;
        }
        else
        {
            Empresadto empresa = new Empresadto();
            empresa.setId(entidade.get().getId());
            empresa.setSite(entidade.get().getSite());
            empresa.setTipo(entidade.get().getTipo());
            return empresa;
        }
    }
}
