package Stepdefinition;

public class Legume {
    private String nom;
    private Planete Planete;


    public Legume(String nom, Planete mere) {
        this.nom = nom;
        this.Planete = mere;
    }
    public String getName(){ return this.nom; }
    public Planete getMere(){return this.Planete;}
    public void setName(String nom){this.nom = nom;}
    public boolean isSoleil(){
        return (this.Planete.getEtoile() == "Soleil");
    }

}
