package Stepdefinition;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlatTest {

        private Plat plat1;
        private Recette recette1;

        // Définissez ici les variables d'instance nécessaires à vos engagements;
        // Vous pouvez également les saisir automatiquement du présentoir
        // à l'aide du menu contextuel "Présentoir --> Engagements".
        // Notez cependant que ce dernier ne peut saisir les objets primitifs
        // du présentoir (les objets sans constructeur, comme int, float, etc.).



        /**
         * Constructeur de la classe-test PlatTest
         */
        public PlatTest()
        {
        }

        /**
         * Met en place les engagements.
         *
         * Méthode appelée avant chaque appel de méthode de test.
         */
        @Before
        public void setUp() // throws java.lang.Exception
        {
            plat1 = new Plat();
            plat1.setRecette(recette1);
        }

        /**
         * Supprime les engagements
         *
         * Méthode appelée après chaque appel de méthode de test.
         */
        @After
        public void tearDown() // throws java.lang.Exception
        {
            //Libérez ici les ressources engagées par setUp()
        }

        @Test
        public void testCommande()
        {
            Plat plat1 = new Plat();
            assertEquals("vous avez commande le plat couscous, il coute 4 euro\n", plat1.commanderPlat("couscous", 4));
        }
        @Test
        public void testGetMenu() {
            plat1 = new Plat();
            Menu menu = new Menu();
            plat1.setMenu(menu);
            assertEquals(menu, plat1.getMenu());
        }

        @Test
        public void testSetMenu() {
            plat1 = new Plat();
            Menu menu = new Menu();
            plat1.setMenu(menu);
            assertEquals(menu, plat1.getMenu());
        }
      /*  @Test
        public void testPreparerPlat()
        {
            assertEquals(12, plat1.preparerPlat(12));
        }*/
}

