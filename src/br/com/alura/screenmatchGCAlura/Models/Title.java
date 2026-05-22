package br.com.alura.screenmatchGCAlura.Models;

public abstract class Title {

    private String name;
    private int realeaseYear;
    private boolean includedPlan;
    private double sumOfTheEvaluations;
    private int ratingsTotal;
    private int minutesInDuration;


    //Construtor

    public Title(String name, int realeaseYear) {
        this.name = name;
        this.realeaseYear = realeaseYear;
    }


    // Getters

    public String getName() {
        return name;
    }

    public int getRealeaseYear() {
        return realeaseYear;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public int getRatingsTotal() {
        return ratingsTotal;
    }

    public int getMinutesInDuration() {
        return minutesInDuration;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setRealeaseYear(int realeaseYear) {
        this.realeaseYear = realeaseYear;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setMinutesInDuration(int minutesInDuration) {
        this.minutesInDuration = minutesInDuration;
    }

    // Métodos

    public void displaysTechnicalSheet() {
        IO.println("Nome do titulo: " + name);
        IO.println("Ano de lancamento: " + realeaseYear);
        IO.println("O tempo de duracao e de: " + getMinutesInDuration());
    }

    public void rating(double grade) {
        sumOfTheEvaluations += grade;
        ratingsTotal++;
    }

    public double takeMedia() {
        if (ratingsTotal == 0) {
            return 0;
        }

        return sumOfTheEvaluations / ratingsTotal;
    }
}