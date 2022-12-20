package org.example.tela;

import org.example.entidade.*;
import org.example.persistencia.Inventario;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TelaCadastroImovel {
    public static Imovel cadastrarImovel(Scanner scanner){


        System.out.println("Digite o Tipo de Imóvel");
        List<TipoDeImovel> list = Arrays.asList(TipoDeImovel.values());
        for(int i =0 ; i< list.size(); i++){
        System.out.println(list.get(i).name());
        }
        String tipoDeImovel = scanner.next();

        System.out.println("Informe o endereço do Imóvel");

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

        System.out.println("Digite a quantidade de cada cômodo");
        System.out.println(Comodos.SALA);
        int sala = scanner.nextInt();

        System.out.println(Comodos.COZINHA);
        int cozinha = scanner.nextInt();

        System.out.println(Comodos.BANHEIRO);
        int banheiro = scanner.nextInt();

        System.out.println(Comodos.QUARTO);
        int quarto = scanner.nextInt();

        System.out.println(Comodos.ESCRITORIO);
        int escritorio = scanner.nextInt();

        System.out.println(Comodos.LAVANDERIA);
        int lavanderia = scanner.nextInt();

        System.out.println(Comodos.DESPENSA);
        int despensa = scanner.nextInt();

        System.out.println(Comodos.VARANDA);
        int varanda = scanner.nextInt();

        System.out.println("Informe o Tipo de Negócio (Compra ou Aluguel)");
        String tipoDeNegocio = scanner.next();

        System.out.println("Informe o preço do negócio: ");
        int preco = scanner.nextInt();

        int codImovel;
        Random random = new Random();
        codImovel = random.nextInt(100);

        Endereco end = new Endereco(rua, estado, bairro, cidade, cep, num);

        Imovel imovel = new Imovel( tipoDeImovel, end, sala, cozinha, banheiro, escritorio, lavanderia, despensa, varanda,preco, quarto, tipoDeNegocio);
        Inventario.adicionar(imovel);

        System.out.println("Cadastro realizado!! O código do imóvel é: "+ codImovel);
        return imovel;
    }


}