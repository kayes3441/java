package program;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		int[][]num1 = new int[2][3];
		int[][]num2 = new int[2][3];
		int[][]num3 = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ;i<2;i++) {
			for (int j = 0; j<3;j++) {
				 num1[i][j]=sc.nextInt();
			}
		}
		System.out.println("First array ");
		for(int i=0 ;i<2;i++) {
			for (int j = 0; j<3;j++) {
				 num2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second array ");
		System.out.println("Result is : ");
		
		
		for (int i =0 ; i<2; i++) {
			for (int j = 0; j<3; j++) {
				 num3[i][j] =num1[i][j]+num2[i][j];
				 System.out.print(num3[i][j]+" ");
			}
			System.out.println(" ");
		}
	//Result 
		
	}

}
