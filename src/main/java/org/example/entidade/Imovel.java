package org.example.entidade;

import java.util.Random;

public class Imovel {

    private String tipoDeImovel;

    private Endereco end;

    private int sala;
    private int cozinha;
    private int banheiro;
    private int escritorio;
    private int lavanderia;
    private int despensa;
    private int varanda;

    private int preco;

    private String tipoDeNegocio;

    public int codImovel;
    Random random = new Random();


    public Imovel(String tipoDeImovel,Endereco end, int sala, int cozinha, int banheiro, int escritorio, int lavanderia, int despensa, int varanda, int preco, String tipoDeVenda){
        this.tipoDeImovel = tipoDeImovel;
        this.sala = sala;
        this.cozinha = cozinha;
        this.banheiro = banheiro;
        this.escritorio = escritorio;
        this.lavanderia = lavanderia;
        this.despensa = despensa;
        this.varanda = varanda;
        this.preco = preco;
        this.tipoDeNegocio = tipoDeVenda;
        this.end = end;
        this.codImovel = random.nextInt(100);
    }

    public String getTipoDeImovel() {
        return tipoDeImovel;
    }

    public int getSala() {
        return sala;
    }
    public int getCozinha() {
        return cozinha;
    }
    public int getBanheiro() {
        return banheiro;
    }
    public int getEscritorio() {
        return escritorio;
    }
    public int getLavanderia() {
        return lavanderia;
    }
    public int getDespensa() {
        return despensa;
    }
    public int getVaranda() {
        return varanda;
    }

    public int getPreco() {
        return preco;
    }

    public String getTipoDeNegocio() {
        return tipoDeNegocio;
    }
    public int getCodImovel(){
        return codImovel;
    }
    public String getRua(){
        return end.getRua();
    }
    public String getBairro(){
        return end.getBairro();
    }
    public String getCidade(){
        return end.getCidade();
    }
    public String getEstado(){
        return end.getEstado();
    }
    public int getNum(){
        return end.getNum();
    }
    public int getCep(){
        return end.getCep();
    }
}
