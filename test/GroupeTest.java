import static org.junit.Assert.*;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

public class GroupeTest {

    Groupe gr;
    List<Etudiant> etuds;
    Etudiant etu1, etu2, etu3, etu4, etu5, etu6, etu10;
    HashMap<String, Integer> mapMatiere, mapMatiere2;
    Formation info, info2;
    Map<String,ArrayList<Float>> notes;



    @Before    
    public void Initialisation(){

        mapMatiere = new HashMap<String, Integer>();
        mapMatiere.put("Mathematique", 3);
        mapMatiere.put("Expression Communication", 2);
        mapMatiere.put("Python", 5);
        mapMatiere.put("BDD", 3);
        mapMatiere2 = new HashMap<String, Integer>();
        mapMatiere2.put("Economie", 3);
        mapMatiere2.put("Danse", 6);
        mapMatiere2.put("Course", 5);
        mapMatiere2.put("Muscu", 1);

        info = new Formation("S3C", mapMatiere);
        info2 = new Formation("S3D", mapMatiere2);

        etu1 = new Etudiant(new Identite("AA", "El Bakhtaoui","Wassim"), info); 
        etu2 = new Etudiant(new Identite("BB", "Karakaya","Enes"), info); 
        etu3 = new Etudiant(new Identite("CC", "Cristiano","Ronaldo"), info); 
        etu4 = new Etudiant(new Identite("DD", "Federico","Chiesa"), info); 
        etu5 = new Etudiant(new Identite("FF", "Didier","Deschamps"), info); 
        etu6 = new Etudiant(new Identite("EE", "Poco","Bello"), info2); 

        etuds = new List<Etudiant>();
        this.add(etu1);  
        this.add(etu2);
        this.add(etu3);

        etu1.ajouterNote("Mathematique", 20);
        etu1.ajouterNote("Mathematique", 20);
        etu1.ajouterNote("Mathematique", 20);
        etu1.ajouterNote("Mathematique", 20);
        etu2.ajouterNote("Mathematique", 20);
        etu2.ajouterNote("Mathematique", 20);
        etu2.ajouterNote("Mathematique", 20);
        etu2.ajouterNote("Mathematique", 20);
        etu3.ajouterNote("Mathematique", 20);
        etu3.ajouterNote("Mathematique", 20);
        etu3.ajouterNote("Mathematique", 20);
        etu3.ajouterNote("Mathematique", 20);

        etu1.ajouterNote("Expression Communication", 20);
        etu1.ajouterNote("Expression Communication", 20);
        etu1.ajouterNote("Expression Communication", 20);
        etu1.ajouterNote("Expression Communication", 20);
        etu2.ajouterNote("Expression Communication", 20);
        etu2.ajouterNote("Expression Communication", 20);
        etu2.ajouterNote("Expression Communication", 20);
        etu2.ajouterNote("Expression Communication", 20);
        etu3.ajouterNote("Expression Communication", 20);
        etu3.ajouterNote("Expression Communication", 20);
        etu3.ajouterNote("Expression Communication", 20);
        etu3.ajouterNote("Expression Communication", 20);

        etu1.ajouterNote("Python", 20);
        etu1.ajouterNote("Python", 20);
        etu1.ajouterNote("Python", 20);
        etu1.ajouterNote("Python", 20);
        etu2.ajouterNote("Python", 20);
        etu2.ajouterNote("Python", 20);
        etu2.ajouterNote("Python", 20);
        etu2.ajouterNote("Python", 20);
        etu3.ajouterNote("Python", 20);
        etu3.ajouterNote("Python", 20);
        etu3.ajouterNote("Python", 20);
        etu3.ajouterNote("Python", 20);

        etu1.ajouterNote("BDD", 20);
        etu1.ajouterNote("BDD", 20);
        etu1.ajouterNote("BDD", 20);
        etu1.ajouterNote("BDD", 20);
        etu2.ajouterNote("BDD", 20);
        etu2.ajouterNote("BDD", 20);
        etu2.ajouterNote("BDD", 20);
        etu2.ajouterNote("BDD", 20);
        etu3.ajouterNote("BDD", 20);
        etu3.ajouterNote("BDD", 20);
        etu3.ajouterNote("BDD", 20);
        etu3.ajouterNote("BDD", 20);

        gr = new Groupe(info, etuds);

    }

    @Test 
    public void ajouterEtudiant_Inexistant() {
        assertEquals("L'etudiant ne peut pas etre ajouté car il n'existe pas", "L'etudiant n'existe pas", gr.ajouterEtudiant(etu5));
    }

    @Test 
    public void ajouterEtudiant_existant(){
        assertEquals("L'etudiant doit pouvoir etre ajouté", "Etudiant ajoute", gr.ajouterEtudiant(etu4));
    }

    @Test 
    public void ajouterEtudiant_existant_formation_differente(){
        assertEquals("L'etudiant ne peut pas avoir une formation differente que le groupe", "La formation n'est pas compatible", gr.ajouterEtudiant(etu6));
    }

    @Test
    public void ajouterEtudiant_existant_formation_pareil(){
        assertEquals("L'etudiant doit avoir la meme formation que le groupe", "Etudiant ajoute", gr.ajouterEtudiant(etu5));
    }

    @Test 
    public void supprimerEtudiant_existant(){
        assertEquals("L'etudiant est supprime car il est existant", "Etudiant supprime", gr.supprimerEtudiant(etu1));
    }

    @Test 
    public void supprimerEtudiant_inexistant(){
        assertEquals("L'etudiant doit existé dans le groupe pour etre supprime", "L'etudiant n'existe pas", gr.supprimerEtudiant(etu10));
    }

    @Test 
    public void calculMoyenne_matiere_existante(){
        assertEquals("Le groupe d'etudiant doit avoir une moyenne de 20 en mathemtique", 20, gr.calculMoyenne("Mathematique"),0.01);
    }

    @Test 
    public void calculMoyenne_matiere_inexistante(){
        assertEquals("La matiere doit etre dans la formation", "La matiere n'est pas dans la formation", gr.calculMoyenne("Logobi"));
    }
    
    @Test
    public void calculMoyenneG_normal(){
        assertEquals("Le groupe d'etudiant doit avoir une moyenne generale de 20", 20, gr.calculMoyenneG(),0.01);
    }

    
    


    
}