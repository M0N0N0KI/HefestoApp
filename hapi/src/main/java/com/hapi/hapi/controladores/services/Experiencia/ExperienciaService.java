package com.hapi.hapi.controladores.services.Experiencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hapi.hapi.controladores.dto.Experiencia.SExperienciadto;
import com.hapi.hapi.modelos.Experiencia.Experiencia;
import com.hapi.hapi.modelos.Experiencia.RepoExperiencia;

@Service
public class ExperienciaService {
    
    @Autowired
    private RepoExperiencia repo;

    public SExperienciadto CadastrarExperiencia(SExperienciadto experiencia)
    {
        final Optional<Experiencia> aux = repo.verSeExiste(
            experiencia.getEmpresa(), 
            experiencia.getCargo(),
            experiencia.getInicio(),
            experiencia.getFim());
        
        if(aux.isEmpty())
        {
            Experiencia entidade = new Experiencia(experiencia);
            entidade = repo.save(entidade);
            return(entidade != null)
                ?new SExperienciadto(entidade)
                :null;
        }
        else
        {
            return new SExperienciadto(aux.get());
        }
    }
    public List<SExperienciadto> CarregarExpPeloId(Long id)
    {
        final List<Experiencia> entidade = repo.carregarExp(id);
        if(entidade.isEmpty())
        {
            return null;
        }
        else
        {
            List<SExperienciadto> exp = new ArrayList<>();
            int tamanho =entidade.size();
            int medidor = 0;
            while(medidor<tamanho)
            {
                exp.add(new SExperienciadto(entidade.get(tamanho)));
                medidor++;
            }

            return exp;
        }
    }
}
