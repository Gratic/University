package Hierarchie;

public class B extends A {
    public B() {
        value = "B";
    }

    public String p()
    {
        return super.m();
    }
}
