package Hierarchie_et_comportements;

public class StudentGamer extends Student implements Gamer {
    @Override
    public String play() {
        return "rage quit";
    }

    public StudentGamer(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String work() {
        return super.work();
    }
}
