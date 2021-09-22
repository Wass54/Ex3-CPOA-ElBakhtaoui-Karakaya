import java.util.*;

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

    /**
     * Méthode toString qui permet de donner les informations de l'identité
     * @return Les informations en forme de String
     */
    @Override
    public String toString() {
        return "{" +
            " nip='" + getNip() + "'" +
            ", nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            "}";
    }

    /**
     * Méthode equals qui permet de comparer deux objets 
     * @param o un objet
     * @return un boolean qui permet de savoir qui c'est les mêmes ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Identite)) {
            return false;
        }
        Identite identite = (Identite) o;
        return Objects.equals(nip, identite.nip) && Objects.equals(nom, identite.nom) && Objects.equals(prenom, identite.prenom);
    }

    /**
     * Méthode hashCode
     * @return un entier
     */
    @Override   
    public int hashCode() {
        return Objects.hash(nip, nom, prenom);
    }


}