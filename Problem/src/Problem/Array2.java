package Problem;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number : ");
        int num = sc.nextInt();
        // for(int i =1;i<=num;i++){
        //     if(i==num){
        //         System.out.print(days[i-1]);
        //         break;
        //     }
        // }
        int i = num-1;
        System.out.print(days[i]);
    }
}
