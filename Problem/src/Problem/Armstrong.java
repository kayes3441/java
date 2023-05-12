package Problem;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();

        int sum = 0 ;
        int rem ;
        int temp = num;
        while(temp!=0){
            rem= temp%10;
            sum =sum+ rem*rem*rem;
            temp =temp/10;
            
        }
        if(sum == num){
            System.out.println(num+" Is Armstrong Number");
        }
        else
        System.out.println(num+" Is Not Armstrong Number");
    }
}
