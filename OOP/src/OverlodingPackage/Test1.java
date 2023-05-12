package OverlodingPackage;

public class Test1 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher4 = new Teacher();
        Teacher teacher2 = new Teacher("Kaye","gender");
        teacher2.displayInfo();
        Teacher teacher3 = new Teacher("Sadi","Male",9029);
        teacher3.displayInfo();
    }
}
