package Stepdefinition;

import java.util.List;
import java.util.Objects;

/**
 * Décrivez votre classe Recette ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class Recette
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int nbIng;

    protected List<Legume> legumeList;
    abstract public String creerRecette();


    public int getNbIng() {
		return nbIng;
	}

	public void setNbIng(int nbIng) {
		this.nbIng = nbIng;
	}

	/**
     * Constructeur d'objets de classe Recette
     */
    public Recette()
    {
        // initialisation des variables d'instance

    }

    public Recette(int nbIng) {
		super();
		this.nbIng = nbIng;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recette r = (Recette) o;
        return Objects.equals(nbIng, r.nbIng);
    }
	/**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int ajouterIng(int n)
    {
        // Insérez votre code ici
        extracted(n);
        return nbIng;
    }

	private void extracted(int n) {
		nbIng+=n;
	}

	//methode d'ajout ingredient
    public String addLegume(Legume l){
        this.legumeList.add(l);
        return l.getName();
    }
}
