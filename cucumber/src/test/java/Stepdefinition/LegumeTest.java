package Stepdefinition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LegumeTest {

    Legume l1 = new Legume("Patate",new Planete("Avril",1));
    @Test
    public void testLegume() {
        String nom  ="patate";
        Legume l = new Legume(nom,new Planete("Avril",1));
        assertEquals("patate",l.getName());
        assertEquals("Avril",l.getMere().getName());
    }
    @Test
    public void TestgetName(){
        assertEquals("Patate",l1.getName());
    }
    @Test
    public void TestgetMere(){assertEquals("Avril",l1.getMere().getName());}
    @Test
    public void TestsetName(){
        l1.setName("carotte");
        assertEquals("carotte",l1.getName());
    }
    @Test
    public void TestisSoleil(){
        assertEquals(true,l1.isSoleil());
    }


}
