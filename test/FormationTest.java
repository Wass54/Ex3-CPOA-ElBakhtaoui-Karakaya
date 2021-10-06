import static org.junit.Assert.*;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

public class FormationTest {

    Etudiant etu1;
    Formation info;
    Map<String, Integer> mapMatiere;

    @Before    
    public void Initialisation(){
        mapMatiere = new HashMap<String, Integer>();
        mapMatiere.put("Mathematique", 3);
        mapMatiere.put("Expression Communication", 2);
        mapMatiere.put("Python", 5);
        info = new Formation("S3C", mapMatiere);
        etu1 = new Etudiant(new Identite("AA", "El Bakhtaoui","Wassim"), info);    
    }
    
    
    @Test 
    public void ajouterMatiere_coef_normal() {
        info.ajouterMatiere("Java", 6);

        assertEquals("Ajouter matiere", "Java", info.get("Java"));
    }
    

    @Test 
    public void ajouterMatiere_coef_null() {
        info.ajouterMatiere("Java", 0);
        int a>0;
        assertEquals("Le coefficient ne peut pas etre à 0", a, info.get("Java"));
    }


    @Test 
    public void ajouterMatiere_coef_negative() {
        info.ajouterMatiere("Java", 6);
        int a<0;
        assertEquals("Ajouter matiere", "Java", info.get("Java"));
    }

    @Test 
    public void supprimerMatiere_existe(){
        info.supprimerMatiere("Mathematique");
        assertEquals("La matiere devrait etre supprime", null, info.get("Mathematique"));
    }

    @Test 
    public void supprimerMatiere_existe_pas(){
        assertEquals("La matiere ne peut pas etre supprime si elle n'existe pas", "La matiere n'existe pas", info.supprimerMatiere("Sport"));
    }

    @Test 
    public void coefMatiere_existe(){
        int res = info.coefMatiere("Python");
        assertEquals("Le resultat devrait etre 5", 5 , res);
    }

    @Test
    public void coefMatiere_existe_pas(){
        int res = info.coefMatiere("Economie");
        assertEquals("Le resultat devrait etre -1 car economie n'existe pas", -1 , res);
    }

    @Test
    public void tableMatiere_instanciee(){
        //instruction de test
		boolean res = mapMatiere.isEmpty();
		//Assertions
		assertTrue("Le resultat devrait etre faux", res);
    }

    
}