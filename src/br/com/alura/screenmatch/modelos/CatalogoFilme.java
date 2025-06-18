package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class CatalogoFilme {
    public static void exibirFilme () {

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        var filmeAdd_00001 = new Filme();
        filmeAdd_00001.setNome("O poderoso chefão");
        filmeAdd_00001.setAnoDeLancamento(1970);
        filmeAdd_00001.setDuracaoEmMinutos(180);

        filmeAdd_00001.exibeFichaTecnica();
        filmeAdd_00001.avalia(8);
        filmeAdd_00001.avalia(5);
        filmeAdd_00001.avalia(10);
        System.out.println("Total de avaliações: " + filmeAdd_00001.getTotalDeAvaliacoes());
        System.out.printf("Média: %.2f%n", filmeAdd_00001.pegaMedia());
        System.out.println();

        var filmeAdd_00002 = new Filme();
        filmeAdd_00002.setNome("Avatar");
        filmeAdd_00002.setAnoDeLancamento(2023);
        filmeAdd_00002.setDuracaoEmMinutos(200);

        filmeAdd_00002.exibeFichaTecnica();
        filmeAdd_00002.avalia(10);
        filmeAdd_00002.avalia(9.5);
        filmeAdd_00002.avalia(9.8);
        System.out.println("Total de avaliações: " + filmeAdd_00002.getTotalDeAvaliacoes());
        System.out.printf("Média: %.2f%n", filmeAdd_00002.pegaMedia());
        System.out.println();


        filtro.filtra(filmeAdd_00002);

        var  filmeAdd_00003 = new Filme();
        filmeAdd_00003.setNome("Dogville");
        filmeAdd_00003.setAnoDeLancamento(2003);
        filmeAdd_00003.setDuracaoEmMinutos(200);

        filmeAdd_00003.exibeFichaTecnica();
        filmeAdd_00003.avalia(7.6);
        filmeAdd_00003.avalia(9.3);
        filmeAdd_00003.avalia(8.9);
        System.out.println("Total de avaliações: " + filmeAdd_00003.getTotalDeAvaliacoes());
        System.out.printf("Média: %.2f%n", filmeAdd_00003.pegaMedia());

        filtro.filtra(filmeAdd_00003);
        System.out.println();



    }
}
