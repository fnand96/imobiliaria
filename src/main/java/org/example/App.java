package org.example;

import org.example.entidade.Imovel;
import org.example.entidade.Cliente;
import org.example.entidade.Interesse;
import org.example.persistencia.Inventario;
import org.example.persistencia.InventarioComodos;
import org.example.tela.*;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Bem vindo a Imobiliaria Ada" );

        int opcao = 0;

        do {
            System.out.println(" (1) - Cadastrar Cliente \n (2) - Cadastrar Imovel \n (3) - Cadastrar Interesse por Imovel \n " +
                    "(4) - Buscar Imóvel Por Endereço \n (5) - Buscar Imóvel por cômodos \n (0) - Sair");

            opcao = scanner.nextInt();
            Cliente cliente = null;
            Imovel imovel = null;
            Interesse interesse = null;
            Inventario inventario = new Inventario();
            InventarioComodos ic = new InventarioComodos();

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
                case 4:
                    imovel = TelaBuscarImovelLocalizacao.buscar(scanner, inventario);
                    break;
                case 5:
                    imovel = TelaBuscarImovelComodo.buscar(scanner, ic);
                case 0:
                    System.out.println("Até Logo");
                    break;
                default:

                    System.out.println("Valor informado de forma incorreta");
            }
        }while (opcao>0);

    }
}
