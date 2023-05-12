package Problem;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
      
        int num;
        int results =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number : ");

        num = sc.nextInt();
        for (int i = 1 ; i<=num ;i++){
            results = results*i;
            
        }
       
        System.out.println("The Factorial is : "+results);

    }
}
