package Stepdefinition;

public class Legume {
    String nom;
    int maturite; // A QUEL MOMENT LE LEGUME EST MATURE (par semaine)
    String couleur;
    int poids;
    String Planete;

    public Legume(String nom,String couleur, Planete mere){
        this.nom = nom;
        this.couleur = couleur;
        this.poids = (int) (Math.random() * 100 + 1 );
        this.Planete = mere.getName();
        this.maturite = (int) (Math.random() * 10 + 1 );
    }
    public String getName(){ return this.nom; }
    public String getMere(){return this.Planete;}
    public int getPoids(){return this.poids;}
    public int getMaturite(){return this.maturite;}
    public void setName(String nom){this.nom = nom;}
    public void setPlanete(Planete planete) { this.Planete = planete.getName(); }
    public void setPoids(int poids) { this.poids = poids; }
    public void setMaturite(int maturite) { this.maturite = maturite; }
    public void setCouleur(String couleur) { this.couleur = couleur; }
}
