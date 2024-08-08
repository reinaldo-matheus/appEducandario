package com.appeducandario.educandario.entities;

import com.appeducandario.educandario.entites.Atividade;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tb_voluntario")
public class Voluntario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;


    @ManyToMany
    @JoinTable(name = "VOLUNTARIO_ATIVIDADE_MAPPING", joinColumns = @JoinColumn(name = "voluntario_id"), inverseJoinColumns = @JoinColumn(name = "atividade_id"))
    private Set<Atividade> atividades;

    public Voluntario() {
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

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
      
