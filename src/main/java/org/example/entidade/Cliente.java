package org.example.entidade;

import java.util.Random;

public class Cliente {

    private String nome;
    private int idade;

    private int telefone;

    private Endereco end;

    public int codCliente;
    Random random = new Random();

    public Cliente(String nome, int idade, int telefone, Endereco end){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.end = end;
        this.codCliente = random.nextInt(100);
    }



//    public String getNome() {
//        return nome;
//    }
//
//    public int getIdade() {
//        return idade;
//    }
//
//    public int getTelefone() {
//        return telefone;
//    }
//
//    public int getcodCliente() {
//        return codCliente;
//    }
//
//    public Endereco getEndereco() {
//        return end;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.end = end;
//    }


}
