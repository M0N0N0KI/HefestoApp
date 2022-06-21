package com.hapi.hapi.modelos.Endereco;

import java.io.Serializable;

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
@Table(name ="endereco")
public class Endereco implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    private Long id;
    
    @Column(name = "endereco_rua")
    private String rua;

    @Column(name = "endereco_numero", length = 2)
    private String numero;

    @Column(name = "endereco_bairro", length = 100)
    private String bairro;

    @Column(name = "endereco_complemento", columnDefinition = "TEXT")
    private String complemento;

    @Column(name = "endereco_cidade")
    private String cidade;

    @Column(name = "endereco_estado")
    private String estado;

    @Column(name = "endereco_pais")
    private String pais;

    @Column(name = "endereco_cep")
    private String cep;

}
