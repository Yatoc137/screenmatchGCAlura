
import br.com.alura.screenmatchGCAlura.Models.Movie;
import br.com.alura.screenmatchGCAlura.Models.Series;
import br.com.alura.screenmatchGCAlura.Models.Title;


import javax.swing.event.ListDataEvent;
import java.util.ArrayList;

void main()
{

    //Filmes
    Movie myMovie = new Movie("O poderoso chefao", 1970);
    myMovie.rating (9);

    Movie otherMovie = new Movie("Avatar", 2023);
    otherMovie.rating (6);

    var MoviePaulo = new Movie("Dog Ville", 2003);
    MoviePaulo.rating (10);
    // Serie

    Series mySeries = new Series("Lost", 2000);



    //


    ArrayList<Title> watchList = new ArrayList<>();
    watchList.add(MoviePaulo);
    watchList.add(myMovie);
    watchList.add(otherMovie);
    watchList.add (mySeries);


    for(Title item: watchList)
    {
        IO.println(item.getName());
        if (item instanceof Movie movie && movie.getClassifiable() > 2)
        {
            IO.println("Classificacao: " + movie.getClassifiable() );
        }
    }


    List <String> searchByArtist = new ArrayList<>();

    searchByArtist.add ("Adam Sandler");
    searchByArtist.add ("Paulo");
    searchByArtist.add ("Jaqueline");

    Collections.sort(searchByArtist);
    IO.println(searchByArtist);

    IO.println("\nLista de titulo ordenados");
    Collections.sort(watchList);
    IO.println(watchList);
    watchList.sort(Comparator.comparing(Title::getRealeaseYear));
    IO.println("Ordenando por ano");
    IO.println(watchList);

}
