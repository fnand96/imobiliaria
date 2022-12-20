package org.example.tela;

import org.example.entidade.Imovel;
import org.example.persistencia.Inventario;

import java.util.Scanner;

public class TelaBuscarImovelPorTipo {
    public static void imprimeInfo(Imovel imovel){
        System.out.println("====================== Imóvel: ======================");
        System.out.println("Endereço : ");
        System.out.println("Rua : "+imovel.getRua()+",Numero :"+imovel.getNum()+", Cidade:"+imovel.getCidade());
        System.out.println("Tipo : ");
        System.out.println(">>>Imovel"+imovel.getTipoDeImovel());
        System.out.println(">>>Negócio: "+imovel.getTipoDeNegocio());
        System.out.println("Caracteristica do imovel:");
        System.out.println(">>>Número de salas: "+imovel.getSala());
        System.out.println(">>>Número de cozinhas: "+imovel.getCozinha());
        System.out.println(">>>Número de banheiros: "+imovel.getBanheiro());
        System.out.println(">>>Número de escritórios: "+imovel.getEscritorio());
        System.out.println(">>>Número de lanvaderias: "+imovel.getLavanderia());
        System.out.println(">>>Número de despensas: "+imovel.getDespensa());
        System.out.println(">>>Número de varandas: "+imovel.getVaranda());
        System.out.println(">>>Preço: "+imovel.getPreco());
        System.out.println(">>>Código do imóvel: "+imovel.getCodImovel());
        System.out.println("===================================================");
    }

    public static void buscadorImovel(Scanner sc, Inventario database){
        System.out.println("Olá digite o tipo do imovel que deseja buscar abaixo: ");
        String busca;
        busca = sc.nextLine();
        try{
            for (Imovel i : database.getImoveis){
                if(i.getTipoDeImovel().equals(busca)){
                    imprimeInfo(i);
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }



    }




}
