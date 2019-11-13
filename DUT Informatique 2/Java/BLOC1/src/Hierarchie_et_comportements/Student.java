package Hierarchie_et_comportements;

public class Student extends Human {

    public Student(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String work() {
        return "Dormir au fond de l'amphi.";
    }
}
