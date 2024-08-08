package com.appeducandario.educandario.entites;


import jakarta.persistence.*;

import java.util.Set;

@Entity

@Table(name = "tb_criancas")
public class Crianca {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String turma;

    @ManyToMany
    @JoinTable(name = "CRIANCA_ATIVIDADE_MAPPING", joinColumns = @JoinColumn(name = "crianca_id"), inverseJoinColumns = @JoinColumn(name = "atividade_id"))
    private Set<Atividade> atividades;

    public Crianca() {
    }

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

    public String getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }


}

