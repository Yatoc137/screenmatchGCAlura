public class Movie {
    String name;
    int realeaseYear;
    boolean includedPlan;
    double sumOfTheEvaluations;
    int ratingsTotal;
    int minutesInDuration;

    void displaysTechnicalSheet (){
        IO.println("Nome do Filme: " + name);
        IO.println("Ano de lamcamento " + realeaseYear);
        IO.println(" O tempo de duracao e' de:" + minutesInDuration);
    }

    void rating(double grade){
        sumOfTheEvaluations += grade;
        ratingsTotal++;
    }
    double takeMedia()
    {
        return sumOfTheEvaluations / ratingsTotal;
    }
}
