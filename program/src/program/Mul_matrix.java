package program;
import java.util.Scanner;
public class Mul_matrix {
	public static void main(String[] args) {
		int m,n,l;
		int sum =0;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("First Matrix row size:");
		m = sc.nextInt();
		
		System.out.print("First Matrix Column size:");
		n = sc.nextInt();
		
		int[][]num1 = new int[m][n];
		//First matrix column size is equal to Second matrix  row size 
		
		System.out.println("Second Matrix row size:"+n);
		
		System.out.println("Seceond Matrix Column size:");
		l = sc.nextInt();
		
		int [][]num2 = new int[n][l];
		
		System.out.print("Enter First matrix value:");
		
		for (int row1 =0;row1<m;row1++) {
			for (int column1=0; column1<n;column1++) {
				num1[row1][column1]=sc.nextInt();			}
		}
		
		
		System.out.print("Enter Second matrix value:");
		
		for (int row2 =0;row2<n;row2++) {
			for (int column2=0; column2<l;column2++) {
				num2[row2][column2]=sc.nextInt();			
				}
		}
		
		System.out.println(" First matrix :");
		
		for (int row1 =0;row1<m;row1++) {
			for (int column1=0; column1<n;column1++) {
				System.out.print(num1[row1][column1] +" ");
			}
			System.out.println();
		}
		
		System.out.println(" Second matrix :");
		
		for (int row2 =0;row2<n;row2++) {
			for (int column2=0; column2<l;column2++) {
				System.out.print(num2[row2][column2] +" ");
			}
			System.out.println();
		}
		
		int[][]num3 = new int[n][l];
		
		for (int row3 = 0; row3<n;row3++) {
			for (int column3=0;column3<l;column3++) {
				for (int k =0; k<n;k++) {
					sum+=(num1[row3][k]*num2[k][column3]);
				}
				num3[row3][column3]=sum;
				sum=0;
			}
			System.out.println();
		}	
		
		System.out.println("The Matrix Multiplication is:");
		
		
		for (int row3 = 0; row3<n;row3++) {
			for (int column3=0;column3<l;column3++) {
				System.out.print(num3[row3][column3]+" ");
			}
			System.out.println();
		}	
		
	}

}
