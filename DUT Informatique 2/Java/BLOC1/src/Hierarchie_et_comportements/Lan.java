package Hierarchie_et_comportements;

import java.util.ArrayList;
import java.util.List;

public class Lan {
    public static void main(String[] args) {
        List<Gamer> gamers = new ArrayList<Gamer>();

        gamers.add(new StudentGamer("Alexis", "Strappazzon"));
        gamers.add(new StudentGamer("Corentin", "Mathieu"));
        gamers.add(new StudentGamer("Tom", "Perrillat-Collomb"));
        gamers.add(new StudentGamer("Baptiste", "Lazareth"));
        gamers.add(new TeacherGamer("Luc", "Damas"));

        for (Gamer g: gamers) {
            Human h = (Human)g;

            System.out.println(g.toString());
            System.out.println(h.work());
            System.out.println(g.play());
        }

        System.out.println("----------------------------------");

        List<Human> humans = new ArrayList<Human>();
        humans.add(new Student("Tom", "Perrilat-Collomb"));
        humans.add(new StudentGamer("Alexis", "Strappazzon"));
        humans.add(new Teacher("Nicolas", "Voiron"));
        humans.add(new TeacherGamer("Luc", "Damas"));

        for(Human h : humans)
        {
            System.out.println(h.toString());
            if(h instanceof Student || h instanceof Teacher)
            {
                System.out.println(h.work());
            }
            else if(h instanceof Gamer)
            {
                System.out.println(((Gamer) h).play());
            }
        }
    }
}
