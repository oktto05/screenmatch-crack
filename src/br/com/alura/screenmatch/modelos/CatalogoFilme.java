package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class CatalogoFilme {
    public static void exibirFilme () {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        outroFilme.exibeFichaTecnica();
        outroFilme.avalia(10);
        outroFilme.avalia(9.5);
        outroFilme.avalia(9.8);
        System.out.println("Total de avaliações: " + outroFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);




    }
}
