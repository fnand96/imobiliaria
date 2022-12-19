package org.example.entidade;

public class Endereco {
    private String rua, bairro, cidade, estado;
    private int num, cep;

    public Endereco (String rua, String bairro, String cidade, String estado, int num, int cep)
    {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.num = num;
        this.cep = cep;

    }



    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public int getNum() {
        return num;
    }
    public int getCep() {
        return cep;
   }


}
