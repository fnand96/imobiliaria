package org.example.tela;

import org.example.entidade.Cliente;
import org.example.entidade.Endereco;

import java.util.Random;
import java.util.Scanner;

public class TelaCadastroCliente {

    public static Cliente cadastrarCliente(Scanner scanner){

        System.out.println("Informe o seu nome completo");
        String nome = scanner.next();

        System.out.println("Informe sua idade" );
        Integer idade = scanner.nextInt();

        System.out.println("Informe seu telefone");
        int telefone = scanner.nextInt();

        System.out.println("Informe o endereço do cliente");

        System.out.println("Rua");
        String rua = scanner.next();

        System.out.println("Número");
        int num = scanner.nextInt();

        System.out.println("Bairro");
        String bairro = scanner.next();

        System.out.println("Cidade");
        String cidade = scanner.next();

        System.out.println("Estado");
        String estado = scanner.next();

        System.out.println("CEP");
        int cep = scanner.nextInt();

        int codCliente;
        Random random = new Random();
        codCliente = random.nextInt(100);
        System.out.println("Cadastro realizado!! O código do cliente é: "+ codCliente);

        Endereco end = new Endereco(rua, estado, bairro,cidade, cep, num);

        return new Cliente( nome, idade, telefone, end);

    }

}
