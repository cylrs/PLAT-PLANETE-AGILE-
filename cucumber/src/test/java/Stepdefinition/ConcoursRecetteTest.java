package Stepdefinition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConcoursRecetteTest {

    @Test
    public void testcreerRecette(){
        ConcoursRecette cr = new ConcoursRecette();
        cr.setRecette(new RecettePlaneteAvril());
        assertEquals("la recette de la Planete Avril est composee de PatateAvril et PommeAvril", cr.presenterRecette());
    }

}