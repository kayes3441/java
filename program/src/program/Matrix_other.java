package program;
import java.util.Scanner;
public class Matrix_other {
	public static void main(String[]args) {
		int m,n;
		int sumDiagonal=0, upperT=0,lowerT=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Row Size:");
		m =sc.nextInt();
		
//		Scanner sc_n = new Scanner (System.in);
		System.out.print("Enter Column Size:");
		n =sc.nextInt();
	
		int[][]num =new int[m][n];
		
		System.out.print("Enter Matrix value");
		
		for (int row =0 ;row<m;row++) {
			for (int column = 0 ; column<n ;column++) {
				num[row][column] = sc.nextInt();
			}
		}
		
		for (int row =0 ;row<m;row++) {
			for (int column = 0 ; column<n ;column++) {
				System.out.print(num[row][column]+" ");
			}
			System.out.println();
		}
		for (int row =0; row<m;row++) {
			for (int column = 0;column<n ; column++) {
				if (row == column) {
					sumDiagonal+=num[row][column];
				}
				if(row < column) {
					upperT+=num[row][column];
				}
				if(row > column) {
					lowerT +=num[row][column];
				}
			}
			
		}
		System.out.println("The matrix Diagonal is:"+sumDiagonal);
		System.out.println("The matrix Upper Tringle is:"+upperT);
		System.out.println("The matrix Lower tringle is:"+lowerT);
		
	}
}
