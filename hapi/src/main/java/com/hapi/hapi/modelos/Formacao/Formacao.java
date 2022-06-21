package com.hapi.hapi.modelos.Formacao;


import java.io.File;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.websocket.Decoder.Text;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "formacao")
public class Formacao implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "formacao_id")
    private Long id;

    @Column(name ="formacao_instituicao")
    private String instituicao;

    @Column(name = "formacao_curso")
    private String curso;

    @Column(name ="formacao_inicio")
    private Date inicio;

    @Column(name ="formacao_completa")
    private Boolean completa;

    @Column(name ="formacao_fim")
    private Date fim;

    @Column(name ="formacao_descricao", length = 120)
    private Text descricao;

    @Column(name ="formacao_file")
    private File file;

    @Column(name ="formacao_colaborador", length = 120)
    private Long colaborador;
    
}