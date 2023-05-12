package Problem;

import java.util.Scanner;

public class Pattern5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        for(int row = 1; row<=num; row++){
            for (int column = 1 ;column<=num-row;column++){
                System.out.print(" ");
            }
            for (int column = 1 ;column<=row;column++){
                System.out.print(column%2);
            }
            System.out.println();
        }
        for(int row = num-1; row>=1; row--){
            for (int column = 1 ;column<=num-row;column++){
                System.out.print(" ");
            }
            for (int column = 1 ;column<=row;column++){
                System.out.print(column%2);
            }
            System.out.println();
        }
       
    }
}
