package com.hapi.hapi.modelos.Experiencia;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hapi.hapi.controladores.dto.Experiencia.SExperienciadto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experiencia_id")
    private Long id;

    @Column(name = "experiencia_empresa")
    private String empresa;

    @Column(name = "experiencia_cargo")
    private String cargo;

    @Column(name = "experiencia_inicio")
    private Date inicio;

    @Column(name = "experiencia_atual")
    private boolean atual;

    @Column(name = "experiencia_fim")
    private Date fim;

    @Column(name = "experiencia_descricao")
    private String descricao;

    @Column(name = "experiencia_tipo")
    private String tipo;

    //substituir pela classe
    private Long servico;

    //substituir pela classe
    private Long colaborador;

    public void setAtual(boolean atual)
    {
        this.atual = atual;
    }

    public boolean getAtual()
    {
        return this.atual;
    }

    public Experiencia()
    {

    }
    public Experiencia(SExperienciadto experienciadto)
    {

        this.empresa = experienciadto.getEmpresa();
        this.cargo = experienciadto.getCargo();
        this.inicio = experienciadto.getInicio();
        this.atual = experienciadto.getAtual();
        this.fim = experienciadto.getFim();
        this.descricao = experienciadto.getDescricao();
        this.tipo = experienciadto.getTipo();
        //trocar os dois ultimos depois
        this.servico = experienciadto.getServico();
        this.colaborador = experienciadto.getColaborador();

    }

}
