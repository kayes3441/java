import java.util.Scanner;

public class spaceCom {
    public static void main(String[] args) {
        int[] even = new int[101];
        for (int i = 0 ; i<101; i++){
            even[i] = 0;
        }
        for (int i = 0 ; i<101; i+=2){
            even[i] = 1;
        }
    
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        if(even[n] == 1){
            System.out.println("this is even ");
        }
        else
            System.out.println("this is odd");
    }
}
