package com.hapi.hapi.modelos.Usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.hapi.hapi.modelos.Contato.Contato;
import com.hapi.hapi.modelos.Endereco.Endereco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long id;

    @Column(name = "usuario_nome", length = 120)
    private String nome;

    @Column(name = "usuario_identificador", length = 17)
    private String identificador;

    @Column(name = "usuario_senha", columnDefinition = "TEXT")
    private String senha;

    @Column(name = "usuario_status", length = 10)
    private String status;

    @OneToOne
    @JoinColumn(name = "usuario_contato")
    private Contato contato;

    @OneToOne
    @JoinColumn(name = "usuario_endereco")
    private Endereco endereco;
}
