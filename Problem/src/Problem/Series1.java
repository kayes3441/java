package Problem;

import java.util.Scanner;

//1+2+3+4+5+.........+n
//find the sum the series number....
public class Series1 {
    public static void main(String[] args) {
        double n,sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        n = sc.nextInt();

        for (double i=1.5 ; i<=n ;i++){
            sum +=i;
            System.out.print("  "+i);
        }
        System.out.println();
        System.out.println("The sum of this series is : " +sum);
    }
}
