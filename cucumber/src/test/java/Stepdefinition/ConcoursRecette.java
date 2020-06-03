package Stepdefinition;

public class ConcoursRecette {
    protected Recette recette;

    public void presenterRecette(){
        recette.creerRecette();
    }
    public void setRecette(Recette recipe){
        recette = recipe;
    }
}
