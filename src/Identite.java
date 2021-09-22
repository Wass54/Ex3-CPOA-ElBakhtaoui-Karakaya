/**
 * Classe qui permet de définir l'identité d'un étudiant
 */
public class Identite{

    /**
     * Attribut qui caractérise Numéro d’Identification Personnel
     */
    private String nip;
    /**
     * Attribut qui caractérise le nom d'un étudiant
     */
    private String nom;
    /**
     * Attribut qui caractérise le prénom d'un étudiant
     */
    private String prenom;

    /**
     * Constructeur qui initialise les paramètres de la classe Identité
     * @param pNip Numéro d’Identification Personnel de l'étudiant
     * @param pNom Nom de l'étudiant
     * @param pPrenom Prénom de l'étudiant
     */
    public Identite(String pNip, String pNom, String pPrenom){
        this.nip = pNip;
        this.nom = pNom;
        this.prenom = pPrenom;
    }

    /**
     * Getteur qui permet de récuperer le nip de l'étudiant
     * @return le nip de l'étudiant en forme de String
     */
    public String getNip(){
        return this.nip;
    }

    /**
     * Getteur qui permet de récuperer le nom de l'étudiant
     * @return le nom de l'étudiant en forme de String
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Getteur qui permet de récuperer le prénom de l'étudiant
     * @return le prénom de l'étudiant en forme de String
     */
    public String getPrenom(){
        return this.prenom;
    }

    
}