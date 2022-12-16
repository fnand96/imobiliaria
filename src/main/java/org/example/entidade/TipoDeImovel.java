package org.example.entidade;

public enum TipoDeImovel {
    APARTAMENTO("APARTAMENTO"),
    CASA("CASA"),
    FLAT("FLAT"),
    LOFT("LOFT"),
    STUDIO("STUDIO");

    private String nome;

    private TipoDeImovel(String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }
}