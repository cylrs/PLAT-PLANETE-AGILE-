package Stepdefinition;

import javax.print.DocFlavor;

public class Soleil {
    private static final Soleil instance = new Soleil();
    private String etoile;

    private Soleil()
    {
        etoile="Soleil";
        System.out.println("Construction du Singleton au premier appel");
    }

    public static final Soleil getInstance()
    {
        return instance;
    }

    @Override
    public String toString()
    {
        return String.format("Je suis l'etoile : %s", etoile);
    }
    public String getEtoile() {return etoile};
}

