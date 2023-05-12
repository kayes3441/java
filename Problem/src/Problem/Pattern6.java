package Problem;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        for (int row= 1;row<=num;row++){
            for (int column=1;column<=num;column++){
                System.out.print(" "+column);
            }
            System.out.println();
        }
    }
}
