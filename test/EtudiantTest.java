public class EtudiantTest {

    Etudiant e;

    @Before
    public void before(){
        e = new Etudiant(new Identite("123", "Martin", "Jean"), new Formation());
    }

    @Test
    public void test_ajouterNote_normal(){
        // Préparations des données
        String matiere = "Sport";
        Float note = 10;

        // Execution
        e.ajouterNote(matiere, note);

        // Verification
        assertTrue("La note n'a pas ete ajoutee", e.getNotes().get(matiere).get(0) == note);

    }

    @Test
    public void test_ajouterNote_negatives(){
        // Préparations des données
        String matiere = "Sport";
        Float note = -10;

        // Execution
        e.ajouterNote(matiere, note);

        // Verification
        assertTrue("La note n'a pas ete ajoutee", e.getNotes().size() == 0);
    }

    @Test
    public void test_ajouterNote_superieures(){
        // Préparations des données
        String matiere = "Sport";
        Float note = 50;

        // Execution
        e.ajouterNote(matiere, note);

        // Verification
        assertTrue("La note n'a pas ete ajoutee valeur trop grande", e.getNotes().size() == 0);
    }

    @Test
    public void test_calculerMoyenneMatiere(){
        // Préparation des données
        e.ajouterNote("Sport", 10);
        e.ajouterNote("Sport", 5);
        e.ajouterNote("Sport", 8);
        e.ajouterNote("Sport", 15);

        // Execution
        float moyenne = e.calculMoyenneMatiere("Sport");

        // Verification
        assertTrue("La moyenne devrait valoir 9,5.", 9.5 == moyenne);
    }

    @Test
    public void test_calculerMoyenneGenerale(){
        // Préparation des données
        e.ajouterNote("Sport", 15);
        e.ajouterNote("Francais", 9);
        e.ajouterNote("Maths", 14);
        e.ajouterNote("Physique", 13);

        // Execution
        float moyenne = e.calculMoyenneGeneral();

        // Verification
        assertTrue("La moyenne devrait valoir 12,75.", 12.75 == moyenne);
    }
}