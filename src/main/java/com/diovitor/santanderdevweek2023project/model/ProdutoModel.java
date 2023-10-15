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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public DepartamentoModel getDepartamentoModel() {
        return departamentoModel;
    }

    public void setDepartamentoModel(DepartamentoModel departamentoModel) {
        this.departamentoModel = departamentoModel;
    }
}
