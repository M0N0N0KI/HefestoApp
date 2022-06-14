package com.hapi.hapi.modelos.Vaga;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "vaga")
public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vaga_id")
    private Long id;
    
    @Column(name = "vaga_carga_Horaria")
    private String cargaHoraria;

    @Column(name = "vaga_status")
    private String status;
    
    @Column(name = "vaga_empresa", length = 170)
    private Long empresa;
    
    @Column(name = "vaga_prerequesitos", columnDefinition = "TEXT")
    private String prerequisitos;
    
    @Column(name = "vaga_diferencias", columnDefinition = "TEXT")
    private String diferenciais;
    
    @Column(name = "vaga_descricao", columnDefinition = "TEXT")
    private String descricao;
    
    @Column(name = "vaga_inicio")
    private Date inicio;
    
    @Column(name = "vaga_fim")
    private Date fim;

    
}
