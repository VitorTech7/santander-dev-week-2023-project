package com.diovitor.santanderdevweek2023project.model;

import jakarta.persistence.*;

@Entity
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double preco;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private DepartamentoModel departamentoModel;
}
