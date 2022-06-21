package com.hapi.hapi.modelos.Colaborador;

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
@Table(name = "colaborador")
public class Colaborador implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "colaborador_id")
    private Long id;

    @Column(name ="colaborador_github", length = 120)
    private String github;

    @Column(name = "colaborador_behance", length = 50)
    private String behance;

    @Column(name ="colaborador_linkedin", length = 120)
    private String linkedin;

}
