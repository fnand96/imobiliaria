package org.example.tela;

import org.example.entidade.Imovel;
import org.example.persistencia.Inventario;

import java.util.Scanner;

public class TelaBuscarImovelLocalizacao {
    public static void imprimeInfo(Imovel imovel){
        System.out.println("====================== Imóvel: ======================");
        System.out.println("Endereço: " +"Rua: "+ imovel.getRua() + ", " + " Numero: "+imovel.getNum() + " - " + "Cidade " + imovel.getCidade());
        System.out.println("Tipo de Imóvel: "+imovel.getTipoDeImovel());
        System.out.println("Tipo de Negócio: "+imovel.getTipoDeNegocio());
        System.out.println("Número de salas: "+imovel.getSala());
        System.out.println("Número de cozinhas: "+imovel.getCozinha());
        System.out.println("Número de banheiros: "+imovel.getBanheiro());
        System.out.println("Número de escritórios: "+imovel.getEscritorio());
        System.out.println("Número de lanvaderias: "+imovel.getLavanderia());
        System.out.println("Número de despensas: "+imovel.getDespensa());
        System.out.println("Número de varandas: "+imovel.getVaranda());
        System.out.println("Preço: "+imovel.getPreco());
        System.out.println("Código do imóvel: "+imovel.getCodImovel());
    }
    public static void buscar(Scanner scanner, Inventario inventario){
        int opcao = 0;
        System.out.println("Digite o modo de busca do imóvel que deseja buscar: ");
        System.out.println(" (1) - Por Cidade \n (2) - Por bairro \n (3) - Por rua \n (0) - Sair");
        opcao = scanner.nextInt();
        boolean achouImovel = false;
        switch (opcao) {
            case 1:
                System.out.println("Digite o nome da cidade: ");
                String cidade = scanner.next();
                for (Imovel i : inventario.getImoveis()) {
                    if (i.getCidade().equals(cidade)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;
            case 2:
                System.out.println("Digite o nome do bairro: ");
                String bairro = scanner.next();
                for (Imovel i : inventario.getImoveis()) {
                    if (i.getBairro().equals(bairro)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

            case 3:
                System.out.println("Digite o nome da rua: ");
                String rua = scanner.next();
                for (Imovel i : inventario.getImoveis()) {
                    if (i.getRua().equals(rua)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

            case 0:
                System.out.println("Até Logo");
                break;
            default:
                System.out.println("Valor informado de forma incorreta: "+"'"+opcao+"'");
                break;
        }
    }
}