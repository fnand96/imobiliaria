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

    public static void exibeImoveis() {
        for (Imovel i : imoveis) {
            System.out.println("Tipo de imovel: " + i.getTipoDeImovel());
            System.out.println("SALA : " + i.getSala());
            System.out.println("COZINHA : " + i.getCozinha());
            System.out.println("QUARTO : " + i.getQuarto());
            System.out.println("BANHEIRO : " + i.getBanheiro());
            System.out.println("ESCRITORIO : " + i.getEscritorio());
            System.out.println("LAVANDERIA : " + i.getLavanderia());
            System.out.println("DESPENSA : " + i.getDespensa());
            System.out.println("VARANDA : " + i.getVaranda());
            System.out.println("Tipo de negocio: " + i.getTipoDeNegocio());
            System.out.println("Codigo do imovel: " + i.getCodImovel());
            System.out.println("=============================");
        }
    }

}
