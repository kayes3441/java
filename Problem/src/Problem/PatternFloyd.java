package Problem;

import java.util.Scanner;

public class PatternFloyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int row = 1; row<=num; row++){
            for (int column = 1 ;column<=row;column++){
            
                System.out.printf("%d ",++count);
            }
            // for (int column = 1 ;column<=num-row;column++){
            //     System.out.print(column);
            // }
            System.out.println();
        }
    }
}
