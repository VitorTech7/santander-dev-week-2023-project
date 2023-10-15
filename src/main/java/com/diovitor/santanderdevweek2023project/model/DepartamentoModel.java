package com.diovitor.santanderdevweek2023project.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DepartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "departamentoModel", cascade = CascadeType.ALL)
    private List<UsuarioModel> usuarioModel;

    @OneToMany(mappedBy = "departamentoModel", cascade = CascadeType.ALL)
    private List<ProdutoModel> produtoModel;

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

    public List<UsuarioModel> getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(List<UsuarioModel> usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public List<ProdutoModel> getProdutoModel() {
        return produtoModel;
    }

    public void setProdutoModel(List<ProdutoModel> produtoModel) {
        this.produtoModel = produtoModel;
    }
}
