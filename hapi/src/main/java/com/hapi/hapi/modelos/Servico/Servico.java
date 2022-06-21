package com.hapi.hapi.modelos.Servico;

import java.io.Serializable;

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
@Table(name = "servico")
public class Servico implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servico_id")
    private Long id;

    @Column(name = "servico_funcao")
    private String funcao;

    @Column(name = "servico_valorEstimado")
    private String valorEstimado;

    @Column(name = "servico_descricao", length = 120)
    private Text descricao;

    @Column(name = "servico_endereco")
    private Long endereco;

    @Column(name = "servico_requerente", length = 100)
    private Long requerente;

    @Column(name = "servico_status")
    private String status;


}
