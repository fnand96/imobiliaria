package org.example.persistencia;
import org.example.entidade.Imovel;

import java.util.ArrayList;

public class InventarioComodos {

    private static ArrayList<Imovel> imoveis = new ArrayList<>();
    public Imovel[] getImoveis;

    public static void adicionar(Imovel imovel) {
        imoveis.add(imovel);
    }

    public static ArrayList getImoveis(){
        return imoveis;
    }
}
