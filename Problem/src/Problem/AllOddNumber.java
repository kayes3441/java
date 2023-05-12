package Problem;

import java.util.Scanner;

public class AllOddNumber {
    public static void main(String[] args) {
        int m,n;
        int sum = 0 ;
        Scanner sc_m = new Scanner(System.in);
        System.out.print("Enter Start NUmber :");
        m   = sc_m.nextInt();

        Scanner sc_n = new Scanner(System.in);
        System.out.print("Enter End Number :");
        n =  sc_n.nextInt();

        if( m < n){
            for(int i = m; i<=n; i++){
                if(i%2 == 1){
                    sum += i;
                }
            }
            System.out.println("The Sum Of Odd Number is :"+sum);
        }
        else if(m > n)
        {
            for(int i = n; i<=m; i++){
                if(i%2 == 1){
                    sum += i;
                }
            }
            System.out.println("The Sum Of Odd Number is :"+sum);
        }
        else
        {
            System.out.println("Enter number Correctly.....");
        }
    }
}
