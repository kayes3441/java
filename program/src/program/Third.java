package program;
import java.util.Scanner;

public class Third {
	public static void main(String args[]) {
		int number_check;
		Scanner sc =new Scanner(System.in);
		number_check=sc.nextInt();
		
		if(number_check>0) {
			System.out.println("Value is positive");
		}
		else if(number_check==0) {
			System.out.println("Value is zero");
		}
		else
			System.out.println("Value is negetive");
	}
}
