import java.util.*;
/**
 * classe qui correspond à un groupe
 */
public class Groupe{

    /**
     * attribut privé qui correspond à la formation du groupe
     */
    private Formation formation;
    /**
     * attribut privé qui correspond aux etudiants constituant le groupe en forme de liste
     */
    private List<Etudiant> etudiants;

    /**
     * constructeur avec paramètre qui initialise les attributs de la classe Groupe
     * @param pFormation formation du groupe
     * @param pEtudiants etudiants du groupe de type liste etudiant
     */
    public Groupe(Formation pFormation, List<Etudiant> pEtudiants){
        this.formation = pFormation;
        this.etudiants = pEtudiants;
    }

    /**
     * méthode qui permet d'ajouter un étudiant du groupe
     * @param Etudiant étudiant qui va être ajouté dans la liste etudiants
     */
    public void ajouterEtudiant(Etudiant pEtu){
        if(this.getFormation() == pEtu.getFormation()){
            if(!etudiants.contains(pEtu)){
                etudiants.add(pEtu);     
            }
        }
    }

    /**
     * méthode qui permet de supprimer un étudiant du groupe
     * @param Etudiant étudiant qui va être supprimé
     */
    public void supprimerEtudiant(Etudiant pEtu){
        if(etudiants.contains(pEtu)){
        etudiants.remove(pEtu);
        }
    }

    /**
     * méthode qui permet de calculer la moyenne du groupe d'étudiant
     * @param String la chaine de caractère correspond à la matière dont on veut savoir la moyenne
     * @return une valeur de type float qui correspond à la moyenne
     */
    public float calculMoyenne(String pMatiere){
        float res = 0;
        for (int i = 0; i < etudiants.size(); i++) {
            res += etudiants.calculMoyenne(pMatiere).get(i);
        }
        return res / etudiants.size();
         
    }

    /**
     * méthode qui permet de calculer la moyenne générale du groupe
     * @return une valeur de type float qui correspond à la moyenne générale du groupe
     */
    public float calculMoyenneG(){
        float res = O;
        for(String matiere : etudiants.getNotes().keySet()){
            res += this.calculMoyenne(matiere);
        }
        return res / etudiants.getNotes().keySet().size();
    }

    /**
     * méthode qui permet de trier les étudiants dans la liste selon
     * leur moyenne générale décroissante
     */
    public void triParMerite(){
        Collections.sort(etudiants, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                return o1.calculMoyenneG() > o2.calculMoyenneG() ? 1 : -1;
            }
        });
    }

    /**
     * méthode qui permet de trier les étudiants dans la liste selon leur 
     * ordre alphabétique
     */
    public void triAlpha(){
        List.sort(etudiants);
    }

    /**
     * Getteur qui permet de récuperer la formation du groupe
     * @return la formation du groupe de type Formation
     */
    public Formation getFormation(){
        return this.formation;
    }

    /**
     * Getteur qui permet de récuperer les étudiants du groupe
     * @return la liste des étudiants appartenant au groupe
     */
    public List<Etudiant> getEtudiant(){
        return this.etudiants;
    }


    /**
     * Méthode toString qui renvoi les informations sur le groupe
     * @return une chaine de caractère qui contient les informations sur le groupe
     */
    @Override
    public String toString() {
        return "{" +
            " formation='" + getFormation() + "'" +
            ", etudiants='" + getEtudiant() + "'" +
            "}";
    }




}