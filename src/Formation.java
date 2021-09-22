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
        matiere.put("Ma clé", "Ma valeur");
    }

    public void supprimerMatiere(String a){


    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Formation)) {
            return false;
        }
        Formation formation = (Formation) o;
        return Objects.equals(id, formation.id) && Objects.equals(matiere, formation.matiere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, matiere);
    }





    public int coefMatiere(String a){

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