public class Formation{

    /**
     * String id correspond à l'id de l'étudiant
     * Map<String,Integer> 
     * 
     */
    private String id;
    private Map<String,Integer> matiere;

    public Formation(String a, Map<String,Integer> b){
        this.id = a;
        this.matiere = b;
    }

    public String getId(){
        return this.id;
    }

    public void ajouterMatiere(String a, int b){
        if(this.containsKey(a)){
        matiere.put(a, b);
        }
    }

    public void supprimerMatiere(String a){
        if(this.containsKey(a)){
            this.remove(a);
        }
    }



    public int coefMatiere(String a){
        int coef = null;
        coef = this.get(a);
        if(!this.containsKey(a)){
            return -1;
        }
        return coef;
    }


    public void setId(String id) {
        this.id = id;
    }

    public Map<String,Integer> getMatiere() {
        return this.matiere;
    }

    public void setMatiere(Map<String,Integer> matiere) {
        this.matiere = matiere;
    }

}    