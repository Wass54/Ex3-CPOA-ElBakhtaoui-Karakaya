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
        etu1 = new Etudiant(new Identite("I1", "Neymar","Jean"), info);    
    }
    
    
    @Test 
    public void testAjouterNote_OK() {
        etu1.ajouterNote("Web", 12);
        Map<String, ArrayList<Float>> notes = etu1.getNotes();
        ArrayList<Float> note = notes.get("Web");
        float n = note.get(note.size()-1);
        assertEquals("La derniere note devrai être 12", 12,n);
    }
    
    
    
}