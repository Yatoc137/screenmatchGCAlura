import br.com.alura.screenmatchGCAlura.Calculations.RecommendationFilter;
import br.com.alura.screenmatchGCAlura.Calculations.TimeCalculator;
import br.com.alura.screenmatchGCAlura.Models.Episodes;
import br.com.alura.screenmatchGCAlura.Models.Movie;
import br.com.alura.screenmatchGCAlura.Models.Series;

void main() {

    // Filme 1
    Movie myMovie = new Movie("O poderoso chefao", 1970);
    myMovie.setMinutesInDuration(180);
    myMovie.displaysTechnicalSheet();

    myMovie.rating(8);
    myMovie.rating(5);
    myMovie.rating(10);

    IO.println("Total de avaliacoes: " + myMovie.getRatingsTotal());
    IO.println();
    IO.println("A media de avaliacoes do filme e: " + myMovie.takeMedia());

    IO.println();

    // Série
    Series mySeries = new Series("Lost", 2000);

    mySeries.setSeasons(10);
    mySeries.setEpisodesPerSeason(10);
    mySeries.setMinutesPerEpisode(50);

    mySeries.displaysTechnicalSheet();
    IO.println("Duracao para maratonar Lost: " + mySeries.getMinutesInDuration());

    IO.println();

    // Filme 2
    Movie otherMovie = new Movie("Avatar", 2023);

    otherMovie.setMinutesInDuration(200);

    otherMovie.displaysTechnicalSheet();
    IO.println("Duracao do filme Avatar: " + otherMovie.getMinutesInDuration());

    IO.println();

    // Calculadora de tempo
    TimeCalculator calculator = new TimeCalculator();

    calculator.includes(myMovie);
    calculator.includes(otherMovie);
    calculator.includes(mySeries);

    IO.println("Tempo total para assistir tudo: " + calculator.getTotalTime());


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


    ArrayList <Movie> MoviesLists = new ArrayList<>();
    MoviesLists.add(MoviePaulo);
    MoviesLists.add(myMovie);
    MoviesLists.add(otherMovie);

    IO.println("Tamanho da lista: " + MoviesLists.size());
    IO.println("Primeiro Filme: " + MoviesLists.get(0).getName());
    IO.println(MoviesLists);
    IO.println("Primeiro Filme: " + MoviesLists.get(0).toString());



}

