package br.com.alura.screenmatchGCAlura.Models;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {

    @SerializedName("Title")
    private String name;

    @SerializedName("Year")
    private int realeaseYear;

    private boolean includedPlan;
    private double sumOfTheEvaluations;
    private int ratingsTotal;
    private int minutesInDuration;

    // Construtor
    public Title(String name, int realeaseYear) {
        this.name = name;
        this.realeaseYear = realeaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.realeaseYear = Integer.valueOf(myTitleOmdb.year());
        this.minutesInDuration = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
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

        System.out.println("Nome do titulo: " + name);
        System.out.println("Ano de lancamento: " + realeaseYear);
        System.out.println("O tempo de duracao e de: " + getMinutesInDuration());
    }

    public void rating(double grade) {
        sumOfTheEvaluations += grade;
        ratingsTotal++;
    }

    public double takeMedia() {
        return sumOfTheEvaluations / ratingsTotal;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                ", realeaseYear: " + realeaseYear + "," +
                "duracao: " + minutesInDuration;
    }
}