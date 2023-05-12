package inheritance;

public class Teacher extends Person {
    String subject;
    void display2(){
        display1();
        System.out.println("subject"+subject);
    }
}
