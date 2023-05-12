package Problem;

public class Wrapper1 {
    public static void main(String[] args) {
        // int x=30;
        // Integer y = Integer.valueOf(x);
        // System.out.println(y);

        //object to primitive
        Double d = new Double (10.5);
        System.out.println(d);

        double e = d.doubleValue();
        System.out.println(e);
    }
}
