package Hierarchie_et_comportements;

public class Teacher extends Human {

    public Teacher(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String work() {
        return "Corrige des copies.";
    }
}
