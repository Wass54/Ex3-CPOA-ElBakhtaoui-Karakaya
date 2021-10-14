import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class EtudiantTest {

    Etudiant e;

    @Before
    public void Initialisation(){
        e = new Etudiant(new Identite("123", "Martin", "Jean"), new Formation());

        String matiere = "Sport";
        Float noteNormal = 10;
        Float noteNegative = -10;
        Float noteSuperieur = 50;
        HashMap<String, Integer> mapMatiere;
        Formation info;
        Etudiant etu1;
        
        mapMatiere = new HashMap<String, Integer>();
        mapMatiere.put("Mathematique", 3);
        mapMatiere.put("Expression Communication", 2);
        mapMatiere.put("Python", 5);
        info = new Formation("S3C", mapMatiere);
        etu1 = new Etudiant(new Identite("AA", "El Bakhtaoui","Wassim"), info);    
    }



    @Test
    public void test_ajouterNote_normal(){

        // Execution
        e.ajouterNote(matiere, noteNormal);

        // Verification
        assertTrue("La note a ete ajoutee", e.getNotes().get(matiere).get(0) == noteNormal);

    }

    @Test(expected = NoteException.class)
    public void test_ajouterNote_negatives() throws NoteException, MatiereException{
        e.ajouterNote("Anglais", -6);
        // Execution
        //e.ajouterNote(matiere, noteNegative);

        // Verification
        //assertTrue("La note n'a pas ete ajoutee car elle est negative", e.getNotes() <= 0);
    }

    @Test(expected = NoteException.class)
    public void test_ajouterNote_superieures() throws NoteException, MatiereException{
        e.ajouterNote("Anglais", 110);
        // Execution
        //e.ajouterNote(matiere, noteSuperieur);

        // Verification
        //assertTrue("La note n'a pas ete ajoutee car la valeur est; trop grande (max : 20)", e.getNotes().get(matiere) >= 20);
    }



    @Test(expected = NoteException.class)
    public void test_ajouterNoteSansMatiere() throws NoteException{
        e.ajouterNote(null, 14);
       //assertTrue("La note n'a pas ete ajoutee car il n'y a pas de matiere", e.getNotes() >= 20);

    }

    @Test
    public void test_calculerMoyenneMatiere(){
        // Préparation des données
        e.ajouterNote("Sport", 10);
        e.ajouterNote("Sport", 5);
        e.ajouterNote("Sport", 8);
        e.ajouterNote("Sport", 15);

        // Execution
        float moyenne = e.calculMoyenne("Sport");

        // Verification
        assertTrue("La moyenne devrait valoir 9,5.", 9.5 == moyenne);
    }


    @Test(expected = NoteException.class)
    public void test_calculerMoyenneMatiereSansNote() throws NoteException{
        e.ajouterNote("Italien", null);
        e.calculMoyenne("Italien");
       //assertTrue("La note n'a pas ete ajoutee car il n'y a pas de matiere", e.getNotes() >= 20);

    }




    @Test
    public void test_calculerMoyenneGenerale(){
        // Préparation des données
        e.ajouterNote("Sport", 15);
        e.ajouterNote("Francais", 9);
        e.ajouterNote("Maths", 14);
        e.ajouterNote("Physique", 13);

        // Execution
        float moyenne = e.calculMoyenneG();

        // Verification
        assertTrue("La moyenne devrait valoir 12,75.", 12.75 == moyenne);
    }
    @Test(expected = NoteException.class)
    public void test_calculerMoyenneGeneraleSansNote() throws NoteException{
        // Préparation des données
        e.ajouterNote("Sport", 15);
        e.ajouterNote("Francais", 9);
        e.ajouterNote("Maths", null);
        e.ajouterNote("Physique", 13);
        
        e.calculMoyenneG();
       //assertTrue("La note n'a pas ete ajoutee car il n'y a pas de matiere", e.getNotes() >= 20);

    }

}