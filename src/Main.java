
void main() {
    Movie myMovie = new Movie();
    myMovie.name = "O poderoso chefao";
    myMovie.realeaseYear = 1970;
    myMovie.minutesInDuration = 180;

    myMovie.displaysTechnicalSheet();
    myMovie.rating(8);
    myMovie.rating(5);
    myMovie.rating(10);

    IO.println(myMovie.sumOfTheEvaluations);
    IO.println(myMovie.ratingsTotal);
    IO.println ("A media de avaliacoes do filme e'" + myMovie.takeMedia());
}


