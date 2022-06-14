package com.hapi.hapi.controladores.services.Vaga;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hapi.hapi.controladores.dto.Vaga.VagaDto;
import com.hapi.hapi.modelos.Vaga.RepoVaga;
import com.hapi.hapi.modelos.Vaga.Vaga;

@Service
public class VagaService {
    @Autowired
    private RepoVaga repo;

    public Vaga CadastrarVaga(VagaDto vaga){
        Vaga entidade = new Vaga();
        entidade.setId(vaga.getId());
        entidade.setCargaHoraria(vaga.getCargaHoraria());
        entidade.setStatus(vaga.getStatus());
        entidade.setEmpresa(vaga.getEmpresa());
        entidade.setPreRequisitos(vaga.getPreRequisitos());
        entidade.setDiferenciais(vaga.getDiferenciais());
        entidade.setDescricao(vaga.getDescricao());
        entidade.setInicio(vaga.getInicio());
        entidade.setFim(vaga.getFim());
        return repo.save(entidade);
        
    }
    public VagaDto RecuperarVagaDtoPorId(Long id){
        
        final Optional<Vaga> entidade = repo.findById(id);

        if(entidade.isEmpty()){
            return null;
        }else{
            VagaDto vaga = new VagaDto();
            vaga.setId(entidade.get().getId());
            vaga.setCargaHoraria(entidade.get().getCargaHoraria());
            vaga.setStatus(entidade.get().getStatus());
            vaga.setEmpresa(entidade.get().getEmpresa());
            vaga.setPreRequisitos(entidade.get().getPreRequisitos());
            vaga.setDiferenciais(entidade.get().getDiferenciais());
            vaga.setDescricao(entidade.get().getDescricao());
            vaga.setInicio(entidade.get().getInicio());
            vaga.setFim(entidade.get().getFim());
            return vaga;
        }
    }
}
