
package br.com.projetoBase.modelo;

import jakarta.persistence.Entity;

@Entity
//lugar = local
public class Lugar extends EntidadeAbstrata{
    private int capacidade;
    private String recursos[];
    private LugarType local_tipo;
    private String detalhes;
    //private LocalExtras locaisExtras;
    /*poderia ser uma lista de ids com locais que pertecem ao maior
    ex: patio, nele vai ter um banheiro como um local "extra" */
    //meotodos
    //sets e gets

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String[] getRecursos() {
        return recursos;
    }

    public void setRecursos(String[] recursos) {
        this.recursos = recursos;
    }

    public LugarType getLocal_tipo() {
        return local_tipo;
    }

    public void setLocal_tipo(LugarType local_tipo) {
        this.local_tipo = local_tipo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
    
}
