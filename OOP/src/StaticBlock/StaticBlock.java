package StaticBlock;

public class StaticBlock {
    static int age ;
    static String name ;
    static{
         age =10;
        name = "kayes";
    }
    static void display(){
        System.out.println(""+name);
        System.out.println(""+age);
    }
    public static void main(String[] args) {
        StaticBlock.display();
    }
}
