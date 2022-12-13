package org.example.tela;

import org.example.entidade.Cliente;

import java.util.Scanner;

public class TelaCadastroCliente {

    public static Cliente cadastrarCliente(Scanner scanner){

        System.out.println("Informe o seu nome completo");
        String nome = scanner.next();

        System.out.println("Informe sua idade" );
        Integer idade = scanner.nextInt();

        System.out.println("Informe seu telefone");
        int telefone = scanner.nextInt();

//        System.out.println("Informe o seu Endereço");
//        String end = scanner.next();

        return new Cliente( nome, idade, telefone);
    }

}
