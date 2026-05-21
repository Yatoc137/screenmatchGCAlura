package br.com.alura.screenmatchGCAlura.Calculations;

import br.com.alura.screenmatchGCAlura.Models.Title;

public class TimeCalculator {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Title title) {
        totalTime += title.getMinutesInDuration();
    }

}