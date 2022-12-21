package org.example.tela;

import org.example.entidade.Imovel;
import org.example.persistencia.InventarioComodos;

import java.util.Scanner;

public class TelaBuscarImovelComodo {
    public static void imprimeInfo(Imovel imovel) {
        System.out.println("====================== Imóvel: ======================");
        System.out.println("Endereço: " +"Rua: "+ imovel.getRua() + ", " + " Numero: "+imovel.getNum() + " - " + "Cidade " + imovel.getCidade());
        System.out.println("Tipo de Imóvel: " + imovel.getTipoDeImovel());
        System.out.println("Tipo de Negócio: " + imovel.getTipoDeNegocio());
        System.out.println("Número de salas: " + imovel.getSala());
        System.out.println("Número de cozinhas: " + imovel.getCozinha());
        System.out.println("Número de banheiros: " + imovel.getBanheiro());
        System.out.println("Número de escritórios: " + imovel.getEscritorio());
        System.out.println("Número de lanvaderias: " + imovel.getLavanderia());
        System.out.println("Número de despensas: " + imovel.getDespensa());
        System.out.println("Número de varandas: " + imovel.getVaranda());
        System.out.println("Preço: " + imovel.getPreco());
        System.out.println("Código do imóvel: " + imovel.getCodImovel());
        System.out.println("=============================\n");
    }

    public static void buscar(Scanner scanner, InventarioComodos inventarioComodos) {
        int opcao = 0;
        System.out.println("Digite por qual comodo deseja buscar: ");
        System.out.println(" (1) - SALA \n (2) - COZINHA \n (3) - BANHEIRO \n (4) - QUARTO \n (5) - ESCRITORIO \n " +
                "(6) - LAVANDERIA \n (7) - DESPENSA \n (8) - VARANDA \n (0) - Sair");
        opcao = scanner.nextInt();
        boolean achouImovel = false;
        switch (opcao) {
            case 1:
                System.out.println("Digite o numero de salas: ");
                int sala = scanner.nextInt();
                for (Imovel i : inventarioComodos.getImoveis()) {
                    if (i.getSala() == (sala)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

                    case 2:
                        System.out.println("Digite o numero de cozinhas: ");
                int cozinha = scanner.nextInt();
                for (Imovel i : inventarioComodos.getImoveis()) {
                    if (i.getCozinha() == (cozinha)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

                    case 3:
                        System.out.println("Digite o numero de banheiros: ");
                int banheiro = scanner.nextInt();
                for (Imovel i : inventarioComodos.getImoveis()) {
                    if (i.getBanheiro() == (banheiro)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

                    case 4:
                        System.out.println("Digite o numero de quartos: ");
                int quarto = scanner.nextInt();
                for (Imovel i : inventarioComodos.getImoveis()) {
                    if (i.getQuarto() == (quarto)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

                    case 5:
                        System.out.println("Digite o numero de escritórios: ");
                int escritorio = scanner.nextInt();
                for (Imovel i : inventarioComodos.getImoveis()) {
                    if (i.getEscritorio() == (escritorio)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

                    case 6:
                        System.out.println("Digite o numero de lavanderias: ");
                int lavanderia = scanner.nextInt();
                for (Imovel i : inventarioComodos.getImoveis()) {
                    if (i.getLavanderia() == (lavanderia)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

                    case 7:
                        System.out.println("Digite o numero de despensas: ");
                int despensa = scanner.nextInt();
                for (Imovel i : inventarioComodos.getImoveis()) {
                    if (i.getDespensa()== (despensa)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

                    case 8:
                        System.out.println("Digite o numero de varandas: ");
                int varanda = scanner.nextInt();
                for (Imovel i : inventarioComodos.getImoveis()) {
                    if (i.getVaranda()==(varanda)) {
                        achouImovel = true;
                        imprimeInfo(i);
                    }
                }
                if (!achouImovel){
                    System.out.println("Imóvel não encontrado!");
                } break;

                    case 0:
                        System.out.println("Até Logo!");
                        break;

            default:
                System.out.println("Valor informado de forma incorreta: "+"'"+opcao+"'");
                break;
        }
    }
}
