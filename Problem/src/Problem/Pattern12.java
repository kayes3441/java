package Problem;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        for(int row =1;row<=num; row++){
            for(int column=1;column<=num;column++){
                if(column==row  || row+column==num+1){
                    System.out.print("#");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
