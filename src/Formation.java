public class Formation{
    private String id;
    private Map<String,Integer> matiere;

    public Formation(String a, Map<String,Integer> b){
        this.id = a;
        this.matiere = b;
    }

    public String getId(){
        return this.id;
    }

    public void ajouterMatiere(String a){
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("Ma clé", "Ma valeur");
    }

    public void supprimerMatiere(String a){


    }

    public int coefMatiere(String a){

    }
}