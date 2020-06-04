package Stepdefinition;

public class ConcoursRecette {
    protected Recette recette;

    public String presenterRecette(){
        return recette.creerRecette();
    }
    public void setRecette(Recette recipe){
        recette = recipe;
    }
}
