public class Formation{

    /**
     * String id correspond à l'id de la matiere
     * Map<String,Integer> est un hashcode matiere avec son coefficient
     * 
     */
    private String id;
    private Map<String,Integer> matiere;


    /**
     * @param a nom de la matiere
     * @param b hahscode matiere
     * 
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
     * @param a le nom de la matiere
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