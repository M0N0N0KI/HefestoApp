package com.hapi.hapi.controladores.dto.Usuariodto;

import com.hapi.hapi.controladores.dto.Contatodto.Contatodto;
import com.hapi.hapi.modelos.Usuario.Usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Usuariodto {

    private Long id;
    private String identificador;
    private String senha;
    private Contatodto contato;

    public Usuariodto(){}

    public Usuariodto(Usuario usuario)
    {
        this.id = usuario.getId();
        this.identificador = usuario.getIdentificador();
        this.senha = usuario.getSenha();
    }

    
}
