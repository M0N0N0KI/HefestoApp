package com.hapi.hapi.controladores.dto.Formacaodto;

import lombok.Getter;
import lombok.Setter;
import java.io.File;
import java.sql.Date;
import javax.websocket.Decoder.Text;

@Getter
@Setter

public class Formacaodto {
    
    private Long id;
    private String instituicao;
    private String curso;
    private Date inicio;
    private Boolean completa;
    private Date fim;
    private Text descricao;
    private File file;
    //interligar colaborador com a classe//
    private Long colaborador;

}
