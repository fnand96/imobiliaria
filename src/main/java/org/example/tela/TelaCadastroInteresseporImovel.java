package org.example.tela;

import org.example.entidade.Imovel;
import org.example.entidade.Interesse;

import java.util.Scanner;


public class TelaCadastroInteresseporImovel {

    public static Interesse cadastrarInteresse(Scanner scanner) {

        System.out.println("Informe o código do cliente");
        int codCliente = scanner.nextInt();

        System.out.println("Informe o código do Imovel de interesse");
        int codImovel = scanner.nextInt();

        return new Interesse(codCliente, codImovel);
    }
}
