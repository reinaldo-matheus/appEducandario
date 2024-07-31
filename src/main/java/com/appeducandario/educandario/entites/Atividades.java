package com.appeducandario.educandario.entites;

// import com.appeducandario.educandario.entities.Voluntario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_atividades")
public class Atividades {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String data;
    private String descricao;
    private String hora;
    private String turma;
//     @ManyToOne
// @JoinColumn(name = "tb_voluntario")
//     private Voluntario voluntario;

    // ArrayList<String> voluntarios = new ArrayList<String>();
    // voluntarios.add();

    public Atividades (){
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
    
      public String getData(){
        return data;
      }
  
      public void  setData(String data){
        this.data = data;
      }

      
      public String getDescricao(){
        return descricao;
      }
  
      public void  setDescricao(String descricao){
        this.descricao = descricao;
      }

      public String getHora(){
        return hora;
      }
  
      public void  setHora(String hora){
        this.hora = hora;
      }
    
      public String getTurma(){
        return turma;
      }
  
      public void  setTurma(String turma){
        this.turma = turma;
      }
     

};
