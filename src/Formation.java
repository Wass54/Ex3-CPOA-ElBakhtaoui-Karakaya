import java.util.*;
/**
 * classe qui correspond à une formation
 */
public class Formation{

    /**
     * Attribut string id correspond à l'id de la matiere
    */
    private String id;
    /** 
    * Map<String,Integer> est un hashcode matiere avec son coefficient 
    * Le string correspond au nom de la matière et l'integer au coefficient de la matière
    */
    private Map<String,Integer> matiere;


    /**
     * @param a nom de la matiere
     * @param b hahscode matiere
     */
    public Formation(String a, Map<String,Integer> b){
        this.id = a;
        this.matiere = b;
    }


    /**
     * @return id de la matiere
     */
    public String getId(){
        return this.id;
    }

    /**
     * Getteur qui permet de recuperer les matières de la formation
     * @return les matières
     */
    public Map<String, Integer> getMatiere(){
        return this.matiere;
    }

    /**
     * @param a string matiere
     * @param b string coefficient
     * On ajoute une matiere
     * 
     */
    public void ajouterMatiere(String a, int b){
        if(matiere.containsKey(a)){
        matiere.put(a, b);
        }
    }


    /**
     * @param a string matiere
     * On supprime une matiere
     * 
     */
    public void supprimerMatiere(String a){
        if(matiere.containsKey(a)){
            matiere.remove(a);
        }
    }

    /**
     * @param a le nom de la matiere
     * @return int le noef de la matiere
     * on accède la valeur (coefficient) de la matiere donne en parametre
     */
    public int coefMatiere(String a){
        int coef = 0;
        coef = matiere.get(a);
        if(!matiere.containsKey(a)){
            return -1;
        }
        return coef;
    }
}    