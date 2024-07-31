package com.appeducandario.educandario.entites;

import org.apache.commons.math3.analysis.function.Identity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
Identity
@Table(name="tb_criancas")
public class Criancas {
      @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String turma;

    public Criancas () {
    }

    public Long getId(){
      return id;
    }
    
    public void  setId(Long id){
      this.id = id;
    }

    public String getNome(){
      return nome;
    }

    public void  setNome(String nome){
      this.nome = nome;
    }

    public String getDataNascimento(){
      return dataNascimento;
    }

    public void  setDataNascimento(String dataNascimento){
      this.dataNascimento = dataNascimento;
    }
    
    public String getTurma(){
      return turma;
    }

    public void  setTurma(String turma){
      this.turma = turma;
    }
   

}

