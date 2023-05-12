package Problem;

import java.util.Scanner;

public class Fibonacci_number {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Number : ");
        num = sc.nextInt();
        int first = 0;
        int second = 1 ;
        int fibo;

        for (int i = first; i<=num;i++){
            fibo = first+second;
            first = second;
            second = fibo;
            System.out.print(fibo+" ");
        }
       
    }
}
