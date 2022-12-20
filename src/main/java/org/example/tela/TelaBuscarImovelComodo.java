package org.example.tela;

import org.example.entidade.Imovel;
import org.example.persistencia.Inventario;
import org.example.persistencia.InventarioComodos;

import java.util.Scanner;

public class TelaBuscarImovelComodo {
    public static void imprimeInfo(Imovel imovel) {
        System.out.println("====================== Imóvel: ======================");
        System.out.println("Endereço: " + imovel.getRua() + "," + imovel.getNum() + " - " + imovel.getCidade());
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
    }

    public static Imovel buscar(Scanner scanner, InventarioComodos ic) {
        int opcao = 0;
        System.out.println("Digite por qual comodo deseja buscar: ");
        System.out.println(" (1) - SALA \n (2) - COZINHA \n (3) - BANHEIRO \n (4) - QUARTO \n (5) - ESCRITORIO \n " +
                "(6) - LAVANDERIA \n (7) - DESPENSA \n (8) - VARANDA \n (0) - Sair");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o numero de salas: ");
                int sala = scanner.nextInt();
                for (Imovel i : ic.getImoveis) {
                    if (i.getSala() == (sala)) {
                    imprimeInfo(i);
                        return i;
                    }
                }
                    System.out.println("Imóvel não encontrado!");
                    return null;

                    case 2:
                        System.out.println("Digite o numero de cozinhas: ");
                int cozinha = scanner.nextInt();
                for (Imovel i : ic.getImoveis) {
                    if (i.getCozinha() == (cozinha)) {
                        imprimeInfo(i);
                        return i;
                    }
                }
                        System.out.println("Imóvel não encontrado!");
                        return null;

                    case 3:
                        System.out.println("Digite o numero de banheiros: ");
                int banheiro = scanner.nextInt();
                for (Imovel i : ic.getImoveis) {
                    if (i.getBanheiro() == (banheiro)) {
                        imprimeInfo(i);
                        return i;
                    }
                }
                        System.out.println("Imóvel não encontrado!");
                        return null;

                    case 4:
                        System.out.println("Digite o numero de quartos: ");
                int quarto = scanner.nextInt();
                for (Imovel i : ic.getImoveis) {
                    if (i.getQuarto() == (quarto)) {
                        imprimeInfo(i);
                        return i;
                    }
                }
                        System.out.println("Imóvel não encontrado!");
                        return null;

                    case 5:
                        System.out.println("Digite o numero de escritórios: ");
                int escritorio = scanner.nextInt();
                for (Imovel i : ic.getImoveis) {
                    if (i.getEscritorio() == (escritorio)) {
                        imprimeInfo(i);
                        return i;
                    }
                }
                        System.out.println("Imóvel não encontrado!");
                        return null;

                    case 6:
                        System.out.println("Digite o numero de lavanderias: ");
                int lavanderia = scanner.nextInt();
                for (Imovel i : ic.getImoveis) {
                    if (i.getLavanderia() == (lavanderia)) {
                        imprimeInfo(i);
                        return i;
                    }
                }
                        System.out.println("Imóvel não encontrado!");
                        return null;

                    case 7:
                        System.out.println("Digite o numero de despensas: ");
                int despensa = scanner.nextInt();
                for (Imovel i : ic.getImoveis) {
                    if (i.getDespensa()== (despensa)) {
                        imprimeInfo(i);
                        return i;
                    }
                }
                        System.out.println("Imóvel não encontrado!");
                        return null;

                    case 8:
                        System.out.println("Digite o numero de varandas: ");
                int varanda = scanner.nextInt();
                for (Imovel i : ic.getImoveis) {
                    if (i.getVaranda()==(varanda)) {
                        imprimeInfo(i);
                        return i;
                    }
                }
                        System.out.println("Imóvel não encontrado!");
                        return null;

                    case 0:
                        System.out.println("Até Logo");
                        break;

            default:
                throw new IllegalStateException("Valor incorreto " + opcao);
        }
        return null;
    }
    }
