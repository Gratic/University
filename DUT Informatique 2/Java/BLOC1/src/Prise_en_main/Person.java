package Prise_en_main;

public class Person {
    private String firstname;

    public Person(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person("Nathan");
        System.out.println(p);
    }
}
