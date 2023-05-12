package Problem;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc_row_size = new Scanner(System.in);
        System.out.print("Enter Row Size:");
        int row_size = sc_row_size.nextInt();
        Scanner sc_column_size = new Scanner(System.in);
        System.out.print("Enter Column Size:");
        int column_size = sc_column_size.nextInt();

        int[][] matrix = new int[row_size][column_size];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        for(int row =0;row<row_size;row++){
            for(int column=0;column<column_size;column++){
                matrix[row][column]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("Matrix : ");
        for(int row =0;row<row_size;row++){
            for(int column=0;column<column_size;column++){
               System.out.print(matrix[row][column]+"\t");
            }
            System.out.println("\t");
        }
        System.out.println();
        int upper_Diagonal_sum = 0;
        int lower_Diagonal_sum = 0;
        for(int row =0;row<row_size;row++){
            for(int column=0;column<column_size;column++){
               if(row<column){
                upper_Diagonal_sum+=matrix[row][column];
               }
               if(row>column){
                lower_Diagonal_sum+=matrix[row][column];
               }
            }
        }
        System.out.println("The sum of upper diagonal is:"+upper_Diagonal_sum);
        System.out.println("The sum of lower diagonal is:"+lower_Diagonal_sum);

    }
}
