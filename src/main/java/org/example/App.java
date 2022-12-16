package org.example;

import org.example.entidade.Imovel;
import org.example.entidade.Cliente;
import org.example.entidade.Interesse;
import org.example.tela.TelaCadastroCliente;
import org.example.tela.TelaCadastroImovel;
import org.example.tela.TelaCadastroInteresseporImovel;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Bem vindo a Imobiliaria Ada" );

        int opcao = 0;

        do {
            System.out.println(" (1) - Cadastrar Cliente \n (2) - Cadastrar Imovel \n (3) - Cadastrar Interesse por Imovel \n (0) - Sair");

            opcao = scanner.nextInt();
            Cliente cliente = null;
            Imovel imovel = null;
            Interesse interesse = null;
            switch (opcao) {
                case 1:
                    cliente = TelaCadastroCliente.cadastrarCliente(scanner);
                    break;
                case 2:
                    imovel = TelaCadastroImovel.cadastrarImovel(scanner);
                    break;
                case 3:
                    interesse = TelaCadastroInteresseporImovel.cadastrarInteresse(scanner);
                    break;
                case 0:
                    System.out.println("Até Logo");
                    break;
                default:

                    System.out.println("Valor informado de forma incorreta");
            }
        }while (opcao>0);

    }
}
