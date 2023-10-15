package com.diovitor.santanderdevweek2023project.model;

import jakarta.persistence.*;

@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private DepartamentoModel departamentoModel;
}
