package com.appeducandario.educandario.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_voluntario")
public class Voluntario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String atividade;
    private String hora;
    private String data;
    private String faixaEtaria;

    //  @ManyToOne
    // @JoinColumn(name = "tb_atividades")
    private Atividades atividades;

    public Voluntario () {
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
  
      public String getEmail(){
        return email;
      }
  
      public void  setEmail(String email){
        this.email = email;
      }
      
      public String getAtividade(){
        return atividade;
      }
  
      public void  setAtividade(String atividade){
        this.atividade = atividade;
      }

      public String getHorario(){
        return hora;
      }
  
      public void  setHorario(String hora){
        this.hora = hora;
      }

      public String getData(){
        return data;
      }
  
      public void  setData(String data){
        this.data = data;
      }

      public String getFaixaEtaria(){
        return faixaEtaria;
      }
  
      public void  setFaixaEtaria(String faixaEtaria){
        this.faixaEtaria = faixaEtaria;
      }
}
