package Bloc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Groupe extends Entite {

    private List<Entite> entites;
    private String nom;

    public Groupe(List<Entite> entites, String nom) {
        super();
        this.entites = entites;
        this.nom = nom;
    }

    public Groupe(String nom) {
        super();
        this.nom = nom;
        this.entites = new ArrayList<Entite>();
    }

    public String indent(int x)
    {
        if(x == 0)
            return "\t";
        else
            return "\t" + indent(x-1);
    }

    @Override
    public String toString() {
        return generate(0);
    }

    @Override
    public int nbPersonnes() {
        int nb = 0;

        for(Entite e : getEntites())
        {
            nb += e.nbPersonnes();
        }
        return nb;
    }

    @Override
    public String generate(int x) {
        String msg = getNom();
        for(Entite e : getEntites())
        {
            msg += "\n" + indent(x) + e.generate(x+1);
        }
        return msg;
    }

    public List<Entite> getEntites() {
        return entites;
    }

    public void setEntites(List<Entite> entites) {
        this.entites = entites;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
