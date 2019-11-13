package Prise_en_main;

import static org.junit.Assert.*;

public class PersonTest {

    @org.junit.Test
    public void getFirstname() {
        Person p = new Person("Alexis");

        assertEquals("Should be Alexis", "Alexis", p.getFirstname());
    }

    @org.junit.Test
    public void setFirstname() {
        Person p = new Person("Alexis");
        p.setFirstname("Nathan");
        assertEquals("Should be Nathan", "Nathan", p.getFirstname());
    }
}