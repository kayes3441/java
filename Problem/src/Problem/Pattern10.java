package Problem;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        for(int row =1;row<=num; row++){
            for(int column=1;column<=num;column++){
                if(row == 1 ||column==num || row==num || column==1){
                    System.out.print("#");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
