package Problem;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        for (int row = num; row>=1;row--){
            for(int column =1;column<=num-row;column++){
                System.out.print(" ");
            }
            for(int column =1;column<=row;column++){
                System.out.print(column);
            }
            // for(int column = 1;column<=row-1;column++){
            //     System.out.print(row-column);
            // }
            for(int column = row-1 ;column>=1;column--){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
