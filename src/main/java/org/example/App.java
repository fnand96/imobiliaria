package org.example;

import org.example.entidade.Imovel;
import org.example.entidade.Cliente;
import org.example.entidade.Interesse;
import org.example.persistencia.ClientesInteresses;
import org.example.persistencia.Inventario;
import org.example.persistencia.InventarioComodos;
import org.example.tela.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Bem vindo a Imobiliaria Ada" );

        int opcao = 0;

        do {
            System.out.println("\n (1) - Cadastrar Cliente \n (2) - Cadastrar Imovel \n (3) - Cadastrar Interesse por Imovel \n " +
                    "(4) - Buscar Imóvel Por Endereço \n (5) - Buscar Imóvel por cômodos \n (6) - Imprimir interessados por Imovel \n (0) - Sair");

            opcao = scanner.nextInt();
            Cliente cliente = null;
            Imovel imovel = null;
            ClientesInteresses interesses = new ClientesInteresses();
            Inventario inventario = new Inventario();
            InventarioComodos inventarioComodos = new InventarioComodos();

            switch (opcao) {
                case 1:
                    cliente = TelaCadastroCliente.cadastrarCliente(scanner);
                    break;
                case 2:
                    imovel = TelaCadastroImovel.cadastrarImovel(scanner);
                    inventario.adicionar(imovel);
                    inventarioComodos.adicionar(imovel);
                    break;
                case 3:
                    interesses.adicionar(TelaCadastroInteresseporImovel.cadastrarInteresse(scanner));
                    break;
                case 4:
                    TelaBuscarImovelLocalizacao.buscar(scanner, inventario);
                    break;
                case 5:
                    TelaBuscarImovelComodo.buscar(scanner, inventarioComodos);
                    break;
                case 6:
                    TelaBuscarInteresse.imprimeInfo(scanner, interesses);
                    break;
                case 0:
                    System.out.println("\nAté Logo!");
                    break;
                default:
                    System.out.println("Valor informado de forma incorreta\n");
                    break;
            }
        }while (opcao>0);
    }
}
