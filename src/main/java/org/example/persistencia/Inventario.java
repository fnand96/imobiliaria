package org.example.persistencia;
import org.example.entidade.Imovel;

import java.util.ArrayList;


public class Inventario {

    private static ArrayList<Imovel> imoveis = new ArrayList<>();
    public Imovel[] getImoveis;

    public static void adicionar(Imovel imovel) {
        imoveis.add(imovel);
    }

    public static void exibeImoveis() {
        for (Imovel i : imoveis) {
            System.out.println("Tipo de imovel: " + i.getTipoDeImovel());
            System.out.println("Preco : " + i.getPreco());
            System.out.println("Rua : " + i.getRua());
            System.out.println("Bairro : " + i.getBairro());
            System.out.println("Cidade : " + i.getCidade());
            System.out.println("Estado : " + i.getEstado());
            System.out.println("Numero : " + i.getNum());
            System.out.println("Cep : " + i.getCep());
            System.out.println("Tipo de negocio: " + i.getTipoDeNegocio());
            System.out.println("Codigo do imovel: " + i.getCodImovel());
            System.out.println("=============================");
        }
    }
    public static ArrayList getImoveis(){
        return imoveis;
    }

}
