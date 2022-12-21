package org.example.tela;
import org.example.entidade.Imovel;
import org.example.entidade.Interesse;
import org.example.persistencia.ClientesInteresses;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaBuscarInteresse {
    public static void imprimeInfo(Scanner scanner, ClientesInteresses interesses) {
        System.out.println("Qual imóvel você gostaria de consultar os clientes interessados?" +
                " Digite o código do imóvel: ");
        int codImovel = scanner.nextInt();
        boolean codEncontrado = false;
        for (Interesse i : interesses.getInteresses()) {
            if (codImovel == i.getCodImovel()){
                codEncontrado = true;
                i.imprimeInteresse();
            } if(!codEncontrado) {
                System.out.println("Não há clientes interessados neste imóvel.");
            }
        }
    }

    }


