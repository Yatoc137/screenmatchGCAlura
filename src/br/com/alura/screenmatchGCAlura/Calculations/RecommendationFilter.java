package br.com.alura.screenmatchGCAlura.Calculations;

public class RecommendationFilter
{
    private String Recommendation;

    public void filter(Classifiable classifiable)
    {
        if (classifiable.getClassifiable() >= 4 )
        {
            System.out.println("Esta entre os preferidos do momento!");
        }
        else if (classifiable.getClassifiable() >= 2)
        {
            System.out.println("Muito bem avaliado no momento!");
        }
        else
        {
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
