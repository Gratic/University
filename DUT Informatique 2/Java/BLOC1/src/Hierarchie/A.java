package Hierarchie;

public class A {
    protected String value;

    public A() {
        value = "A";
    }

    public String m()
    {
        return this.value;
    }

    public String p()
    {
        return this.m();
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        A ab = new B();

        System.out.println(a.m());
        System.out.println(a.p());

        System.out.println(b.m());
        System.out.println(b.p());

        System.out.println(ab.m());
        System.out.println(ab.p());
    }
}
