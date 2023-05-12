package static_keyword;

public class Teacher {
    static int count = 0;

    Teacher(){
        count++;
    }

    void display (){
        System.out.println("Total Teacher ; "+count);
    }
}
