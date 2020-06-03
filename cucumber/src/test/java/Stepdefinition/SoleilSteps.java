package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class SoleilSteps {
    Legume l;
    boolean isSoleil;

    @Given("la pousse-legume necessite les rayons du soleil")
    public void la_pousse_legume_necessite_les_rayons_du_soleil() {
        l = new Legume("carotteAvril",new Planete("Avril",10000));
    }

    @When("la creation du soleil fait pousser les legumes")
    public void la_creation_du_soleil_fait_pousser_les_legumes() {
        la_pousse_legume_necessite_les_rayons_du_soleil();
        isSoleil = l.isSoleil();
    }

    @Then("l'etoile de la planete du legume est Soleil")
    public void l_etoile_de_la_planete_du_legume_est_Soleil() {
        la_creation_du_soleil_fait_pousser_les_legumes();
        assertEquals(true,isSoleil);
    }



}
