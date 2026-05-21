package br.com.alura.screenmatchGCAlura.Models;

import br.com.alura.screenmatchGCAlura.Calculations.Classifiable;

public class Movie extends Title implements Classifiable {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassifiable() {
        return (int) takeMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" +this.getRealeaseYear() + ") ";
    }
}