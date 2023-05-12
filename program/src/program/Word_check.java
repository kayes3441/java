package program;

import java.util.Scanner;
public class Word_check {
	public static void  main(String args[]) {
		char ch;
		Scanner sc= new Scanner (System.in);
		ch=sc.next().charAt(0);
		
		if(ch >= 'A' && ch<= 'F') {
			System.out.println("Right character");
		}
		else
			System.out.println("Wrong Character");
	}

}
