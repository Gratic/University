package Bloc;

public class Personne extends Entite {
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }

    @Override
    public int nbPersonnes() {
        return 1;
    }

    @Override
    public String generate(int x) {
        return toString();
    }
}
