public class Formation{

    /**
     * String id correspond à l'id de l'étudiant
     * Map<String,Integer> est un hashcode matiere avec son coefficient
     * 
     */
    private String id;
    private Map<String,Integer> matiere;


    /**
     * @param a nom de l'étudiant
     * @param b hahscode matiere
     * 
     */
    public Formation(String a, Map<String,Integer> b){
        this.id = a;
        this.matiere = b;
    }


    /**
     * @return id de l'étudiant
     */
    public String getId(){
        return this.id;
    }

    /**
     * @param a string matiere
     * @param b string coefficient
     * On ajoute une matiere
     * 
     */
    public void ajouterMatiere(String a, int b){
        if(this.containsKey(a)){
        matiere.put(a, b);
        }
    }


        /**
     * @param a string matiere
     * On supprime une matiere
     * 
     */
    public void supprimerMatiere(String a){
        if(this.containsKey(a)){
            this.remove(a);
        }
    }



    /**
     * @param a le nom de l'étudiant
     * @return int le noef de la matiere
     * on accède la valeur ( coefficient) de la matiere donne en parametre
     */
    public int coefMatiere(String a){
        int coef = null;
        coef = this.get(a);
        if(!this.containsKey(a)){
            return -1;
        }
        return coef;
    }
}    