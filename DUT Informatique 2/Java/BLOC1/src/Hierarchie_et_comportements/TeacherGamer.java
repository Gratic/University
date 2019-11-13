package Hierarchie_et_comportements;

public class TeacherGamer extends Teacher implements Gamer {
    public TeacherGamer(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String work() {
        return super.work();
    }

    @Override
    public String play() {
        return "prof OP";
    }
}
