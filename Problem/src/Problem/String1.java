package Problem;

public class String1 {
    public static void main(String[] args) {
        String s1 = "Sadi Mohammad kayes";
        String s2 = new String("Sadi mohammad Kayes");

        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }
        boolean con = s1.contains("Moha");
        System.out.print(con);

        boolean check = s1.isEmpty();
        System.out.println();
        System.out.println(check);
    }
}
