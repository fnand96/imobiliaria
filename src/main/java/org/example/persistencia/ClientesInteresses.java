package org.example.persistencia;

import org.example.entidade.Imovel;
import org.example.entidade.Interesse;

import java.util.ArrayList;

public class ClientesInteresses {
    private static ArrayList<Interesse> interesses = new ArrayList<>();

    public void adicionar(Interesse interesse) {
        interesses.add(interesse);
    }
    public ArrayList<Interesse> getInteresses(){
        return interesses;
    }
}
