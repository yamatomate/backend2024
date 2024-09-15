/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoBase.modelo;

/**
 *
 * @author gusta
 */
public enum UserType {
    
    USER("User"),
    ADMIN("Admin");

    private final String nome;

    UserType(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
