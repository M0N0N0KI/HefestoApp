package com.hapi.hapi.controladores.dto.Experiencia;

import com.hapi.hapi.modelos.Experiencia.Experiencia;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SExperienciadto extends Experienciadto{

    private Long servico;

    private Long colaborador;

    public SExperienciadto()
    {

    }
    public SExperienciadto(Experiencia experiencia)
    {
        this.setId(experiencia.getId());
        this.setEmpresa(experiencia.getEmpresa());
        this.setCargo(experiencia.getCargo());
        this.setInicio(experiencia.getInicio());
        this.setAtual(experiencia.getAtual());
        this.setFim(experiencia.getFim());
        this.setDescricao(experiencia.getDescricao());
        this.setTipo(experiencia.getTipo());
        this.setServico(experiencia.getServico());
        this.setColaborador(experiencia.getColaborador());
    }

}
