import br.com.alura.screenmatchGCAlura.Calculations.TimeCalculator;
import br.com.alura.screenmatchGCAlura.Models.Movie;
import br.com.alura.screenmatchGCAlura.Models.Series;

void main() {

    // Filme 1
    Movie myMovie = new Movie();
    myMovie.setName("O poderoso chefao");
    myMovie.setRealeaseYear(1970);
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
    Series mySeries = new Series();
    mySeries.setName("Lost");
    mySeries.setRealeaseYear(2000);
    mySeries.setSeasons(10);
    mySeries.setEpisodesPerSeason(10);
    mySeries.setMinutesPerEpisode(50);

    mySeries.displaysTechnicalSheet();
    IO.println("Duracao para maratonar Lost: " + mySeries.getMinutesInDuration());

    IO.println();

    // Filme 2
    Movie otherMovie = new Movie();
    otherMovie.setName("Avatar");
    otherMovie.setRealeaseYear(2023);
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
}

