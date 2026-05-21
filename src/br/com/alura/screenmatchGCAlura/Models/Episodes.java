package br.com.alura.screenmatchGCAlura.Models;

import br.com.alura.screenmatchGCAlura.Calculations.Classifiable;

public class Episodes implements Classifiable {
    private int numbers;
    private String name;
    private Series serie;
    private int totalViews;


    //Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbers() {
        return numbers;
    }

    public int getTotalViews() {
        return totalViews;
    }


    //Setters

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassifiable()
    {
        if (totalViews > 100)
        {
            return 4;
        }
        else
        {
            return 2;
        }
    }

}
