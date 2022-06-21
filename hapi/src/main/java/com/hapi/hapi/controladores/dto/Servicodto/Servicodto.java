package com.hapi.hapi.controladores.dto.Servicodto;

import javax.websocket.Decoder.Text;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Servicodto {

    private Long id;
    private String funcao;
    private String valorEstimado;
    private Text descricao;
    private Long endereco;
    private Long requerente;
    private String status;
    
}
