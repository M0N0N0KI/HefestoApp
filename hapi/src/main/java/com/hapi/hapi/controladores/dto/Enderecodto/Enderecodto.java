package com.hapi.hapi.controladores.dto.Enderecodto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Enderecodto {
    
    private Long id;
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
     
}
