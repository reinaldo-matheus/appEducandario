package com.appeducandario.educandario.entites;

// import com.appeducandario.educandario.entities.Voluntario;

import com.appeducandario.educandario.entities.Voluntario;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String data;
    private String descricao;
    private String hora;

    @ManyToMany

    @JoinTable(name = "VOLUNTARIO_ATIVIDADE_MAPPING", joinColumns = @JoinColumn(name = "atividade_id"), inverseJoinColumns = @JoinColumn(name = "voluntario_id"))
    private Set<Voluntario> voluntarios;

    @ManyToMany
    @JoinTable(name = "CRIANCA_ATIVIDADE_MAPPING", joinColumns = @JoinColumn(name = "atividade_id"), inverseJoinColumns = @JoinColumn(name = "crianca_id"))
    private Set<Crianca> criancas;

    public Atividade() {
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

};
