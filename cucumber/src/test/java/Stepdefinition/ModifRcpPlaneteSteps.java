package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ModifRcpPlaneteSteps {
    Recette r;
    Legume nvlegume ;
    String nomLegume;

    @Given("une recette est composé des legumes de la planete")
    public void une_recette_est_composé_des_legumes_de_la_planete() {
        r = new RecettePlaneteMer();
        r.creerRecette();
    }

    @When("un nouveau legume apparait dans une planete")
    public void un_nouveau_legume_apparait_dans_une_planete() {
        une_recette_est_composé_des_legumes_de_la_planete();
        nvlegume = new Legume("haricot",new Planete("Mer",10000));
        nomLegume = r.addLegume(nvlegume);
    }

    @Then("la recette change")
    public void la_recette_change() {
        un_nouveau_legume_apparait_dans_une_planete();
        assertEquals("haricot",nomLegume);
    }


}
