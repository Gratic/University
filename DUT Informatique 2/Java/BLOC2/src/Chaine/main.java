package Chaine;

public class main {
    public static void main(String[] args) {
        LinkList<String> first = new LinkList<String>("Violet");
        first.append("Evergarden");
        first.append("est");
        first.append("le");
        first.append("meilleur");
        first.append("anime");

        first.toStringAll();

        first = first.prepend("que");
        first = first.prepend("pense");
        first = first.prepend("Je");

        first.toStringAll();

        first.deleteElement("Violet");
        first.deleteElement("anime");
        first.deleteElementAt(3);
        first.toStringAll();

        first.addAtIndex(3, "Nier");
        first.addAtIndex(4, "Automata");
        first.append("jeu");
        first.addLast("oui");
        first.toStringAll();

        System.out.println(first.linkLength());
    }
}
