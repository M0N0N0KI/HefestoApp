package com.hapi.hapi.controladores.dto.Experiencia;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Experienciadto {
    
    private long id;

    private String empresa;

    private String cargo;

    private Date inicio;

    private boolean atual;

    private Date fim;

    private String descricao;
    
    private String tipo;
    

    public void setAtual(boolean atual)
    {
        this.atual = atual;
    }
    public boolean getAtual()
    {
        return this.atual;
    }
    
}
