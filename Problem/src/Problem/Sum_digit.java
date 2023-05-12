package Problem;

import java.util.Scanner;

public class Sum_digit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        long num = sc.nextInt();
        long rem; 
        long temp = num ;
        long sum = 0;

        while(temp!=0){
            rem = temp %10;
            sum += rem;
            temp /= 10;   
        }
        System.out.println();
        System.out.print("Sum Of "+num+" Is : "+sum);
    }
   
    
}
