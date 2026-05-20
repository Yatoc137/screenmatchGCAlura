package br.com.alura.screenmatchGCAlura.Models;

public class Movie {
    private String name;
    private int realeaseYear;
    private boolean includedPlan;
    private double sumOfTheEvaluations;
    private int ratingsTotal;
    private int minutesInDuration;

    //getters
    public int getRatingsTotal(){
        return ratingsTotal;

    }

    public String getName() {
        return name;
    }

    public int getRealeaseYear() {
        return realeaseYear;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public int getMinutesInDuration() {
        return minutesInDuration;
    }


    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setRealeaseYear(int realeaseYear) {
        this.realeaseYear = realeaseYear;
    }

    public void setMinutesInDuration(int minutesInDuration) {
        this.minutesInDuration = minutesInDuration;
    }

    // class
    public void displaysTechnicalSheet(){
        IO.println("Nome do Filme: " + name);
        IO.println("Ano de lamcamento " + realeaseYear);
        IO.println("O tempo de duracao e' de:" + minutesInDuration);
    }

    public void rating(double grade){
        sumOfTheEvaluations += grade;
        ratingsTotal++;
    }
    public double takeMedia()
    {
        return sumOfTheEvaluations / ratingsTotal;
    }
}
