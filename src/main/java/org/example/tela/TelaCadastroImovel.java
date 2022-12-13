package org.example.tela;

import org.example.entidade.Imovel;

import java.util.Scanner;

public class TelaCadastroImovel {

    public static Imovel cadastrarImovel(Scanner scanner){

        System.out.println("Informe o Tipo de Imóvel (Casa ou Apartamento)");
        String tipoDeImovel = scanner.next();
        System.out.println("Informe a Quantidade de Cômodos do Imóvel");
        int quantDeComodos = scanner.nextInt();
        System.out.println("Informe o Preço que deseja pagar");
        int preco = scanner.nextInt();
        System.out.println("Informe o Tipo de Negócio(Compra ou Alguel)");
        String tipoDeNegocio = scanner.next();

        return new Imovel( tipoDeImovel, quantDeComodos, preco, tipoDeNegocio);
    }


}