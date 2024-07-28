package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The Matrix", 1999);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(6);

        Filme aqueleFilme = new Filme("Vingadores", 2012);
        meuFilme.avalia(10);

        Serie lost = new Serie("lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(aqueleFilme);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo titulo : lista) {
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            System.out.println(titulo);
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Ricardo");
        buscaPorArtista.add("Feitosa");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Após ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
