package Problem;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your number : ");
        int n = sc.nextInt();
        int [] number = new int[n];
        int sum = 0;
        int max = number[0];
        int mini = number[0];
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
            sum += number[i];

        }
        System.out.println("The Sum is :"+sum);
        for(int i=1;i<n;i++){
            if(max<number[i]){
                max= number[i];
            }
            if(mini>number[i]){
                mini = number[i];
            }

        }
        System.out.println("Max number is : "+max);
        System.out.println("Min number is :"+mini);
    }
}
