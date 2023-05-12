package program;
import java.util.Scanner;
public class Condition_op3 {
	public static void main (String args[]) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		num = input.nextInt();
		
		String check=(num >0)?"Positive":"Negative";
		System.out.println(+num+" is "+check);
	}

}
