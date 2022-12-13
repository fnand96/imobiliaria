package org.example.entidade;

public class Imovel {

    private String tipoDeImovel;

    private int quantDeComodos;

    private int preco;

    private String tipoDeNegocio;

    public Imovel(String tipoDeImovel, int quantDeComodos, int preco, String tipoDeVenda){
        this.tipoDeImovel = tipoDeImovel;
        this.quantDeComodos = quantDeComodos;
        this.preco = preco;
        this.tipoDeNegocio = tipoDeVenda;
    }

    public String getTipoDeImovel() {
        return tipoDeImovel;
    }

    public int getQuantDeComodos() {
        return quantDeComodos;
    }

    public int getPreco() {
        return preco;
    }

    public String getTipoDeNegocio() {
        return tipoDeNegocio;
    }


}
