package Stepdefinition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecettePlaneteTest {
    Recette rAvril = new RecettePlaneteAvril();
    Recette rMer = new RecettePlaneteMer();
    Recette rPartis = new RecettePlanetePartis();

    @Test
    public void TestRp(){
        assertEquals("la recette de la Planete Avril est composee de PatateAvril et PommeAvril",rAvril.creerRecette());
        assertEquals("la recette de la Planete Mer est composee de PatateMer et PommeMer",rMer.creerRecette());
        assertEquals("la recette de la Planete Partis est composee de PatatePartis et PommePartis",rPartis.creerRecette());
    }
}

