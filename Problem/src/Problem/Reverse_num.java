package Problem;

import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        num =  sc.nextInt();
        int rem = 0;
        int sum = 0;
        int temp = num ;
        while(temp != 0){
            rem = temp% 10;
            sum = sum *10 + rem ;
            temp = temp /10;
        }
        System.out.print(sum);
    }
}
