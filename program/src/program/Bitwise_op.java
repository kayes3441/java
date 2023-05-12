package program;
//import java.util.Scanner;
public class Bitwise_op {
	public static void main(String[] args) {
		int a=10,b=15,c,d,e,f,g;
//		Scanner sc_a = new Scanner (System.in);
//		System.out.print("Enter your first number:");
//		a = sc_a.nextInt();
//		
//		Scanner sc_b = new Scanner (System.in);
//		System.out.print("Enter your Second number:");
//		b = sc_b.nextInt();
		
		c = a&b;
		System.out.println("Bitwise And is:"+c);
		
		d = a|b;
		System.out.println("Bitwise Or is:"+d);
		
		e = a^b;
		System.out.println("Bitwise Exclusive Or is:"+e);
		
		
		f = a<<3;
		System.out.println("Bitwise left shift is:"+f);
		
		g = a>>2;
		System.out.println("Bitwise Right shift is:"+g);
		
		g = ~100;
		System.out.println("Bitwise Right shift is:"+g);
		
	}
}
