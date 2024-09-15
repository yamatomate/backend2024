/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoBase.modelo;

/**
 *
 * @author gusta
 */
public enum LugarType {
    
    PATIO("Patio");

    private final String nome;

    LugarType(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
