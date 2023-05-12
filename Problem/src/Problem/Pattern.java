package Problem;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        for(int row = 1; row<=num; row++){
            for (int column = 1 ;column<=row;column++){
               System.out.print(" "+column*row);
            }
            System.out.println();
        }
    }
}
