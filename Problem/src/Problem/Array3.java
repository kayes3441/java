package Problem;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        //A Matrix
        Scanner input_a_row = new Scanner(System.in);
        System.out.print("Enter Row Size Of Matrix A : ");
        int a_row = input_a_row.nextInt();
        Scanner input_a_column = new Scanner(System.in);
        System.out.print("Enter Column Size Of Matrix A: ");
        int a_column = input_a_column.nextInt();
        //...B matrix
        int b_row = a_row;
        int b_column=a_column;
        System.out.println("Row Size Of Matrix B is: "+b_row);

        // Scanner input_b_column = new Scanner(System.in);
        System.out.println("Enter Column Size Of Matrix B:"+b_column);
        // int b_column = input_a_column.nextInt();

        int[][]matrix_a = new int [a_row][a_column];
        int[][]matrix_b = new int [b_row][b_column];
        int[][]matrix_result = new int [a_row][a_column];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your A Matrix");
        for(int row =0;row<a_row;row++){
            for(int column=0;column<a_column;column++){
                matrix_a[row][column] = sc.nextInt();
            }
        }
        System.out.println("Enter Your B Matrix");
        for(int row =0;row<b_row;row++){
            for(int column=0;column<b_column;column++){
                matrix_b[row][column] = sc.nextInt();
            }
        }
        System.out.print("A:");
        for(int row=0;row<a_row;row++){
            for (int column=0;column<a_column;column++){
                System.out.print("\t"+matrix_a[row][column]);
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.print("B:");
        for(int row=0;row<b_row;row++){
            for (int column=0;column<b_column;column++){
                System.out.print("\t"+matrix_b[row][column]);
            }
            System.out.println();
        }
        //end of input of these two matrix ..
        //now add these two matrix....
        System.out.println();
        System.out.print("The Result :");
        for(int row=0;row<a_row;row++){
            for(int column=0;column<a_column;column++){
                matrix_result[row][column]=matrix_a[row][column]+matrix_b[row][column];
                System.out.print("\t "+matrix_result[row][column]);
            }
            System.out.println();
        }
    }
}
