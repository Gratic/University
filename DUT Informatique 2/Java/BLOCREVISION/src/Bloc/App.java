package Bloc;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Groupe universite = new Groupe("Universite");
        Groupe iuta = new Groupe("IUT Annecy");
        Groupe polytech = new Groupe("Polytech");
        Groupe iae = new Groupe("IAE");

        Groupe info = new Groupe("DUT Informatique");

        Groupe g22 = new Groupe("G22");
        g22.getEntites().add(new Personne("Strappazzon", "Alexis"));
        g22.getEntites().add(new Personne("Perrillat-Collomb", "Tom"));

        Groupe g24 = new Groupe("G24");
        g24.getEntites().add(new Personne("Lazareth", "Baptiste"));
        g24.getEntites().add(new Personne("Schoebela", "Patryk"));

        info.getEntites().add(g22);
        info.getEntites().add(g24);

        Groupe gmp = new Groupe("DUT Génie Mécanique et Production");

        Groupe g1 = new Groupe("G1");
        g1.getEntites().add(new Personne("Paul", "Maxime"));

        gmp.getEntites().add(g1);

        Groupe geii = new Groupe("DUT Génie Electrique et Informatique de l'industrie");


        iuta.getEntites().add(info);
        iuta.getEntites().add(gmp);
        iuta.getEntites().add(geii);
        universite.getEntites().add(iuta);
        universite.getEntites().add(polytech);
        universite.getEntites().add(iae);

        System.out.println(universite);
        System.out.println(universite.nbPersonnes());
//        List<Entite> entites = new ArrayList<Entite>();

    }
}
