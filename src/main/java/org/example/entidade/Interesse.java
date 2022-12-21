package org.example.entidade;


public class Interesse {

    int codCliente;
    int codImovel;

    public void imprimeInteresse(){
        System.out.println("Código do cliente: " + codCliente);
    }
    public Interesse(int codCliente, int codImovel){
        this.codCliente = codCliente;
        this.codImovel = codImovel;
    }
    public int getCodImovel(){
        return this.codImovel;
    }

    public int getCodCliente() {
        return this.codCliente;
    }
}
