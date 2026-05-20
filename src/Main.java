import br.com.alura.screenmatchGCAlura.Models.Movie;

void main() {
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
    IO.println ("A media de avaliacoes do filme e' " + myMovie.takeMedia());




}


