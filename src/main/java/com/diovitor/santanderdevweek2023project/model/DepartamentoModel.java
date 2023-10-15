package com.diovitor.santanderdevweek2023project.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DepartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<UsuarioModel> usuarioModel;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<ProdutoModel> produtoModel;
}
