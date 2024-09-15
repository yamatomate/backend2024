
package br.com.projetoBase.modelo;

import jakarta.persistence.Entity;
import java.util.Date;

@Entity
public class Evento extends EntidadeAbstrata{
   private String nome;
   private String descriao;
   private int capacidade;
   //private User gerenciador[];//esses dois tão dando problema
   //private Lugar local;
   private Date inicio;
   private Date fim;
   //metodos
   //gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriao() {
        return descriao;
    }

    public void setDescriao(String descriao) {
        this.descriao = descriao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /*public User[] getGerenciador() {
        return gerenciador;
    }

    public void setGerenciador(User[] gerenciador) {
        this.gerenciador = gerenciador;
    }

    public Lugar getLocal() {
        return local;
    }

    public void setLocal(Lugar local) {
        this.local = local;
    }
    */
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }
   
}

