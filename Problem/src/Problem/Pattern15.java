package Problem;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        for (int row=1;row<=num;row++){
           
            for(int column=1;column<=2*num;column++){
                if(row==1 || column ==1 || column == num*2 || row == num)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
