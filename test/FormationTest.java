import static org.junit.Assert.*;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

public class FormationTest {

    Etudiant etudiant;
    Formation Medecine, Informatique, Mecanique;
    Map<String, Integer> mapMatiere;

    @Before    
    public void Initialisation(){
        mapMatiere = new HashMap<String, Integer>();
        mapMatiere.put("Mathematique", 3);
        mapMatiere.put("Expression Communication", 2);
        mapMatiere.put("Python", 5);
        info = new Formation("S3C", mapMatiere);
        etu1 = new Etudiant(new Identite("AA", "El-Baktahoui","Wassim"), info);    
    }
    
    
    @Test 
    public void ajouterMatiere_normal() {
        info.ajouterMatiere("Java", 6);

        assertEquals("Ajouter matiere", "Java", info.get("Java"));
    }
    

    @Test 
    public void ajouterMatiere_normal_null() {
        info.ajouterMatiere("Java", 0);
        int a>0;
        assertEquals("Le coefficient ne peut pas etre à 0", a, info.get("Java"));
    }



    @Test 
    public void ajouterMatiere_normal_negative() {
        info.ajouterMatiere("Java", 6);
        int a<0;
        assertEquals("Ajouter matiere", "Java", info.get("Java"));
    }
    
    
}