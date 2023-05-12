package Problem;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        num = sc.nextInt();
        int count = 0;

        for (int i =2 ;i<num ;i++){
            if (num % i == 0){
               count++;
               break;
            }
           
        }
        if (count==0){
            System.out.print("This " +num+ " prime number ");
        }
        else
        System.out.println("This "+num+" is not prime number");
      
    }
}
