package Stepdefinition;

import java.util.ArrayList;

public class RecettePlaneteMer extends Recette {

    @Override
    public String creerRecette() {
        Legume l1 = new Legume("PommeMer", new Planete("Mer", 10000));
        Legume l2 = new Legume("PatataMer", new Planete("Mer", 10000));
        legumeList = new ArrayList<Legume>();
        legumeList.add(l1);
        legumeList.add(l2);
        return("la recette de la Planete Mer est composee de PatateMer et PommeMer");
    }
}
