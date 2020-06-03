package Stepdefinition;


import java.util.ArrayList;

public class RecettePlaneteAvril extends Recette{
    @Override
    public String creerRecette() {
        Legume l1 = new Legume("PommeAvril", new Planete("Avril", 10000));
        Legume l2 = new Legume("PatataAvril", new Planete("Avril", 10000));
        legumeList = new ArrayList<Legume>();
        legumeList.add(l1);
        legumeList.add(l2);
        return ("la recette de la Planete Avril est composee de PatateAvril et PommeAvril");
    }
}
