package program;
import java.util.Scanner;

public class Condition_operator {
	public static void main(String args[]) {
		int a,b,max ;
		Scanner sc1 = new Scanner (System.in);
		a = sc1.nextInt();
		Scanner sc2 = new Scanner (System.in);
		b = sc2.nextInt();
		max =(a>b)? a:b;
		System.out.println("This is max value " + max);
		
	}

}
