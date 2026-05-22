
import br.com.alura.screenmatchGCAlura.Models.Movie;
import br.com.alura.screenmatchGCAlura.Models.Series;
import br.com.alura.screenmatchGCAlura.Models.Title;


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

}
