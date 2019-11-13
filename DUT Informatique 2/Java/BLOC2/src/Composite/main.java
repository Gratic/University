package Composite;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Leaf farine = new Leaf("farine", 125,"g");
        Leaf bo = new Leaf("blanc d'oeuf", 4,"");
        Leaf sucre = new Leaf("sucre", 125,"g");
        Leaf beurre = new Leaf("beurre", 30,"g");
        Leaf cremef = new Leaf("crème fraiche", 1,"");
        Leaf sucreg = new Leaf("sucre glace", 1,"");
        Leaf chocolat = new Leaf("chocolat noir", 1,"");

        Composite genoise = new Composite("génoise");
        Composite cremec = new Composite("crème chantilly");
        Composite foret = new Composite("forêt noire");

        genoise.add(farine);
        genoise.add(bo);
        genoise.add(sucre);
        genoise.add(beurre);

        cremec.add(cremef);
        cremec.add(sucreg);

        foret.add(genoise);
        foret.add(cremec);
        foret.add(chocolat);

        System.out.println(foret.toString());
    }
}
