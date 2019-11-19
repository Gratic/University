package LinkList;

import sun.awt.image.ImageWatched;

public class main {
    public static void main(String[] args) {
        LinkList<String> first = new LinkList<String>("Violet");
        first.setNext(new LinkList<String>("Evergarden",
                new LinkList<String>("est",
                new LinkList<String>("le",
                new LinkList<String>("meilleur",
                new LinkList<String>("anime",
                new LinkList<String>(".")))))));

        System.out.println(first.toString());

        first.addFirst("que");
        first.addFirst("pense");
        first.addFirst("Je");

        System.out.println(first.toString());

        System.out.println(first.getElementAt(1));

        first.deleteElementAt(3);
        first.deleteElementAt(3);
        first.addElementAt(3, "Nier");
        first.addElementAt(4, "Automata");
        first.deleteElement("anime");
        first.addElementAt(first.getLength() - 1, "jeu");

        System.out.println(first.toString());

        System.out.println(first.getLastElement());
    }
}
