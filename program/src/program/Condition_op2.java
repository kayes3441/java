package program;
import java.util.Scanner;
public class Condition_op2 {
	public static void main(String args[]) {
		int a ;
		Scanner sc_a=new Scanner(System.in);
		 System.out.print("Enter a number: ");
		a = sc_a.nextInt();
		
		String check = (a % 2  ==0)  ? "Even":"Odd";
		System.out.println("This is "+check);
	}
}
