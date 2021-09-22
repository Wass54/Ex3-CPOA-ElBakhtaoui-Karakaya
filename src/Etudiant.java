import java.util.*;

/**
 * Classe qui permet de définir un étudiant
 */

public class Etudiant{

    /**
     * Attribut qui permet de connaitre l'identité de l'étudiant
     */
    private Identite identite;
    /**
     * Attribut qui permet de connaitre la formation de l'étudiant
     */
    private Formation formation;
    /**
     * Attribut qui permet de savoir les notes de l'étudiant
     */
    private Map<String,ArrayList<Float>> notes;

    /**
     * Constructeur permettant d'initialiser les attributs d'etudiant
     * @param Identite l'identité de l'étudiant
     * @param Formation formation de l'étudiant
     */
    public Etudiant(Identite pIdentite, Formation pFormation){
        this.identite = pIdentite;
        this.formation = pFormation;
        this.notes = new HashMap<String, ArrayList<Float>>();
    }

    /**
     * Méthode qui permet d'ajouter des notes
     * @param s une chaine de caractère qui correspond à une clé
     * @param f un float qui correspond à la note
     */
    public void ajouterNote(String a, float b){
        if(this.containsKey(a)){
        notes.put(a, b);
        }
    }

    /**
     * Getteur qui permet de récuperer l'identité de l'étudiant
     * @return l'identité de l'étudiant de type Identite
     */
    public Identite getIdentite(){
        return this.identite;
    }

    /**
     * Getteur qui permet de récuperer la formation de l'étudiant
     * @return la formation de l'étudiant de type Formation
     */
    public Formation getFormation(){
        return this.formation;
    }

    /**
     * Getteur qui permet de récuperer les notes de l'étudiant
     * @return les notes de l'étudiant 
     */
    public Map<String, ArrayList<Float>> getNotes(){
        return this.notes;
    }

    /**
     * Méthode toString qui renvoi les informations sur l'étudiant
     * @return une chaine de caractère qui contient les informations sur l'étudiant
     */
    @Override
    public String toString() {
        return "{" +
            " identite='" + getIdentite() + "'" +
            ", formation='" + getFormation() + "'" +
            ", notes='" + getNotes() + "'" +
            "}";
    }


}