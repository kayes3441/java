package polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        Person t = new Teacher();
        t.display();
        p = new Student();
        p.display();

    }
}
