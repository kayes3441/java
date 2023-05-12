package Problem;

import java.util.Scanner;

public class Palindrome_number {
    
    public static void main(String[] args) {
        int m ,n;
        Scanner sc_m = new Scanner(System.in);
        System.out.print("Enter Start Number : ");
         m = sc_m.nextInt();
        Scanner sc_n = new Scanner(System.in);
        System.out.print("Enter End Number : ");
         n = sc_n.nextInt();

        int rem;
        int sum = 0;
        int count = 0;


        for ( int i =m ; i<=n ; i++){
          int temp = i;
          while(temp != 0){
            rem = temp% 10;
            sum = sum *10 + rem ;
            // System.out.println(sum);
            temp = temp /10;
        }if (sum == i ){
          count++;
          System.out.println(i);
        }
        sum = 0;
        }

        System.out.println("Total Palindrome Number Is : "+count);
    }
}
