package methods_overloading;

public class Test {
    public static void main(String[] args) {
        Overloading ob = new Overloading();
        ob.add();
       
        ob.add(4,3,23);
        ob.add(64,23);
        ob.add(4.12,23.21);
    }
}
