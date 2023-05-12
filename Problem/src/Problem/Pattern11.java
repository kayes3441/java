package Problem;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        for(int row =1;row<=num; row++){
            for(int column=1;column<=row;column++){
                if(column==1 || row==num || column==row){
                    System.out.print("#");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
