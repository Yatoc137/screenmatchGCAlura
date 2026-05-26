import br.com.alura.screenmatchGCAlura.Calculations.RecommendationFilter;
import br.com.alura.screenmatchGCAlura.Calculations.TimeCalculator;
import br.com.alura.screenmatchGCAlura.Models.Episodes;
import br.com.alura.screenmatchGCAlura.Models.Movie;
import br.com.alura.screenmatchGCAlura.Models.Series;

import java.util.ArrayList;

void main() {

    // Filme 1
    Movie myMovie = new Movie("O poderoso chefao", 1970);
    myMovie.setMinutesInDuration(180);
    myMovie.displaysTechnicalSheet();

    myMovie.rating(8);
    myMovie.rating(5);
    myMovie.rating(10);

    System.out.println("Total de avaliacoes: " + myMovie.getRatingsTotal());

    System.out.println("A media de avaliacoes do filme e: " + myMovie.takeMedia());



    // Série
    Series mySeries = new Series("Lost", 2000);

    mySeries.setSeasons(10);
    mySeries.setEpisodesPerSeason(10);
    mySeries.setMinutesPerEpisode(50);

    System.out.println("Duracao para maratonar Lost: " + mySeries.getMinutesInDuration());


    // Filme 2
    Movie otherMovie = new Movie("Avatar", 2023);

    otherMovie.setMinutesInDuration(200);

    otherMovie.displaysTechnicalSheet();
    System.out.println("Duracao do filme Avatar: " + otherMovie.getMinutesInDuration());



    // Calculadora de tempo
    TimeCalculator calculator = new TimeCalculator();

    calculator.includes(myMovie);
    calculator.includes(otherMovie);
    calculator.includes(mySeries);

    System.out.println("Tempo total para assistir tudo: " + calculator.getTotalTime());


    RecommendationFilter filteredRecommendation = new RecommendationFilter();
    filteredRecommendation.filter(myMovie);


    Episodes episode = new Episodes();
    episode.setNumbers(1);
    episode.setSerie(mySeries);
    episode.setTotalViews(300);
    filteredRecommendation.filter(episode);



    //Filme Paulo
    var MoviePaulo = new Movie("Dog Ville", 2003);
    MoviePaulo.setMinutesInDuration(200);
    MoviePaulo.rating(10);


    ArrayList<Movie> MoviesLists = new ArrayList<>();
    MoviesLists.add(MoviePaulo);
    MoviesLists.add(myMovie);
    MoviesLists.add(otherMovie);

    System.out.println("Tamanho da lista: " + MoviesLists.size());
    System.out.println("Primeiro Filme: " + MoviesLists.get(0).getName());
    System.out.println(MoviesLists);
    System.out.println("Primeiro Filme: " + MoviesLists.get(0).toString());



}

